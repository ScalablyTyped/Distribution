package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a client tooltip.
  */
@JSGlobal("ASPxClientSchedulerToolTipData")
@js.native
class ASPxClientSchedulerToolTipData ()
  extends typings.devexpressWeb.ASPxClientSchedulerToolTipData {
  /**
    * Returns the client appointment for which the tooltip is displayed.
    */
  /* CompleteClass */
  override def GetAppointment(): typings.devexpressWeb.ASPxClientAppointment = js.native
  /**
    * Returns the client time interval for which the tooltip is displayed.
    */
  /* CompleteClass */
  override def GetInterval(): typings.devexpressWeb.ASPxClientTimeInterval = js.native
  /**
    * Returns the resources associated with the appointment for which the tooltip is displayed.
    */
  /* CompleteClass */
  override def GetResources(): js.Array[String] = js.native
}

