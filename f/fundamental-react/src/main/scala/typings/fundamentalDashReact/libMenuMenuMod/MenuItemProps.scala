package typings.fundamentalDashReact.libMenuMenuMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemProps
  extends /* x */ StringDictionary[js.Any] {
  /* Name of the SAP icon to be applied as an add-on before. */
  var addon: js.UndefOr[String] = js.undefined
  /* Additional props to be spread to the add-on section. */
  var addonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /* Set to **true** to style as a link. */
  var isLink: js.UndefOr[Boolean] = js.undefined
  /* Set to **true** to add a horizontal line (separator). */
  var separator: js.UndefOr[Boolean] = js.undefined
  /* Enables use of `<a>` element. Value to be applied to the anchor's `href` attribute. Should use either `link` or `url`, but not both. */
  var url: js.UndefOr[String] = js.undefined
  /* Additional props to be spread to the Menu Item links (when using `url`). */
  var urlProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object MenuItemProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    addon: String = null,
    addonProps: StringDictionary[js.Any] = null,
    className: String = null,
    isLink: js.UndefOr[Boolean] = js.undefined,
    separator: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    urlProps: StringDictionary[js.Any] = null
  ): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (addon != null) __obj.updateDynamic("addon")(addon)
    if (addonProps != null) __obj.updateDynamic("addonProps")(addonProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(isLink)) __obj.updateDynamic("isLink")(isLink)
    if (!js.isUndefined(separator)) __obj.updateDynamic("separator")(separator)
    if (url != null) __obj.updateDynamic("url")(url)
    if (urlProps != null) __obj.updateDynamic("urlProps")(urlProps)
    __obj.asInstanceOf[MenuItemProps]
  }
}

