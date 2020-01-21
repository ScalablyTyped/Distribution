package typings.expressFileupload.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends /* property */ StringDictionary[js.Any] {
  var abortOnLimit: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var preserveExtension: js.UndefOr[Boolean | String | Double] = js.undefined
  var safeFileNames: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: /* property */ StringDictionary[js.Any] = null,
    abortOnLimit: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    preserveExtension: Boolean | String | Double = null,
    safeFileNames: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(abortOnLimit)) __obj.updateDynamic("abortOnLimit")(abortOnLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (preserveExtension != null) __obj.updateDynamic("preserveExtension")(preserveExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(safeFileNames)) __obj.updateDynamic("safeFileNames")(safeFileNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

