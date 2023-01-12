package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetServiceAccountsRoleDescriptorWrapper extends StObject {
  
  var role_descriptor: SecurityRoleDescriptorRead
}
object SecurityGetServiceAccountsRoleDescriptorWrapper {
  
  inline def apply(role_descriptor: SecurityRoleDescriptorRead): SecurityGetServiceAccountsRoleDescriptorWrapper = {
    val __obj = js.Dynamic.literal(role_descriptor = role_descriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetServiceAccountsRoleDescriptorWrapper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityGetServiceAccountsRoleDescriptorWrapper] (val x: Self) extends AnyVal {
    
    inline def setRole_descriptor(value: SecurityRoleDescriptorRead): Self = StObject.set(x, "role_descriptor", value.asInstanceOf[js.Any])
  }
}
