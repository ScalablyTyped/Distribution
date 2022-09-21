package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExplanation extends StObject {
  
  /**
    * The map from roles to their included permissions that match the permission query (i.e., a query containing `policy.role.permissions:`). Example: if query `policy.role.permissions:compute.disk.get` matches a policy binding that contains owner role, the matched_permissions will be `{"roles/owner": ["compute.disk.get"]\}`. The roles can also be found in the returned `policy` bindings. Note that the map is populated only for requests with permission queries.
    */
  var matchedPermissions: js.UndefOr[StringDictionary[SchemaPermissions] | Null] = js.undefined
}
object SchemaExplanation {
  
  inline def apply(): SchemaExplanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExplanation]
  }
  
  extension [Self <: SchemaExplanation](x: Self) {
    
    inline def setMatchedPermissions(value: StringDictionary[SchemaPermissions]): Self = StObject.set(x, "matchedPermissions", value.asInstanceOf[js.Any])
    
    inline def setMatchedPermissionsNull: Self = StObject.set(x, "matchedPermissions", null)
    
    inline def setMatchedPermissionsUndefined: Self = StObject.set(x, "matchedPermissions", js.undefined)
  }
}
