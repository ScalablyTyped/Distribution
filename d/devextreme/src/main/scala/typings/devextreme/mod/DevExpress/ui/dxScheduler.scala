package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.global.JQuery
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxScheduler extends Widget {
  
  /**
    * [descr:dxScheduler.addAppointment(appointment)]
    */
  def addAppointment(appointment: js.Any): Unit = js.native
  
  /**
    * [descr:dxScheduler.deleteAppointment(appointment)]
    */
  def deleteAppointment(appointment: js.Any): Unit = js.native
  
  /**
    * [descr:DataHelperMixin.getDataSource()]
    */
  def getDataSource(): DataSource = js.native
  
  /**
    * [descr:dxScheduler.getEndViewDate()]
    */
  def getEndViewDate(): Date = js.native
  
  /**
    * [descr:dxScheduler.getStartViewDate()]
    */
  def getStartViewDate(): Date = js.native
  
  /**
    * [descr:dxScheduler.hideAppointmentPopup(saveChanges)]
    */
  def hideAppointmentPopup(): Unit = js.native
  def hideAppointmentPopup(saveChanges: Boolean): Unit = js.native
  
  /**
    * [descr:dxScheduler.hideAppointmentTooltip()]
    */
  def hideAppointmentTooltip(): Unit = js.native
  
  /**
    * [descr:dxScheduler.scrollToTime(hours, minutes, date)]
    */
  def scrollToTime(hours: Double, minutes: Double): Unit = js.native
  def scrollToTime(hours: Double, minutes: Double, date: Date): Unit = js.native
  
  /**
    * [descr:dxScheduler.showAppointmentPopup(appointmentData, createNewAppointment, currentAppointmentData)]
    */
  def showAppointmentPopup(): Unit = js.native
  def showAppointmentPopup(
    appointmentData: js.UndefOr[scala.Nothing],
    createNewAppointment: js.UndefOr[scala.Nothing],
    currentAppointmentData: js.Any
  ): Unit = js.native
  def showAppointmentPopup(appointmentData: js.UndefOr[scala.Nothing], createNewAppointment: Boolean): Unit = js.native
  def showAppointmentPopup(
    appointmentData: js.UndefOr[scala.Nothing],
    createNewAppointment: Boolean,
    currentAppointmentData: js.Any
  ): Unit = js.native
  def showAppointmentPopup(appointmentData: js.Any): Unit = js.native
  def showAppointmentPopup(
    appointmentData: js.Any,
    createNewAppointment: js.UndefOr[scala.Nothing],
    currentAppointmentData: js.Any
  ): Unit = js.native
  def showAppointmentPopup(appointmentData: js.Any, createNewAppointment: Boolean): Unit = js.native
  def showAppointmentPopup(appointmentData: js.Any, createNewAppointment: Boolean, currentAppointmentData: js.Any): Unit = js.native
  
  /**
    * [descr:dxScheduler.showAppointmentTooltip(appointmentData, target, currentAppointmentData)]
    */
  def showAppointmentTooltip(appointmentData: js.Any, target: String): Unit = js.native
  def showAppointmentTooltip(appointmentData: js.Any, target: String, currentAppointmentData: js.Any): Unit = js.native
  def showAppointmentTooltip(appointmentData: js.Any, target: JQuery): Unit = js.native
  def showAppointmentTooltip(appointmentData: js.Any, target: JQuery, currentAppointmentData: js.Any): Unit = js.native
  def showAppointmentTooltip(appointmentData: js.Any, target: Element): Unit = js.native
  def showAppointmentTooltip(appointmentData: js.Any, target: Element, currentAppointmentData: js.Any): Unit = js.native
  
  /**
    * [descr:dxScheduler.updateAppointment(target, appointment)]
    */
  def updateAppointment(target: js.Any, appointment: js.Any): Unit = js.native
}
