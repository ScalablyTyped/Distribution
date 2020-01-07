package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A recolor effect applied on an image.
  */
@js.native
trait Schema$Recolor extends js.Object {
  /**
    * The name of the recolor effect.  The name is determined from the
    * `recolor_stops` by matching the gradient against the colors in the
    * page&#39;s current color scheme. This property is read-only.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The recolor effect is represented by a gradient, which is a list of color
    * stops.  The colors in the gradient will replace the corresponding colors
    * at the same position in the color palette and apply to the image. This
    * property is read-only.
    */
  var recolorStops: js.UndefOr[js.Array[Schema$ColorStop]] = js.native
}

object Schema$Recolor {
  @scala.inline
  def apply(name: String = null, recolorStops: js.Array[Schema$ColorStop] = null): Schema$Recolor = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (recolorStops != null) __obj.updateDynamic("recolorStops")(recolorStops.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Recolor]
  }
}

