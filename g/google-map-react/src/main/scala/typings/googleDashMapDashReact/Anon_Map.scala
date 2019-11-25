package typings.googleDashMapDashReact

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Map extends js.Object {
  var map: js.Any
  var maps: js.Any
  var ref: Element | Null
}

object Anon_Map {
  @scala.inline
  def apply(map: js.Any, maps: js.Any, ref: Element = null): Anon_Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], maps = maps.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Map]
  }
}

