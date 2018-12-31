package typings
package gapiDotClientDotBigqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Role extends js.Object {
  /** [Pick one] A domain to grant access to. Any users signed in with the domain specified will be granted the specified access. Example: "example.com". */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /** [Pick one] An email address of a Google Group to grant access to. */
  var groupByEmail: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Required] Describes the rights granted to the user specified by the other member of the access object. The following string values are supported:
    * READER, WRITER, OWNER.
    */
  var role: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Pick one] A special group to grant access to. Possible values include: projectOwners: Owners of the enclosing project. projectReaders: Readers of the
    * enclosing project. projectWriters: Writers of the enclosing project. allAuthenticatedUsers: All authenticated BigQuery users.
    */
  var specialGroup: js.UndefOr[java.lang.String] = js.undefined
  /** [Pick one] An email address of a user to grant access to. For example: fred@example.com. */
  var userByEmail: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Pick one] A view from a different dataset to grant access to. Queries executed against that view will have read access to tables in this dataset. The
    * role field is not required when this field is set. If that view is updated by any user, access to the view needs to be granted again via an update
    * operation.
    */
  var view: js.UndefOr[gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs.TableReference] = js.undefined
}

