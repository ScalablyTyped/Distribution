package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`lot-numbers`
import typings.fhir.fhirStrings.`serial-numbers`
import typings.fhir.fhirStrings.model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinitionCorrectiveAction
  extends StObject
     with BackboneElement {
  
  var _recall: js.UndefOr[Element] = js.undefined
  
  var _scope: js.UndefOr[Element] = js.undefined
  
  /**
    * Start and end dates of the  corrective action.
    */
  var period: Period
  
  /**
    * When a field safety action has been initiated but not yet resulted in a recall, this element will be set to 'false'.
    */
  var recall: Boolean
  
  /**
    * The scope of the corrective action - whether the action targeted all units of a given device model, or only a specific set of batches identified by lot numbers, or individually identified devices identified by the serial name.
    */
  var scope: js.UndefOr[model | `lot-numbers` | `serial-numbers`] = js.undefined
}
object DeviceDefinitionCorrectiveAction {
  
  inline def apply(period: Period, recall: Boolean): DeviceDefinitionCorrectiveAction = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any], recall = recall.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDefinitionCorrectiveAction]
  }
  
  extension [Self <: DeviceDefinitionCorrectiveAction](x: Self) {
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setRecall(value: Boolean): Self = StObject.set(x, "recall", value.asInstanceOf[js.Any])
    
    inline def setScope(value: model | `lot-numbers` | `serial-numbers`): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def set_recall(value: Element): Self = StObject.set(x, "_recall", value.asInstanceOf[js.Any])
    
    inline def set_recallUndefined: Self = StObject.set(x, "_recall", js.undefined)
    
    inline def set_scope(value: Element): Self = StObject.set(x, "_scope", value.asInstanceOf[js.Any])
    
    inline def set_scopeUndefined: Self = StObject.set(x, "_scope", js.undefined)
  }
}
