package typings
package fundamentalDashReactLib.libMenuMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /* Set to **true** enables menu items with add-on before. */
  var addonBefore: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    addonBefore: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(addonBefore)) __obj.updateDynamic("addonBefore")(addonBefore)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[MenuProps]
  }
}

