package typings.dv.dvMod

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
    val __obj = js.Dynamic.literal(confidence = confidence, text = text)
  
    __obj.asInstanceOf[Choice]
  }
}

