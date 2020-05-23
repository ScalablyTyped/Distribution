package typings.fsExtra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteOptions extends WriteFileOptions {
  var EOL: js.UndefOr[String] = js.undefined
  var fs: js.UndefOr[js.Object] = js.undefined
  var replacer: js.UndefOr[js.Any] = js.undefined
  var spaces: js.UndefOr[Double | String] = js.undefined
}

object WriteOptions {
  @scala.inline
  def apply(
    EOL: String = null,
    encoding: js.UndefOr[Null | String] = js.undefined,
    flag: String = null,
    fs: js.Object = null,
    mode: js.UndefOr[Double] = js.undefined,
    replacer: js.Any = null,
    spaces: Double | String = null
  ): WriteOptions = {
    val __obj = js.Dynamic.literal()
    if (EOL != null) __obj.updateDynamic("EOL")(EOL.asInstanceOf[js.Any])
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    if (replacer != null) __obj.updateDynamic("replacer")(replacer.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteOptions]
  }
}

