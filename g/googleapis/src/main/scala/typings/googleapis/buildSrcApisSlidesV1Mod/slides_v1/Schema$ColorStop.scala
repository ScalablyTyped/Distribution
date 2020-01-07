package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A color and position in a gradient band.
  */
@js.native
trait Schema$ColorStop extends js.Object {
  /**
    * The alpha value of this color in the gradient band. Defaults to 1.0,
    * fully opaque.
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * The color of the gradient stop.
    */
  var color: js.UndefOr[Schema$OpaqueColor] = js.native
  /**
    * The relative position of the color stop in the gradient band measured in
    * percentage. The value should be in the interval [0.0, 1.0].
    */
  var position: js.UndefOr[Double] = js.native
}

object Schema$ColorStop {
  @scala.inline
  def apply(alpha: Int | Double = null, color: Schema$OpaqueColor = null, position: Int | Double = null): Schema$ColorStop = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ColorStop]
  }
}

