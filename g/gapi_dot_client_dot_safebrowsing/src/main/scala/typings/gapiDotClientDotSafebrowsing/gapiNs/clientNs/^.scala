package typings.gapiDotClientDotSafebrowsing.gapiNs.clientNs

import typings.gapiDotClientDotSafebrowsing.gapiDotClientDotSafebrowsingStrings.safebrowsing
import typings.gapiDotClientDotSafebrowsing.gapiDotClientDotSafebrowsingStrings.v4
import typings.gapiDotClientDotSafebrowsing.gapiNs.clientNs.safebrowsingNs.EncodedFullHashesResource
import typings.gapiDotClientDotSafebrowsing.gapiNs.clientNs.safebrowsingNs.EncodedUpdatesResource
import typings.gapiDotClientDotSafebrowsing.gapiNs.clientNs.safebrowsingNs.FullHashesResource
import typings.gapiDotClientDotSafebrowsing.gapiNs.clientNs.safebrowsingNs.ThreatListUpdatesResource
import typings.gapiDotClientDotSafebrowsing.gapiNs.clientNs.safebrowsingNs.ThreatListsResource
import typings.gapiDotClientDotSafebrowsing.gapiNs.clientNs.safebrowsingNs.ThreatMatchesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val encodedFullHashes: EncodedFullHashesResource = js.native
  val encodedUpdates: EncodedUpdatesResource = js.native
  val fullHashes: FullHashesResource = js.native
  val threatListUpdates: ThreatListUpdatesResource = js.native
  val threatLists: ThreatListsResource = js.native
  val threatMatches: ThreatMatchesResource = js.native
  /** Load Google Safe Browsing API v4 */
  def load(name: safebrowsing, version: v4): js.Thenable[Unit] = js.native
  def load(name: safebrowsing, version: v4, callback: js.Function0[_]): Unit = js.native
}

