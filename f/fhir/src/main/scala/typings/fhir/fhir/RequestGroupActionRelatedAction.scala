package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Relationship to another action
  */
trait RequestGroupActionRelatedAction
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'actionId'.
    */
  var _actionId: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'relationship'.
    */
  var _relationship: js.UndefOr[Element] = js.undefined
  
  /**
    * What action this is related to
    */
  var actionId: id
  
  /**
    * Time offset for the relationship
    */
  var offsetDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * Time offset for the relationship
    */
  var offsetRange: js.UndefOr[Range] = js.undefined
  
  /**
    * before-start | before | before-end | concurrent-with-start | concurrent | concurrent-with-end | after-start | after | after-end
    */
  var relationship: code
}
object RequestGroupActionRelatedAction {
  
  inline def apply(actionId: id, relationship: code): RequestGroupActionRelatedAction = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestGroupActionRelatedAction]
  }
  
  extension [Self <: RequestGroupActionRelatedAction](x: Self) {
    
    inline def setActionId(value: id): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setOffsetDuration(value: Duration): Self = StObject.set(x, "offsetDuration", value.asInstanceOf[js.Any])
    
    inline def setOffsetDurationUndefined: Self = StObject.set(x, "offsetDuration", js.undefined)
    
    inline def setOffsetRange(value: Range): Self = StObject.set(x, "offsetRange", value.asInstanceOf[js.Any])
    
    inline def setOffsetRangeUndefined: Self = StObject.set(x, "offsetRange", js.undefined)
    
    inline def setRelationship(value: code): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def set_actionId(value: Element): Self = StObject.set(x, "_actionId", value.asInstanceOf[js.Any])
    
    inline def set_actionIdUndefined: Self = StObject.set(x, "_actionId", js.undefined)
    
    inline def set_relationship(value: Element): Self = StObject.set(x, "_relationship", value.asInstanceOf[js.Any])
    
    inline def set_relationshipUndefined: Self = StObject.set(x, "_relationship", js.undefined)
  }
}
