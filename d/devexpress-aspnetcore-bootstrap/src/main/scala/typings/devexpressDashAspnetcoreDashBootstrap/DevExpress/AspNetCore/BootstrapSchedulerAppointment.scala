package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapSchedulerAppointment")
@js.native
class BootstrapSchedulerAppointment protected () extends js.Object {
  protected def this(instance: js.Any) = this()
  val appointmentId: String = js.native
  val appointmentType: BootstrapSchedulerAppointmentType = js.native
  val instance: js.Any = js.native
  val interval: BootstrapTimeInterval | Null = js.native
  val labelIndex: Double = js.native
  val resources: js.Array[String] = js.native
  val statusIndex: Double = js.native
  def addResource(resourceId: js.Object): Unit = js.native
  def getAllDay(): Boolean = js.native
  def getAppointmentType(): BootstrapSchedulerAppointmentType = js.native
  def getDescription(): String = js.native
  def getDuration(): Double = js.native
  def getEnd(): Date = js.native
  def getId(): js.Any = js.native
  def getLabelId(): Double = js.native
  def getLocation(): String = js.native
  def getRecurrenceInfo(): BootstrapSchedulerRecurrenceInfo | Null = js.native
  def getRecurrencePattern(): BootstrapSchedulerAppointment | Null = js.native
  def getResource(index: Double): js.Any = js.native
  def getStart(): Date = js.native
  def getStatusId(): Double = js.native
  def getSubject(): String = js.native
  def setAllDay(allDay: Boolean): Unit = js.native
  def setAppointmentType(`type`: BootstrapSchedulerAppointmentType): Unit = js.native
  def setDescription(description: String): Unit = js.native
  def setDuration(duration: Double): Unit = js.native
  def setEnd(end: Date): Unit = js.native
  def setId(id: js.Any): Unit = js.native
  def setLabelId(statusId: Double): Unit = js.native
  def setLocation(location: String): Unit = js.native
  def setRecurrenceInfo(recurrenceInfo: BootstrapSchedulerRecurrenceInfo): Unit = js.native
  def setStart(start: Date): Unit = js.native
  def setStatusId(statusId: Double): Unit = js.native
  def setSubject(subject: String): Unit = js.native
}

