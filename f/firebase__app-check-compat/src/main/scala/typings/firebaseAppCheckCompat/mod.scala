package typings.firebaseAppCheckCompat

import typings.firebaseAppCheck.mod.AppCheckTokenResult
import typings.firebaseAppCheckTypes.mod.FirebaseAppCheck
import typings.firebaseUtil.mod.PartialObserver
import typings.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/app-check-compat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object firebaseAppCheckAugmentingMod {
    
    @JSImport("@firebase/app-check", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getToken(appCheckInstance: FirebaseAppCheck, forceRefresh: js.UndefOr[Boolean]): js.Promise[AppCheckTokenResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(appCheckInstance.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AppCheckTokenResult]]
    
    inline def onTokenChanged(appCheckInstance: FirebaseAppCheck, observer: PartialObserver[AppCheckTokenResult]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onTokenChanged")(appCheckInstance.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    inline def onTokenChanged(
      appCheckInstance: FirebaseAppCheck,
      onNext: js.Function1[/* tokenResult */ AppCheckTokenResult, Unit],
      onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]],
      onCompletion: js.UndefOr[js.Function0[Unit]]
    ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onTokenChanged")(appCheckInstance.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    
    inline def setTokenAutoRefreshEnabled(appCheckInstance: FirebaseAppCheck, isTokenAutoRefreshEnabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTokenAutoRefreshEnabled")(appCheckInstance.asInstanceOf[js.Any], isTokenAutoRefreshEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def registerAppCheck(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAppCheck")().asInstanceOf[Unit]
  
  /**
    * Define extension behavior of `registerAppCheck`
    */
  /* augmented module */
  object firebaseAppCompatAugmentingMod {
    
    trait FirebaseApp extends StObject {
      
      def appCheck(): FirebaseAppCheck
    }
    object FirebaseApp {
      
      inline def apply(appCheck: () => FirebaseAppCheck): FirebaseApp = {
        val __obj = js.Dynamic.literal(appCheck = js.Any.fromFunction0(appCheck))
        __obj.asInstanceOf[FirebaseApp]
      }
      
      extension [Self <: FirebaseApp](x: Self) {
        
        inline def setAppCheck(value: () => FirebaseAppCheck): Self = StObject.set(x, "appCheck", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait FirebaseNamespace extends StObject {
      
      def appCheck(): FirebaseAppCheck = js.native
      def appCheck(app: FirebaseApp): FirebaseAppCheck = js.native
    }
  }
}
