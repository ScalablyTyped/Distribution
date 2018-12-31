package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPoliciesResponse extends js.Object {
  /** If there are more results, a token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The list of policies. */
  var policies: js.UndefOr[js.Array[Policy]] = js.undefined
}

