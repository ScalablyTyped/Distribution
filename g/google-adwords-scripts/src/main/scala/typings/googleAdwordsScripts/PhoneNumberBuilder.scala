package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneNumberBuilder[PhoneNumber]
  extends StObject
     with AdWordsBuilder[PhoneNumber]
     with hasMobilePreferredBuilder[PhoneNumberBuilder[PhoneNumber]]
     with hasStartAndEndDateBuilder[PhoneNumberBuilder[PhoneNumber]]
     with hasSchedulesBuilder[PhoneNumberBuilder[PhoneNumber]] {
  
  def withCountry(country: String): PhoneNumberBuilder[PhoneNumber] = js.native
  
  def withPhoneNumber(phoneNumber: String): PhoneNumberBuilder[PhoneNumber] = js.native
}
