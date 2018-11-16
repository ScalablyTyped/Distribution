package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val encodedFullHashes: gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs.EncodedFullHashesResource = js.native
  val encodedUpdates: gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs.EncodedUpdatesResource = js.native
  val fullHashes: gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs.FullHashesResource = js.native
  val threatListUpdates: gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs.ThreatListUpdatesResource = js.native
  val threatLists: gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs.ThreatListsResource = js.native
  val threatMatches: gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs.ThreatMatchesResource = js.native
  /** Load Google Safe Browsing API v4 */
  def load(
    name: gapiDotClientDotSafebrowsingLib.gapiDotClientDotSafebrowsingLibStrings.safebrowsing,
    version: gapiDotClientDotSafebrowsingLib.gapiDotClientDotSafebrowsingLibStrings.v4
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotSafebrowsingLib.gapiDotClientDotSafebrowsingLibStrings.safebrowsing,
    version: gapiDotClientDotSafebrowsingLib.gapiDotClientDotSafebrowsingLibStrings.v4,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

