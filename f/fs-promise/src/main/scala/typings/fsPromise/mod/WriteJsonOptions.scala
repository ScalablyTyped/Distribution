package typings.fsPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteJsonOptions extends WriteOptions {
  var replacer: js.UndefOr[JsonReplacer] = js.undefined
  var spaces: js.UndefOr[Double] = js.undefined
}

object WriteJsonOptions {
  @scala.inline
  def apply(
    encoding: String = null,
    flag: String = null,
    mode: js.UndefOr[Double] = js.undefined,
    replacer: JsonReplacer = null,
    spaces: js.UndefOr[Double] = js.undefined
  ): WriteJsonOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    if (replacer != null) __obj.updateDynamic("replacer")(replacer.asInstanceOf[js.Any])
    if (!js.isUndefined(spaces)) __obj.updateDynamic("spaces")(spaces.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteJsonOptions]
  }
}

