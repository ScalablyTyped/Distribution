package typings.fundamentalReact

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/SideNavigation/SideNav.SideNavListItemProps> */
trait PartialSideNavListItemPro extends js.Object {
  var expanded: js.UndefOr[Boolean] = js.undefined
  var glyph: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object PartialSideNavListItemPro {
  @scala.inline
  def apply(
    expanded: js.UndefOr[Boolean] = js.undefined,
    glyph: String = null,
    id: String = null,
    name: String = null,
    onClick: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit = null,
    url: String = null
  ): PartialSideNavListItemPro = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSideNavListItemPro]
  }
}

