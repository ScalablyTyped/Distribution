package typings.expo.buildARMod

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
    val __obj = js.Dynamic.literal(id = id, x = x, y = y, z = z)
  
    __obj.asInstanceOf[RawFeaturePoint]
  }
}

