package typings
package gapiDotClientDotIamLib.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryTestablePermissionsResponse extends js.Object {
  /**
               * To retrieve the next page of results, set
               * `QueryTestableRolesRequest.page_token` to this value.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The Permissions testable on the requested resource. */
  var permissions: js.UndefOr[js.Array[Permission]] = js.undefined
}

