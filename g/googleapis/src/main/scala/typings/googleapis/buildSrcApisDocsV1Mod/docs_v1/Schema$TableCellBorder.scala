package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A border around a table cell.
  */
@js.native
trait Schema$TableCellBorder extends js.Object {
  /**
    * The color of the border.
    */
  var color: js.UndefOr[Schema$OptionalColor] = js.native
  /**
    * The dash style of the border.
    */
  var dashStyle: js.UndefOr[String] = js.native
  /**
    * The width of the border.
    */
  var width: js.UndefOr[Schema$Dimension] = js.native
}

object Schema$TableCellBorder {
  @scala.inline
  def apply(color: Schema$OptionalColor = null, dashStyle: String = null, width: Schema$Dimension = null): Schema$TableCellBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableCellBorder]
  }
}

