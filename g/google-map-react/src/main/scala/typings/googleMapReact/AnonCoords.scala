package typings.googleMapReact

import typings.googleMapReact.mod.Coords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCoords extends js.Object {
  var coords: Coords
}

object AnonCoords {
  @scala.inline
  def apply(coords: Coords): AnonCoords = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCoords]
  }
}

