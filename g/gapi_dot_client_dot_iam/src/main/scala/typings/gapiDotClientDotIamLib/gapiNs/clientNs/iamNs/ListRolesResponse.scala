package typings
package gapiDotClientDotIamLib.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRolesResponse extends js.Object {
  /**
    * To retrieve the next page of results, set
    * `ListRolesRequest.page_token` to this value.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The Roles defined on this resource. */
  var roles: js.UndefOr[js.Array[Role]] = js.undefined
}

