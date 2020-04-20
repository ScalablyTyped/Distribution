package typings.fabric

import typings.fabric.fabricImplMod.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCorner extends js.Object {
  var corner: String
  var originX: String
  var originY: String
  var original: Object
  var width: Double
}

object AnonCorner {
  @scala.inline
  def apply(corner: String, originX: String, originY: String, original: Object, width: Double): AnonCorner = {
    val __obj = js.Dynamic.literal(corner = corner.asInstanceOf[js.Any], originX = originX.asInstanceOf[js.Any], originY = originY.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCorner]
  }
}

