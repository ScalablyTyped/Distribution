package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestIamPermissionsRequest extends js.Object {
  /**
    * REQUIRED: The set of permissions to check for the 'resource'.
    * Permissions with wildcards (such as '&#42;' or 'storage.&#42;') are not allowed.
    * Allowed permissions are&#58;
    *
    * &#42; `genomics.datasets.create`
    * &#42; `genomics.datasets.delete`
    * &#42; `genomics.datasets.get`
    * &#42; `genomics.datasets.list`
    * &#42; `genomics.datasets.update`
    * &#42; `genomics.datasets.getIamPolicy`
    * &#42; `genomics.datasets.setIamPolicy`
    */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}

object TestIamPermissionsRequest {
  @scala.inline
  def apply(): TestIamPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestIamPermissionsRequest]
  }
  @scala.inline
  implicit class TestIamPermissionsRequestOps[Self <: TestIamPermissionsRequest] (val x: Self) extends AnyVal {
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
    def setPermissionsVarargs(value: String*): Self = this.set("permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
  }
  
}

