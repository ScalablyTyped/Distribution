package typings.geodesy.latlonEllipsoidalReferenceframeMod

import typings.geodesy.mod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceFrame extends js.Object {
  var ellipsoid: Ellipsoid
  var epoch: Double
  var name: String
}

object ReferenceFrame {
  @scala.inline
  def apply(ellipsoid: Ellipsoid, epoch: Double, name: String): ReferenceFrame = {
    val __obj = js.Dynamic.literal(ellipsoid = ellipsoid.asInstanceOf[js.Any], epoch = epoch.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReferenceFrame]
  }
}

