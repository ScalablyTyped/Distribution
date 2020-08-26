package typings.dv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Symbol extends Region {
  var choices: js.Array[Choice] = js.native
}

object Symbol {
  @scala.inline
  def apply(box: Box, choices: js.Array[Choice], confidence: Double, text: String): Symbol = {
    val __obj = js.Dynamic.literal(box = box.asInstanceOf[js.Any], choices = choices.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
  @scala.inline
  implicit class SymbolOps[Self <: Symbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChoicesVarargs(value: Choice*): Self = this.set("choices", js.Array(value :_*))
    @scala.inline
    def setChoices(value: js.Array[Choice]): Self = this.set("choices", value.asInstanceOf[js.Any])
  }
  
}

