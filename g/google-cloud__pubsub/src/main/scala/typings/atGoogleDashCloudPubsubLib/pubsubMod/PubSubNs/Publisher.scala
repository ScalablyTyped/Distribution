package typings
package atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Publisher extends js.Object {
  def publish(data: nodeLib.Buffer): stdLib.Promise[java.lang.String] = js.native
  def publish(
    data: nodeLib.Buffer,
    attributes: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PublisherNs.Attributes
  ): stdLib.Promise[java.lang.String] = js.native
  def publish(
    data: nodeLib.Buffer,
    attributes: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PublisherNs.Attributes,
    callback: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PublisherNs.PublishCallback
  ): scala.Unit = js.native
  def publish(
    data: nodeLib.Buffer,
    callback: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.PublisherNs.PublishCallback
  ): scala.Unit = js.native
}

