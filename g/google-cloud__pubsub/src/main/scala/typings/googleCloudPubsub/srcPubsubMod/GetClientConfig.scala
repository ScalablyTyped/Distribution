package typings.googleCloudPubsub.srcPubsubMod

import typings.googleCloudPubsub.googleCloudPubsubStrings.PublisherClient
import typings.googleCloudPubsub.googleCloudPubsubStrings.SubscriberClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClientConfig extends js.Object {
  var client: PublisherClient | SubscriberClient
}

object GetClientConfig {
  @scala.inline
  def apply(client: PublisherClient | SubscriberClient): GetClientConfig = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClientConfig]
  }
}

