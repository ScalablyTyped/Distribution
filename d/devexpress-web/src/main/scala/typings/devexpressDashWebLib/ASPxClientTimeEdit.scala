package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents the client-side equivalent of the ASPxTimeEdit control.
 */

trait ASPxClientTimeEdit extends ASPxClientSpinEditBase {
  /**
       * Fires after the selected date has been changed within the time editor.
       */
  var DateChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTimeEdit]]
  /**
       * Gets the date that is the editor's value.
       */
  def GetDate(): stdLib.Date
  /**
       * Specifies the date for the editor.
       * @param date A DateTime object that is the date.
       */
  def SetDate(date: stdLib.Date): scala.Unit
}

