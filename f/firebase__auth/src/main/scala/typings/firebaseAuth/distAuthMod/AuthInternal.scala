package typings.firebaseAuth.distAuthMod

import typings.firebaseUtil.mod.ErrorFactory
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * UserInternal and AuthInternal reference each other, so both of them are included in the public typings.
  * In order to exclude them, we mark them as internal explicitly.
  *
  * @internal
  */
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
