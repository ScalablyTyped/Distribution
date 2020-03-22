package typings.fundamentalReact

import typings.fundamentalReact.iconMod.IconGlyph
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/List/List.ListIconProps> */
trait WeakValidationMapListIcon extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var glyph: js.UndefOr[Validator[js.UndefOr[IconGlyph | Null]]] = js.undefined
}

object WeakValidationMapListIcon {
  @scala.inline
  def apply(
    className: Validator[js.UndefOr[Null | String]] = null,
    glyph: Validator[js.UndefOr[IconGlyph | Null]] = null
  ): WeakValidationMapListIcon = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapListIcon]
  }
}

