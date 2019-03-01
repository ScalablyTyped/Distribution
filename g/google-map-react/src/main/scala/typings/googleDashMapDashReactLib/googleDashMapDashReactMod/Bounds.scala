package typings
package googleDashMapDashReactLib.googleDashMapDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds extends js.Object {
  @JSName("ne")
  var ne_FBounds: Coords
  var nw: Coords
  var se: Coords
  var sw: Coords
}

object Bounds {
  @scala.inline
  def apply(ne: Coords, nw: Coords, se: Coords, sw: Coords): Bounds = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ne")(ne)
    __obj.updateDynamic("nw")(nw)
    __obj.updateDynamic("se")(se)
    __obj.updateDynamic("sw")(sw)
    __obj.asInstanceOf[Bounds]
  }
}

