package typings.emberTestHelpers

import typings.rsvp.mod.default.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waitMod {
  
  @JSImport("ember-test-helpers/wait", JSImport.Default)
  @js.native
  def default(): Promise[Unit] = js.native
  @JSImport("ember-test-helpers/wait", JSImport.Default)
  @js.native
  def default(options: WaitOptions): Promise[Unit] = js.native
  
  @js.native
  trait WaitOptions extends StObject {
    
    var waitForAJAX: js.UndefOr[Boolean] = js.native
    
    var waitForTimers: js.UndefOr[Boolean] = js.native
    
    var waitForWaiters: js.UndefOr[Boolean] = js.native
  }
  object WaitOptions {
    
    @scala.inline
    def apply(): WaitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaitOptions]
    }
    
    @scala.inline
    implicit class WaitOptionsMutableBuilder[Self <: WaitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWaitForAJAX(value: Boolean): Self = StObject.set(x, "waitForAJAX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForAJAXUndefined: Self = StObject.set(x, "waitForAJAX", js.undefined)
      
      @scala.inline
      def setWaitForTimers(value: Boolean): Self = StObject.set(x, "waitForTimers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForTimersUndefined: Self = StObject.set(x, "waitForTimers", js.undefined)
      
      @scala.inline
      def setWaitForWaiters(value: Boolean): Self = StObject.set(x, "waitForWaiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForWaitersUndefined: Self = StObject.set(x, "waitForWaiters", js.undefined)
    }
  }
}
