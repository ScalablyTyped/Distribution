package typings.fundamentalReact.listMod

import typings.fundamentalReact.iconMod.IconGlyph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIconProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var glyph: IconGlyph
}

object ListIconProps {
  @scala.inline
  def apply(glyph: IconGlyph, className: String = null): ListIconProps = {
    val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIconProps]
  }
}

