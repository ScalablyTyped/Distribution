package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Contains information related to the reminder alert.
 */

trait ASPxClientReminderAlertNotification extends js.Object {
  /**
       * Gets the appointment associated with the triggered reminder.
       * Value: An ASPxClientAppointment object.
       */
  var appointment: ASPxClientAppointment
  /**
       * Gets or sets whether the reminder is handled and therefore no default processing is required.
       * Value: true, if no default processing is required; otherwise, false.
       */
  var handled: scala.Boolean
  /**
       * Gets or sets whether an alert is invoked for a particular reminder.
       * Value: true, if the reminder doesn't generate an alert notification; otherwise, false.
       */
  var ignore: scala.Boolean
  /**
       * Returns the triggered reminder.
       * Value: An ASPxClientReminder object.
       */
  var reminder: ASPxClientReminder
  /**
       * Gets the appointment associated with the reminder.
       */
  def GetAppointment(): ASPxClientAppointment
  /**
       * Gets the triggered reminder.
       */
  def GetReminder(): ASPxClientReminder
  /**
       * Gets the triggered reminder's ID.
       */
  def GetReminderId(): java.lang.String
}

