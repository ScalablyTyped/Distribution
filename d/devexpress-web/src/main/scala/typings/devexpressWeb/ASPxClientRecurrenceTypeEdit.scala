package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the RecurrenceTypeEdit.
  */
@JSGlobal("ASPxClientRecurrenceTypeEdit")
@js.native
class ASPxClientRecurrenceTypeEdit () extends ASPxClientRadioButtonList {
  /**
    * Gets the selected recurrence type.
    */
  def GetRecurrenceType(): ASPxClientRecurrenceType = js.native
  /**
    * Sets the selected recurrence type.
    * @param recurrenceType An ASPxClientRecurrenceType enumeration value.
    */
  def SetRecurrenceType(recurrenceType: ASPxClientRecurrenceType): Unit = js.native
}

