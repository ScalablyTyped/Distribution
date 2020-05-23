package typings.encodingDown.mod.EncodingDown

import typings.abstractLeveldown.mod.AbstractGetOptions
import typings.levelCodec.mod.CodecEncoder
import typings.levelCodec.mod.CodecOptions
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
    if (!js.isUndefined(asBuffer)) __obj.updateDynamic("asBuffer")(asBuffer.get.asInstanceOf[js.Any])
    if (keyEncoding != null) __obj.updateDynamic("keyEncoding")(keyEncoding.asInstanceOf[js.Any])
    if (valueEncoding != null) __obj.updateDynamic("valueEncoding")(valueEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOptions]
  }
}

