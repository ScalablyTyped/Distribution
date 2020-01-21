package typings.googleMapReact

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMap extends js.Object {
  var map: js.Any
  var maps: js.Any
  var ref: Element | Null
}

object AnonMap {
  @scala.inline
  def apply(map: js.Any, maps: js.Any, ref: Element = null): AnonMap = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], maps = maps.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMap]
  }
}

