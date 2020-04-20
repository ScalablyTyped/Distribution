package typings.dv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  var box: Box
  var confidence: Double
  var text: String
}

object Region {
  @scala.inline
  def apply(box: Box, confidence: Double, text: String): Region = {
    val __obj = js.Dynamic.literal(box = box.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
}

