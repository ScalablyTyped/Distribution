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
    /* 0 */ val EXACT_MATCH: googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType.EXACT_MATCH with scala.Double = js.native
    /* 2 */ val NOT_A_NUMBER: googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType.NOT_A_NUMBER with scala.Double = js.native
    /* 1 */ val NO_MATCH: googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType.NO_MATCH with scala.Double = js.native
    /* 3 */ val NSN_MATCH: googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType.NSN_MATCH with scala.Double = js.native
    /* 4 */ val SHORT_NSN_MATCH: googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType.SHORT_NSN_MATCH with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType with scala.Double
      ] = js.native
  }
  
  @js.native
  object ValidationResult extends js.Object {
    /* 1 */ val INVALID_COUNTRY_CODE: googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.ValidationResult.INVALID_COUNTRY_CODE with scala.Double = js.native
    /* 0 */ val IS_POSSIBLE: googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.ValidationResult.IS_POSSIBLE with scala.Double = js.native
    /* 3 */ val TOO_LONG: googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.ValidationResult.TOO_LONG with scala.Double = js.native
    /* 2 */ val TOO_SHORT: googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.ValidationResult.TOO_SHORT with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.ValidationResult with scala.Double
      ] = js.native
  }
  
}

