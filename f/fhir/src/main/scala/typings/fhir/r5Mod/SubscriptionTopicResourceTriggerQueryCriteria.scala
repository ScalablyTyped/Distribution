package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`test-fails`
import typings.fhir.fhirStrings.`test-passes`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionTopicResourceTriggerQueryCriteria
  extends StObject
     with BackboneElement {
  
  var _current: js.UndefOr[Element] = js.undefined
  
  var _previous: js.UndefOr[Element] = js.undefined
  
  var _requireBoth: js.UndefOr[Element] = js.undefined
  
  var _resultForCreate: js.UndefOr[Element] = js.undefined
  
  var _resultForDelete: js.UndefOr[Element] = js.undefined
  
  /**
    * The rules are search criteria (without the [base] part). Like Bundle.entry.request.url, it has no leading "/".
    */
  var current: js.UndefOr[String] = js.undefined
  
  /**
    * The rules are search criteria (without the [base] part). Like Bundle.entry.request.url, it has no leading "/".
    */
  var previous: js.UndefOr[String] = js.undefined
  
  /**
    * If set to true, both current and previous criteria must evaluate true to  trigger a notification for this topic.  Otherwise a notification for this topic will be triggered if either one evaluates to true.
    */
  var requireBoth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * What behavior a server will exhibit if the previous state of a resource does NOT exist (e.g., prior to a create).
    */
  var resultForCreate: js.UndefOr[`test-passes` | `test-fails`] = js.undefined
  
  /**
    * What behavior a server will exhibit if the current state of a resource does NOT exist (e.g., after a DELETE).
    */
  var resultForDelete: js.UndefOr[`test-passes` | `test-fails`] = js.undefined
}
object SubscriptionTopicResourceTriggerQueryCriteria {
  
  inline def apply(): SubscriptionTopicResourceTriggerQueryCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionTopicResourceTriggerQueryCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionTopicResourceTriggerQueryCriteria] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setRequireBoth(value: Boolean): Self = StObject.set(x, "requireBoth", value.asInstanceOf[js.Any])
    
    inline def setRequireBothUndefined: Self = StObject.set(x, "requireBoth", js.undefined)
    
    inline def setResultForCreate(value: `test-passes` | `test-fails`): Self = StObject.set(x, "resultForCreate", value.asInstanceOf[js.Any])
    
    inline def setResultForCreateUndefined: Self = StObject.set(x, "resultForCreate", js.undefined)
    
    inline def setResultForDelete(value: `test-passes` | `test-fails`): Self = StObject.set(x, "resultForDelete", value.asInstanceOf[js.Any])
    
    inline def setResultForDeleteUndefined: Self = StObject.set(x, "resultForDelete", js.undefined)
    
    inline def set_current(value: Element): Self = StObject.set(x, "_current", value.asInstanceOf[js.Any])
    
    inline def set_currentUndefined: Self = StObject.set(x, "_current", js.undefined)
    
    inline def set_previous(value: Element): Self = StObject.set(x, "_previous", value.asInstanceOf[js.Any])
    
    inline def set_previousUndefined: Self = StObject.set(x, "_previous", js.undefined)
    
    inline def set_requireBoth(value: Element): Self = StObject.set(x, "_requireBoth", value.asInstanceOf[js.Any])
    
    inline def set_requireBothUndefined: Self = StObject.set(x, "_requireBoth", js.undefined)
    
    inline def set_resultForCreate(value: Element): Self = StObject.set(x, "_resultForCreate", value.asInstanceOf[js.Any])
    
    inline def set_resultForCreateUndefined: Self = StObject.set(x, "_resultForCreate", js.undefined)
    
    inline def set_resultForDelete(value: Element): Self = StObject.set(x, "_resultForDelete", value.asInstanceOf[js.Any])
    
    inline def set_resultForDeleteUndefined: Self = StObject.set(x, "_resultForDelete", js.undefined)
  }
}
