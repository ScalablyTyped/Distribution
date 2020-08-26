package typings.gapiClientPrediction.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Numeric extends js.Object {
  /** Description of the output values in the data set. */
  var numeric: js.UndefOr[Mean] = js.native
  /** Description of the output labels in the data set. */
  var text: js.UndefOr[js.Array[Count]] = js.native
}

object Numeric {
  @scala.inline
  def apply(): Numeric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Numeric]
  }
  @scala.inline
  implicit class NumericOps[Self <: Numeric] (val x: Self) extends AnyVal {
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
    def setNumeric(value: Mean): Self = this.set("numeric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumeric: Self = this.set("numeric", js.undefined)
    @scala.inline
    def setTextVarargs(value: Count*): Self = this.set("text", js.Array(value :_*))
    @scala.inline
    def setText(value: js.Array[Count]): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

