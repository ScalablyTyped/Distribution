package typings.googleCloudPubsub.srcPubsubMod

import typings.googleCloudPubsub.googleCloudPubsubStrings.PublisherClient
import typings.googleCloudPubsub.googleCloudPubsubStrings.SubscriberClient
import typings.googleGax.gaxMod.CallOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestConfig extends GetClientConfig {
  var gaxOpts: js.UndefOr[CallOptions] = js.undefined
  var method: String
  var reqOpts: js.UndefOr[js.Object] = js.undefined
}

object RequestConfig {
  @scala.inline
  def apply(
    client: PublisherClient | SubscriberClient,
    method: String,
    gaxOpts: CallOptions = null,
    reqOpts: js.Object = null
  ): RequestConfig = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    if (gaxOpts != null) __obj.updateDynamic("gaxOpts")(gaxOpts.asInstanceOf[js.Any])
    if (reqOpts != null) __obj.updateDynamic("reqOpts")(reqOpts.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestConfig]
  }
}

