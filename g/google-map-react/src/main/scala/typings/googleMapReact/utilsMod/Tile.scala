package typings.googleMapReact.utilsMod

import typings.googleMapReact.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tile extends Point {
  var zoom: Double
}

object Tile {
  @scala.inline
  def apply(x: Double, y: Double, zoom: Double): Tile = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tile]
  }
}

