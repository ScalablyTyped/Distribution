package typings.evernote.mod

import typings.evernote.AnonAccountEmailDomain
import typings.evernote.AnonAuthenticationToken
import typings.evernote.AnonMessageStoreUrl
import typings.evernote.AnonName
import typings.evernote.AnonNoteStoreUrl
import typings.evernote.AnonProfiles
import typings.evernote.mod.Types.ServiceLevel
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.User
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "UserStore")
@js.native
object UserStore extends js.Object {
  @js.native
  class AuthenticationResult () extends js.Object {
    def this(args: AnonAuthenticationToken) = this()
    var authenticationToken: js.UndefOr[String] = js.native
    var currentTime: js.UndefOr[Timestamp] = js.native
    var expiration: js.UndefOr[Timestamp] = js.native
    var noteStoreUrl: js.UndefOr[String] = js.native
    var publicUserInfo: js.UndefOr[PublicUserInfo] = js.native
    var secondFactorDeliveryHint: js.UndefOr[String] = js.native
    var secondFactorRequired: js.UndefOr[Boolean] = js.native
    var urls: js.UndefOr[UserUrls] = js.native
    var user: js.UndefOr[User] = js.native
    var webApiUrlPrefix: js.UndefOr[String] = js.native
  }
  
  @js.native
  class BootstrapInfo () extends js.Object {
    def this(args: AnonProfiles) = this()
    var profiles: js.UndefOr[js.Array[BootstrapProfile]] = js.native
  }
  
  @js.native
  class BootstrapProfile () extends js.Object {
    def this(args: AnonName) = this()
    var name: js.UndefOr[String] = js.native
    var settings: js.UndefOr[BootstrapSettings] = js.native
  }
  
  @js.native
  class BootstrapSettings () extends js.Object {
    def this(args: AnonAccountEmailDomain) = this()
    var accountEmailDomain: js.UndefOr[String] = js.native
    var enableFacebookSharing: js.UndefOr[Boolean] = js.native
    var enableGiftSubscriptions: js.UndefOr[Boolean] = js.native
    var enableGoogle: js.UndefOr[Boolean] = js.native
    var enableLinkedInSharing: js.UndefOr[Boolean] = js.native
    var enablePublicNotebooks: js.UndefOr[Boolean] = js.native
    var enableSharedNotebooks: js.UndefOr[Boolean] = js.native
    var enableSingleNoteSharing: js.UndefOr[Boolean] = js.native
    var enableSponsoredAccounts: js.UndefOr[Boolean] = js.native
    var enableSupportTickets: js.UndefOr[Boolean] = js.native
    var enableTwitterSharing: js.UndefOr[Boolean] = js.native
    var marketingUrl: js.UndefOr[String] = js.native
    var serviceHost: js.UndefOr[String] = js.native
    var supportUrl: js.UndefOr[String] = js.native
  }
  
  @js.native
  class PublicUserInfo () extends js.Object {
    def this(args: AnonNoteStoreUrl) = this()
    var noteStoreUrl: js.UndefOr[String] = js.native
    var serviceLevel: js.UndefOr[ServiceLevel] = js.native
    var userId: js.UndefOr[UserID] = js.native
    var username: js.UndefOr[String] = js.native
    var webApiUrlPrefix: js.UndefOr[String] = js.native
  }
  
  @js.native
  class UserUrls () extends js.Object {
    def this(args: AnonMessageStoreUrl) = this()
    var messageStoreUrl: js.UndefOr[String] = js.native
    var noteStoreUrl: js.UndefOr[String] = js.native
    var userStoreUrl: js.UndefOr[String] = js.native
    var userWebSocketUrl: js.UndefOr[String] = js.native
    var utilityUrl: js.UndefOr[String] = js.native
    var webApiUrlPrefix: js.UndefOr[String] = js.native
  }
  
  val EDAM_VERSION_MAJOR: Double = js.native
  val EDAM_VERSION_MINOR: Double = js.native
}

