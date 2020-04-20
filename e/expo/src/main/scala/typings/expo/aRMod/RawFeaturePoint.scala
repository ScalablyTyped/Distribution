package typings.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawFeaturePoint extends js.Object {
  var id: String
  var x: Double
  var y: Double
  var z: Double
}

object RawFeaturePoint {
  @scala.inline
  def apply(id: String, x: Double, y: Double, z: Double): RawFeaturePoint = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawFeaturePoint]
  }
}

