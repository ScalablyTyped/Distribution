package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

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
  
  def getEnd(): js.Date
  
  def getId(): Any
  
  def getLabelId(): Double
  
  def getLocation(): String
  
  def getRecurrenceInfo(): BootstrapSchedulerRecurrenceInfo | Null
  
  def getRecurrencePattern(): BootstrapSchedulerAppointment | Null
  
  def getResource(index: Double): Any
  
  def getStart(): js.Date
  
  def getStatusId(): Double
  
  def getSubject(): String
  
  /* protected */ val instance: Any
  
  val interval: BootstrapTimeInterval | Null
  
  val labelIndex: Double
  
  val resources: js.Array[String]
  
  def setAllDay(allDay: Boolean): Unit
  
  def setAppointmentType(`type`: BootstrapSchedulerAppointmentType): Unit
  
  def setDescription(description: String): Unit
  
  def setDuration(duration: Double): Unit
  
  def setEnd(end: js.Date): Unit
  
  def setId(id: Any): Unit
  
  def setLabelId(statusId: Double): Unit
  
  def setLocation(location: String): Unit
  
  def setRecurrenceInfo(recurrenceInfo: BootstrapSchedulerRecurrenceInfo): Unit
  
  def setStart(start: js.Date): Unit
  
  def setStatusId(statusId: Double): Unit
  
  def setSubject(subject: String): Unit
  
  val statusIndex: Double
}
object BootstrapSchedulerAppointment {
  
