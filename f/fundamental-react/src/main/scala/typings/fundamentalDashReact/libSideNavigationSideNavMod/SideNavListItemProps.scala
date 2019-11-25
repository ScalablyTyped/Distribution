package typings.fundamentalDashReact.libSideNavigationSideNavMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideNavListItemProps
  extends /* x */ StringDictionary[js.Any] {
  /* Set to **true** to have this item initially render as expanded and its children items shown. */
  var expanded: js.UndefOr[Boolean] = js.undefined
  var glyph: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var isSubItem: js.UndefOr[Boolean] = js.undefined
  /* Localized text for the item (when `url` is provided). */
  var name: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var onItemSelect: js.UndefOr[
    js.Function3[
      /* e */ MouseEvent[Element, NativeMouseEvent], 
      /* id */ js.Any, 
      /* hasChild */ Boolean, 
      Unit
    ]
  ] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var selected: js.UndefOr[Boolean] = js.undefined
  /* _INTERNAL USE ONLY._ */
  var selectedId: js.UndefOr[String] = js.undefined
  /* Enables use of `<a>` element. Value to be applied to the anchor\'s `href` attribute. */
  var url: js.UndefOr[String] = js.undefined
}

object SideNavListItemProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    glyph: String = null,
    id: String = null,
    isSubItem: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onClick: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit = null,
    onItemSelect: (/* e */ MouseEvent[Element, NativeMouseEvent], /* id */ js.Any, /* hasChild */ Boolean) => Unit = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedId: String = null,
    url: String = null
  ): SideNavListItemProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isSubItem)) __obj.updateDynamic("isSubItem")(isSubItem.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(js.Any.fromFunction3(onItemSelect))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (selectedId != null) __obj.updateDynamic("selectedId")(selectedId.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideNavListItemProps]
  }
}

