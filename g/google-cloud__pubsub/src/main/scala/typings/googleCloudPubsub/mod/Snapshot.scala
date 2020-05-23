package typings.googleCloudPubsub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub", "Snapshot")
@js.native
class Snapshot protected ()
  extends typings.googleCloudPubsub.snapshotMod.Snapshot {
  def this(parent: PubSub, name: String) = this()
  def this(parent: typings.googleCloudPubsub.subscriptionMod.Subscription, name: String) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "Snapshot")
@js.native
object Snapshot extends js.Object {
  def formatName_(projectId: String, name: String): String = js.native
}

