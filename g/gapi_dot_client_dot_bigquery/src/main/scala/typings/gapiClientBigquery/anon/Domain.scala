package typings.gapiClientBigquery.anon

import typings.gapiClientBigquery.gapi.client.bigquery.TableReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Domain extends js.Object {
  /** [Pick one] A domain to grant access to. Any users signed in with the domain specified will be granted the specified access. Example: "example.com". */
  var domain: js.UndefOr[String] = js.native
  /** [Pick one] An email address of a Google Group to grant access to. */
  var groupByEmail: js.UndefOr[String] = js.native
  /**
    * [Required] Describes the rights granted to the user specified by the other member of the access object. The following string values are supported:
    * READER, WRITER, OWNER.
    */
  var role: js.UndefOr[String] = js.native
  /**
    * [Pick one] A special group to grant access to. Possible values include: projectOwners: Owners of the enclosing project. projectReaders: Readers of the
    * enclosing project. projectWriters: Writers of the enclosing project. allAuthenticatedUsers: All authenticated BigQuery users.
    */
  var specialGroup: js.UndefOr[String] = js.native
  /** [Pick one] An email address of a user to grant access to. For example: fred@example.com. */
  var userByEmail: js.UndefOr[String] = js.native
  /**
    * [Pick one] A view from a different dataset to grant access to. Queries executed against that view will have read access to tables in this dataset. The
    * role field is not required when this field is set. If that view is updated by any user, access to the view needs to be granted again via an update
    * operation.
    */
  var view: js.UndefOr[TableReference] = js.native
}

object Domain {
  @scala.inline
  def apply(): Domain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Domain]
  }
  @scala.inline
  implicit class DomainOps[Self <: Domain] (val x: Self) extends AnyVal {
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setGroupByEmail(value: String): Self = this.set("groupByEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupByEmail: Self = this.set("groupByEmail", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setSpecialGroup(value: String): Self = this.set("specialGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecialGroup: Self = this.set("specialGroup", js.undefined)
    @scala.inline
    def setUserByEmail(value: String): Self = this.set("userByEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserByEmail: Self = this.set("userByEmail", js.undefined)
    @scala.inline
    def setView(value: TableReference): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

