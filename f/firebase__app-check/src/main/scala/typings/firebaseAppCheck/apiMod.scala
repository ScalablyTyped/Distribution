package typings.firebaseAppCheck

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAppCheck.factoryMod.AppCheckService
import typings.firebaseAppCheck.publicTypesMod.AppCheck
import typings.firebaseAppCheck.publicTypesMod.AppCheckOptions
import typings.firebaseAppCheck.publicTypesMod.AppCheckTokenResult
import typings.firebaseAppCheck.publicTypesMod.CustomProviderOptions
import typings.firebaseUtil.mod.PartialObserver
import typings.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  @JSImport("@firebase/app-check/dist/esm/src/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/app-check/dist/esm/src/api", "CustomProvider")
  @js.native
  open class CustomProvider protected ()
    extends typings.firebaseAppCheck.providersMod.CustomProvider {
    def this(_customProviderOptions: CustomProviderOptions) = this()
  }
  
  @JSImport("@firebase/app-check/dist/esm/src/api", "ReCaptchaEnterpriseProvider")
  @js.native
  open class ReCaptchaEnterpriseProvider protected ()
    extends typings.firebaseAppCheck.providersMod.ReCaptchaEnterpriseProvider {
    /**
      * Create a ReCaptchaEnterpriseProvider instance.
      * @param siteKey - reCAPTCHA Enterprise score-based site key.
      */
    def this(_siteKey: String) = this()
  }
  
  @JSImport("@firebase/app-check/dist/esm/src/api", "ReCaptchaV3Provider")
  @js.native
  open class ReCaptchaV3Provider protected ()
    extends typings.firebaseAppCheck.providersMod.ReCaptchaV3Provider {
    /**
      * Create a ReCaptchaV3Provider instance.
      * @param siteKey - ReCAPTCHA V3 siteKey.
      */
    def this(_siteKey: String) = this()
  }
  
  inline def getToken(appCheckInstance: AppCheck): js.Promise[AppCheckTokenResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(appCheckInstance.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AppCheckTokenResult]]
  inline def getToken(appCheckInstance: AppCheck, forceRefresh: Boolean): js.Promise[AppCheckTokenResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(appCheckInstance.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AppCheckTokenResult]]
  
  inline def initializeAppCheck(app: Unit, options: AppCheckOptions): AppCheck = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAppCheck")(app.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AppCheck]
  inline def initializeAppCheck(app: FirebaseApp, options: AppCheckOptions): AppCheck = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAppCheck")(app.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AppCheck]
  
  inline def onTokenChanged(appCheckInstance: AppCheck, observer: PartialObserver[AppCheckTokenResult]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onTokenChanged")(appCheckInstance.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onTokenChanged(appCheckInstance: AppCheck, onNext: js.Function1[/* tokenResult */ AppCheckTokenResult, Unit]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onTokenChanged")(appCheckInstance.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onTokenChanged(
    appCheckInstance: AppCheck,
    onNext: js.Function1[/* tokenResult */ AppCheckTokenResult, Unit],
    onError: js.Function1[/* error */ js.Error, Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onTokenChanged")(appCheckInstance.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onTokenChanged(
    appCheckInstance: AppCheck,
    onNext: js.Function1[/* tokenResult */ AppCheckTokenResult, Unit],
    onError: js.Function1[/* error */ js.Error, Unit],
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onTokenChanged")(appCheckInstance.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onTokenChanged(
    appCheckInstance: AppCheck,
    onNext: js.Function1[/* tokenResult */ AppCheckTokenResult, Unit],
    onError: Unit,
    onCompletion: js.Function0[Unit]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onTokenChanged")(appCheckInstance.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def setTokenAutoRefreshEnabled(appCheckInstance: AppCheck, isTokenAutoRefreshEnabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTokenAutoRefreshEnabled")(appCheckInstance.asInstanceOf[js.Any], isTokenAutoRefreshEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var `app-check`: AppCheckService
    }
    object NameServiceMapping {
      
      inline def apply(`app-check`: AppCheckService): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("app-check")(`app-check`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def `setApp-check`(value: AppCheckService): Self = StObject.set(x, "app-check", value.asInstanceOf[js.Any])
      }
    }
  }
}
