package typings.firebase.firebaseMod.default

import typings.firebase.firebaseMod.firebase.app.App
import typings.firebase.firebaseMod.firebase.appCheck.AppCheck
import typings.firebase.firebaseMod.firebase.appCheck.CustomProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @webonly
  */
object appCheck {
  
  inline def apply(): AppCheck = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[AppCheck]
  inline def apply(app: App): AppCheck = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[AppCheck]
  
  @JSImport("firebase/compat", "default.appCheck")
  @js.native
  val ^ : js.Any = js.native
  
  /*
    * Custom token provider.
    */
  @JSImport("firebase/compat", "default.appCheck.CustomProvider")
  @js.native
  open class CustomProvider protected ()
    extends StObject
       with typings.firebase.firebaseMod.firebase.appCheck.CustomProvider {
    /**
      * @param options - Options for creating the custom provider.
      */
    def this(options: CustomProviderOptions) = this()
  }
  
  /*
    * reCAPTCHA Enterprise token provider.
    */
  @JSImport("firebase/compat", "default.appCheck.ReCaptchaEnterpriseProvider")
  @js.native
  open class ReCaptchaEnterpriseProvider protected ()
    extends StObject
       with typings.firebase.firebaseMod.firebase.appCheck.ReCaptchaEnterpriseProvider {
    /**
      * @param keyId - reCAPTCHA Enterprise key ID.
      */
    def this(keyId: String) = this()
  }
  
  /*
    * reCAPTCHA v3 token provider.
    */
  @JSImport("firebase/compat", "default.appCheck.ReCaptchaV3Provider")
  @js.native
  open class ReCaptchaV3Provider protected ()
    extends StObject
       with typings.firebase.firebaseMod.firebase.appCheck.ReCaptchaV3Provider {
    /**
      * @param siteKey - reCAPTCHA v3 site key (public key).
      */
    def this(siteKey: String) = this()
  }
}
