package typings.evernote.mod.Evernote

import typings.evernote.AnonNoteStoreUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    This structure is used to provide publicly-available user information
  *    about a particular account.
  * <dl>
  *    <dt>userId:</dt>
  *        <dd>
  *        The unique numeric user identifier for the user account.
  *        </dd>
  *    <dt>shardId:</dt>
  *        <dd>
  *        DEPRECATED - Client applications should have no need to use this field.
  *        </dd>
  *    <dt>privilege:</dt>
  *        <dd>
  *        The privilege level of the account, to determine whether
  *        this is a Premium or Free account.
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
  *    </dl>
  */
@JSImport("evernote", "Evernote.PublicUserInfo")
@js.native
class PublicUserInfo () extends js.Object {
  def this(args: AnonNoteStoreUrl) = this()
  var noteStoreUrl: String = js.native
  var privilege: PrivilegeLevel = js.native
  var shardId: String = js.native
  var userId: Double = js.native
  var username: String = js.native
  var webApiUrlPrefix: String = js.native
}

