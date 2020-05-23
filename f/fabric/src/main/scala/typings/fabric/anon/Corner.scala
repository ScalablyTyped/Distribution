package typings.fabric.anon

import typings.fabric.fabricImplMod.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Corner extends js.Object {
  var corner: String
  var originX: String
  var originY: String
  var original: Object
  var width: Double
}

object Corner {
  @scala.inline
  def apply(corner: String, originX: String, originY: String, original: Object, width: Double): Corner = {
    val __obj = js.Dynamic.literal(corner = corner.asInstanceOf[js.Any], originX = originX.asInstanceOf[js.Any], originY = originY.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corner]
  }
}

