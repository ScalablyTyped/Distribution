package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the AppointmentType enumeration.
  */
trait ASPxAppointmentType extends js.Object {
  /**
    * Gets a string representation equivalent of AppointmentType.ChangedOccurrence enumeration for use in client scripts.
    */
  var ChangedOccurrence: String
  /**
    * Gets a string representation equivalent of ASPxAppointmentType.DeletedOccurrence enumeration for use in client scripts.
    */
  var DeletedOccurrence: String
  /**
    * Gets a string representation equivalent of ASPxAppointmentType.Normal enumeration for use in client scripts.
    */
  var Normal: String
  /**
    * Gets a string representation equivalent of ASPxAppointmentType.Occurrence enumeration for use in client scripts.
    */
  var Occurrence: String
  /**
    * Gets a string representation equivalent of ASPxAppointmentType.Pattern enumeration for use in client scripts.
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
    val __obj = js.Dynamic.literal(ChangedOccurrence = ChangedOccurrence.asInstanceOf[js.Any], DeletedOccurrence = DeletedOccurrence.asInstanceOf[js.Any], Normal = Normal.asInstanceOf[js.Any], Occurrence = Occurrence.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxAppointmentType]
  }
}

