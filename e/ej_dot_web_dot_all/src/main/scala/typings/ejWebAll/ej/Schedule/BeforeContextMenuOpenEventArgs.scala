package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeContextMenuOpenEventArgs extends js.Object {
  /** Returns the current appointment details while opening the menu from appointment.
    */
  var appointment: js.UndefOr[js.Any] = js.native
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the current cell index value.
    */
  var cellIndex: js.UndefOr[Double] = js.native
  /** Returns the current date value.
    */
  var currentDate: js.UndefOr[js.Any] = js.native
  /** Returns the object of before opening menu target.
    */
  var events: js.UndefOr[js.Any] = js.native
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[Model] = js.native
  /** Returns the object of beforeContextMenuOpen event.
    */
  var `object`: js.UndefOr[js.Any] = js.native
  /** Returns the current resource details, when multiple resources are present, otherwise returns null.
    */
  var resources: js.UndefOr[js.Any] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object BeforeContextMenuOpenEventArgs {
  @scala.inline
  def apply(): BeforeContextMenuOpenEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeContextMenuOpenEventArgs]
  }
  @scala.inline
  implicit class BeforeContextMenuOpenEventArgsOps[Self <: BeforeContextMenuOpenEventArgs] (val x: Self) extends AnyVal {
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
    def setAppointment(value: js.Any): Self = this.set("appointment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppointment: Self = this.set("appointment", js.undefined)
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setCellIndex(value: Double): Self = this.set("cellIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellIndex: Self = this.set("cellIndex", js.undefined)
    @scala.inline
    def setCurrentDate(value: js.Any): Self = this.set("currentDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentDate: Self = this.set("currentDate", js.undefined)
    @scala.inline
    def setEvents(value: js.Any): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setObject(value: js.Any): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    @scala.inline
    def setResources(value: js.Any): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

