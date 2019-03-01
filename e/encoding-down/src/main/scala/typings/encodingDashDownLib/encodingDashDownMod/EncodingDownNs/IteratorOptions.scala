package typings
package encodingDashDownLib.encodingDashDownMod.EncodingDownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IteratorOptions
  extends abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractIteratorOptions[js.Any]
     with levelDashCodecLib.levelDashCodecMod.CodecOptions

object IteratorOptions {
  @scala.inline
  def apply(
    gt: js.Any = null,
    gte: js.Any = null,
    keyAsBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    keyEncoding: java.lang.String | levelDashCodecLib.levelDashCodecMod.CodecEncoder = null,
    keys: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Int | scala.Double = null,
    lt: js.Any = null,
    lte: js.Any = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    valueAsBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    valueEncoding: java.lang.String | levelDashCodecLib.levelDashCodecMod.CodecEncoder = null,
    values: js.UndefOr[scala.Boolean] = js.undefined
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

