package typings
package devexpressDashWebLib

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
  def GetResources(): js.Array[java.lang.String]
}

object ASPxClientSchedulerToolTipData {
  @scala.inline
  def apply(
    GetAppointment: js.Function0[ASPxClientAppointment],
    GetInterval: js.Function0[ASPxClientTimeInterval],
    GetResources: js.Function0[js.Array[java.lang.String]]
  ): ASPxClientSchedulerToolTipData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetAppointment")(GetAppointment)
    __obj.updateDynamic("GetInterval")(GetInterval)
    __obj.updateDynamic("GetResources")(GetResources)
    __obj.asInstanceOf[ASPxClientSchedulerToolTipData]
  }
}

