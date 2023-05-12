package typings.firebaseAuth

import typings.firebaseAuth.anon.Url
import typings.firebaseAuth.distNodeSrcCoreErrorsMod.AuthErrorCode
import typings.firebaseAuth.distNodeSrcCoreErrorsMod.AuthErrorParams
import typings.firebaseAuth.distNodeSrcCoreUtilVersionMod.ClientPlatform
import typings.firebaseAuth.distNodeSrcModelPopupRedirectMod.PopupRedirectResolverInternal
import typings.firebaseAuth.distNodeSrcModelPublicTypesMod.Auth
import typings.firebaseAuth.distNodeSrcModelPublicTypesMod.Config
import typings.firebaseAuth.distNodeSrcModelPublicTypesMod.PopupRedirectResolver
import typings.firebaseAuth.distNodeSrcModelUserMod.UserInternal
import typings.firebaseAuth.distNodeSrcPlatformBrowserRecaptchaRecaptchaMod.RecaptchaConfig
import typings.firebaseUtil.mod.ErrorFactory
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcModelAuthMod {
  
  type ApiKey = String
  
  type AppName = String
  
  type AuthDomain = String
  
  @js.native
  trait AuthInternal
    extends StObject
       with Auth {
    
    var _agentRecaptchaConfig: RecaptchaConfig | Null = js.native
    
    var _canInitEmulator: Boolean = js.native
    
    var _errorFactory: ErrorFactory[AuthErrorCode, AuthErrorParams] = js.native
    
    def _getAdditionalHeaders(): js.Promise[Record[String, String]] = js.native
    
    def _getAppCheckToken(): js.Promise[js.UndefOr[String]] = js.native
    
    def _getFrameworks(): js.Array[String] = js.native
    
    def _getPersistence(): String = js.native
    
    def _getRecaptchaConfig(): RecaptchaConfig | Null = js.native
    
    var _initializationPromise: js.Promise[Unit] | Null = js.native
    
    var _isInitialized: Boolean = js.native
    
    def _key(): String = js.native
    
    def _logFramework(framework: String): Unit = js.native
    
    def _notifyListenersIfCurrent(user: UserInternal): Unit = js.native
    
    def _onStorageEvent(): Unit = js.native
    
    def _persistUserIfCurrent(user: UserInternal): js.Promise[Unit] = js.native
    
    var _popupRedirectResolver: PopupRedirectResolverInternal | Null = js.native
    
    def _redirectUserForId(id: String): js.Promise[UserInternal | Null] = js.native
    
    def _setRedirectUser(): js.Promise[Unit] = js.native
    def _setRedirectUser(user: Null, popupRedirectResolver: PopupRedirectResolver): js.Promise[Unit] = js.native
    def _setRedirectUser(user: UserInternal): js.Promise[Unit] = js.native
    def _setRedirectUser(user: UserInternal, popupRedirectResolver: PopupRedirectResolver): js.Promise[Unit] = js.native
    
    def _startProactiveRefresh(): Unit = js.native
    
    def _stopProactiveRefresh(): Unit = js.native
    
    var _tenantRecaptchaConfigs: Record[String, RecaptchaConfig] = js.native
    
    def _updateCurrentUser(): js.Promise[Unit] = js.native
    def _updateCurrentUser(user: UserInternal): js.Promise[Unit] = js.native
    
    @JSName("config")
    val config_AuthInternal: ConfigInternal = js.native
    
    def initializeRecaptchaConfig(): js.Promise[Unit] = js.native
    
    @JSName("name")
    val name_AuthInternal: AppName = js.native
  }
  
  trait ConfigInternal
    extends StObject
       with Config {
    
    /**
      * @readonly
      */
    var clientPlatform: ClientPlatform
    
    /**
      * @readonly
      */
    var emulator: js.UndefOr[Url] = js.undefined
  }
  object ConfigInternal {
    
    inline def apply(
      apiHost: String,
      apiKey: String,
      apiScheme: String,
      clientPlatform: ClientPlatform,
      sdkClientVersion: String,
      tokenApiHost: String
    ): ConfigInternal = {
      val __obj = js.Dynamic.literal(apiHost = apiHost.asInstanceOf[js.Any], apiKey = apiKey.asInstanceOf[js.Any], apiScheme = apiScheme.asInstanceOf[js.Any], clientPlatform = clientPlatform.asInstanceOf[js.Any], sdkClientVersion = sdkClientVersion.asInstanceOf[js.Any], tokenApiHost = tokenApiHost.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigInternal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigInternal] (val x: Self) extends AnyVal {
      
      inline def setClientPlatform(value: ClientPlatform): Self = StObject.set(x, "clientPlatform", value.asInstanceOf[js.Any])
      
      inline def setEmulator(value: Url): Self = StObject.set(x, "emulator", value.asInstanceOf[js.Any])
      
      inline def setEmulatorUndefined: Self = StObject.set(x, "emulator", js.undefined)
    }
  }
}
