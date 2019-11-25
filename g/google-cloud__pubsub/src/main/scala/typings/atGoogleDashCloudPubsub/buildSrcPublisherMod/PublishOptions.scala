package typings.atGoogleDashCloudPubsub.buildSrcPublisherMod

import typings.googleDashGax.buildSrcGaxMod.CallOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishOptions extends js.Object {
  var batching: js.UndefOr[BatchPublishOptions] = js.undefined
  var gaxOpts: js.UndefOr[CallOptions] = js.undefined
}

object PublishOptions {
  @scala.inline
  def apply(batching: BatchPublishOptions = null, gaxOpts: CallOptions = null): PublishOptions = {
    val __obj = js.Dynamic.literal()
    if (batching != null) __obj.updateDynamic("batching")(batching.asInstanceOf[js.Any])
    if (gaxOpts != null) __obj.updateDynamic("gaxOpts")(gaxOpts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishOptions]
  }
}

