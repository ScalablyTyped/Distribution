package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Border {
  @scala.inline
  def apply(color: Color = null, style: String = null, width: js.UndefOr[Double] = js.undefined): Border = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
}

