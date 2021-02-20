package typings.elv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("elv", JSImport.Namespace)
  @js.native
  def apply(`val`: js.Any): Boolean = js.native
  
  object behavior {
    
    @JSImport("elv", "behavior")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("elv", "behavior.enableFalse")
    @js.native
    def enableFalse: Boolean = js.native
    @scala.inline
    def enableFalse_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableFalse")(x.asInstanceOf[js.Any])
    
    @JSImport("elv", "behavior.enableNaN")
    @js.native
    def enableNaN: Boolean = js.native
    @scala.inline
    def enableNaN_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableNaN")(x.asInstanceOf[js.Any])
    
    @JSImport("elv", "behavior.enableNull")
    @js.native
    def enableNull: Boolean = js.native
    @scala.inline
    def enableNull_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableNull")(x.asInstanceOf[js.Any])
    
    @JSImport("elv", "behavior.enableUndefined")
    @js.native
    def enableUndefined: Boolean = js.native
    @scala.inline
    def enableUndefined_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableUndefined")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("elv", "coalesce")
  @js.native
  def coalesce(args: js.Any*): js.Any = js.native
  
  @JSImport("elv", "ncoalesce")
  @js.native
  def ncoalesce(args: js.Any*): js.Any = js.native
  
  @JSImport("elv", "populated")
  @js.native
  def populated(`val`: js.Any): Boolean = js.native
  
  @JSImport("elv", "tryGet")
  @js.native
  def tryGet(`val`: js.Array[_], index: Double): js.Any = js.native
  @JSImport("elv", "tryGet")
  @js.native
  def tryGet(`val`: js.Array[_], index: Double, `def`: js.Any): js.Any = js.native
}
