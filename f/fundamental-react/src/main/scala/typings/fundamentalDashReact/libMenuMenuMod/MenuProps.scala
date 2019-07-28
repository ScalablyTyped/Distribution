package typings.fundamentalDashReact.libMenuMenuMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps
  extends /* x */ StringDictionary[js.Any] {
  /* Set to **true** enables menu items with add-on before. */
  var addonBefore: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    addonBefore: js.UndefOr[Boolean] = js.undefined,
    className: String = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(addonBefore)) __obj.updateDynamic("addonBefore")(addonBefore)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[MenuProps]
  }
}

