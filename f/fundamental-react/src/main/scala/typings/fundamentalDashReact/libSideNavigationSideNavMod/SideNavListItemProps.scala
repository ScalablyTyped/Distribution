package typings.fundamentalDashReact.libSideNavigationSideNavMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
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
  /* Localized text for the item (when `url` is provided). */
  var name: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
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
    name: String = null,
    onClick: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit = null,
    url: String = null
  ): SideNavListItemProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideNavListItemProps]
  }
}

