package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumberBuilder[PhoneNumber]
  extends AdWordsBuilder[PhoneNumber]
     with hasMobilePreferredBuilder[PhoneNumberBuilder[PhoneNumber]]
     with hasStartAndEndDateBuilder[PhoneNumberBuilder[PhoneNumber]]
     with hasSchedulesBuilder[PhoneNumberBuilder[PhoneNumber]] {
  def withCountry(country: java.lang.String): PhoneNumberBuilder[PhoneNumber] = js.native
  def withPhoneNumber(phoneNumber: java.lang.String): PhoneNumberBuilder[PhoneNumber] = js.native
}

