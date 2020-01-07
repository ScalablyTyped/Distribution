package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A solid color.
  */
@js.native
trait Schema$Color extends js.Object {
  /**
    * The RGB color value.
    */
  var rgbColor: js.UndefOr[Schema$RgbColor] = js.native
}

object Schema$Color {
  @scala.inline
  def apply(rgbColor: Schema$RgbColor = null): Schema$Color = {
    val __obj = js.Dynamic.literal()
    if (rgbColor != null) __obj.updateDynamic("rgbColor")(rgbColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Color]
  }
}

