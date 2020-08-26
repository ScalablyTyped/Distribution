package typings.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderFailureEventArgs extends js.Object {
  /** returns the current action of PivotGrid control.
    */
  var action: js.UndefOr[String] = js.native
  /** returns the custom object bound with the control.
    */
  var customObject: js.UndefOr[js.Any] = js.native
  /** returns the HTML element of PivotGrid control.
    */
  var element: js.UndefOr[js.Any] = js.native
  /** returns the error message with error code.
    */
  var message: js.UndefOr[String] = js.native
}

object RenderFailureEventArgs {
  @scala.inline
  def apply(): RenderFailureEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderFailureEventArgs]
  }
  @scala.inline
  implicit class RenderFailureEventArgsOps[Self <: RenderFailureEventArgs] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setCustomObject(value: js.Any): Self = this.set("customObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomObject: Self = this.set("customObject", js.undefined)
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

