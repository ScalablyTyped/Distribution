package typings.googleLibphonenumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object libphonenumber {
    
    @JSGlobal("libphonenumber.AsYouTypeFormatter")
    @js.native
    class AsYouTypeFormatter protected ()
      extends typings.googleLibphonenumber.libphonenumber.AsYouTypeFormatter {
      def this(region: String) = this()
    }
    
    @JSGlobal("libphonenumber.PhoneNumber")
    @js.native
    class PhoneNumber ()
      extends typings.googleLibphonenumber.libphonenumber.PhoneNumber
    object PhoneNumber {
      
      @JSGlobal("libphonenumber.PhoneNumber.CountryCodeSource")
      @js.native
      object CountryCodeSource extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[
                typings.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource with Double
              ] = js.native
        
        /* 20 */ val FROM_DEFAULT_COUNTRY: typings.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY with Double = js.native
        
        /* 10 */ val FROM_NUMBER_WITHOUT_PLUS_SIGN: typings.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN with Double = js.native
        
        /* 5 */ val FROM_NUMBER_WITH_IDD: typings.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD with Double = js.native
        
        /* 1 */ val FROM_NUMBER_WITH_PLUS_SIGN: typings.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN with Double = js.native
      }
    }
    
    @JSGlobal("libphonenumber.PhoneNumberFormat")
    @js.native
    object PhoneNumberFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.googleLibphonenumber.libphonenumber.PhoneNumberFormat with Double] = js.native
      
      /* 0 */ val E164: typings.googleLibphonenumber.libphonenumber.PhoneNumberFormat.E164 with Double = js.native
      
      /* 1 */ val INTERNATIONAL: typings.googleLibphonenumber.libphonenumber.PhoneNumberFormat.INTERNATIONAL with Double = js.native
      
      /* 2 */ val NATIONAL: typings.googleLibphonenumber.libphonenumber.PhoneNumberFormat.NATIONAL with Double = js.native
      
      /* 3 */ val RFC3966: typings.googleLibphonenumber.libphonenumber.PhoneNumberFormat.RFC3966 with Double = js.native
    }
    
    @JSGlobal("libphonenumber.PhoneNumberType")
    @js.native
    object PhoneNumberType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.googleLibphonenumber.libphonenumber.PhoneNumberType with Double] = js.native
      
      /* 0 */ val FIXED_LINE: typings.googleLibphonenumber.libphonenumber.PhoneNumberType.FIXED_LINE with Double = js.native
      
      /* 2 */ val FIXED_LINE_OR_MOBILE: typings.googleLibphonenumber.libphonenumber.PhoneNumberType.FIXED_LINE_OR_MOBILE with Double = js.native
      
      /* 1 */ val MOBILE: typings.googleLibphonenumber.libphonenumber.PhoneNumberType.MOBILE with Double = js.native
      
      /* 8 */ val PAGER: typings.googleLibphonenumber.libphonenumber.PhoneNumberType.PAGER with Double = js.native
      
      /* 7 */ val PERSONAL_NUMBER: typings.googleLibphonenumber.libphonenumber.PhoneNumberType.PERSONAL_NUMBER with Double = js.native
      
      /* 4 */ val PREMIUM_RATE: typings.googleLibphonenumber.libphonenumber.PhoneNumberType.PREMIUM_RATE with Double = js.native
      
      /* 5 */ val SHARED_COST: typings.googleLibphonenumber.libphonenumber.PhoneNumberType.SHARED_COST with Double = js.native
      
      /* 3 */ val TOLL_FREE: typings.googleLibphonenumber.libphonenumber.PhoneNumberType.TOLL_FREE with Double = js.native
      
      /* 9 */ val UAN: typings.googleLibphonenumber.libphonenumber.PhoneNumberType.UAN with Double = js.native
      
      /* -1 */ val UNKNOWN: typings.googleLibphonenumber.libphonenumber.PhoneNumberType.UNKNOWN with Double = js.native
      
      /* 10 */ val VOICEMAIL: typings.googleLibphonenumber.libphonenumber.PhoneNumberType.VOICEMAIL with Double = js.native
      
      /* 6 */ val VOIP: typings.googleLibphonenumber.libphonenumber.PhoneNumberType.VOIP with Double = js.native
    }
    
    @JSGlobal("libphonenumber.PhoneNumberUtil")
    @js.native
    class PhoneNumberUtil ()
      extends typings.googleLibphonenumber.libphonenumber.PhoneNumberUtil
    /* static members */
    object PhoneNumberUtil {
      
      @JSGlobal("libphonenumber.PhoneNumberUtil.MatchType")
      @js.native
      object MatchType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[
                typings.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType with Double
              ] = js.native
        
        /* 0 */ val EXACT_MATCH: typings.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.EXACT_MATCH with Double = js.native
        
        /* 2 */ val NOT_A_NUMBER: typings.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.NOT_A_NUMBER with Double = js.native
        
        /* 1 */ val NO_MATCH: typings.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.NO_MATCH with Double = js.native
        
        /* 3 */ val NSN_MATCH: typings.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.NSN_MATCH with Double = js.native
        
        /* 4 */ val SHORT_NSN_MATCH: typings.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.SHORT_NSN_MATCH with Double = js.native
      }
      
      @JSGlobal("libphonenumber.PhoneNumberUtil.ValidationResult")
      @js.native
      object ValidationResult extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[
                typings.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult with Double
              ] = js.native
        
        /* 1 */ val INVALID_COUNTRY_CODE: typings.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.INVALID_COUNTRY_CODE with Double = js.native
        
        /* 0 */ val IS_POSSIBLE: typings.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.IS_POSSIBLE with Double = js.native
        
        /* 3 */ val TOO_LONG: typings.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.TOO_LONG with Double = js.native
        
        /* 2 */ val TOO_SHORT: typings.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.TOO_SHORT with Double = js.native
      }
      
      @JSGlobal("libphonenumber.PhoneNumberUtil.getInstance")
      @js.native
      def getInstance(): typings.googleLibphonenumber.libphonenumber.PhoneNumberUtil = js.native
    }
    
    @JSGlobal("libphonenumber.StringBuffer")
    @js.native
    class StringBuffer protected ()
      extends typings.googleLibphonenumber.libphonenumber.StringBuffer {
      def this(opt_a1: js.UndefOr[scala.Nothing], var_args: js.Any*) = this()
      def this(opt_a1: js.Any, var_args: js.Any*) = this()
    }
  }
}
