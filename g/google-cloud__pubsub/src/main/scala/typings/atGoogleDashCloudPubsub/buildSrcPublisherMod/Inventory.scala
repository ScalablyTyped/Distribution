package typings.atGoogleDashCloudPubsub.buildSrcPublisherMod

import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.IPubsubMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inventory extends js.Object {
  var bytes: Double
  var callbacks: js.Array[PublishCallback]
  var queued: js.Array[IPubsubMessage]
}

object Inventory {
  @scala.inline
  def apply(bytes: Double, callbacks: js.Array[PublishCallback], queued: js.Array[IPubsubMessage]): Inventory = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], callbacks = callbacks.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Inventory]
  }
}

