package typings
package atGoogleDashCloudPubsubLib.buildSrcMessageDashQueuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchOptions extends js.Object {
  var callOptions: js.UndefOr[googleDashGaxLib.buildSrcGaxMod.CallOptions] = js.undefined
  var maxMessages: js.UndefOr[scala.Double] = js.undefined
  var maxMilliseconds: js.UndefOr[scala.Double] = js.undefined
}

object BatchOptions {
  @scala.inline
  def apply(
    callOptions: googleDashGaxLib.buildSrcGaxMod.CallOptions = null,
    maxMessages: scala.Int | scala.Double = null,
    maxMilliseconds: scala.Int | scala.Double = null
  ): BatchOptions = {
    val __obj = js.Dynamic.literal()
    if (callOptions != null) __obj.updateDynamic("callOptions")(callOptions)
    if (maxMessages != null) __obj.updateDynamic("maxMessages")(maxMessages.asInstanceOf[js.Any])
    if (maxMilliseconds != null) __obj.updateDynamic("maxMilliseconds")(maxMilliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchOptions]
  }
}

