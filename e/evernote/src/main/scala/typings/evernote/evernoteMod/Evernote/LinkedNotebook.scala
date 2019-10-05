package typings.evernote.evernoteMod.Evernote

import typings.evernote.Anon_BusinessIdGuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A link in an users account that refers them to a public or individual share in
  * another user's account.
  *
  * <dl>
  * <dt>shareName</dt>
  * <dd>the display name of the shared notebook.
  *     The link owner can change this.</dd>
  *
  * <dt>username</dt>
  * <dd>the username of the user who owns the shared or public notebook</dd>
  *
  * <dt>shardId</dt>
  * <dd>the shard ID of the notebook if the notebook is not public</dt>
  *
  * <dt>shareKey</dt>
  * <dd>the secret key that provides access to the shared notebook</dd>
  *
  * <dt>uri</dt>
  * <dd>the identifier of the public notebook</dd>
  *
  * <dt>guid</dt>
  *     <dd>The unique identifier of this linked notebook.    Will be set whenever
  *     a linked notebook is retrieved from the service, but may be null when a client
  *     is creating a linked notebook.
  *     <br/>
  *     Length:    EDAM_GUID_LEN_MIN - EDAM_GUID_LEN_MAX
  *     <br/>
  *     Regex:    EDAM_GUID_REGEX
  *     </dd>
  *
  * <dt>updateSequenceNum</dt>
  *     <dd>A number identifying the last transaction to
  *     modify the state of this object.    The USN values are sequential within an
  *     account, and can be used to compare the order of modifications within the
  *     service.
  *     </dd>
  *
  * <dt>noteStoreUrl</dt>
  *     <dd>
  *     This field will contain the full URL that clients should use to make
  *     NoteStore requests to the server shard that contains that notebook's data.
  *     I.e. this is the URL that should be used to create the Thrift HTTP client
  *     transport to send messages to the NoteStore service for the account.
  *     </dd>
  *
  * <dt>webApiUrlPrefix:</dt>
  *     <dd>
  *     This field will contain the initial part of the URLs that should be used
  *     to make requests to Evernote's thin client "web API", which provide
  *     optimized operations for clients that aren't capable of manipulating
  *     the full contents of accounts via the full Thrift data model. Clients
  *     should concatenate the relative path for the various servlets onto the
  *     end of this string to construct the full URL, as documented on our
  *     developer web site.
  *     </dd>
  *
  * <dt>stack</dt>
  *     <dd>If this is set, then the notebook is visually contained within a stack
  *     of notebooks with this name.    All notebooks in the same account with the
  *     same 'stack' field are considered to be in the same stack.
  *     Notebooks with no stack set are "top level" and not contained within a
  *     stack.    The link owner can change this and this field is for the benefit
  *     of the link owner.
  *     </dd>
  *
  * <dt>businessId</dt>
  *     <dd>If set, this will be the unique identifier for the business that owns
  *     the notebook to which the linked notebook refers.
  *
  * </dl>
  */
@JSImport("evernote", "Evernote.LinkedNotebook")
@js.native
class LinkedNotebook () extends js.Object {
  def this(args: Anon_BusinessIdGuid) = this()
  var businessId: Double = js.native
  var guid: String = js.native
  var noteStoreUrl: String = js.native
  var shardId: String = js.native
  var shareKey: String = js.native
  var shareName: String = js.native
  var stack: String = js.native
  var updateSequenceNum: Double = js.native
  var uri: String = js.native
  var username: String = js.native
  var webApiUrlPrefix: String = js.native
}

