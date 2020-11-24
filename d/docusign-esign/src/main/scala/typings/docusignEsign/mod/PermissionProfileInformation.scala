package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionProfileInformation extends js.Object {
  
  /**
    * A complex type containing a collection of permission profiles.
    */
  var permissionProfiles: js.UndefOr[
    js.Array[
      /* This object defines the account permissions for a profile that you can apply to a group of users. */ PermissionProfile
    ]
  ] = js.native
}
object PermissionProfileInformation {
  
  @scala.inline
  def apply(): PermissionProfileInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionProfileInformation]
  }
  
  @scala.inline
  implicit class PermissionProfileInformationOps[Self <: PermissionProfileInformation] (val x: Self) extends AnyVal {
    
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
    def setPermissionProfilesVarargs(
      value: (/* This object defines the account permissions for a profile that you can apply to a group of users. */ PermissionProfile)*
    ): Self = this.set("permissionProfiles", js.Array(value :_*))
    
    @scala.inline
    def setPermissionProfiles(
      value: js.Array[
          /* This object defines the account permissions for a profile that you can apply to a group of users. */ PermissionProfile
        ]
    ): Self = this.set("permissionProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionProfiles: Self = this.set("permissionProfiles", js.undefined)
  }
}
