package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A product permissions resource represents the set of permissions required
  * by a specific app and whether or not they have been accepted by an
  * enterprise admin.  The API can be used to read the set of permissions, and
  * also to update the set to indicate that permissions have been accepted.
  */
@js.native
trait SchemaProductPermission extends js.Object {
  
  /**
    * An opaque string uniquely identifying the permission.
    */
  var permissionId: js.UndefOr[String] = js.native
  
  /**
    * Whether the permission has been accepted or not.
    */
  var state: js.UndefOr[String] = js.native
}
object SchemaProductPermission {
  
  @scala.inline
  def apply(): SchemaProductPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductPermission]
  }
  
  @scala.inline
  implicit class SchemaProductPermissionOps[Self <: SchemaProductPermission] (val x: Self) extends AnyVal {
    
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
    def setPermissionId(value: String): Self = this.set("permissionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionId: Self = this.set("permissionId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
