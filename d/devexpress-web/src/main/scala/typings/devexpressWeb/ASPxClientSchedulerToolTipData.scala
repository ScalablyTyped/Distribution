package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a client tooltip.
  */
@js.native
trait ASPxClientSchedulerToolTipData extends StObject {
  
  /**
    * Returns the client appointment for which the tooltip is displayed.
    */
  def GetAppointment(): ASPxClientAppointment = js.native
  
  /**
    * Returns the client time interval for which the tooltip is displayed.
    */
  def GetInterval(): ASPxClientTimeInterval = js.native
  
  /**
    * Returns the resources associated with the appointment for which the tooltip is displayed.
    */
  def GetResources(): js.Array[String] = js.native
}
object ASPxClientSchedulerToolTipData {
  
  @scala.inline
  def apply(
    GetAppointment: () => ASPxClientAppointment,
    GetInterval: () => ASPxClientTimeInterval,
    GetResources: () => js.Array[String]
  ): ASPxClientSchedulerToolTipData = {
    val __obj = js.Dynamic.literal(GetAppointment = js.Any.fromFunction0(GetAppointment), GetInterval = js.Any.fromFunction0(GetInterval), GetResources = js.Any.fromFunction0(GetResources))
    __obj.asInstanceOf[ASPxClientSchedulerToolTipData]
  }
  
  @scala.inline
  implicit class ASPxClientSchedulerToolTipDataMutableBuilder[Self <: ASPxClientSchedulerToolTipData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAppointment(value: () => ASPxClientAppointment): Self = StObject.set(x, "GetAppointment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInterval(value: () => ASPxClientTimeInterval): Self = StObject.set(x, "GetInterval", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResources(value: () => js.Array[String]): Self = StObject.set(x, "GetResources", js.Any.fromFunction0(value))
  }
}
