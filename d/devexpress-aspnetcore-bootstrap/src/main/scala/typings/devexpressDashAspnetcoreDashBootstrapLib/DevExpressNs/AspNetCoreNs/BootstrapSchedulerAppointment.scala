package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapSchedulerAppointment")
@js.native
class BootstrapSchedulerAppointment protected () extends js.Object {
  protected def this(instance: js.Any) = this()
  val appointmentId: java.lang.String = js.native
  val appointmentType: BootstrapSchedulerAppointmentType = js.native
  val instance: js.Any = js.native
  val interval: BootstrapTimeInterval | scala.Null = js.native
  val labelIndex: scala.Double = js.native
  val resources: js.Array[java.lang.String] = js.native
  val statusIndex: scala.Double = js.native
  def addResource(resourceId: js.Object): scala.Unit = js.native
  def getAllDay(): scala.Boolean = js.native
  def getAppointmentType(): BootstrapSchedulerAppointmentType = js.native
  def getDescription(): java.lang.String = js.native
  def getDuration(): scala.Double = js.native
  def getEnd(): stdLib.Date = js.native
  def getId(): js.Any = js.native
  def getLabelId(): scala.Double = js.native
  def getLocation(): java.lang.String = js.native
  def getRecurrenceInfo(): BootstrapSchedulerRecurrenceInfo | scala.Null = js.native
  def getRecurrencePattern(): BootstrapSchedulerAppointment | scala.Null = js.native
  def getResource(index: scala.Double): js.Any = js.native
  def getStart(): stdLib.Date = js.native
  def getStatusId(): scala.Double = js.native
  def getSubject(): java.lang.String = js.native
  def setAllDay(allDay: scala.Boolean): scala.Unit = js.native
  def setAppointmentType(`type`: BootstrapSchedulerAppointmentType): scala.Unit = js.native
  def setDescription(description: java.lang.String): scala.Unit = js.native
  def setDuration(duration: scala.Double): scala.Unit = js.native
  def setEnd(end: stdLib.Date): scala.Unit = js.native
  def setId(id: js.Any): scala.Unit = js.native
  def setLabelId(statusId: scala.Double): scala.Unit = js.native
  def setLocation(location: java.lang.String): scala.Unit = js.native
  def setRecurrenceInfo(recurrenceInfo: BootstrapSchedulerRecurrenceInfo): scala.Unit = js.native
  def setStart(start: stdLib.Date): scala.Unit = js.native
  def setStatusId(statusId: scala.Double): scala.Unit = js.native
  def setSubject(subject: java.lang.String): scala.Unit = js.native
}

