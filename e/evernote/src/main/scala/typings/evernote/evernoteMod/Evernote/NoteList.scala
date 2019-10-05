package typings.evernote.evernoteMod.Evernote

import typings.evernote.Anon_Notes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    A small structure for returning a list of notes out of a larger set.
  *
  * <dl>
  *    <dt>startIndex</dt>
  *        <dd>
  *        The starting index within the overall set of notes.    This
  *        is also the number of notes that are "before" this list in the set.
  *        </dd>
  *
  *    <dt>totalNotes</dt>
  *        <dd>
  *        The number of notes in the larger set.    This can be used
  *        to calculate how many notes are "after" this note in the set.
  *        (I.e.    remaining = totalNotes - (startIndex + notes.length)    )
  *        </dd>
  *
  *    <dt>notes</dt>
  *        <dd>
  *        The list of notes from this range.    The Notes will include all
  *        metadata (attributes, resources, etc.), but will not include the ENML
  *        content of the note or the binary contents of any resources.
  *        </dd>
  *
  *    <dt>stoppedWords</dt>
  *        <dd>
  *        If the NoteList was produced using a text based search
  *        query that included words that are not indexed or searched by the service,
  *        this will include a list of those ignored words.
  *        </dd>
  *
  *    <dt>searchedWords</dt>
  *        <dd>
  *        If the NoteList was produced using a text based search
  *        query that included viable search words or quoted expressions, this will
  *        include a list of those words.    Any stopped words will not be included
  *        in this list.
  *        </dd>
  *
  *    <dt>updateCount</dt>
  *        <dd>
  *        Indicates the total number of transactions that have
  *        been committed within the account.    This reflects (for example) the
  *        number of discrete additions or modifications that have been made to
  *        the data in this account (tags, notes, resources, etc.).
  *        This number is the "high water mark" for Update Sequence Numbers (USN)
  *        within the account.
  *        </dd>
  *    </dl>
  */
@JSImport("evernote", "Evernote.NoteList")
@js.native
class NoteList () extends js.Object {
  def this(args: Anon_Notes) = this()
  var notes: js.Array[Note] = js.native
  var searchedWords: js.Array[String] = js.native
  var startIndex: Double = js.native
  var stoppedWords: js.Array[String] = js.native
  var totalNotes: Double = js.native
  var updateCount: Double = js.native
}

