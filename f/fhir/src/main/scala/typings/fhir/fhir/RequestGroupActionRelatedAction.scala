package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Relationship to another action
  */
@js.native
trait RequestGroupActionRelatedAction extends BackboneElement {
  
  /**
    * Contains extended information for property 'actionId'.
    */
  var _actionId: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'relationship'.
    */
  var _relationship: js.UndefOr[Element] = js.native
  
  /**
    * What action this is related to
    */
  var actionId: id = js.native
  
  /**
    * Time offset for the relationship
    */
  var offsetDuration: js.UndefOr[Duration] = js.native
  
  /**
    * Time offset for the relationship
    */
  var offsetRange: js.UndefOr[Range] = js.native
  
  /**
    * before-start | before | before-end | concurrent-with-start | concurrent | concurrent-with-end | after-start | after | after-end
    */
  var relationship: code = js.native
}
object RequestGroupActionRelatedAction {
  
  @scala.inline
  def apply(actionId: id, relationship: code): RequestGroupActionRelatedAction = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestGroupActionRelatedAction]
  }
  
  @scala.inline
  implicit class RequestGroupActionRelatedActionOps[Self <: RequestGroupActionRelatedAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionId(value: id): Self = this.set("actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationship(value: code): Self = this.set("relationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_actionId(value: Element): Self = this.set("_actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_actionId: Self = this.set("_actionId", js.undefined)
    
    @scala.inline
    def set_relationship(value: Element): Self = this.set("_relationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_relationship: Self = this.set("_relationship", js.undefined)
    
    @scala.inline
    def setOffsetDuration(value: Duration): Self = this.set("offsetDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetDuration: Self = this.set("offsetDuration", js.undefined)
    
    @scala.inline
    def setOffsetRange(value: Range): Self = this.set("offsetRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetRange: Self = this.set("offsetRange", js.undefined)
  }
}
