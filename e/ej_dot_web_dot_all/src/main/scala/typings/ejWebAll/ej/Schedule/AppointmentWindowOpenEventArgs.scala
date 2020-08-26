package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppointmentWindowOpenEventArgs extends js.Object {
  /** Returns the edit appointment object.
    */
  var appointment: js.UndefOr[js.Any] = js.native
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the edit occurrence option value.
    */
  var edit: js.UndefOr[Boolean] = js.native
  /** Returns the end time of the double clicked cell.
    */
  var endTime: js.UndefOr[js.Any] = js.native
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[Model] = js.native
  /** returns the object of appointmentWindowOpen event while selecting the detail option from quick window or edit appointment or edit series option.
    */
  var `object`: js.UndefOr[js.Any] = js.native
  /** Returns the action name that triggers window open.
    */
  var originalEventType: js.UndefOr[String] = js.native
  /** Returns the start time of the double clicked cell.
    */
  var startTime: js.UndefOr[js.Any] = js.native
  /** Returns the target of the double clicked cell.
    */
  var target: js.UndefOr[js.Any] = js.native
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object AppointmentWindowOpenEventArgs {
  @scala.inline
  def apply(): AppointmentWindowOpenEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentWindowOpenEventArgs]
  }
  @scala.inline
  implicit class AppointmentWindowOpenEventArgsOps[Self <: AppointmentWindowOpenEventArgs] (val x: Self) extends AnyVal {
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
    def setEdit(value: Boolean): Self = this.set("edit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    @scala.inline
    def setEndTime(value: js.Any): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setObject(value: js.Any): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    @scala.inline
    def setOriginalEventType(value: String): Self = this.set("originalEventType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalEventType: Self = this.set("originalEventType", js.undefined)
    @scala.inline
    def setStartTime(value: js.Any): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

