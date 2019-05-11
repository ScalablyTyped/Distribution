package typings
package atGoogleDashCloudPubsubLib.buildSrcMessageDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageStreamOptions extends js.Object {
  var highWaterMark: js.UndefOr[scala.Double] = js.undefined
  var maxStreams: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object MessageStreamOptions {
  @scala.inline
  def apply(
    highWaterMark: scala.Int | scala.Double = null,
    maxStreams: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): MessageStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (maxStreams != null) __obj.updateDynamic("maxStreams")(maxStreams.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageStreamOptions]
  }
}

