package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of each border cell.
  */
@js.native
trait Schema$TableBorderCell extends js.Object {
  /**
    * The location of the border within the border table.
    */
  var location: js.UndefOr[Schema$TableCellLocation] = js.native
  /**
    * The border properties.
    */
  var tableBorderProperties: js.UndefOr[Schema$TableBorderProperties] = js.native
}

object Schema$TableBorderCell {
  @scala.inline
  def apply(
    location: Schema$TableCellLocation = null,
    tableBorderProperties: Schema$TableBorderProperties = null
  ): Schema$TableBorderCell = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (tableBorderProperties != null) __obj.updateDynamic("tableBorderProperties")(tableBorderProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableBorderCell]
  }
}

