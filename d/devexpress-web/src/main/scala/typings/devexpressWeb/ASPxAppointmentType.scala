package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the AppointmentType enumeration.
  */
@js.native
trait ASPxAppointmentType extends js.Object {
  /**
    * Gets a string representation equivalent of AppointmentType.ChangedOccurrence enumeration for use in client scripts.
    */
  var ChangedOccurrence: String = js.native
  /**
    * Gets a string representation equivalent of ASPxAppointmentType.DeletedOccurrence enumeration for use in client scripts.
    */
  var DeletedOccurrence: String = js.native
  /**
    * Gets a string representation equivalent of ASPxAppointmentType.Normal enumeration for use in client scripts.
    */
  var Normal: String = js.native
  /**
    * Gets a string representation equivalent of ASPxAppointmentType.Occurrence enumeration for use in client scripts.
    */
  var Occurrence: String = js.native
  /**
    * Gets a string representation equivalent of ASPxAppointmentType.Pattern enumeration for use in client scripts.
    */
  var Pattern: String = js.native
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
  @scala.inline
  implicit class ASPxAppointmentTypeOps[Self <: ASPxAppointmentType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChangedOccurrence(value: String): Self = this.set("ChangedOccurrence", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletedOccurrence(value: String): Self = this.set("DeletedOccurrence", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormal(value: String): Self = this.set("Normal", value.asInstanceOf[js.Any])
    @scala.inline
    def setOccurrence(value: String): Self = this.set("Occurrence", value.asInstanceOf[js.Any])
    @scala.inline
    def setPattern(value: String): Self = this.set("Pattern", value.asInstanceOf[js.Any])
  }
  
}

