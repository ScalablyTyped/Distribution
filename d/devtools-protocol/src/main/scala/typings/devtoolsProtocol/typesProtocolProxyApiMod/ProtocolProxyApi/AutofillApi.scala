package typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.Autofill.TriggerRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutofillApi extends StObject {
  
  /**
    * Trigger autofill on a form identified by the fieldId.
    * If the field and related form cannot be autofilled, returns an error.
    */
  def trigger(params: TriggerRequest): js.Promise[Unit]
}
object AutofillApi {
  
  inline def apply(trigger: TriggerRequest => js.Promise[Unit]): AutofillApi = {
    val __obj = js.Dynamic.literal(trigger = js.Any.fromFunction1(trigger))
    __obj.asInstanceOf[AutofillApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutofillApi] (val x: Self) extends AnyVal {
    
    inline def setTrigger(value: TriggerRequest => js.Promise[Unit]): Self = StObject.set(x, "trigger", js.Any.fromFunction1(value))
  }
}
