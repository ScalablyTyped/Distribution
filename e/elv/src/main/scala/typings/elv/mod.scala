package typings.elv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("elv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object behavior {
    
    @JSImport("elv", "behavior")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("elv", "behavior.enableFalse")
    @js.native
    def enableFalse: Boolean = js.native
    inline def enableFalse_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableFalse")(x.asInstanceOf[js.Any])
    
    @JSImport("elv", "behavior.enableNaN")
    @js.native
    def enableNaN: Boolean = js.native
    inline def enableNaN_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableNaN")(x.asInstanceOf[js.Any])
    
    @JSImport("elv", "behavior.enableNull")
    @js.native
    def enableNull: Boolean = js.native
    inline def enableNull_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableNull")(x.asInstanceOf[js.Any])
    
    @JSImport("elv", "behavior.enableUndefined")
    @js.native
    def enableUndefined: Boolean = js.native
    inline def enableUndefined_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableUndefined")(x.asInstanceOf[js.Any])
  }
  
  inline def coalesce(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("coalesce")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def ncoalesce(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ncoalesce")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def populated(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("populated")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def tryGet(`val`: js.Array[Any], index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("tryGet")(`val`.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def tryGet(`val`: js.Array[Any], index: Double, `def`: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("tryGet")(`val`.asInstanceOf[js.Any], index.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Any]
}
