package typings.fhir.r5Mod

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

trait PlanDefinitionActionRelatedAction
  extends StObject
     with BackboneElement {
  
  var _endRelationship: js.UndefOr[Element] = js.undefined
  
  var _relationship: js.UndefOr[Element] = js.undefined
  
  var _targetId: js.UndefOr[Element] = js.undefined
  
  /**
    * The relationship of the end of this action to the related action.
    */
  var endRelationship: js.UndefOr[
    before | `before-start` | `before-end` | concurrent | `concurrent-with-start` | `concurrent-with-end` | after | `after-start` | `after-end`
  ] = js.undefined
  
  /**
    * A duration or range of durations to apply to the relationship. For example, 30-60 minutes before.
    */
  var offsetDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * A duration or range of durations to apply to the relationship. For example, 30-60 minutes before.
    */
  var offsetRange: js.UndefOr[Range] = js.undefined
  
  /**
    * The relationship of the start of this action to the related action.
    */
  var relationship: before | `before-start` | `before-end` | concurrent | `concurrent-with-start` | `concurrent-with-end` | after | `after-start` | `after-end`
  
  /**
    * The element id of the target related action.
    */
  var targetId: String
}
object PlanDefinitionActionRelatedAction {
  
  inline def apply(
    relationship: before | `before-start` | `before-end` | concurrent | `concurrent-with-start` | `concurrent-with-end` | after | `after-start` | `after-end`,
    targetId: String
  ): PlanDefinitionActionRelatedAction = {
    val __obj = js.Dynamic.literal(relationship = relationship.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanDefinitionActionRelatedAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlanDefinitionActionRelatedAction] (val x: Self) extends AnyVal {
    
    inline def setEndRelationship(
      value: before | `before-start` | `before-end` | concurrent | `concurrent-with-start` | `concurrent-with-end` | after | `after-start` | `after-end`
    ): Self = StObject.set(x, "endRelationship", value.asInstanceOf[js.Any])
    
    inline def setEndRelationshipUndefined: Self = StObject.set(x, "endRelationship", js.undefined)
    
    inline def setOffsetDuration(value: Duration): Self = StObject.set(x, "offsetDuration", value.asInstanceOf[js.Any])
    
    inline def setOffsetDurationUndefined: Self = StObject.set(x, "offsetDuration", js.undefined)
    
    inline def setOffsetRange(value: Range): Self = StObject.set(x, "offsetRange", value.asInstanceOf[js.Any])
    
    inline def setOffsetRangeUndefined: Self = StObject.set(x, "offsetRange", js.undefined)
    
    inline def setRelationship(
      value: before | `before-start` | `before-end` | concurrent | `concurrent-with-start` | `concurrent-with-end` | after | `after-start` | `after-end`
    ): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def set_endRelationship(value: Element): Self = StObject.set(x, "_endRelationship", value.asInstanceOf[js.Any])
    
    inline def set_endRelationshipUndefined: Self = StObject.set(x, "_endRelationship", js.undefined)
    
    inline def set_relationship(value: Element): Self = StObject.set(x, "_relationship", value.asInstanceOf[js.Any])
    
    inline def set_relationshipUndefined: Self = StObject.set(x, "_relationship", js.undefined)
    
    inline def set_targetId(value: Element): Self = StObject.set(x, "_targetId", value.asInstanceOf[js.Any])
    
    inline def set_targetIdUndefined: Self = StObject.set(x, "_targetId", js.undefined)
  }
}
