package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "AuthenticationApi")
@js.native
class AuthenticationApi protected () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def deleteSocialLogin(accountId: String, userId: String): js.Promise[Unit] = js.native
  def deleteSocialLogin(accountId: String, userId: String, optsOrCallback: js.Any): js.Promise[Unit] = js.native
  def deleteSocialLogin(accountId: String, userId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def deleteSocialLogin(accountId: String, userId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def getOAuthToken(): js.Promise[OauthAccess] = js.native
  def getOAuthToken(callback: js.Function0[Unit]): js.Promise[OauthAccess] = js.native
  
  def listSocialLogins(accountId: String, userId: String): js.Promise[UserSocialIdResult] = js.native
  def listSocialLogins(accountId: String, userId: String, callback: js.Function0[Unit]): js.Promise[UserSocialIdResult] = js.native
  
  def login(): js.Promise[LoginInformation] = js.native
  def login(optsOrCallback: js.Any): js.Promise[LoginInformation] = js.native
  def login(optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[LoginInformation] = js.native
  def login(optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[LoginInformation] = js.native
  
  def revokeOAuthToken(): js.Promise[Unit] = js.native
  def revokeOAuthToken(callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def updatePassword(loginPart: String): js.Promise[Unit] = js.native
  def updatePassword(loginPart: String, optsOrCallback: js.Any): js.Promise[Unit] = js.native
  def updatePassword(loginPart: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def updatePassword(loginPart: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def updateSocialLogin(accountId: String, userId: String): js.Promise[Unit] = js.native
  def updateSocialLogin(accountId: String, userId: String, optsOrCallback: js.Any): js.Promise[Unit] = js.native
  def updateSocialLogin(accountId: String, userId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def updateSocialLogin(accountId: String, userId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
}
