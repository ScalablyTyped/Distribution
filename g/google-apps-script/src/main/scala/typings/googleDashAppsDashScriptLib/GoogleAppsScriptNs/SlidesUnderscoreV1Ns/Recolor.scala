package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recolor extends js.Object {
  // The name of the recolor effect.
  //
  // The name is determined from the `recolor_stops` by matching the gradient
  // against the colors in the page's current color scheme. This property is
  // read-only.
  var name: RecolorName
  // The recolor effect is represented by a gradient, which is a list of color
  // stops.
  //
  // The colors in the gradient will replace the corresponding colors at
  // the same position in the color palette and apply to the image. This
  // property is read-only.
  var recolor_stops: js.Array[ColorStop]
}

object Recolor {
  @scala.inline
  def apply(name: RecolorName, recolor_stops: js.Array[ColorStop]): Recolor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("recolor_stops")(recolor_stops)
    __obj.asInstanceOf[Recolor]
  }
}

