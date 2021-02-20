package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource representing a role within a Membership.
  */
@js.native
trait SchemaMembershipRole extends StObject {
  
  /**
    * MembershipRole in string format.  Currently supported MembershipRoles:
    * `&quot;MEMBER&quot;`.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaMembershipRole {
  
  @scala.inline
  def apply(): SchemaMembershipRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembershipRole]
  }
  
  @scala.inline
  implicit class SchemaMembershipRoleMutableBuilder[Self <: SchemaMembershipRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
