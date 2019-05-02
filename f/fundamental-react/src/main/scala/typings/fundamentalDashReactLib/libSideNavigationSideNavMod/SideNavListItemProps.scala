package typings
package fundamentalDashReactLib.libSideNavigationSideNavMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideNavListItemProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /* Set to **true** to have this item initially render as expanded and its children items shown. */
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  var glyph: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var isSubItem: js.UndefOr[scala.Boolean] = js.undefined
  /* Localized text for the item (when `url` is provided). */
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var onItemSelect: js.UndefOr[
    js.Function3[
      /* e */ reactLib.reactMod.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent], 
      /* id */ js.Any, 
      /* hasChild */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var selectedId: js.UndefOr[java.lang.String] = js.undefined
  /* Enables use of `<a>` element. Value to be applied to the anchor\'s `href` attribute. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object SideNavListItemProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    expanded: js.UndefOr[scala.Boolean] = js.undefined,
    glyph: java.lang.String = null,
    id: java.lang.String = null,
    isSubItem: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onClick: /* e */ reactLib.reactMod.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent] => scala.Unit = null,
    onItemSelect: (/* e */ reactLib.reactMod.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent], /* id */ js.Any, /* hasChild */ scala.Boolean) => scala.Unit = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    selectedId: java.lang.String = null,
    url: java.lang.String = null
  ): SideNavListItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (glyph != null) __obj.updateDynamic("glyph")(glyph)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isSubItem)) __obj.updateDynamic("isSubItem")(isSubItem)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(js.Any.fromFunction3(onItemSelect))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (selectedId != null) __obj.updateDynamic("selectedId")(selectedId)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[SideNavListItemProps]
  }
}

