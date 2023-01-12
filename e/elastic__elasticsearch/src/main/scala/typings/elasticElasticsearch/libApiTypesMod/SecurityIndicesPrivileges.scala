package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityIndicesPrivileges extends StObject {
  
  var allow_restricted_indices: js.UndefOr[Boolean] = js.undefined
  
  var field_security: js.UndefOr[SecurityFieldSecurity | js.Array[SecurityFieldSecurity]] = js.undefined
  
  var names: Indices
  
  var privileges: js.Array[SecurityIndexPrivilege]
  
  var query: js.UndefOr[SecurityIndicesPrivilegesQuery] = js.undefined
}
object SecurityIndicesPrivileges {
  
  inline def apply(names: Indices, privileges: js.Array[SecurityIndexPrivilege]): SecurityIndicesPrivileges = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], privileges = privileges.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityIndicesPrivileges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityIndicesPrivileges] (val x: Self) extends AnyVal {
    
    inline def setAllow_restricted_indices(value: Boolean): Self = StObject.set(x, "allow_restricted_indices", value.asInstanceOf[js.Any])
    
    inline def setAllow_restricted_indicesUndefined: Self = StObject.set(x, "allow_restricted_indices", js.undefined)
    
    inline def setField_security(value: SecurityFieldSecurity | js.Array[SecurityFieldSecurity]): Self = StObject.set(x, "field_security", value.asInstanceOf[js.Any])
    
    inline def setField_securityUndefined: Self = StObject.set(x, "field_security", js.undefined)
    
    inline def setField_securityVarargs(value: SecurityFieldSecurity*): Self = StObject.set(x, "field_security", js.Array(value*))
    
    inline def setNames(value: Indices): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: IndexName*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setPrivileges(value: js.Array[SecurityIndexPrivilege]): Self = StObject.set(x, "privileges", value.asInstanceOf[js.Any])
    
    inline def setPrivilegesVarargs(value: SecurityIndexPrivilege*): Self = StObject.set(x, "privileges", js.Array(value*))
    
    inline def setQuery(value: SecurityIndicesPrivilegesQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
