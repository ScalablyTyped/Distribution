package typings.dmgLicense

import typings.dmgLicense.libUtilErrorsMod.ErrorBuffer
import typings.dmgLicense.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextMod {
  
  @JSImport("dmg-license/lib/Context", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Context {
    def this(options: Options) = this()
  }
  /* static members */
  object default {
    
    @JSImport("dmg-license/lib/Context", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(contextOrOptions: Context): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(contextOrOptions.asInstanceOf[js.Any]).asInstanceOf[Context]
    inline def from(contextOrOptions: Options): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(contextOrOptions.asInstanceOf[js.Any]).asInstanceOf[Context]
  }
  
  @js.native
  trait Context extends StObject {
    
    val canWarn: Boolean = js.native
    
    def nonFatalError(error: js.Error): Unit = js.native
    def nonFatalError(error: js.Error, errorBuffer: ErrorBuffer): Unit = js.native
    
    var options: Options = js.native
    
    def resolvePath(path: String): String = js.native
    
    def warning(error: js.Error): Unit = js.native
    def warning(error: js.Error, errorBuffer: ErrorBuffer): Unit = js.native
  }
}
