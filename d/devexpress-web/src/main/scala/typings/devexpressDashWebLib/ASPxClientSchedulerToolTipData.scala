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
  def GetResources(): js.Array[js.Object]
}

