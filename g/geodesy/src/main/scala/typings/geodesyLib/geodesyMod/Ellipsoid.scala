package typings
package geodesyLib.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ellipsoid extends js.Object {
  var a: scala.Double
  var b: scala.Double
  var f: scala.Double
}

trait ellipsoid extends js.Object

object Ellipsoid {
  @scala.inline
  def apply(a: scala.Double, b: scala.Double, f: scala.Double): Ellipsoid = {
    val __obj = js.Dynamic.literal(a = a, b = b, f = f)
  
    __obj.asInstanceOf[Ellipsoid]
  }
}

