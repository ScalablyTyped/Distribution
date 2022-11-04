package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityUserIndicesPrivileges extends StObject {
  
  var allow_restricted_indices: Boolean
  
  var field_security: js.UndefOr[js.Array[SecurityFieldSecurity]] = js.undefined
  
  var names: Indices
  
  var privileges: js.Array[SecurityIndexPrivilege]
  
  var query: js.UndefOr[js.Array[SecurityIndicesPrivilegesQuery]] = js.undefined
}
object SecurityUserIndicesPrivileges {
  
  inline def apply(allow_restricted_indices: Boolean, names: Indices, privileges: js.Array[SecurityIndexPrivilege]): SecurityUserIndicesPrivileges = {
    val __obj = js.Dynamic.literal(allow_restricted_indices = allow_restricted_indices.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], privileges = privileges.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityUserIndicesPrivileges]
  }
  
  extension [Self <: SecurityUserIndicesPrivileges](x: Self) {
    
    inline def setAllow_restricted_indices(value: Boolean): Self = StObject.set(x, "allow_restricted_indices", value.asInstanceOf[js.Any])
    
    inline def setField_security(value: js.Array[SecurityFieldSecurity]): Self = StObject.set(x, "field_security", value.asInstanceOf[js.Any])
    
    inline def setField_securityUndefined: Self = StObject.set(x, "field_security", js.undefined)
    
    inline def setField_securityVarargs(value: SecurityFieldSecurity*): Self = StObject.set(x, "field_security", js.Array(value*))
    
    inline def setNames(value: Indices): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: IndexName*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setPrivileges(value: js.Array[SecurityIndexPrivilege]): Self = StObject.set(x, "privileges", value.asInstanceOf[js.Any])
    
    inline def setPrivilegesVarargs(value: SecurityIndexPrivilege*): Self = StObject.set(x, "privileges", js.Array(value*))
    
    inline def setQuery(value: js.Array[SecurityIndicesPrivilegesQuery]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setQueryVarargs(value: SecurityIndicesPrivilegesQuery*): Self = StObject.set(x, "query", js.Array(value*))
  }
}
