package typings
package encodingDashDownLib.encodingDashDownMod.EncodingDownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOptions
  extends abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractGetOptions
     with levelDashCodecLib.levelDashCodecMod.CodecOptions

object GetOptions {
  @scala.inline
  def apply(
    asBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    keyEncoding: java.lang.String | levelDashCodecLib.levelDashCodecMod.CodecEncoder = null,
    valueEncoding: java.lang.String | levelDashCodecLib.levelDashCodecMod.CodecEncoder = null
  ): GetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asBuffer)) __obj.updateDynamic("asBuffer")(asBuffer)
    if (keyEncoding != null) __obj.updateDynamic("keyEncoding")(keyEncoding.asInstanceOf[js.Any])
    if (valueEncoding != null) __obj.updateDynamic("valueEncoding")(valueEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOptions]
  }
}

