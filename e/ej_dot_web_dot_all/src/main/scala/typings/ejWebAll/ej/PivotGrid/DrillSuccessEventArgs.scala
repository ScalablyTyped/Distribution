package typings.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrillSuccessEventArgs extends js.Object {
  /** returns the HTML element of the control.
    */
  var args: js.UndefOr[js.Any] = js.native
}

object DrillSuccessEventArgs {
  @scala.inline
  def apply(): DrillSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrillSuccessEventArgs]
  }
  @scala.inline
  implicit class DrillSuccessEventArgsOps[Self <: DrillSuccessEventArgs] (val x: Self) extends AnyVal {
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
    def setArgs(value: js.Any): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
  }
  
}

