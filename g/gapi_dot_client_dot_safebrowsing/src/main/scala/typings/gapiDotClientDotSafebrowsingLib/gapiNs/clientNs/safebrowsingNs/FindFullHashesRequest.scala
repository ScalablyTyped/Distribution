package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindFullHashesRequest extends js.Object {
  /**
    * Client metadata associated with callers of higher-level APIs built on top
    * of the client's implementation.
    */
  var apiClient: js.UndefOr[ClientInfo] = js.undefined
  /** The client metadata. */
  var client: js.UndefOr[ClientInfo] = js.undefined
  /** The current client states for each of the client's local threat lists. */
  var clientStates: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The lists and hashes to be checked. */
  var threatInfo: js.UndefOr[ThreatInfo] = js.undefined
}

