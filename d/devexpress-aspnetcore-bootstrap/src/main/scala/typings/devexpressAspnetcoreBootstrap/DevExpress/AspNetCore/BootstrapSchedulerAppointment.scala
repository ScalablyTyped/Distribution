package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapSchedulerAppointment extends StObject {
  
  def addResource(resourceId: js.Object): Unit
  
  val appointmentId: String
  
  val appointmentType: BootstrapSchedulerAppointmentType
  
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
  
  val instance: js.Any
  
  val interval: BootstrapTimeInterval | Null
  
  val labelIndex: Double
  
  val resources: js.Array[String]
  
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
  
  val statusIndex: Double
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
    val __obj = js.Dynamic.literal(addResource = js.Any.fromFunction1(addResource), appointmentId = appointmentId.asInstanceOf[js.Any], appointmentType = appointmentType.asInstanceOf[js.Any], getAllDay = js.Any.fromFunction0(getAllDay), getAppointmentType = js.Any.fromFunction0(getAppointmentType), getDescription = js.Any.fromFunction0(getDescription), getDuration = js.Any.fromFunction0(getDuration), getEnd = js.Any.fromFunction0(getEnd), getId = js.Any.fromFunction0(getId), getLabelId = js.Any.fromFunction0(getLabelId), getLocation = js.Any.fromFunction0(getLocation), getRecurrenceInfo = js.Any.fromFunction0(getRecurrenceInfo), getRecurrencePattern = js.Any.fromFunction0(getRecurrencePattern), getResource = js.Any.fromFunction1(getResource), getStart = js.Any.fromFunction0(getStart), getStatusId = js.Any.fromFunction0(getStatusId), getSubject = js.Any.fromFunction0(getSubject), instance = instance.asInstanceOf[js.Any], labelIndex = labelIndex.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], setAllDay = js.Any.fromFunction1(setAllDay), setAppointmentType = js.Any.fromFunction1(setAppointmentType), setDescription = js.Any.fromFunction1(setDescription), setDuration = js.Any.fromFunction1(setDuration), setEnd = js.Any.fromFunction1(setEnd), setId = js.Any.fromFunction1(setId), setLabelId = js.Any.fromFunction1(setLabelId), setLocation = js.Any.fromFunction1(setLocation), setRecurrenceInfo = js.Any.fromFunction1(setRecurrenceInfo), setStart = js.Any.fromFunction1(setStart), setStatusId = js.Any.fromFunction1(setStatusId), setSubject = js.Any.fromFunction1(setSubject), statusIndex = statusIndex.asInstanceOf[js.Any], interval = null)
    __obj.asInstanceOf[BootstrapSchedulerAppointment]
  }
  
  @scala.inline
  implicit class BootstrapSchedulerAppointmentMutableBuilder[Self <: BootstrapSchedulerAppointment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddResource(value: js.Object => Unit): Self = StObject.set(x, "addResource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppointmentId(value: String): Self = StObject.set(x, "appointmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentType(value: BootstrapSchedulerAppointmentType): Self = StObject.set(x, "appointmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAllDay(value: () => Boolean): Self = StObject.set(x, "getAllDay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAppointmentType(value: () => BootstrapSchedulerAppointmentType): Self = StObject.set(x, "getAppointmentType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDescription(value: () => String): Self = StObject.set(x, "getDescription", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnd(value: () => Date): Self = StObject.set(x, "getEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => js.Any): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLabelId(value: () => Double): Self = StObject.set(x, "getLabelId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLocation(value: () => String): Self = StObject.set(x, "getLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecurrenceInfo(value: () => BootstrapSchedulerRecurrenceInfo | Null): Self = StObject.set(x, "getRecurrenceInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecurrencePattern(value: () => BootstrapSchedulerAppointment | Null): Self = StObject.set(x, "getRecurrencePattern", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResource(value: Double => js.Any): Self = StObject.set(x, "getResource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStart(value: () => Date): Self = StObject.set(x, "getStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStatusId(value: () => Double): Self = StObject.set(x, "getStatusId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubject(value: () => String): Self = StObject.set(x, "getSubject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstance(value: js.Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: BootstrapTimeInterval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalNull: Self = StObject.set(x, "interval", null)
    
    @scala.inline
    def setLabelIndex(value: Double): Self = StObject.set(x, "labelIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    @scala.inline
    def setSetAllDay(value: Boolean => Unit): Self = StObject.set(x, "setAllDay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAppointmentType(value: BootstrapSchedulerAppointmentType => Unit): Self = StObject.set(x, "setAppointmentType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDescription(value: String => Unit): Self = StObject.set(x, "setDescription", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDuration(value: Double => Unit): Self = StObject.set(x, "setDuration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnd(value: Date => Unit): Self = StObject.set(x, "setEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetId(value: js.Any => Unit): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLabelId(value: Double => Unit): Self = StObject.set(x, "setLabelId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLocation(value: String => Unit): Self = StObject.set(x, "setLocation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRecurrenceInfo(value: BootstrapSchedulerRecurrenceInfo => Unit): Self = StObject.set(x, "setRecurrenceInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStart(value: Date => Unit): Self = StObject.set(x, "setStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStatusId(value: Double => Unit): Self = StObject.set(x, "setStatusId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSubject(value: String => Unit): Self = StObject.set(x, "setSubject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatusIndex(value: Double): Self = StObject.set(x, "statusIndex", value.asInstanceOf[js.Any])
  }
}
