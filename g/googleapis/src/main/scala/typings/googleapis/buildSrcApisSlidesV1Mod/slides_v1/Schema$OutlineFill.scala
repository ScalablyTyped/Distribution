package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The fill of the outline.
  */
@js.native
trait Schema$OutlineFill extends js.Object {
  /**
    * Solid color fill.
    */
  var solidFill: js.UndefOr[Schema$SolidFill] = js.native
}

object Schema$OutlineFill {
  @scala.inline
  def apply(solidFill: Schema$SolidFill = null): Schema$OutlineFill = {
    val __obj = js.Dynamic.literal()
    if (solidFill != null) __obj.updateDynamic("solidFill")(solidFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OutlineFill]
  }
}

