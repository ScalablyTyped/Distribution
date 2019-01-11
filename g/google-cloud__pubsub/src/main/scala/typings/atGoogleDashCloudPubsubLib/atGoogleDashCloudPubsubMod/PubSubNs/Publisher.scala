package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Publisher extends js.Object {
  def publish(data: nodeLib.Buffer): js.Promise[java.lang.String] = js.native
  def publish(
    data: nodeLib.Buffer,
    attributes: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PublisherNs.Attributes
  ): js.Promise[java.lang.String] = js.native
  def publish(
    data: nodeLib.Buffer,
    attributes: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PublisherNs.Attributes,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PublisherNs.PublishCallback
  ): scala.Unit = js.native
  def publish(
    data: nodeLib.Buffer,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PublisherNs.PublishCallback
  ): scala.Unit = js.native
}

