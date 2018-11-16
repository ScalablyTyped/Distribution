package typings
package gapiDotClientDotPubsubLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val projects: gapiDotClientDotPubsubLib.gapiNs.clientNs.pubsubNs.ProjectsResource = js.native
  /** Load Google Cloud Pub/Sub API v1 */
  def load(
    name: gapiDotClientDotPubsubLib.gapiDotClientDotPubsubLibStrings.pubsub,
    version: gapiDotClientDotPubsubLib.gapiDotClientDotPubsubLibStrings.v1
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotPubsubLib.gapiDotClientDotPubsubLibStrings.pubsub,
    version: gapiDotClientDotPubsubLib.gapiDotClientDotPubsubLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

