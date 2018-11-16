package typings
package googleDashLibphonenumberLib.googleDashLibphonenumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-libphonenumber", "PhoneNumberUtil")
@js.native
object PhoneNumberUtilNs extends js.Object {
  @js.native
  object MatchType extends js.Object {
    val EXACT_MATCH: googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType.EXACT_MATCH with java.lang.String = js.native
    val NOT_A_NUMBER: googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType.NOT_A_NUMBER with java.lang.String = js.native
    val NO_MATCH: googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType.NO_MATCH with java.lang.String = js.native
    val NSN_MATCH: googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType.NSN_MATCH with java.lang.String = js.native
    val SHORT_NSN_MATCH: googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType.SHORT_NSN_MATCH with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType with java.lang.String
      ] = js.native
  }
  
  @js.native
  object ValidationResult extends js.Object {
    val INVALID_COUNTRY_CODE: googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.ValidationResult.INVALID_COUNTRY_CODE with java.lang.String = js.native
    val IS_POSSIBLE: googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.ValidationResult.IS_POSSIBLE with java.lang.String = js.native
    val TOO_LONG: googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.ValidationResult.TOO_LONG with java.lang.String = js.native
    val TOO_SHORT: googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.ValidationResult.TOO_SHORT with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.ValidationResult with java.lang.String
      ] = js.native
  }
  
  type MatchType = googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType
  type ValidationResult = googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.ValidationResult
}

