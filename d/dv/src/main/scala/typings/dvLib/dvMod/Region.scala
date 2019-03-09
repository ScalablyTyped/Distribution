package typings
package dvLib.dvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  var box: Box
  var confidence: scala.Double
  var text: java.lang.String
}

object Region {
  @scala.inline
  def apply(box: Box, confidence: scala.Double, text: java.lang.String): Region = {
    val __obj = js.Dynamic.literal(box = box, confidence = confidence, text = text)
  
    __obj.asInstanceOf[Region]
  }
}

