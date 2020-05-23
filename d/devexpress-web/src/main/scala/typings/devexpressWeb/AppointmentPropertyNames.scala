package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains lists of property names for different appointment types.
  */
trait AppointmentPropertyNames extends js.Object {
  /**
    * Gets the list of properties characteristic for appointments of the ASPxAppointmentType.Normal type.
    */
  var Normal: String
  /**
    * Gets the list of properties characteristic for appointments of the ASPxAppointmentType.Pattern type.
    */
  var Pattern: String
}

object AppointmentPropertyNames {
  @scala.inline
  def apply(Normal: String, Pattern: String): AppointmentPropertyNames = {
    val __obj = js.Dynamic.literal(Normal = Normal.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentPropertyNames]
  }
}

