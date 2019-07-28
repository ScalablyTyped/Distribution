package typings.encodingDashDown.encodingDashDownMod.EncodingDownNs

import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractIteratorOptions
import typings.levelDashCodec.levelDashCodecMod.CodecEncoder
import typings.levelDashCodec.levelDashCodecMod.CodecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IteratorOptions
  extends AbstractIteratorOptions[js.Any]
     with CodecOptions

object IteratorOptions {
  @scala.inline
  def apply(
    gt: js.Any = null,
    gte: js.Any = null,
    keyAsBuffer: js.UndefOr[Boolean] = js.undefined,
    keyEncoding: String | CodecEncoder = null,
    keys: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    lt: js.Any = null,
    lte: js.Any = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    valueAsBuffer: js.UndefOr[Boolean] = js.undefined,
    valueEncoding: String | CodecEncoder = null,
    values: js.UndefOr[Boolean] = js.undefined
  ): IteratorOptions = {
    val __obj = js.Dynamic.literal()
    if (gt != null) __obj.updateDynamic("gt")(gt)
    if (gte != null) __obj.updateDynamic("gte")(gte)
    if (!js.isUndefined(keyAsBuffer)) __obj.updateDynamic("keyAsBuffer")(keyAsBuffer)
    if (keyEncoding != null) __obj.updateDynamic("keyEncoding")(keyEncoding.asInstanceOf[js.Any])
    if (!js.isUndefined(keys)) __obj.updateDynamic("keys")(keys)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (lt != null) __obj.updateDynamic("lt")(lt)
    if (lte != null) __obj.updateDynamic("lte")(lte)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (!js.isUndefined(valueAsBuffer)) __obj.updateDynamic("valueAsBuffer")(valueAsBuffer)
    if (valueEncoding != null) __obj.updateDynamic("valueEncoding")(valueEncoding.asInstanceOf[js.Any])
    if (!js.isUndefined(values)) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[IteratorOptions]
  }
}

