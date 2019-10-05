package typings.evernote.evernoteMod.Evernote

import typings.evernote.Anon_Ascending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    A list of criteria that are used to indicate which notes are desired from
  *    the account.    This is used in queries to the NoteStore to determine
  *    which notes should be retrieved.
  *
  * <dl>
  *    <dt>order</dt>
  *        <dd>
  *        The NoteSortOrder value indicating what criterion should be
  *        used to sort the results of the filter.
  *        </dd>
  *
  *    <dt>ascending</dt>
  *        <dd>
  *        If true, the results will be ascending in the requested
  *        sort order.    If false, the results will be descending.
  *        </dd>
  *
  *    <dt>words</dt>
  *        <dd>
  *        If present, a search query string that will filter the set of notes to be returned.
  *        Accepts the full search grammar documented in the Evernote API Overview.
  *        </dd>
  *
  *    <dt>notebookGuid</dt>
  *        <dd>
  *        If present, the Guid of the notebook that must contain
  *        the notes.
  *        </dd>
  *
  *    <dt>tagGuids</dt>
  *        <dd>
  *        If present, the list of tags (by GUID) that must be present
  *        on the notes.
  *        </dd>
  *
  *    <dt>timeZone</dt>
  *        <dd>
  *        The zone ID for the user, which will be used to interpret
  *        any dates or times in the queries that do not include their desired zone
  *        information.
  *        For example, if a query requests notes created "yesterday", this
  *        will be evaluated from the provided time zone, if provided.
  *        The format must be encoded as a standard zone ID such as
  *        "America/Los_Angeles".
  *        </dd>
  *
  *    <dt>inactive</dt>
  *        <dd>
  *        If true, then only notes that are not active (i.e. notes in
  *        the Trash) will be returned. Otherwise, only active notes will be returned.
  *        There is no way to find both active and inactive notes in a single query.
  *        </dd>
  *
  *    <dt>emphasized</dt>
  *        <dd>
  *        If present, a search query string that may or may not influence the notes
  *        to be returned, both in terms of coverage as well as of order. Think of it
  *        as a wish list, not a requirement.
  *        Accepts the full search grammar documented in the Evernote API Overview.
  *        </dd>
  *    </dl>
  */
@JSImport("evernote", "Evernote.NoteFilter")
@js.native
class NoteFilter () extends js.Object {
  def this(args: Anon_Ascending) = this()
  var ascending: Boolean = js.native
  var emphasized: String = js.native
  var inactive: Boolean = js.native
  var notebookGuid: String = js.native
  var order: Double = js.native
  var tagGuids: js.Array[String] = js.native
  var timeZone: String = js.native
  var words: String = js.native
}

