package typings.dv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol extends Region {
  var choices: js.Array[Choice]
}

object Symbol {
  @scala.inline
  def apply(box: Box, choices: js.Array[Choice], confidence: Double, text: String): Symbol = {
    val __obj = js.Dynamic.literal(box = box.asInstanceOf[js.Any], choices = choices.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Symbol]
  }
}

