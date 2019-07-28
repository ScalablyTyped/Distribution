package typings.gapiDotClientDotPubsub.gapiNs.clientNs

import typings.gapiDotClientDotPubsub.gapiDotClientDotPubsubStrings.pubsub
import typings.gapiDotClientDotPubsub.gapiDotClientDotPubsubStrings.v1
import typings.gapiDotClientDotPubsub.gapiNs.clientNs.pubsubNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: ProjectsResource = js.native
  /** Load Google Cloud Pub/Sub API v1 */
  def load(name: pubsub, version: v1): js.Thenable[Unit] = js.native
  def load(name: pubsub, version: v1, callback: js.Function0[_]): Unit = js.native
}

