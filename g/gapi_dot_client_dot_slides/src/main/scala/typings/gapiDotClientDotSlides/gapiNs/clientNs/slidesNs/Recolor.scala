package typings.gapiDotClientDotSlides.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recolor extends js.Object {
  /**
    * The name of the recolor effect.
    *
    * The name is determined from the `recolor_stops` by matching the gradient
    * against the colors in the page's current color scheme. This property is
    * read-only.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The recolor effect is represented by a gradient, which is a list of color
    * stops.
    *
    * The colors in the gradient will replace the corresponding colors at
    * the same position in the color palette and apply to the image. This
    * property is read-only.
    */
  var recolorStops: js.UndefOr[js.Array[ColorStop]] = js.undefined
}

object Recolor {
  @scala.inline
  def apply(name: String = null, recolorStops: js.Array[ColorStop] = null): Recolor = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (recolorStops != null) __obj.updateDynamic("recolorStops")(recolorStops)
    __obj.asInstanceOf[Recolor]
  }
}

