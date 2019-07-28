package typings.dv.dvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol extends Region {
  var choices: js.Array[Choice]
}

object Symbol {
  @scala.inline
  def apply(box: Box, choices: js.Array[Choice], confidence: Double, text: String): Symbol = {
    val __obj = js.Dynamic.literal(box = box, choices = choices, confidence = confidence, text = text)
  
    __obj.asInstanceOf[Symbol]
  }
}

