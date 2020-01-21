package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A base for client equivalents of recurrence controls available in the XtraScheduler library.
  */
@JSGlobal("ASPxClientRecurrenceControlBase")
@js.native
class ASPxClientRecurrenceControlBase () extends ASPxClientControl {
  /**
    * Returns an object providing access to the ASPxClientRecurrenceControlBase control's editor values.
    */
  def CreateValueAccessor(): DefaultRecurrenceRuleValuesAccessor = js.native
  /**
    * Updates values of editors displayed by the ASPxClientRecurrenceControlBase control.
    * @param recurrenceInfo An ASPxClientRecurrenceInfo object containing new editor values.
    */
  def Update(recurrenceInfo: ASPxClientRecurrenceInfo): Unit = js.native
}

