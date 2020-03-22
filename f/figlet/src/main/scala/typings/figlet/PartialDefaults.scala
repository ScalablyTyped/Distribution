package typings.figlet

import typings.figlet.mod.Fonts_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<figlet.figlet.Defaults> */
trait PartialDefaults extends js.Object {
  var font: js.UndefOr[Fonts_] = js.undefined
  var fontPath: js.UndefOr[String] = js.undefined
}

object PartialDefaults {
  @scala.inline
  def apply(font: Fonts_ = null, fontPath: String = null): PartialDefaults = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontPath != null) __obj.updateDynamic("fontPath")(fontPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDefaults]
  }
}

