package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FetchThreatListUpdatesRequest extends js.Object {
  /** The client metadata. */
  var client: js.UndefOr[ClientInfo] = js.undefined
  /** The requested threat list updates. */
  var listUpdateRequests: js.UndefOr[js.Array[ListUpdateRequest]] = js.undefined
}

