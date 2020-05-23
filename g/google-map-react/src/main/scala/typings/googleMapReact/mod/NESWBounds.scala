package typings.googleMapReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NESWBounds extends js.Object {
  @JSName("ne")
  var ne_FNESWBounds: Coords
  var nw: js.UndefOr[Coords] = js.undefined
  var se: js.UndefOr[Coords] = js.undefined
  var sw: Coords
}

object NESWBounds {
  @scala.inline
  def apply(ne: Coords, sw: Coords, nw: Coords = null, se: Coords = null): NESWBounds = {
    val __obj = js.Dynamic.literal(ne = ne.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any])
    if (nw != null) __obj.updateDynamic("nw")(nw.asInstanceOf[js.Any])
    if (se != null) __obj.updateDynamic("se")(se.asInstanceOf[js.Any])
    __obj.asInstanceOf[NESWBounds]
  }
}

