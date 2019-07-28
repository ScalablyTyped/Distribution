package typings.googleDashLibphonenumber.googleDashLibphonenumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-libphonenumber", "PhoneNumberUtil")
@js.native
object PhoneNumberUtilNs extends js.Object {
  @js.native
  object MatchType extends js.Object {
    /* 0 */ val EXACT_MATCH: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.MatchType.EXACT_MATCH with Double = js.native
    /* 2 */ val NOT_A_NUMBER: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.MatchType.NOT_A_NUMBER with Double = js.native
    /* 1 */ val NO_MATCH: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.MatchType.NO_MATCH with Double = js.native
    /* 3 */ val NSN_MATCH: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.MatchType.NSN_MATCH with Double = js.native
    /* 4 */ val SHORT_NSN_MATCH: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.MatchType.SHORT_NSN_MATCH with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.MatchType with Double
      ] = js.native
  }
  
  @js.native
  object ValidationResult extends js.Object {
    /* 1 */ val INVALID_COUNTRY_CODE: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.ValidationResult.INVALID_COUNTRY_CODE with Double = js.native
    /* 0 */ val IS_POSSIBLE: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.ValidationResult.IS_POSSIBLE with Double = js.native
    /* 3 */ val TOO_LONG: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.ValidationResult.TOO_LONG with Double = js.native
    /* 2 */ val TOO_SHORT: typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.ValidationResult.TOO_SHORT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.ValidationResult with Double
      ] = js.native
  }
  
}

