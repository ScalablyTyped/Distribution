package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityHasPrivilegesIndexPrivilegesCheck extends StObject {
  
  var allow_restricted_indices: js.UndefOr[Boolean] = js.undefined
  
  var names: Indices
  
  var privileges: js.Array[SecurityIndexPrivilege]
}
object SecurityHasPrivilegesIndexPrivilegesCheck {
  
  inline def apply(names: Indices, privileges: js.Array[SecurityIndexPrivilege]): SecurityHasPrivilegesIndexPrivilegesCheck = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], privileges = privileges.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityHasPrivilegesIndexPrivilegesCheck]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityHasPrivilegesIndexPrivilegesCheck] (val x: Self) extends AnyVal {
    
    inline def setAllow_restricted_indices(value: Boolean): Self = StObject.set(x, "allow_restricted_indices", value.asInstanceOf[js.Any])
    
    inline def setAllow_restricted_indicesUndefined: Self = StObject.set(x, "allow_restricted_indices", js.undefined)
    
    inline def setNames(value: Indices): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: IndexName*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setPrivileges(value: js.Array[SecurityIndexPrivilege]): Self = StObject.set(x, "privileges", value.asInstanceOf[js.Any])
    
    inline def setPrivilegesVarargs(value: SecurityIndexPrivilege*): Self = StObject.set(x, "privileges", js.Array(value*))
  }
}
