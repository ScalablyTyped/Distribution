package typings.ejWebAll.ej.Draggable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelperEventArgs extends js.Object {
  /** returns the draggable element object
    */
  var element: js.UndefOr[js.Any] = js.native
  /** returns the event model values
    */
  var sender: js.UndefOr[js.Any] = js.native
}

object HelperEventArgs {
  @scala.inline
  def apply(): HelperEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HelperEventArgs]
  }
  @scala.inline
  implicit class HelperEventArgsOps[Self <: HelperEventArgs] (val x: Self) extends AnyVal {
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
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setSender(value: js.Any): Self = this.set("sender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSender: Self = this.set("sender", js.undefined)
  }
  
}

