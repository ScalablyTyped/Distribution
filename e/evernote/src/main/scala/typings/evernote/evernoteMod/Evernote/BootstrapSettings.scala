package typings.evernote.evernoteMod.Evernote

import typings.evernote.Anon_AccountEmailDomain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    This structure describes a collection of bootstrap settings.
  * <dl>
  *    <dt>serviceHost:</dt>
  *        <dd>
  *        The hostname and optional port for composing Evernote web service URLs.
  *        This URL can be used to access the UserStore and related services,
  *        but must not be used to compose the NoteStore URL. Client applications
  *        must handle serviceHost values that include only the hostname
  *        (e.g. www.evernote.com) or both the hostname and port (e.g. www.evernote.com:8080).
  *        If no port is specified, or if port 443 is specified, client applications must
  *        use the scheme "https" when composing URLs. Otherwise, a client must use the
  *        scheme "http".
  *    </dd>
  *    <dt>marketingUrl:</dt>
  *        <dd>
  *        The URL stem for the Evernote corporate marketing website, e.g. http://www.evernote.com.
  *        This stem can be used to compose website URLs. For example, the URL of the Evernote
  *        Trunk is composed by appending "/about/trunk/" to the value of marketingUrl.
  *        </dd>
  *    <dt>supportUrl:</dt>
  *        <dd>
  *        The full URL for the Evernote customer support website, e.g. https://support.evernote.com.
  *        </dd>
  *    <dt>accountEmailDomain:</dt>
  *        <dd>
  *        The domain used for an Evernote user's incoming email address, which allows notes to
  *        be emailed into an account. E.g. m.evernote.com.
  *        </dd>
  *    <dt>enableFacebookSharing:</dt>
  *        <dd>
  *        Whether the client application should enable sharing of notes on Facebook.
  *        </dd>
  *    <dt>enableGiftSubscriptions:</dt>
  *        <dd>
  *        Whether the client application should enable gift subscriptions.
  *        </dd>
  *    <dt>enableSupportTickets:</dt>
  *        <dd>
  *        Whether the client application should enable in-client creation of support tickets.
  *        </dd>
  *    <dt>enableSharedNotebooks:</dt>
  *        <dd>
  *        Whether the client application should enable shared notebooks.
  *        </dd>
  *    <dt>enableSingleNoteSharing:</dt>
  *        <dd>
  *        Whether the client application should enable single note sharing.
  *        </dd>
  *    <dt>enableSponsoredAccounts:</dt>
  *        <dd>
  *        Whether the client application should enable sponsored accounts.
  *        </dd>
  *    <dt>enableTwitterSharing:</dt>
  *        <dd>
  *        Whether the client application should enable sharing of notes on Twitter.
  *        </dd>
  *    </dl>
  */
@JSImport("evernote", "Evernote.BootstrapSettings")
@js.native
class BootstrapSettings () extends js.Object {
  def this(args: Anon_AccountEmailDomain) = this()
  var accountEmailDomain: String = js.native
  var enableFacebookSharing: Boolean = js.native
  var enableGiftSubscriptions: Boolean = js.native
  var enableLinkedInSharing: Boolean = js.native
  var enablePublicNotebooks: Boolean = js.native
  var enableSharedNotebooks: Boolean = js.native
  var enableSingleNoteSharing: Boolean = js.native
  var enableSponsoredAccounts: Boolean = js.native
  var enableSupportTickets: Boolean = js.native
  var enableTwitterSharing: Boolean = js.native
  var marketingUrl: String = js.native
  var serviceHost: String = js.native
  var supportUrl: String = js.native
}

