package typings.getpass

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("getpass", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPass(cb: Callback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPass")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getPass(options: Options, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getPass")(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Callback = js.Function2[/* error */ Error | Null, /* password */ String, Unit]
  
  trait Options extends StObject {
    
    var prompt: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    }
  }
}
