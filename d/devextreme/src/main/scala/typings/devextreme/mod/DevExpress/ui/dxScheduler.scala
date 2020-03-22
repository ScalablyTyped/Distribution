package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod._Global_.JQuery
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxScheduler extends Widget {
  /** Adds an appointment. */
  def addAppointment(appointment: js.Any): Unit = js.native
  /** Deletes an appointment from the timetable and its object from the data source. */
  def deleteAppointment(appointment: js.Any): Unit = js.native
  /** Gets the DataSource instance. */
  def getDataSource(): DataSource = js.native
  /** Gets the current view's end date. */
  def getEndViewDate(): Date = js.native
  /** Gets the current view's start date. */
  def getStartViewDate(): Date = js.native
  /** Hides an appointment details form. */
  def hideAppointmentPopup(): Unit = js.native
  def hideAppointmentPopup(saveChanges: Boolean): Unit = js.native
  /** Hides an appointment's or cell overflow indicator's tooltip. */
  def hideAppointmentTooltip(): Unit = js.native
  /** Scrolls the current view to a specific day and time. */
  def scrollToTime(hours: Double, minutes: Double): Unit = js.native
  def scrollToTime(hours: Double, minutes: Double, date: Date): Unit = js.native
  /** Shows the appointment details form. */
  def showAppointmentPopup(): Unit = js.native
  def showAppointmentPopup(appointmentData: js.Any): Unit = js.native
  def showAppointmentPopup(appointmentData: js.Any, createNewAppointment: Boolean): Unit = js.native
  def showAppointmentPopup(appointmentData: js.Any, createNewAppointment: Boolean, currentAppointmentData: js.Any): Unit = js.native
  /** Shows a tooltip for a target element. */
  def showAppointmentTooltip(appointmentData: js.Any, target: String): Unit = js.native
  def showAppointmentTooltip(appointmentData: js.Any, target: String, currentAppointmentData: js.Any): Unit = js.native
  def showAppointmentTooltip(appointmentData: js.Any, target: JQuery): Unit = js.native
  def showAppointmentTooltip(appointmentData: js.Any, target: JQuery, currentAppointmentData: js.Any): Unit = js.native
  def showAppointmentTooltip(appointmentData: js.Any, target: Element): Unit = js.native
  def showAppointmentTooltip(appointmentData: js.Any, target: Element, currentAppointmentData: js.Any): Unit = js.native
  /** Updates an appointment. */
  def updateAppointment(target: js.Any, appointment: js.Any): Unit = js.native
}

