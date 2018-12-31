package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

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
  var name: js.UndefOr[java.lang.String] = js.undefined
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

