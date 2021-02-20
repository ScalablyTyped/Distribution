package typings.emberTestHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waitUntilMod {
  
  @JSImport("@ember/test-helpers/wait-until", JSImport.Default)
  @js.native
  def default[T](callback: js.Function0[T]): js.Promise[T] = js.native
  @JSImport("@ember/test-helpers/wait-until", JSImport.Default)
  @js.native
  def default[T](callback: js.Function0[T], options: Options): js.Promise[T] = js.native
  
  @js.native
  trait Options extends StObject {
    
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
