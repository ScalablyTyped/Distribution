package typings
package atGoogleDashCloudPubsubLib.buildSrcPubsubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClientConfig extends js.Object {
  var client: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.PublisherClient | atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.SubscriberClient
}

object GetClientConfig {
  @scala.inline
  def apply(
    client: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.PublisherClient | atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.SubscriberClient
  ): GetClientConfig = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetClientConfig]
  }
}

