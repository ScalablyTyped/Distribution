package typings.dispatchr

import typings.dispatchr.mod.Store
import typings.dispatchr.mod.StoreClass
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActionName extends StObject {
    
    var actionName: js.UndefOr[String] = js.undefined
    
    var error: Error
    
    var payload: js.UndefOr[js.Any] = js.undefined
  }
  object ActionName {
    
    @scala.inline
    def apply(error: Error): ActionName = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionName]
    }
    
    @scala.inline
    implicit class ActionNameMutableBuilder[Self <: ActionName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionName(value: String): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionNameUndefined: Self = StObject.set(x, "actionName", js.undefined)
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(name: String): Store[js.Object] = js.native
    def apply[T /* <: StoreClass */](name: T): T = js.native
  }
}
