package typings.firebaseDatabase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SvIncrement extends js.Object {
  @JSName(".sv")
  var Dotsv: Increment = js.native
}

object SvIncrement {
  @scala.inline
  def apply(Dotsv: Increment): SvIncrement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".sv")(Dotsv.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvIncrement]
  }
  @scala.inline
  implicit class SvIncrementOps[Self <: SvIncrement] (val x: Self) extends AnyVal {
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
    def setDotsv(value: Increment): Self = this.set(".sv", value.asInstanceOf[js.Any])
  }
  
}

