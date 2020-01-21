package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddon extends js.Object {
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

object AnonAddon {
  @scala.inline
  def apply(
    addon: String = null,
    addonProps: StringDictionary[js.Any] = null,
    className: String = null,
    isLink: js.UndefOr[Boolean] = js.undefined,
    separator: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    urlProps: StringDictionary[js.Any] = null
  ): AnonAddon = {
    val __obj = js.Dynamic.literal()
    if (addon != null) __obj.updateDynamic("addon")(addon.asInstanceOf[js.Any])
    if (addonProps != null) __obj.updateDynamic("addonProps")(addonProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isLink)) __obj.updateDynamic("isLink")(isLink.asInstanceOf[js.Any])
    if (!js.isUndefined(separator)) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urlProps != null) __obj.updateDynamic("urlProps")(urlProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddon]
  }
}

