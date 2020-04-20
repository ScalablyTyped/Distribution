package typings.dv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Choice extends js.Object {
  var confidence: Double
  var text: String
}

object Choice {
  @scala.inline
  def apply(confidence: Double, text: String): Choice = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Choice]
  }
}

