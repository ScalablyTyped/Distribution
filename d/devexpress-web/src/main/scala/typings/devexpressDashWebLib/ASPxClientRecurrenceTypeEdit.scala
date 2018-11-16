package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a client-side equivalent of the RecurrenceTypeEdit.
 */

trait ASPxClientRecurrenceTypeEdit extends ASPxClientCheckListBase {
  /**
       * Gets the selected recurrence type.
       */
  def GetRecurrenceType(): ASPxClientRecurrenceType
  /**
       * Sets the selected recurrence type.
       * @param recurrenceType An ASPxClientRecurrenceType enumeration value.
       */
  def SetRecurrenceType(recurrenceType: ASPxClientRecurrenceType): scala.Unit
}

