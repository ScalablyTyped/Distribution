package typings.gapiDotClientDotBigquery

import typings.gapiDotClientDotBigquery.gapi.client.bigquery.TableReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Domain extends js.Object {
  /** [Pick one] A domain to grant access to. Any users signed in with the domain specified will be granted the specified access. Example: "example.com". */
  var domain: js.UndefOr[String] = js.undefined
  /** [Pick one] An email address of a Google Group to grant access to. */
  var groupByEmail: js.UndefOr[String] = js.undefined
  /**
    * [Required] Describes the rights granted to the user specified by the other member of the access object. The following string values are supported:
    * READER, WRITER, OWNER.
    */
  var role: js.UndefOr[String] = js.undefined
  /**
    * [Pick one] A special group to grant access to. Possible values include: projectOwners: Owners of the enclosing project. projectReaders: Readers of the
    * enclosing project. projectWriters: Writers of the enclosing project. allAuthenticatedUsers: All authenticated BigQuery users.
    */
  var specialGroup: js.UndefOr[String] = js.undefined
  /** [Pick one] An email address of a user to grant access to. For example: fred@example.com. */
  var userByEmail: js.UndefOr[String] = js.undefined
  /**
    * [Pick one] A view from a different dataset to grant access to. Queries executed against that view will have read access to tables in this dataset. The
    * role field is not required when this field is set. If that view is updated by any user, access to the view needs to be granted again via an update
    * operation.
    */
  var view: js.UndefOr[TableReference] = js.undefined
}

object Anon_Domain {
  @scala.inline
  def apply(
    domain: String = null,
    groupByEmail: String = null,
    role: String = null,
    specialGroup: String = null,
    userByEmail: String = null,
    view: TableReference = null
  ): Anon_Domain = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (groupByEmail != null) __obj.updateDynamic("groupByEmail")(groupByEmail.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (specialGroup != null) __obj.updateDynamic("specialGroup")(specialGroup.asInstanceOf[js.Any])
    if (userByEmail != null) __obj.updateDynamic("userByEmail")(userByEmail.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Domain]
  }
}

