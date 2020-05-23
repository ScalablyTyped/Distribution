package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a client tooltip.
  */
trait ASPxClientSchedulerToolTipData extends js.Object {
  /**
    * Returns the client appointment for which the tooltip is displayed.
    */
  def GetAppointment(): ASPxClientAppointment
  /**
    * Returns the client time interval for which the tooltip is displayed.
    */
  def GetInterval(): ASPxClientTimeInterval
  /**
    * Returns the resources associated with the appointment for which the tooltip is displayed.
    */
  def GetResources(): js.Array[String]
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
}

