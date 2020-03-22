package typings.fundamentalReact

import typings.fundamentalReact.iconMod.IconGlyph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/List/List.ListIconProps> */
trait PartialListIconProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var glyph: js.UndefOr[IconGlyph] = js.undefined
}

object PartialListIconProps {
  @scala.inline
  def apply(className: String = null, glyph: IconGlyph = null): PartialListIconProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialListIconProps]
  }
}

