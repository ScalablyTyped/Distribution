package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains lists of property names for different appointment types.
  */
@js.native
trait AppointmentPropertyNames extends js.Object {
  /**
    * Gets the list of properties characteristic for appointments of the ASPxAppointmentType.Normal type.
    */
  var Normal: String = js.native
  /**
    * Gets the list of properties characteristic for appointments of the ASPxAppointmentType.Pattern type.
    */
  var Pattern: String = js.native
}

object AppointmentPropertyNames {
  @scala.inline
  def apply(Normal: String, Pattern: String): AppointmentPropertyNames = {
    val __obj = js.Dynamic.literal(Normal = Normal.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentPropertyNames]
  }
  @scala.inline
  implicit class AppointmentPropertyNamesOps[Self <: AppointmentPropertyNames] (val x: Self) extends AnyVal {
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
    def setNormal(value: String): Self = this.set("Normal", value.asInstanceOf[js.Any])
    @scala.inline
    def setPattern(value: String): Self = this.set("Pattern", value.asInstanceOf[js.Any])
  }
  
}

