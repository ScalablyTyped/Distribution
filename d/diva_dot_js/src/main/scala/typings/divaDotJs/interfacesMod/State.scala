package typings.divaDotJs.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var f: Boolean
  var i: Boolean | String
  var n: Double
  var p: Boolean | Double
  var v: String
  var x: Boolean | Double
  var y: Boolean | Double
  var z: Double
}

object State {
  @scala.inline
  def apply(
    f: Boolean,
    i: Boolean | String,
    n: Double,
    p: Boolean | Double,
    v: String,
    x: Boolean | Double,
    y: Boolean | Double,
    z: Double
  ): State = {
    val __obj = js.Dynamic.literal(f = f.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

