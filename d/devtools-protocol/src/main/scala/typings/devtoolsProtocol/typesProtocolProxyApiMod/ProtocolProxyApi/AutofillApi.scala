package typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.Autofill.SetAddressesRequest
import typings.devtoolsProtocol.mod.Protocol.Autofill.TriggerRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutofillApi extends StObject {
  
  /**
    * Set addresses so that developers can verify their forms implementation.
    */
  def setAddresses(params: SetAddressesRequest): js.Promise[Unit]
  
  /**
    * Trigger autofill on a form identified by the fieldId.
    * If the field and related form cannot be autofilled, returns an error.
    */
  def trigger(params: TriggerRequest): js.Promise[Unit]
}
object AutofillApi {
  
  inline def apply(setAddresses: SetAddressesRequest => js.Promise[Unit], trigger: TriggerRequest => js.Promise[Unit]): AutofillApi = {
    val __obj = js.Dynamic.literal(setAddresses = js.Any.fromFunction1(setAddresses), trigger = js.Any.fromFunction1(trigger))
    __obj.asInstanceOf[AutofillApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutofillApi] (val x: Self) extends AnyVal {
    
    inline def setSetAddresses(value: SetAddressesRequest => js.Promise[Unit]): Self = StObject.set(x, "setAddresses", js.Any.fromFunction1(value))
    
    inline def setTrigger(value: TriggerRequest => js.Promise[Unit]): Self = StObject.set(x, "trigger", js.Any.fromFunction1(value))
  }
}
