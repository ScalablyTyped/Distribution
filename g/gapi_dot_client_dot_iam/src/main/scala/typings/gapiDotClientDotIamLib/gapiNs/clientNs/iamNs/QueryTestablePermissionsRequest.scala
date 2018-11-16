package typings
package gapiDotClientDotIamLib.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryTestablePermissionsRequest extends js.Object {
  /**
               * Required. The full resource name to query from the list of testable
               * permissions.
               *
               * The name follows the Google Cloud Platform resource format.
               * For example, a Cloud Platform project with id `my-project` will be named
               * `//cloudresourcemanager.googleapis.com/projects/my-project`.
               */
  var fullResourceName: js.UndefOr[java.lang.String] = js.undefined
  /** Optional limit on the number of permissions to include in the response. */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
               * Optional pagination token returned in an earlier
               * QueryTestablePermissionsRequest.
               */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
}

