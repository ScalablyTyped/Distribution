package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.global.JQuery
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxScheduler extends Widget {
  /** @name dxScheduler.addAppointment(appointment) */
  def addAppointment(appointment: js.Any): Unit = js.native
  /** @name dxScheduler.deleteAppointment(appointment) */
  def deleteAppointment(appointment: js.Any): Unit = js.native
  /** @name DataHelperMixin.getDataSource() */
  def getDataSource(): DataSource = js.native
  /** @name dxScheduler.getEndViewDate() */
  def getEndViewDate(): Date = js.native
  /** @name dxScheduler.getStartViewDate() */
  def getStartViewDate(): Date = js.native
  /** @name dxScheduler.hideAppointmentPopup(saveChanges) */
  def hideAppointmentPopup(): Unit = js.native
  def hideAppointmentPopup(saveChanges: Boolean): Unit = js.native
  /** @name dxScheduler.hideAppointmentTooltip() */
  def hideAppointmentTooltip(): Unit = js.native
  /** @name dxScheduler.scrollToTime(hours, minutes, date) */
  def scrollToTime(hours: Double, minutes: Double): Unit = js.native
  def scrollToTime(hours: Double, minutes: Double, date: Date): Unit = js.native
  /** @name dxScheduler.showAppointmentPopup(appointmentData, createNewAppointment, currentAppointmentData) */
  def showAppointmentPopup(): Unit = js.native
  def showAppointmentPopup(appointmentData: js.Any): Unit = js.native
  def showAppointmentPopup(appointmentData: js.Any, createNewAppointment: Boolean): Unit = js.native
  def showAppointmentPopup(appointmentData: js.Any, createNewAppointment: Boolean, currentAppointmentData: js.Any): Unit = js.native
  /** @name dxScheduler.showAppointmentTooltip(appointmentData, target, currentAppointmentData) */
  def showAppointmentTooltip(appointmentData: js.Any, target: String): Unit = js.native
  def showAppointmentTooltip(appointmentData: js.Any, target: String, currentAppointmentData: js.Any): Unit = js.native
  def showAppointmentTooltip(appointmentData: js.Any, target: JQuery): Unit = js.native
  def showAppointmentTooltip(appointmentData: js.Any, target: JQuery, currentAppointmentData: js.Any): Unit = js.native
  def showAppointmentTooltip(appointmentData: js.Any, target: Element): Unit = js.native
  def showAppointmentTooltip(appointmentData: js.Any, target: Element, currentAppointmentData: js.Any): Unit = js.native
  /** @name dxScheduler.updateAppointment(target, appointment) */
  def updateAppointment(target: js.Any, appointment: js.Any): Unit = js.native
}

