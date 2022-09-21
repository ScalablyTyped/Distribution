package typings.firebaseAppCheck

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAppCheck.srcPublicTypesMod.CustomProviderOptions
import typings.firebaseAppCheck.srcTypesMod.AppCheckProvider
import typings.firebaseAppCheck.srcTypesMod.AppCheckTokenInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcProvidersMod {
  
  @JSImport("@firebase/app-check/dist/src/providers", "CustomProvider")
  @js.native
  open class CustomProvider protected ()
    extends StObject
       with AppCheckProvider {
    def this(_customProviderOptions: CustomProviderOptions) = this()
    
    /* private */ var _app: Any = js.native
    
    /* private */ var _customProviderOptions: Any = js.native
    
    /**
      * Returns an App Check token.
      * @internal
      */
    /* CompleteClass */
    override def getToken(): js.Promise[AppCheckTokenInternal] = js.native
    
    /**
      * @internal
      */
    /* CompleteClass */
    override def initialize(app: FirebaseApp): Unit = js.native
    
    /**
      * @internal
      */
    def isEqual(otherProvider: Any): Boolean = js.native
  }
  
  @JSImport("@firebase/app-check/dist/src/providers", "ReCaptchaEnterpriseProvider")
  @js.native
  open class ReCaptchaEnterpriseProvider protected ()
    extends StObject
       with AppCheckProvider {
    /**
      * Create a ReCaptchaEnterpriseProvider instance.
      * @param siteKey - reCAPTCHA Enterprise score-based site key.
      */
    def this(_siteKey: String) = this()
    
    /* private */ var _app: Any = js.native
    
    /* private */ var _heartbeatServiceProvider: Any = js.native
    
    /* private */ var _siteKey: Any = js.native
    
    /**
      * Throttle requests on certain error codes to prevent too many retries
      * in a short time.
      */
    /* private */ var _throttleData: Any = js.native
    
    /**
      * Returns an App Check token.
      * @internal
      */
    /* CompleteClass */
    override def getToken(): js.Promise[AppCheckTokenInternal] = js.native
    
    /**
      * @internal
      */
    /* CompleteClass */
    override def initialize(app: FirebaseApp): Unit = js.native
    
    /**
      * @internal
      */
    def isEqual(otherProvider: Any): Boolean = js.native
  }
  
  @JSImport("@firebase/app-check/dist/src/providers", "ReCaptchaV3Provider")
  @js.native
  open class ReCaptchaV3Provider protected ()
    extends StObject
       with AppCheckProvider {
    /**
      * Create a ReCaptchaV3Provider instance.
      * @param siteKey - ReCAPTCHA V3 siteKey.
      */
    def this(_siteKey: String) = this()
    
    /* private */ var _app: Any = js.native
    
    /* private */ var _heartbeatServiceProvider: Any = js.native
    
    /* private */ var _siteKey: Any = js.native
    
    /**
      * Throttle requests on certain error codes to prevent too many retries
      * in a short time.
      */
    /* private */ var _throttleData: Any = js.native
    
    /**
      * Returns an App Check token.
      * @internal
      */
    /* CompleteClass */
    override def getToken(): js.Promise[AppCheckTokenInternal] = js.native
    
    /**
      * @internal
      */
    /* CompleteClass */
    override def initialize(app: FirebaseApp): Unit = js.native
    
    /**
      * @internal
      */
    def isEqual(otherProvider: Any): Boolean = js.native
  }
}
