package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListEnvironmentsResponse extends js.Object {
  /** All Environments of a GTM Container. */
  var environment: js.UndefOr[js.Array[Environment]] = js.undefined
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

