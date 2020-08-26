package typings.ejWebAll.ej.Spreadsheet

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabSelectEventArgs extends js.Object {
  /** Returns active tab header element.
    */
  var activeHeader: js.UndefOr[js.Any] = js.native
  /** Returns the active tab index.
    */
  var activeIndex: js.UndefOr[Double] = js.native
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.native
  /** Returns previous active tab header element.
    */
  var prevActiveHeader: js.UndefOr[js.Any] = js.native
  /** Returns previous active tab index.
    */
  var prevActiveIndex: js.UndefOr[Double] = js.native
  /** Returns the target element.
    */
  var target: js.UndefOr[HTMLElement] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object TabSelectEventArgs {
  @scala.inline
  def apply(): TabSelectEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabSelectEventArgs]
  }
  @scala.inline
  implicit class TabSelectEventArgsOps[Self <: TabSelectEventArgs] (val x: Self) extends AnyVal {
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
    def setActiveHeader(value: js.Any): Self = this.set("activeHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveHeader: Self = this.set("activeHeader", js.undefined)
    @scala.inline
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setPrevActiveHeader(value: js.Any): Self = this.set("prevActiveHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevActiveHeader: Self = this.set("prevActiveHeader", js.undefined)
    @scala.inline
    def setPrevActiveIndex(value: Double): Self = this.set("prevActiveIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevActiveIndex: Self = this.set("prevActiveIndex", js.undefined)
    @scala.inline
    def setTarget(value: HTMLElement): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

