package typings.evernote.mod

import typings.evernote.mod.Types.AccountLimits
import typings.evernote.mod.Types.BusinessInvitation
import typings.evernote.mod.Types.PremiumInfo
import typings.evernote.mod.Types.ServiceLevel
import typings.evernote.mod.Types.User
import typings.evernote.mod.Types.UserProfile
import typings.evernote.mod.UserStore.AuthenticationResult
import typings.evernote.mod.UserStore.BootstrapInfo
import typings.evernote.mod.UserStore.PublicUserInfo
import typings.evernote.mod.UserStore.UserUrls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "UserStoreClient")
@js.native
class UserStoreClient () extends js.Object {
  def authenticateLongSession(
    username: String,
    password: String,
    consumerKey: String,
    consumerSecret: String,
    deviceIdentifier: String,
    deviceDescription: String,
    supportsTwoFactor: Boolean
  ): js.Promise[AuthenticationResult] = js.native
  def authenticateToBusiness(): js.Promise[AuthenticationResult] = js.native
  def checkVersion(clientName: String, edamVersionMajor: Double, edamVersionMinor: Double): js.Promise[Boolean] = js.native
  def completeTwoFactorAuthentication(
    authenticationToken: String,
    oneTimeCode: String,
    deviceIdentifier: String,
    deviceDescription: String
  ): js.Promise[AuthenticationResult] = js.native
  def getAccountLimits(serviceLevel: ServiceLevel): js.Promise[AccountLimits] = js.native
  def getBootstrapInfo(locale: String): js.Promise[BootstrapInfo] = js.native
  def getPremiumInfo(): js.Promise[PremiumInfo] = js.native
  def getPublicUserInfo(username: String): js.Promise[PublicUserInfo] = js.native
  def getUser(): js.Promise[User] = js.native
  def getUserUrls(): js.Promise[UserUrls] = js.native
  def inviteToBusiness(emailAddress: String): js.Promise[Unit] = js.native
  def listBusinessInvitations(includeRequestedInvitations: Boolean): js.Promise[js.Array[BusinessInvitation]] = js.native
  def listBusinessUsers(): js.Promise[js.Array[UserProfile]] = js.native
  def removeFromBusiness(emailAddress: String): js.Promise[Unit] = js.native
  def revokeLongSession(): js.Promise[Unit] = js.native
  def updateBusinessUserIdentifier(oldEmailAddress: String, newEmailAddress: String): js.Promise[Unit] = js.native
}

