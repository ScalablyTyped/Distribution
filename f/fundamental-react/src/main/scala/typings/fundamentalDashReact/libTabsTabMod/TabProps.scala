package typings.fundamentalDashReact.libTabsTabMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  /* Icon to display on the tab. */
  var glyph: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  /* Additional props to be spread to the tab\'s <a> element. */
  var linkProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the tab content's <div> element. */
  var tabContentProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Localized text to display on the tab. */
  var title: js.UndefOr[String] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    glyph: String = null,
    id: String = null,
    linkProps: StringDictionary[js.Any] = null,
    tabContentProps: StringDictionary[js.Any] = null,
    title: String = null
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (linkProps != null) __obj.updateDynamic("linkProps")(linkProps.asInstanceOf[js.Any])
    if (tabContentProps != null) __obj.updateDynamic("tabContentProps")(tabContentProps.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabProps]
  }
}

