package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Who or what is in group
  */
@js.native
trait GroupMember extends BackboneElement {
  
  /**
    * Contains extended information for property 'inactive'.
    */
  var _inactive: js.UndefOr[Element] = js.native
  
  /**
    * Reference to the group member
    */
  var entity: Reference = js.native
  
  /**
    * If member is no longer in group
    */
  var inactive: js.UndefOr[Boolean] = js.native
  
  /**
    * Period member belonged to the group
    */
  var period: js.UndefOr[Period] = js.native
}
object GroupMember {
  
  @scala.inline
  def apply(entity: Reference): GroupMember = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMember]
  }
  
  @scala.inline
  implicit class GroupMemberOps[Self <: GroupMember] (val x: Self) extends AnyVal {
    
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
    def setEntity(value: Reference): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_inactive(value: Element): Self = this.set("_inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_inactive: Self = this.set("_inactive", js.undefined)
    
    @scala.inline
    def setInactive(value: Boolean): Self = this.set("inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactive: Self = this.set("inactive", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
  }
}
