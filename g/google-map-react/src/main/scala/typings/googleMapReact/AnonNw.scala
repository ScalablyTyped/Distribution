package typings.googleMapReact

import typings.googleMapReact.mod.Coords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNw extends js.Object {
  var nw: Coords
  var se: Coords
}

object AnonNw {
  @scala.inline
  def apply(nw: Coords, se: Coords): AnonNw = {
    val __obj = js.Dynamic.literal(nw = nw.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNw]
  }
}

