package typings
package atGoogleDashCloudPubsubLib.buildSrcPublisherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inventory extends js.Object {
  var bytes: scala.Double
  var callbacks: js.Array[PublishCallback]
  var queued: js.Array[
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPubsubMessage
  ]
}

object Inventory {
  @scala.inline
  def apply(
    bytes: scala.Double,
    callbacks: js.Array[PublishCallback],
    queued: js.Array[
      atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPubsubMessage
    ]
  ): Inventory = {
    val __obj = js.Dynamic.literal(bytes = bytes, callbacks = callbacks, queued = queued)
  
    __obj.asInstanceOf[Inventory]
  }
}

