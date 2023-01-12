package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SecurityHasPrivilegesUserProfilePrivilegesCheck
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SecurityUserProfileId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Privileges extends StObject {
  
  var privileges: SecurityHasPrivilegesUserProfilePrivilegesCheck
  
  var uids: js.Array[SecurityUserProfileId]
}
object Privileges {
  
  inline def apply(privileges: SecurityHasPrivilegesUserProfilePrivilegesCheck, uids: js.Array[SecurityUserProfileId]): Privileges = {
    val __obj = js.Dynamic.literal(privileges = privileges.asInstanceOf[js.Any], uids = uids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Privileges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Privileges] (val x: Self) extends AnyVal {
    
    inline def setPrivileges(value: SecurityHasPrivilegesUserProfilePrivilegesCheck): Self = StObject.set(x, "privileges", value.asInstanceOf[js.Any])
    
    inline def setUids(value: js.Array[SecurityUserProfileId]): Self = StObject.set(x, "uids", value.asInstanceOf[js.Any])
    
    inline def setUidsVarargs(value: SecurityUserProfileId*): Self = StObject.set(x, "uids", js.Array(value*))
  }
}
