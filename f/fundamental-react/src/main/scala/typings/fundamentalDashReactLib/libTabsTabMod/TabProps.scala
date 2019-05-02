package typings
package fundamentalDashReactLib.libTabsTabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /* Icon to display on the tab. */
  var glyph: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var index: js.UndefOr[scala.Double] = js.undefined
  /* Additional props to be spread to the tab\'s <a> element. */
  var linkProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLAnchorElement, stdLib.MouseEvent], 
      /* index */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /* Additional props to be spread to the tab content's <div> element. */
  var tabContentProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Localized text to display on the tab. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    glyph: java.lang.String = null,
    id: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    linkProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    onClick: (/* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLAnchorElement, stdLib.MouseEvent], /* index */ scala.Double) => scala.Unit = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    tabContentProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    title: java.lang.String = null
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (glyph != null) __obj.updateDynamic("glyph")(glyph)
    if (id != null) __obj.updateDynamic("id")(id)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (linkProps != null) __obj.updateDynamic("linkProps")(linkProps)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (tabContentProps != null) __obj.updateDynamic("tabContentProps")(tabContentProps)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TabProps]
  }
}

