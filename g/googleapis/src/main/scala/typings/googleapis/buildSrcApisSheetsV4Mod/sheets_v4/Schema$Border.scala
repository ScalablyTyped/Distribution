package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A border along a cell.
  */
@js.native
trait Schema$Border extends js.Object {
  /**
    * The color of the border.
    */
  var color: js.UndefOr[Schema$Color] = js.native
  /**
    * The style of the border.
    */
  var style: js.UndefOr[String] = js.native
  /**
    * The width of the border, in pixels. Deprecated; the width is determined
    * by the &quot;style&quot; field.
    */
  var width: js.UndefOr[Double] = js.native
}

object Schema$Border {
  @scala.inline
  def apply(color: Schema$Color = null, style: String = null, width: Int | Double = null): Schema$Border = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Border]
  }
}