  inline def apply(
    addResource: js.Object => Unit,
    appointmentId: String,
    appointmentType: BootstrapSchedulerAppointmentType,
    getAllDay: () => Boolean,
    getAppointmentType: () => BootstrapSchedulerAppointmentType,
    getDescription: () => String,
    getDuration: () => Double,
    getEnd: () => js.Date,
    getId: () => Any,
    getLabelId: () => Double,
    getLocation: () => String,
    getRecurrenceInfo: () => BootstrapSchedulerRecurrenceInfo | Null,
    getRecurrencePattern: () => BootstrapSchedulerAppointment | Null,
    getResource: Double => Any,
    getStart: () => js.Date,
    getStatusId: () => Double,
    getSubject: () => String,
    instance: Any,
    labelIndex: Double,
    resources: js.Array[String],
    setAllDay: Boolean => Unit,
    setAppointmentType: BootstrapSchedulerAppointmentType => Unit,
    setDescription: String => Unit,
    setDuration: Double => Unit,
    setEnd: js.Date => Unit,
    setId: Any => Unit,
    setLabelId: Double => Unit,
    setLocation: String => Unit,
    setRecurrenceInfo: BootstrapSchedulerRecurrenceInfo => Unit,
    setStart: js.Date => Unit,
    setStatusId: Double => Unit,
    setSubject: String => Unit,
    statusIndex: Double
  ): BootstrapSchedulerAppointment = {
    val __obj = js.Dynamic.literal(addResource = js.Any.fromFunction1(addResource), appointmentId = appointmentId.asInstanceOf[js.Any], appointmentType = appointmentType.asInstanceOf[js.Any], getAllDay = js.Any.fromFunction0(getAllDay), getAppointmentType = js.Any.fromFunction0(getAppointmentType), getDescription = js.Any.fromFunction0(getDescription), getDuration = js.Any.fromFunction0(getDuration), getEnd = js.Any.fromFunction0(getEnd), getId = js.Any.fromFunction0(getId), getLabelId = js.Any.fromFunction0(getLabelId), getLocation = js.Any.fromFunction0(getLocation), getRecurrenceInfo = js.Any.fromFunction0(getRecurrenceInfo), getRecurrencePattern = js.Any.fromFunction0(getRecurrencePattern), getResource = js.Any.fromFunction1(getResource), getStart = js.Any.fromFunction0(getStart), getStatusId = js.Any.fromFunction0(getStatusId), getSubject = js.Any.fromFunction0(getSubject), instance = instance.asInstanceOf[js.Any], labelIndex = labelIndex.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], setAllDay = js.Any.fromFunction1(setAllDay), setAppointmentType = js.Any.fromFunction1(setAppointmentType), setDescription = js.Any.fromFunction1(setDescription), setDuration = js.Any.fromFunction1(setDuration), setEnd = js.Any.fromFunction1(setEnd), setId = js.Any.fromFunction1(setId), setLabelId = js.Any.fromFunction1(setLabelId), setLocation = js.Any.fromFunction1(setLocation), setRecurrenceInfo = js.Any.fromFunction1(setRecurrenceInfo), setStart = js.Any.fromFunction1(setStart), setStatusId = js.Any.fromFunction1(setStatusId), setSubject = js.Any.fromFunction1(setSubject), statusIndex = statusIndex.asInstanceOf[js.Any], interval = null)
    __obj.asInstanceOf[BootstrapSchedulerAppointment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BootstrapSchedulerAppointment] (val x: Self) extends AnyVal {
    
    inline def setAddResource(value: js.Object => Unit): Self = StObject.set(x, "addResource", js.Any.fromFunction1(value))
    
    inline def setAppointmentId(value: String): Self = StObject.set(x, "appointmentId", value.asInstanceOf[js.Any])
    
    inline def setAppointmentType(value: BootstrapSchedulerAppointmentType): Self = StObject.set(x, "appointmentType", value.asInstanceOf[js.Any])
    
    inline def setGetAllDay(value: () => Boolean): Self = StObject.set(x, "getAllDay", js.Any.fromFunction0(value))
    
    inline def setGetAppointmentType(value: () => BootstrapSchedulerAppointmentType): Self = StObject.set(x, "getAppointmentType", js.Any.fromFunction0(value))
    
    inline def setGetDescription(value: () => String): Self = StObject.set(x, "getDescription", js.Any.fromFunction0(value))
    
    inline def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
    
    inline def setGetEnd(value: () => js.Date): Self = StObject.set(x, "getEnd", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Any): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetLabelId(value: () => Double): Self = StObject.set(x, "getLabelId", js.Any.fromFunction0(value))
    
    inline def setGetLocation(value: () => String): Self = StObject.set(x, "getLocation", js.Any.fromFunction0(value))
    
    inline def setGetRecurrenceInfo(value: () => BootstrapSchedulerRecurrenceInfo | Null): Self = StObject.set(x, "getRecurrenceInfo", js.Any.fromFunction0(value))
    
    inline def setGetRecurrencePattern(value: () => BootstrapSchedulerAppointment | Null): Self = StObject.set(x, "getRecurrencePattern", js.Any.fromFunction0(value))
    
    inline def setGetResource(value: Double => Any): Self = StObject.set(x, "getResource", js.Any.fromFunction1(value))
    
    inline def setGetStart(value: () => js.Date): Self = StObject.set(x, "getStart", js.Any.fromFunction0(value))
    
    inline def setGetStatusId(value: () => Double): Self = StObject.set(x, "getStatusId", js.Any.fromFunction0(value))
    
    inline def setGetSubject(value: () => String): Self = StObject.set(x, "getSubject", js.Any.fromFunction0(value))
    
    inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: BootstrapTimeInterval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalNull: Self = StObject.set(x, "interval", null)
    
    inline def setLabelIndex(value: Double): Self = StObject.set(x, "labelIndex", value.asInstanceOf[js.Any])
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setSetAllDay(value: Boolean => Unit): Self = StObject.set(x, "setAllDay", js.Any.fromFunction1(value))
    
    inline def setSetAppointmentType(value: BootstrapSchedulerAppointmentType => Unit): Self = StObject.set(x, "setAppointmentType", js.Any.fromFunction1(value))
    
    inline def setSetDescription(value: String => Unit): Self = StObject.set(x, "setDescription", js.Any.fromFunction1(value))
    
    inline def setSetDuration(value: Double => Unit): Self = StObject.set(x, "setDuration", js.Any.fromFunction1(value))
    
    inline def setSetEnd(value: js.Date => Unit): Self = StObject.set(x, "setEnd", js.Any.fromFunction1(value))
    
    inline def setSetId(value: Any => Unit): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
    
    inline def setSetLabelId(value: Double => Unit): Self = StObject.set(x, "setLabelId", js.Any.fromFunction1(value))
    
    inline def setSetLocation(value: String => Unit): Self = StObject.set(x, "setLocation", js.Any.fromFunction1(value))
    
    inline def setSetRecurrenceInfo(value: BootstrapSchedulerRecurrenceInfo => Unit): Self = StObject.set(x, "setRecurrenceInfo", js.Any.fromFunction1(value))
    
    inline def setSetStart(value: js.Date => Unit): Self = StObject.set(x, "setStart", js.Any.fromFunction1(value))
    
    inline def setSetStatusId(value: Double => Unit): Self = StObject.set(x, "setStatusId", js.Any.fromFunction1(value))
    
    inline def setSetSubject(value: String => Unit): Self = StObject.set(x, "setSubject", js.Any.fromFunction1(value))
    
    inline def setStatusIndex(value: Double): Self = StObject.set(x, "statusIndex", value.asInstanceOf[js.Any])
  }
}
