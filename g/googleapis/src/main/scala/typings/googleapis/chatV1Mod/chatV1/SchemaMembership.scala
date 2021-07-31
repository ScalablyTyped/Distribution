package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a membership relation in Hangouts Chat.
  */
trait SchemaMembership extends StObject {
  
  /**
    * The creation time of the membership a.k.a the time at which the member
    * joined the space, if applicable.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Member details.
    */
  var member: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * Resource name of the membership, in the form
    * &quot;spaces/x/members/ *&quot;.  Example:
    * spaces/AAAAMpdlehY/members/105115627578887013105
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * State of the membership.
    */
  var state: js.UndefOr[String] = js.undefined
}
object SchemaMembership {
  
  @scala.inline
  def apply(): SchemaMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembership]
  }
  
  @scala.inline
  implicit class SchemaMembershipMutableBuilder[Self <: SchemaMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setMember(value: SchemaUser): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
