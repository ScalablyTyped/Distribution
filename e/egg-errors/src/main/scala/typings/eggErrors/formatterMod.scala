package typings.eggErrors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatterMod {
  
  @JSImport("egg-errors/lib/framework/formatter", "FrameworkErrorFormater")
  @js.native
  open class FrameworkErrorFormater () extends StObject
  /* static members */
  object FrameworkErrorFormater {
    
    @JSImport("egg-errors/lib/framework/formatter", "FrameworkErrorFormater")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("egg-errors/lib/framework/formatter", "FrameworkErrorFormater.faqPrefix")
    @js.native
    def faqPrefix: String = js.native
    
    @JSImport("egg-errors/lib/framework/formatter", "FrameworkErrorFormater.faqPrefixEnv")
    @js.native
    def faqPrefixEnv: Any = js.native
    inline def faqPrefixEnv_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("faqPrefixEnv")(x.asInstanceOf[js.Any])
    
    inline def faqPrefix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("faqPrefix")(x.asInstanceOf[js.Any])
    
    inline def format(err: js.Error): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(err.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def formatError[T /* <: js.Error */](err: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(err.asInstanceOf[js.Any]).asInstanceOf[T]
  }
}
