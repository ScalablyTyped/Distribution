package typings.fsExtra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteFileOptions extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.undefined
  var flag: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
}

object WriteFileOptions {
  @scala.inline
  def apply(
    encoding: js.UndefOr[Null | String] = js.undefined,
    flag: String = null,
    mode: js.UndefOr[Double] = js.undefined
  ): WriteFileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteFileOptions]
  }
}

