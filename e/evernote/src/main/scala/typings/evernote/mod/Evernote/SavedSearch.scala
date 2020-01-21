package typings.evernote.mod.Evernote

import typings.evernote.AnonFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A named search associated with the account that can be quickly re-used.
  * <dl>
  * <dt>guid</dt>
  *     <dd>The unique identifier of this search.    Will be set by the
  *     service, so may be omitted by the client when creating.
  *     <br/>
  *     Length:    EDAM_GUID_LEN_MIN - EDAM_GUID_LEN_MAX
  *     <br/>
  *     Regex:    EDAM_GUID_REGEX
  *     </dd>
  *
  * <dt>name</dt>
  *     <dd>The name of the saved search to display in the GUI.    The
  *     account may only contain one search with a given name (case-insensitive
  *     compare). Can't begin or end with a space.
  *     <br/>
  *     Length:    EDAM_SAVED_SEARCH_NAME_LEN_MIN - EDAM_SAVED_SEARCH_NAME_LEN_MAX
  *     <br/>
  *     Regex:    EDAM_SAVED_SEARCH_NAME_REGEX
  *     </dd>
  *
  * <dt>query</dt>
  *     <dd>A string expressing the search to be performed.
  *     <br/>
  *     Length:    EDAM_SAVED_SEARCH_QUERY_LEN_MIN - EDAM_SAVED_SEARCH_QUERY_LEN_MAX
  *     </dd>
  *
  * <dt>format</dt>
  *     <dd>The format of the query string, to determine how to parse
  *     and process it.
  *     </dd>
  *
  * <dt>updateSequenceNum</dt>
  *     <dd>A number identifying the last transaction to
  *     modify the state of this object.    The USN values are sequential within an
  *     account, and can be used to compare the order of modifications within the
  *     service.
  *     </dd>
  *
  * <dt>scope</dt>
  *     <dd><p>Specifies the set of notes that should be included in the search, if
  *        possible.</p>
  *        <p>Clients are expected to search as much of the desired scope as possible,
  *        with the understanding that a given client may not be able to cover the full
  *        specified scope. For example, when executing a search that includes notes in both
  *        the owner's account and business notebooks, a mobile client may choose to only
  *        search within the user's account because it is not capable of searching both
  *        scopes simultaneously. When a search across multiple scopes is not possible,
  *        a client may choose which scope to search based on the current application
  *        context. If a client cannot search any of the desired scopes, it should refuse
  *        to execute the search.</p>
  *        </dd>
  * </dl>
  */
@JSImport("evernote", "Evernote.SavedSearch")
@js.native
class SavedSearch () extends js.Object {
  def this(args: AnonFormat) = this()
  var format: QueryFormat = js.native
  var guid: String = js.native
  var name: String = js.native
  var query: String = js.native
  var scope: SavedSearchScope = js.native
  var updateSequenceNum: Double = js.native
}

