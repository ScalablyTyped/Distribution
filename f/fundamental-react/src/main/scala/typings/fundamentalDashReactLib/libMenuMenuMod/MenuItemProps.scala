package typings
package fundamentalDashReactLib.libMenuMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /* Name of the SAP icon to be applied as an add-on before. */
  var addon: js.UndefOr[java.lang.String] = js.undefined
  /* Additional props to be spread to the add-on section. */
  var addonProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  /* Set to **true** to style as a link. */
  var isLink: js.UndefOr[scala.Boolean] = js.undefined
  /* Set to **true** to add a horizontal line (separator). */
  var separator: js.UndefOr[scala.Boolean] = js.undefined
  /* Enables use of `<a>` element. Value to be applied to the anchor's `href` attribute. Should use either `link` or `url`, but not both. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /* Additional props to be spread to the Menu Item links (when using `url`). */
  var urlProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object MenuItemProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    addon: java.lang.String = null,
    addonProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    isLink: js.UndefOr[scala.Boolean] = js.undefined,
    separator: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null,
    urlProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null
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

