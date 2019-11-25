package typings.fundamentalDashReact.libTabsTabMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLAnchorElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  /* Icon to display on the tab. */
  var glyph: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var index: js.UndefOr[Double] = js.undefined
  /* Additional props to be spread to the tab\'s <a> element. */
  var linkProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ typings.react.reactMod.MouseEvent[HTMLAnchorElement, MouseEvent], 
      /* index */ Double, 
      Unit
    ]
  ] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var selected: js.UndefOr[Boolean] = js.undefined
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
    disabled: js.UndefOr[Boolean] = js.undefined,
    glyph: String = null,
    id: String = null,
    index: Int | Double = null,
    linkProps: StringDictionary[js.Any] = null,
    onClick: (/* event */ typings.react.reactMod.MouseEvent[HTMLAnchorElement, MouseEvent], /* index */ Double) => Unit = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    tabContentProps: StringDictionary[js.Any] = null,
    title: String = null
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (linkProps != null) __obj.updateDynamic("linkProps")(linkProps.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (tabContentProps != null) __obj.updateDynamic("tabContentProps")(tabContentProps.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabProps]
  }
}

