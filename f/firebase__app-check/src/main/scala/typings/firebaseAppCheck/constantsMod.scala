package typings.firebaseAppCheck

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("@firebase/app-check/dist/esm/src/constants", "BASE_ENDPOINT")
  @js.native
  val BASE_ENDPOINT: /* "https://content-firebaseappcheck.googleapis.com/v1" */ String = js.native
  
  @JSImport("@firebase/app-check/dist/esm/src/constants", "EXCHANGE_DEBUG_TOKEN_METHOD")
  @js.native
  val EXCHANGE_DEBUG_TOKEN_METHOD: /* "exchangeDebugToken" */ String = js.native
  
  @JSImport("@firebase/app-check/dist/esm/src/constants", "EXCHANGE_RECAPTCHA_ENTERPRISE_TOKEN_METHOD")
  @js.native
  val EXCHANGE_RECAPTCHA_ENTERPRISE_TOKEN_METHOD: /* "exchangeRecaptchaEnterpriseToken" */ String = js.native
  
  @JSImport("@firebase/app-check/dist/esm/src/constants", "EXCHANGE_RECAPTCHA_TOKEN_METHOD")
  @js.native
  val EXCHANGE_RECAPTCHA_TOKEN_METHOD: /* "exchangeRecaptchaV3Token" */ String = js.native
  
  @JSImport("@firebase/app-check/dist/esm/src/constants", "ONE_DAY")
  @js.native
  val ONE_DAY: Double = js.native
  
  object TOKEN_REFRESH_TIME {
    
    @JSImport("@firebase/app-check/dist/esm/src/constants", "TOKEN_REFRESH_TIME")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The offset time before token natural expiration to run the refresh.
      * This is currently 5 minutes.
      */
    @JSImport("@firebase/app-check/dist/esm/src/constants", "TOKEN_REFRESH_TIME.OFFSET_DURATION")
    @js.native
    def OFFSET_DURATION: Double = js.native
    inline def OFFSET_DURATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFFSET_DURATION")(x.asInstanceOf[js.Any])
    
    /**
      * This is the maximum retrial wait, currently 16 minutes.
      */
    @JSImport("@firebase/app-check/dist/esm/src/constants", "TOKEN_REFRESH_TIME.RETRIAL_MAX_WAIT")
    @js.native
    def RETRIAL_MAX_WAIT: Double = js.native
    inline def RETRIAL_MAX_WAIT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RETRIAL_MAX_WAIT")(x.asInstanceOf[js.Any])
    
    /**
      * This is the first retrial wait after an error. This is currently
      * 30 seconds.
      */
    @JSImport("@firebase/app-check/dist/esm/src/constants", "TOKEN_REFRESH_TIME.RETRIAL_MIN_WAIT")
    @js.native
    def RETRIAL_MIN_WAIT: Double = js.native
    inline def RETRIAL_MIN_WAIT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RETRIAL_MIN_WAIT")(x.asInstanceOf[js.Any])
  }
}
