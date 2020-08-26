package typings.ejWebAll.ej.Menu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeydownEventArgs extends js.Object {
  /** returns clicked menu item element
    */
  var element: js.UndefOr[js.Any] = js.native
  /** returns the event
    */
  var event: js.UndefOr[js.Any] = js.native
  /** returns clicked menu item text
    */
  var menuText: js.UndefOr[String] = js.native
  /** returns the menu model
    */
  var model: js.UndefOr[Model] = js.native
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}

object KeydownEventArgs {
  @scala.inline
  def apply(): KeydownEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeydownEventArgs]
  }
  @scala.inline
  implicit class KeydownEventArgsOps[Self <: KeydownEventArgs] (val x: Self) extends AnyVal {
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
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setMenuText(value: String): Self = this.set("menuText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuText: Self = this.set("menuText", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

