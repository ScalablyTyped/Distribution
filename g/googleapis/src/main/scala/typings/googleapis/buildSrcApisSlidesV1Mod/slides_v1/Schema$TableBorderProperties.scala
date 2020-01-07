package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The border styling properties of the TableBorderCell.
  */
@js.native
trait Schema$TableBorderProperties extends js.Object {
  /**
    * The dash style of the border.
    */
  var dashStyle: js.UndefOr[String] = js.native
  /**
    * The fill of the table border.
    */
  var tableBorderFill: js.UndefOr[Schema$TableBorderFill] = js.native
  /**
    * The thickness of the border.
    */
  var weight: js.UndefOr[Schema$Dimension] = js.native
}

object Schema$TableBorderProperties {
  @scala.inline
  def apply(
    dashStyle: String = null,
    tableBorderFill: Schema$TableBorderFill = null,
    weight: Schema$Dimension = null
  ): Schema$TableBorderProperties = {
    val __obj = js.Dynamic.literal()
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (tableBorderFill != null) __obj.updateDynamic("tableBorderFill")(tableBorderFill.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableBorderProperties]
  }
}

