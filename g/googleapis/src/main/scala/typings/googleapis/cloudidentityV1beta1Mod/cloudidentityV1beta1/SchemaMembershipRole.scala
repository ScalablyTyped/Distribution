package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource representing a role within a Membership.
  */
trait SchemaMembershipRole extends StObject {
  
  /**
    * MembershipRole in string format.  Currently supported MembershipRoles:
    * `&quot;MEMBER&quot;`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaMembershipRole {
  
  inline def apply(): SchemaMembershipRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembershipRole]
  }
  
  extension [Self <: SchemaMembershipRole](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
