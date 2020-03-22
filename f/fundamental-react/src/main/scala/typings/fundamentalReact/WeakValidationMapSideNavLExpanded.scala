package typings.fundamentalReact

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Validator
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/SideNavigation/SideNav.SideNavListItemProps> */
trait WeakValidationMapSideNavLExpanded extends js.Object {
  var expanded: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var glyph: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var name: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var onClick: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]) | Null]
    ]
  ] = js.undefined
  var url: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
}

object WeakValidationMapSideNavLExpanded {
  @scala.inline
  def apply(
    expanded: Validator[js.UndefOr[Boolean | Null]] = null,
    glyph: Validator[js.UndefOr[Null | String]] = null,
    id: Validator[js.UndefOr[Null | String]] = null,
    name: Validator[js.UndefOr[Null | String]] = null,
    onClick: Validator[
      js.UndefOr[(js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]) | Null]
    ] = null,
    url: Validator[js.UndefOr[Null | String]] = null
  ): WeakValidationMapSideNavLExpanded = {
    val __obj = js.Dynamic.literal()
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapSideNavLExpanded]
  }
}

