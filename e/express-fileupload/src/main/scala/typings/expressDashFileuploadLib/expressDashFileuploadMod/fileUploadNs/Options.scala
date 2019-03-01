package typings
package expressDashFileuploadLib.expressDashFileuploadMod.fileUploadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends /* property */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var abortOnLimit: js.UndefOr[scala.Boolean] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var preserveExtension: js.UndefOr[scala.Boolean | java.lang.String | scala.Double] = js.undefined
  var safeFileNames: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: /* property */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    abortOnLimit: js.UndefOr[scala.Boolean] = js.undefined,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    preserveExtension: scala.Boolean | java.lang.String | scala.Double = null,
    safeFileNames: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(abortOnLimit)) __obj.updateDynamic("abortOnLimit")(abortOnLimit)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (preserveExtension != null) __obj.updateDynamic("preserveExtension")(preserveExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(safeFileNames)) __obj.updateDynamic("safeFileNames")(safeFileNames)
    __obj.asInstanceOf[Options]
  }
}

