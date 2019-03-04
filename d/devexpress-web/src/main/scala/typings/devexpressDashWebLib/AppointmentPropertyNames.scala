package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains lists of property names for different appointment types.
  */
trait AppointmentPropertyNames extends js.Object {
  /**
    * Gets the list of properties characteristic for appointments of the Normal type.
    * Value: A string array which is composed of the appointment property names.
    */
  var Normal: java.lang.String
  /**
    * Gets the list of properties characteristic for appointments of the Pattern type.
    * Value: A string array which is composed of the appointment property names.
    */
  var Pattern: java.lang.String
}

object AppointmentPropertyNames {
  @scala.inline
  def apply(Normal: java.lang.String, Pattern: java.lang.String): AppointmentPropertyNames = {
    val __obj = js.Dynamic.literal(Normal = Normal, Pattern = Pattern)
  
    __obj.asInstanceOf[AppointmentPropertyNames]
  }
}

