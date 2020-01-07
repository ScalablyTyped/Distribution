package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An RGB color.
  */
@js.native
trait Schema$RgbColor extends js.Object {
  /**
    * The blue component of the color, from 0.0 to 1.0.
    */
  var blue: js.UndefOr[Double] = js.native
  /**
    * The green component of the color, from 0.0 to 1.0.
    */
  var green: js.UndefOr[Double] = js.native
  /**
    * The red component of the color, from 0.0 to 1.0.
    */
  var red: js.UndefOr[Double] = js.native
}

object Schema$RgbColor {
  @scala.inline
  def apply(blue: Int | Double = null, green: Int | Double = null, red: Int | Double = null): Schema$RgbColor = {
    val __obj = js.Dynamic.literal()
    if (blue != null) __obj.updateDynamic("blue")(blue.asInstanceOf[js.Any])
    if (green != null) __obj.updateDynamic("green")(green.asInstanceOf[js.Any])
    if (red != null) __obj.updateDynamic("red")(red.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RgbColor]
  }
}

