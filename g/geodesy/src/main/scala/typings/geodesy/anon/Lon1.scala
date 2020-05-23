package typings.geodesy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lon1 extends js.Object {
  var lon1: Double
  var lon2: Double
}

object Lon1 {
  @scala.inline
  def apply(lon1: Double, lon2: Double): Lon1 = {
    val __obj = js.Dynamic.literal(lon1 = lon1.asInstanceOf[js.Any], lon2 = lon2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lon1]
  }
}

