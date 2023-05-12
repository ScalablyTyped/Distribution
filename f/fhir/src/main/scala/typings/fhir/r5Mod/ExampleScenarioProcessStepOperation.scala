package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExampleScenarioProcessStepOperation
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _initiator: js.UndefOr[Element] = js.undefined
  
  var _initiatorActive: js.UndefOr[Element] = js.undefined
  
  var _receiver: js.UndefOr[Element] = js.undefined
  
  var _receiverActive: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * This should contain information not already present in the process step.  It's more of a description of what the operation in general does - if not already evident from the operation.type
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * This must either be the 'key' of one of the actors defined in this scenario or the special keyword 'OTHER' if the initiator is not one of the actors defined for the scenario.  (Multiple references to 'OTHER' don't necessarily indicate the same actor.)
    */
  var initiator: js.UndefOr[String] = js.undefined
  
  /**
    * De-activation of an actor means they have no further role until such time as they are the recipient of an operation.
    */
  var initiatorActive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This must either be the 'key' of one of the actors defined in this scenario or the special keyword 'OTHER' if the receiver is not one of the actors defined for the scenario.  (Multiple references to 'OTHER' don't necessarily indicate the same actor.)  In some cases, receiver could be same as sender if representing a local operation
    */
  var receiver: js.UndefOr[String] = js.undefined
  
  /**
    * De-activation of an actor means they have no further role until such time as they are the recipient of an operation.
    */
  var receiverActive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A reference to the instance that is transmitted from requester to receiver as part of the invocation of the operation.
    */
  var request: js.UndefOr[ExampleScenarioInstanceContainedInstance] = js.undefined
  
  /**
    * A reference to the instance that is transmitted from receiver to requester as part of the operation's synchronous response (if any).
    */
  var response: js.UndefOr[ExampleScenarioInstanceContainedInstance] = js.undefined
  
  /**
    * A short descriptive label the step to be used in tables or diagrams.
    */
  var title: String
  
  /**
    * The standardized type of action (FHIR or otherwise).
    */
  var `type`: js.UndefOr[Coding] = js.undefined
}
object ExampleScenarioProcessStepOperation {
  
  inline def apply(title: String): ExampleScenarioProcessStepOperation = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExampleScenarioProcessStepOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExampleScenarioProcessStepOperation] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInitiator(value: String): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorActive(value: Boolean): Self = StObject.set(x, "initiatorActive", value.asInstanceOf[js.Any])
    
    inline def setInitiatorActiveUndefined: Self = StObject.set(x, "initiatorActive", js.undefined)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setReceiver(value: String): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setReceiverActive(value: Boolean): Self = StObject.set(x, "receiverActive", value.asInstanceOf[js.Any])
    
    inline def setReceiverActiveUndefined: Self = StObject.set(x, "receiverActive", js.undefined)
    
    inline def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
    
    inline def setRequest(value: ExampleScenarioInstanceContainedInstance): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResponse(value: ExampleScenarioInstanceContainedInstance): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: Coding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_initiator(value: Element): Self = StObject.set(x, "_initiator", value.asInstanceOf[js.Any])
    
    inline def set_initiatorActive(value: Element): Self = StObject.set(x, "_initiatorActive", value.asInstanceOf[js.Any])
    
    inline def set_initiatorActiveUndefined: Self = StObject.set(x, "_initiatorActive", js.undefined)
    
    inline def set_initiatorUndefined: Self = StObject.set(x, "_initiator", js.undefined)
    
    inline def set_receiver(value: Element): Self = StObject.set(x, "_receiver", value.asInstanceOf[js.Any])
    
    inline def set_receiverActive(value: Element): Self = StObject.set(x, "_receiverActive", value.asInstanceOf[js.Any])
    
    inline def set_receiverActiveUndefined: Self = StObject.set(x, "_receiverActive", js.undefined)
    
    inline def set_receiverUndefined: Self = StObject.set(x, "_receiver", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}
