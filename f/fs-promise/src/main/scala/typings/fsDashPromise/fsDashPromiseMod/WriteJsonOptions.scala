package typings.fsDashPromise.fsDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteJsonOptions
  extends typings.fsDashExtra.fsDashExtraMod.WriteOptions {
  @JSName("replacer")
  var replacer_WriteJsonOptions: js.UndefOr[JsonReplacer] = js.undefined
  @JSName("spaces")
  var spaces_WriteJsonOptions: js.UndefOr[Double] = js.undefined
}

object WriteJsonOptions {
  @scala.inline
  def apply(
    EOL: String = null,
    fs: js.Object = null,
    replacer: JsonReplacer = null,
    spaces: Int | Double = null
  ): WriteJsonOptions = {
    val __obj = js.Dynamic.literal()
    if (EOL != null) __obj.updateDynamic("EOL")(EOL)
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (replacer != null) __obj.updateDynamic("replacer")(replacer.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteJsonOptions]
  }
}

