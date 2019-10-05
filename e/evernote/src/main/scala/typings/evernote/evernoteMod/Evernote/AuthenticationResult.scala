package typings.evernote.evernoteMod.Evernote

import typings.evernote.Anon_AuthenticationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    When an authentication (or re-authentication) is performed, this structure
  *    provides the result to the client.
  * <dl>
  *    <dt>currentTime:</dt>
  *        <dd>
  *        The server-side date and time when this result was
  *        generated.
  *        </dd>
  *    <dt>authenticationToken:</dt>
  *        <dd>
  *        Holds an opaque, ASCII-encoded token that can be
  *        used by the client to perform actions on a NoteStore.
  *        </dd>
  *    <dt>expiration:</dt>
  *        <dd>
  *        Holds the server-side date and time when the
  *        authentication token will expire.
  *        This time can be compared to "currentTime" to produce an expiration
  *        time that can be reconciled with the client's local clock.
  *        </dd>
  *    <dt>user:</dt>
  *        <dd>
  *        Holds the information about the account which was
  *        authenticated if this was a full authentication.    May be absent if this
  *        particular authentication did not require user information.
  *        </dd>
  *    <dt>publicUserInfo:</dt>
  *        <dd>
  *        If this authentication result was achieved without full permissions to
  *        access the full User structure, this field may be set to give back
  *        a more limited public set of data.
  *        </dd>
  *    <dt>noteStoreUrl:</dt>
  *        <dd>
  *        This field will contain the full URL that clients should use to make
  *        NoteStore requests to the server shard that contains that user's data.
  *        I.e. this is the URL that should be used to create the Thrift HTTP client
  *        transport to send messages to the NoteStore service for the account.
  *        </dd>
  *    <dt>webApiUrlPrefix:</dt>
  *        <dd>
  *        This field will contain the initial part of the URLs that should be used
  *        to make requests to Evernote's thin client "web API", which provide
  *        optimized operations for clients that aren't capable of manipulating
  *        the full contents of accounts via the full Thrift data model. Clients
  *        should concatenate the relative path for the various servlets onto the
  *        end of this string to construct the full URL, as documented on our
  *        developer web site.
  *        </dd>
  *    <dt>secondFactorRequired:</dt>
  *        <dd>
  *        If set to true, this field indicates that the user has enabled two-factor
  *        authentication and must enter their second factor in order to complete
  *        authentication. In this case the value of authenticationResult will be
  *        a short-lived authentication token that may only be used to make a
  *        subsequent call to completeTwoFactorAuthentication.
  *        </dd>
  *    <dt>secondFactorDeliveryHint:</dt>
  *        <dd>
  *        When secondFactorRequired is set to true, this field may contain a string
  *        describing the second factor delivery method that the user has configured.
  *        This will typically be an obfuscated mobile device number, such as
  *        "(xxx) xxx-x095". This string can be displayed to the user to remind them
  *        how to obtain the required second factor.
  *        TODO do we need to differentiate between SMS and voice delivery?
  *        </dd>
  *    </dl>
  */
@JSImport("evernote", "Evernote.AuthenticationResult")
@js.native
class AuthenticationResult () extends js.Object {
  def this(args: Anon_AuthenticationToken) = this()
  var authenticationToken: String = js.native
  var currentTime: Double = js.native
  var expiration: Double = js.native
  var noteStoreUrl: String = js.native
  var publicUserInfo: PublicUserInfo = js.native
  var secondFactorDeliveryHint: String = js.native
  var secondFactorRequired: Boolean = js.native
  var user: User = js.native
  var webApiUrlPrefix: String = js.native
}

