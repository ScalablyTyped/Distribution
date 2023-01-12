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
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _number: js.UndefOr[Element] = js.undefined
  
  var _receiver: js.UndefOr[Element] = js.undefined
  
  var _receiverActive: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * A comment to be inserted in the diagram.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Who starts the transaction.
    */
  var initiator: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the initiator is deactivated right after the transaction.
    */
  var initiatorActive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The human-friendly name of the interaction.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The sequential number of the interaction, e.g. 1.2.5.
    */
  var number: String
  
  /**
    * Who receives the transaction.
    */
  var receiver: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the receiver is deactivated right after the transaction.
    */
  var receiverActive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Each resource instance used by the initiator.
    */
  var request: js.UndefOr[ExampleScenarioInstanceContainedInstance] = js.undefined
  
  /**
    * Each resource instance used by the responder.
    */
  var response: js.UndefOr[ExampleScenarioInstanceContainedInstance] = js.undefined
  
  /**
    * The type of operation - CRUD.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ExampleScenarioProcessStepOperation {
  
  inline def apply(number: String): ExampleScenarioProcessStepOperation = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
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
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setReceiver(value: String): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setReceiverActive(value: Boolean): Self = StObject.set(x, "receiverActive", value.asInstanceOf[js.Any])
    
    inline def setReceiverActiveUndefined: Self = StObject.set(x, "receiverActive", js.undefined)
    
    inline def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
    
    inline def setRequest(value: ExampleScenarioInstanceContainedInstance): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResponse(value: ExampleScenarioInstanceContainedInstance): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_initiator(value: Element): Self = StObject.set(x, "_initiator", value.asInstanceOf[js.Any])
    
    inline def set_initiatorActive(value: Element): Self = StObject.set(x, "_initiatorActive", value.asInstanceOf[js.Any])
    
    inline def set_initiatorActiveUndefined: Self = StObject.set(x, "_initiatorActive", js.undefined)
    
    inline def set_initiatorUndefined: Self = StObject.set(x, "_initiator", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_number(value: Element): Self = StObject.set(x, "_number", value.asInstanceOf[js.Any])
    
    inline def set_numberUndefined: Self = StObject.set(x, "_number", js.undefined)
    
    inline def set_receiver(value: Element): Self = StObject.set(x, "_receiver", value.asInstanceOf[js.Any])
    
    inline def set_receiverActive(value: Element): Self = StObject.set(x, "_receiverActive", value.asInstanceOf[js.Any])
    
    inline def set_receiverActiveUndefined: Self = StObject.set(x, "_receiverActive", js.undefined)
    
    inline def set_receiverUndefined: Self = StObject.set(x, "_receiver", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
