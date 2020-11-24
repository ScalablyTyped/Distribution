package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the permissions required by a specific app and whether
  * they have been accepted by the enterprise.
  */
@js.native
trait SchemaProductPermissions extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#productPermissions&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The permissions required by the app.
    */
  var permission: js.UndefOr[js.Array[SchemaProductPermission]] = js.native
  
  /**
    * The ID of the app that the permissions relate to, e.g.
    * &quot;app:com.google.android.gm&quot;.
    */
  var productId: js.UndefOr[String] = js.native
}
object SchemaProductPermissions {
  
  @scala.inline
  def apply(): SchemaProductPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductPermissions]
  }
  
  @scala.inline
  implicit class SchemaProductPermissionsOps[Self <: SchemaProductPermissions] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPermissionVarargs(value: SchemaProductPermission*): Self = this.set("permission", js.Array(value :_*))
    
    @scala.inline
    def setPermission(value: js.Array[SchemaProductPermission]): Self = this.set("permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermission: Self = this.set("permission", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
  }
}
