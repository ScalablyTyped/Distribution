package typings.googleDashMapDashReact.googleDashMapDashReactMod

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
    val __obj = js.Dynamic.literal(ne = ne.asInstanceOf[js.Any], nw = nw.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Bounds]
  }
}

