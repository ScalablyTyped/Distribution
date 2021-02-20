package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRbacPolicy extends StObject {
  
  /**
    * Name of the RbacPolicy.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The list of permissions.
    */
  var permissions: js.UndefOr[js.Array[SchemaPermission]] = js.native
  
  /**
    * The list of principals.
    */
  var principals: js.UndefOr[js.Array[SchemaPrincipal]] = js.native
}
object SchemaRbacPolicy {
  
  @scala.inline
  def apply(): SchemaRbacPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRbacPolicy]
  }
  
  @scala.inline
  implicit class SchemaRbacPolicyMutableBuilder[Self <: SchemaRbacPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPermissions(value: js.Array[SchemaPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: SchemaPermission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setPrincipals(value: js.Array[SchemaPrincipal]): Self = StObject.set(x, "principals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalsUndefined: Self = StObject.set(x, "principals", js.undefined)
    
    @scala.inline
    def setPrincipalsVarargs(value: SchemaPrincipal*): Self = StObject.set(x, "principals", js.Array(value :_*))
  }
}
