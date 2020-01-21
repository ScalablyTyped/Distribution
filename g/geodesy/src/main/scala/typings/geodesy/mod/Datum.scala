package typings.geodesy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Datum extends js.Object {
  var ellipsoid: Ellipsoid
  var transform: Transform
}

object Datum {
  @scala.inline
  def apply(ellipsoid: Ellipsoid, transform: Transform): Datum = {
    val __obj = js.Dynamic.literal(ellipsoid = ellipsoid.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Datum]
  }
}

