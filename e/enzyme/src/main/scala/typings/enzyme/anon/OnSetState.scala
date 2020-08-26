package typings.enzyme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSetState extends js.Object {
  var onSetState: Boolean = js.native
  var prevContext: Boolean = js.native
}

object OnSetState {
  @scala.inline
  def apply(onSetState: Boolean, prevContext: Boolean): OnSetState = {
    val __obj = js.Dynamic.literal(onSetState = onSetState.asInstanceOf[js.Any], prevContext = prevContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSetState]
  }
  @scala.inline
  implicit class OnSetStateOps[Self <: OnSetState] (val x: Self) extends AnyVal {
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
    def setOnSetState(value: Boolean): Self = this.set("onSetState", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevContext(value: Boolean): Self = this.set("prevContext", value.asInstanceOf[js.Any])
  }
  
}

