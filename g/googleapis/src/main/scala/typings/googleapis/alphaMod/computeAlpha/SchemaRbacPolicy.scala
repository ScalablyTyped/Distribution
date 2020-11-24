package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRbacPolicy extends js.Object {
  
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
  implicit class SchemaRbacPolicyOps[Self <: SchemaRbacPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: SchemaPermission*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[SchemaPermission]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setPrincipalsVarargs(value: SchemaPrincipal*): Self = this.set("principals", js.Array(value :_*))
    
    @scala.inline
    def setPrincipals(value: js.Array[SchemaPrincipal]): Self = this.set("principals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipals: Self = this.set("principals", js.undefined)
  }
}
