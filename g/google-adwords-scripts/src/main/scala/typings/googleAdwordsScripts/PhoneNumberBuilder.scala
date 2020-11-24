package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneNumberBuilder[PhoneNumber]
  extends AdWordsBuilder[PhoneNumber]
     with hasMobilePreferredBuilder[PhoneNumberBuilder[PhoneNumber]]
     with hasStartAndEndDateBuilder[PhoneNumberBuilder[PhoneNumber]]
     with hasSchedulesBuilder[PhoneNumberBuilder[PhoneNumber]] {
  
  def withCountry(country: String): PhoneNumberBuilder[PhoneNumber] = js.native
  
  def withPhoneNumber(phoneNumber: String): PhoneNumberBuilder[PhoneNumber] = js.native
}
