package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Publisher extends js.Object {
  def publish(data: nodeLib.Buffer): js.Promise[java.lang.String] = js.native
  def publish(
    data: nodeLib.Buffer,
    attributes: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PublisherNs.Attributes
  ): js.Promise[java.lang.String] = js.native
  def publish(
    data: nodeLib.Buffer,
    attributes: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PublisherNs.Attributes,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PublisherNs.PublishCallback
  ): scala.Unit = js.native
  def publish(
    data: nodeLib.Buffer,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PublisherNs.PublishCallback
  ): scala.Unit = js.native
}

