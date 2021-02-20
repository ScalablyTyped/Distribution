package typings.emberTestHelpers

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waitForMod {
  
  @JSImport("@ember/test-helpers/dom/wait-for", JSImport.Default)
  @js.native
  def default(selector: String): js.Promise[Element | js.Array[Element]] = js.native
  @JSImport("@ember/test-helpers/dom/wait-for", JSImport.Default)
  @js.native
  def default(selector: String, options: Options): js.Promise[Element | js.Array[Element]] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var count: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var timeoutMessage: js.UndefOr[String] = js.native
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
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutMessage(value: String): Self = StObject.set(x, "timeoutMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutMessageUndefined: Self = StObject.set(x, "timeoutMessage", js.undefined)
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
