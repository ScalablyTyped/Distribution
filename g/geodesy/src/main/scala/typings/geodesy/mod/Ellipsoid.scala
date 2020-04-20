package typings.geodesy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ellipsoid extends js.Object {
  var a: Double
  var b: Double
  var f: Double
}

object Ellipsoid {
  @scala.inline
  def apply(a: Double, b: Double, f: Double): Ellipsoid = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ellipsoid]
  }
}

