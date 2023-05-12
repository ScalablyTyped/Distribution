package typings.fhir.r4bMod

import typings.fhir.fhirStrings.`after-end`
import typings.fhir.fhirStrings.`after-start`
import typings.fhir.fhirStrings.`before-end`
import typings.fhir.fhirStrings.`before-start`
import typings.fhir.fhirStrings.`concurrent-with-end`
import typings.fhir.fhirStrings.`concurrent-with-start`
import typings.fhir.fhirStrings.after
import typings.fhir.fhirStrings.before
import typings.fhir.fhirStrings.concurrent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestGroupActionRelatedAction
  extends StObject
     with BackboneElement {
  
  var _actionId: js.UndefOr[Element] = js.undefined
  
  var _relationship: js.UndefOr[Element] = js.undefined
  
  /**
    * The element id of the action this is related to.
    */
  var actionId: String
  
  /**
    * A duration or range of durations to apply to the relationship. For example, 30-60 minutes before.
    */
  var offsetDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * A duration or range of durations to apply to the relationship. For example, 30-60 minutes before.
    */
  var offsetRange: js.UndefOr[Range] = js.undefined
  
  /**
    * The relationship of this action to the related action.
    */
  var relationship: `before-start` | before | `before-end` | `concurrent-with-start` | concurrent | `concurrent-with-end` | `after-start` | after | `after-end`
}
object RequestGroupActionRelatedAction {
  
  inline def apply(
    actionId: String,
    relationship: `before-start` | before | `before-end` | `concurrent-with-start` | concurrent | `concurrent-with-end` | `after-start` | after | `after-end`
  ): RequestGroupActionRelatedAction = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestGroupActionRelatedAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestGroupActionRelatedAction] (val x: Self) extends AnyVal {
    
    inline def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setOffsetDuration(value: Duration): Self = StObject.set(x, "offsetDuration", value.asInstanceOf[js.Any])
    
    inline def setOffsetDurationUndefined: Self = StObject.set(x, "offsetDuration", js.undefined)
    
    inline def setOffsetRange(value: Range): Self = StObject.set(x, "offsetRange", value.asInstanceOf[js.Any])
    
    inline def setOffsetRangeUndefined: Self = StObject.set(x, "offsetRange", js.undefined)
    
    inline def setRelationship(
      value: `before-start` | before | `before-end` | `concurrent-with-start` | concurrent | `concurrent-with-end` | `after-start` | after | `after-end`
    ): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def set_actionId(value: Element): Self = StObject.set(x, "_actionId", value.asInstanceOf[js.Any])
    
    inline def set_actionIdUndefined: Self = StObject.set(x, "_actionId", js.undefined)
    
    inline def set_relationship(value: Element): Self = StObject.set(x, "_relationship", value.asInstanceOf[js.Any])
    
    inline def set_relationshipUndefined: Self = StObject.set(x, "_relationship", js.undefined)
  }
}
