package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class GroupMemberMutableBuilder[Self <: GroupMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: Reference): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactive(value: Boolean): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def set_inactive(value: Element): Self = StObject.set(x, "_inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_inactiveUndefined: Self = StObject.set(x, "_inactive", js.undefined)
  }
}
