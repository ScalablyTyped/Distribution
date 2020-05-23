package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapSchedulerAppointment extends js.Object {
  val appointmentId: String
  val appointmentType: BootstrapSchedulerAppointmentType
  val instance: js.Any
  val interval: BootstrapTimeInterval | Null
  val labelIndex: Double
  val resources: js.Array[String]
  val statusIndex: Double
  def addResource(resourceId: js.Object): Unit
  def getAllDay(): Boolean
  def getAppointmentType(): BootstrapSchedulerAppointmentType
  def getDescription(): String
  def getDuration(): Double
  def getEnd(): Date
  def getId(): js.Any
  def getLabelId(): Double
  def getLocation(): String
  def getRecurrenceInfo(): BootstrapSchedulerRecurrenceInfo | Null
  def getRecurrencePattern(): BootstrapSchedulerAppointment | Null
  def getResource(index: Double): js.Any
  def getStart(): Date
  def getStatusId(): Double
  def getSubject(): String
  def setAllDay(allDay: Boolean): Unit
  def setAppointmentType(`type`: BootstrapSchedulerAppointmentType): Unit
  def setDescription(description: String): Unit
  def setDuration(duration: Double): Unit
  def setEnd(end: Date): Unit
  def setId(id: js.Any): Unit
  def setLabelId(statusId: Double): Unit
  def setLocation(location: String): Unit
  def setRecurrenceInfo(recurrenceInfo: BootstrapSchedulerRecurrenceInfo): Unit
  def setStart(start: Date): Unit
  def setStatusId(statusId: Double): Unit
  def setSubject(subject: String): Unit
}

object BootstrapSchedulerAppointment {
  @scala.inline
  def apply(
    addResource: js.Object => Unit,
    appointmentId: String,
    appointmentType: BootstrapSchedulerAppointmentType,
    getAllDay: () => Boolean,
    getAppointmentType: () => BootstrapSchedulerAppointmentType,
    getDescription: () => String,
    getDuration: () => Double,
    getEnd: () => Date,
    getId: () => js.Any,
    getLabelId: () => Double,
    getLocation: () => String,
    getRecurrenceInfo: () => BootstrapSchedulerRecurrenceInfo | Null,
    getRecurrencePattern: () => BootstrapSchedulerAppointment | Null,
    getResource: Double => js.Any,
    getStart: () => Date,
    getStatusId: () => Double,
    getSubject: () => String,
    instance: js.Any,
    labelIndex: Double,
    resources: js.Array[String],
    setAllDay: Boolean => Unit,
    setAppointmentType: BootstrapSchedulerAppointmentType => Unit,
    setDescription: String => Unit,
    setDuration: Double => Unit,
    setEnd: Date => Unit,
    setId: js.Any => Unit,
    setLabelId: Double => Unit,
    setLocation: String => Unit,
    setRecurrenceInfo: BootstrapSchedulerRecurrenceInfo => Unit,
    setStart: Date => Unit,
    setStatusId: Double => Unit,
    setSubject: String => Unit,
    statusIndex: Double,
    interval: BootstrapTimeInterval = null
  ): BootstrapSchedulerAppointment = {
    val __obj = js.Dynamic.literal(addResource = js.Any.fromFunction1(addResource), appointmentId = appointmentId.asInstanceOf[js.Any], appointmentType = appointmentType.asInstanceOf[js.Any], getAllDay = js.Any.fromFunction0(getAllDay), getAppointmentType = js.Any.fromFunction0(getAppointmentType), getDescription = js.Any.fromFunction0(getDescription), getDuration = js.Any.fromFunction0(getDuration), getEnd = js.Any.fromFunction0(getEnd), getId = js.Any.fromFunction0(getId), getLabelId = js.Any.fromFunction0(getLabelId), getLocation = js.Any.fromFunction0(getLocation), getRecurrenceInfo = js.Any.fromFunction0(getRecurrenceInfo), getRecurrencePattern = js.Any.fromFunction0(getRecurrencePattern), getResource = js.Any.fromFunction1(getResource), getStart = js.Any.fromFunction0(getStart), getStatusId = js.Any.fromFunction0(getStatusId), getSubject = js.Any.fromFunction0(getSubject), instance = instance.asInstanceOf[js.Any], labelIndex = labelIndex.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], setAllDay = js.Any.fromFunction1(setAllDay), setAppointmentType = js.Any.fromFunction1(setAppointmentType), setDescription = js.Any.fromFunction1(setDescription), setDuration = js.Any.fromFunction1(setDuration), setEnd = js.Any.fromFunction1(setEnd), setId = js.Any.fromFunction1(setId), setLabelId = js.Any.fromFunction1(setLabelId), setLocation = js.Any.fromFunction1(setLocation), setRecurrenceInfo = js.Any.fromFunction1(setRecurrenceInfo), setStart = js.Any.fromFunction1(setStart), setStatusId = js.Any.fromFunction1(setStatusId), setSubject = js.Any.fromFunction1(setSubject), statusIndex = statusIndex.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapSchedulerAppointment]
  }
}

