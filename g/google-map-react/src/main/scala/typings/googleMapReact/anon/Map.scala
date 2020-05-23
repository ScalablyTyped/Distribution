package typings.googleMapReact.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map extends js.Object {
  var map: js.Any
  var maps: js.Any
  var ref: Element | Null
}

object Map {
  @scala.inline
  def apply(map: js.Any, maps: js.Any, ref: Element = null): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], maps = maps.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
}

