package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FindThreatMatchesRequest extends js.Object {
  /** The client metadata. */
  var client: js.UndefOr[ClientInfo] = js.undefined
  /** The lists and entries to be checked for matches. */
  var threatInfo: js.UndefOr[ThreatInfo] = js.undefined
}

