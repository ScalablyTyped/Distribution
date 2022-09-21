package typings.firebaseAuth.authMod

import typings.firebaseAuth.firebaseAuthStrings.firebase
import typings.firebaseUtil.mod.NextFn
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
trait UserInternal
  extends StObject
     with User {
  
  def _assign(user: UserInternal): Unit = js.native
  
  def _clone(auth: AuthInternal): UserInternal = js.native
  
  def _notifyReloadListener(value: APIUserInfo): Unit = js.native
  @JSName("_notifyReloadListener")
  var _notifyReloadListener_Original: NextFn[APIUserInfo] = js.native
  
  def _onReload(cb: NextFn[APIUserInfo]): Unit = js.native
  
  var _redirectEventId: js.UndefOr[String] = js.native
  
  def _startProactiveRefresh(): Unit = js.native
  
  def _stopProactiveRefresh(): Unit = js.native
  
  def _updateTokensIfNecessary(response: FinalizeMfaResponse): js.Promise[Unit] = js.native
  def _updateTokensIfNecessary(response: FinalizeMfaResponse, reload: Boolean): js.Promise[Unit] = js.native
  def _updateTokensIfNecessary(response: IdTokenResponse): js.Promise[Unit] = js.native
  def _updateTokensIfNecessary(response: IdTokenResponse, reload: Boolean): js.Promise[Unit] = js.native
  
  var auth: AuthInternal = js.native
  
  @JSName("metadata")
  var metadata_UserInternal: UserMetadata2 = js.native
  
  @JSName("providerData")
  var providerData_UserInternal: js.Array[MutableUserInfo] = js.native
  
  @JSName("providerId")
  var providerId_UserInternal: firebase = js.native
  
  var stsTokenManager: StsTokenManager = js.native
}
