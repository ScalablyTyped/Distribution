package typings.googleMapReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ne extends js.Object {
  @JSName("ne")
  var ne_FNe: typings.googleMapReact.mod.Coords
  var sw: typings.googleMapReact.mod.Coords
}

object Ne {
  @scala.inline
  def apply(ne: typings.googleMapReact.mod.Coords, sw: typings.googleMapReact.mod.Coords): Ne = {
    val __obj = js.Dynamic.literal(ne = ne.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ne]
  }
}

