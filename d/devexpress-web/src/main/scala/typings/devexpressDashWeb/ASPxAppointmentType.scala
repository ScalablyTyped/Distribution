package typings.devexpressDashWeb

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
  var ChangedOccurrence: String
  /**
    * Gets a string representation equivalent of DeletedOccurrence enumeration for use in client scripts.
    * Value: A "DeletedOccurrence" string value.
    */
  var DeletedOccurrence: String
  /**
    * Gets a string representation equivalent of Normal enumeration for use in client scripts.
    * Value: A "Normal" string value.
    */
  var Normal: String
  /**
    * Gets a string representation equivalent of Occurrence enumeration for use in client scripts.
    * Value: An "Occurrence" string value.
    */
  var Occurrence: String
  /**
    * Gets a string representation equivalent of Pattern enumeration for use in client scripts.
    * Value: A "Pattern" string value.
    */
  var Pattern: String
}

object ASPxAppointmentType {
  @scala.inline
  def apply(
    ChangedOccurrence: String,
    DeletedOccurrence: String,
    Normal: String,
    Occurrence: String,
    Pattern: String
  ): ASPxAppointmentType = {
    val __obj = js.Dynamic.literal(ChangedOccurrence = ChangedOccurrence, DeletedOccurrence = DeletedOccurrence, Normal = Normal, Occurrence = Occurrence, Pattern = Pattern)
  
    __obj.asInstanceOf[ASPxAppointmentType]
  }
}

