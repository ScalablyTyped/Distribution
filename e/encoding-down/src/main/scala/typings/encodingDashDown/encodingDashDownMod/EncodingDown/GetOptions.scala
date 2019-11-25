package typings.encodingDashDown.encodingDashDownMod.EncodingDown

import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractGetOptions
import typings.levelDashCodec.levelDashCodecMod.CodecEncoder
import typings.levelDashCodec.levelDashCodecMod.CodecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOptions
  extends AbstractGetOptions
     with CodecOptions

object GetOptions {
  @scala.inline
  def apply(
    asBuffer: js.UndefOr[Boolean] = js.undefined,
    keyEncoding: String | CodecEncoder = null,
    valueEncoding: String | CodecEncoder = null
  ): GetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asBuffer)) __obj.updateDynamic("asBuffer")(asBuffer.asInstanceOf[js.Any])
    if (keyEncoding != null) __obj.updateDynamic("keyEncoding")(keyEncoding.asInstanceOf[js.Any])
    if (valueEncoding != null) __obj.updateDynamic("valueEncoding")(valueEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOptions]
  }
}

