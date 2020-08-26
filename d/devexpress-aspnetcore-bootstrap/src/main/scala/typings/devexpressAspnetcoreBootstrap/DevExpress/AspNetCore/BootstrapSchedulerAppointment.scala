package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapSchedulerAppointment extends js.Object {
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
    statusIndex: Double
  ): BootstrapSchedulerAppointment = {
    val __obj = js.Dynamic.literal(addResource = js.Any.fromFunction1(addResource), appointmentId = appointmentId.asInstanceOf[js.Any], appointmentType = appointmentType.asInstanceOf[js.Any], getAllDay = js.Any.fromFunction0(getAllDay), getAppointmentType = js.Any.fromFunction0(getAppointmentType), getDescription = js.Any.fromFunction0(getDescription), getDuration = js.Any.fromFunction0(getDuration), getEnd = js.Any.fromFunction0(getEnd), getId = js.Any.fromFunction0(getId), getLabelId = js.Any.fromFunction0(getLabelId), getLocation = js.Any.fromFunction0(getLocation), getRecurrenceInfo = js.Any.fromFunction0(getRecurrenceInfo), getRecurrencePattern = js.Any.fromFunction0(getRecurrencePattern), getResource = js.Any.fromFunction1(getResource), getStart = js.Any.fromFunction0(getStart), getStatusId = js.Any.fromFunction0(getStatusId), getSubject = js.Any.fromFunction0(getSubject), instance = instance.asInstanceOf[js.Any], labelIndex = labelIndex.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], setAllDay = js.Any.fromFunction1(setAllDay), setAppointmentType = js.Any.fromFunction1(setAppointmentType), setDescription = js.Any.fromFunction1(setDescription), setDuration = js.Any.fromFunction1(setDuration), setEnd = js.Any.fromFunction1(setEnd), setId = js.Any.fromFunction1(setId), setLabelId = js.Any.fromFunction1(setLabelId), setLocation = js.Any.fromFunction1(setLocation), setRecurrenceInfo = js.Any.fromFunction1(setRecurrenceInfo), setStart = js.Any.fromFunction1(setStart), setStatusId = js.Any.fromFunction1(setStatusId), setSubject = js.Any.fromFunction1(setSubject), statusIndex = statusIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapSchedulerAppointment]
  }
  @scala.inline
  implicit class BootstrapSchedulerAppointmentOps[Self <: BootstrapSchedulerAppointment] (val x: Self) extends AnyVal {
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
    def setAddResource(value: js.Object => Unit): Self = this.set("addResource", js.Any.fromFunction1(value))
    @scala.inline
    def setAppointmentId(value: String): Self = this.set("appointmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppointmentType(value: BootstrapSchedulerAppointmentType): Self = this.set("appointmentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAllDay(value: () => Boolean): Self = this.set("getAllDay", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAppointmentType(value: () => BootstrapSchedulerAppointmentType): Self = this.set("getAppointmentType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDescription(value: () => String): Self = this.set("getDescription", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDuration(value: () => Double): Self = this.set("getDuration", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEnd(value: () => Date): Self = this.set("getEnd", js.Any.fromFunction0(value))
    @scala.inline
    def setGetId(value: () => js.Any): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLabelId(value: () => Double): Self = this.set("getLabelId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLocation(value: () => String): Self = this.set("getLocation", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRecurrenceInfo(value: () => BootstrapSchedulerRecurrenceInfo | Null): Self = this.set("getRecurrenceInfo", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRecurrencePattern(value: () => BootstrapSchedulerAppointment | Null): Self = this.set("getRecurrencePattern", js.Any.fromFunction0(value))
    @scala.inline
    def setGetResource(value: Double => js.Any): Self = this.set("getResource", js.Any.fromFunction1(value))
    @scala.inline
    def setGetStart(value: () => Date): Self = this.set("getStart", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStatusId(value: () => Double): Self = this.set("getStatusId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSubject(value: () => String): Self = this.set("getSubject", js.Any.fromFunction0(value))
    @scala.inline
    def setInstance(value: js.Any): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelIndex(value: Double): Self = this.set("labelIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourcesVarargs(value: String*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetAllDay(value: Boolean => Unit): Self = this.set("setAllDay", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAppointmentType(value: BootstrapSchedulerAppointmentType => Unit): Self = this.set("setAppointmentType", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDescription(value: String => Unit): Self = this.set("setDescription", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDuration(value: Double => Unit): Self = this.set("setDuration", js.Any.fromFunction1(value))
    @scala.inline
    def setSetEnd(value: Date => Unit): Self = this.set("setEnd", js.Any.fromFunction1(value))
    @scala.inline
    def setSetId(value: js.Any => Unit): Self = this.set("setId", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLabelId(value: Double => Unit): Self = this.set("setLabelId", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLocation(value: String => Unit): Self = this.set("setLocation", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRecurrenceInfo(value: BootstrapSchedulerRecurrenceInfo => Unit): Self = this.set("setRecurrenceInfo", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStart(value: Date => Unit): Self = this.set("setStart", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStatusId(value: Double => Unit): Self = this.set("setStatusId", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSubject(value: String => Unit): Self = this.set("setSubject", js.Any.fromFunction1(value))
    @scala.inline
    def setStatusIndex(value: Double): Self = this.set("statusIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterval(value: BootstrapTimeInterval): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntervalNull: Self = this.set("interval", null)
  }
  
}

