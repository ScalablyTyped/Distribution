package typings.getpass

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("getpass", "getPass")
  @js.native
  def getPass(cb: Callback): Unit = js.native
  @JSImport("getpass", "getPass")
  @js.native
  def getPass(options: Options, cb: Callback): Unit = js.native
  
  type Callback = js.Function2[/* error */ Error | Null, /* password */ String, Unit]
  
  @js.native
  trait Options extends StObject {
    
    var prompt: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    }
  }
}
