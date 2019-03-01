package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var style: js.UndefOr[BorderStyle] = js.undefined
}

object Border {
  @scala.inline
  def apply(color: Color = null, style: BorderStyle = null): Border = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Border]
  }
}

