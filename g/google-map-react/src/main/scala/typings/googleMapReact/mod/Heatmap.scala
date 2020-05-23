package typings.googleMapReact.mod

import typings.googleMapReact.anon.Opacity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Heatmap extends js.Object {
  var options: Opacity
  var positions: js.Array[Position]
}

object Heatmap {
  @scala.inline
  def apply(options: Opacity, positions: js.Array[Position]): Heatmap = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heatmap]
  }
}

