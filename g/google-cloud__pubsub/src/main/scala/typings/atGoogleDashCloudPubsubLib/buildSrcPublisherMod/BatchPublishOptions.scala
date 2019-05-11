package typings
package atGoogleDashCloudPubsubLib.buildSrcPublisherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchPublishOptions extends js.Object {
  var maxBytes: js.UndefOr[scala.Double] = js.undefined
  var maxMessages: js.UndefOr[scala.Double] = js.undefined
  var maxMilliseconds: js.UndefOr[scala.Double] = js.undefined
}

object BatchPublishOptions {
  @scala.inline
  def apply(
    maxBytes: scala.Int | scala.Double = null,
    maxMessages: scala.Int | scala.Double = null,
    maxMilliseconds: scala.Int | scala.Double = null
  ): BatchPublishOptions = {
    val __obj = js.Dynamic.literal()
    if (maxBytes != null) __obj.updateDynamic("maxBytes")(maxBytes.asInstanceOf[js.Any])
    if (maxMessages != null) __obj.updateDynamic("maxMessages")(maxMessages.asInstanceOf[js.Any])
    if (maxMilliseconds != null) __obj.updateDynamic("maxMilliseconds")(maxMilliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPublishOptions]
  }
}

