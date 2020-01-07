package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The fill of the border.
  */
@js.native
trait Schema$TableBorderFill extends js.Object {
  /**
    * Solid fill.
    */
  var solidFill: js.UndefOr[Schema$SolidFill] = js.native
}

object Schema$TableBorderFill {
  @scala.inline
  def apply(solidFill: Schema$SolidFill = null): Schema$TableBorderFill = {
    val __obj = js.Dynamic.literal()
    if (solidFill != null) __obj.updateDynamic("solidFill")(solidFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableBorderFill]
  }
}

