package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupMember
  extends StObject
     with BackboneElement {
  
  var _inactive: js.UndefOr[Element] = js.undefined
  
  /**
    * A reference to the entity that is a member of the group. Must be consistent with Group.type.
    */
  var entity: Reference
  
  /**
    * A flag to indicate that the member is no longer in the group, but previously may have been a member.
    */
  var inactive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The period that the member was in the group, if known.
    */
  var period: js.UndefOr[Period] = js.undefined
}
object GroupMember {
  
  inline def apply(entity: Reference): GroupMember = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupMember] (val x: Self) extends AnyVal {
    
    inline def setEntity(value: Reference): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setInactive(value: Boolean): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    inline def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def set_inactive(value: Element): Self = StObject.set(x, "_inactive", value.asInstanceOf[js.Any])
    
    inline def set_inactiveUndefined: Self = StObject.set(x, "_inactive", js.undefined)
  }
}
