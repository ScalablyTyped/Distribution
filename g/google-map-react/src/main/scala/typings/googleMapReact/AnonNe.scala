package typings.googleMapReact

import typings.googleMapReact.mod.Coords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNe extends js.Object {
  @JSName("ne")
  var ne_FAnonNe: Coords
  var sw: Coords
}

object AnonNe {
  @scala.inline
  def apply(ne: Coords, sw: Coords): AnonNe = {
    val __obj = js.Dynamic.literal(ne = ne.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNe]
  }
}

