package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the AppointmentType enumeration.
  */
trait ASPxAppointmentType extends js.Object {
  /**
    * Gets a string representation equivalent of ChangedOccurrence enumeration for use in client scripts.
    * Value: A "ChangedOccurrence" string value.
    */
  var ChangedOccurrence: java.lang.String
  /**
    * Gets a string representation equivalent of DeletedOccurrence enumeration for use in client scripts.
    * Value: A "DeletedOccurrence" string value.
    */
  var DeletedOccurrence: java.lang.String
  /**
    * Gets a string representation equivalent of Normal enumeration for use in client scripts.
    * Value: A "Normal" string value.
    */
  var Normal: java.lang.String
  /**
    * Gets a string representation equivalent of Occurrence enumeration for use in client scripts.
    * Value: An "Occurrence" string value.
    */
  var Occurrence: java.lang.String
  /**
    * Gets a string representation equivalent of Pattern enumeration for use in client scripts.
    * Value: A "Pattern" string value.
    */
  var Pattern: java.lang.String
}

object ASPxAppointmentType {
  @scala.inline
  def apply(
    ChangedOccurrence: java.lang.String,
    DeletedOccurrence: java.lang.String,
    Normal: java.lang.String,
    Occurrence: java.lang.String,
    Pattern: java.lang.String
  ): ASPxAppointmentType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ChangedOccurrence")(ChangedOccurrence)
    __obj.updateDynamic("DeletedOccurrence")(DeletedOccurrence)
    __obj.updateDynamic("Normal")(Normal)
    __obj.updateDynamic("Occurrence")(Occurrence)
    __obj.updateDynamic("Pattern")(Pattern)
    __obj.asInstanceOf[ASPxAppointmentType]
  }
}

