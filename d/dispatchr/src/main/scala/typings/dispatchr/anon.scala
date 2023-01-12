package typings.dispatchr

import typings.dispatchr.mod.Store
import typings.dispatchr.mod.StoreClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActionName extends StObject {
    
    var actionName: js.UndefOr[String] = js.undefined
    
    var error: js.Error
    
    var payload: js.UndefOr[Any] = js.undefined
  }
  object ActionName {
    
    inline def apply(error: js.Error): ActionName = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionName] (val x: Self) extends AnyVal {
      
      inline def setActionName(value: String): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
      
      inline def setActionNameUndefined: Self = StObject.set(x, "actionName", js.undefined)
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(name: String): Store[js.Object] = js.native
    def apply[T /* <: StoreClass */](name: T): T = js.native
  }
}
