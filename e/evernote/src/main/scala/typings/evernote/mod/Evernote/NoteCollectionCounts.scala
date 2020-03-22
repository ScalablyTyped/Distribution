package typings.evernote.mod.Evernote

import org.scalablytyped.runtime.StringDictionary
import typings.evernote.AnonNotebookCounts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    A data structure representing the number of notes for each notebook
  *    and tag with a non-zero set of applicable notes.
  *
  * <dl>
  *    <dt>notebookCounts</dt>
  *        <dd>
  *        A mapping from the Notebook GUID to the number of
  *        notes (from some selection) that are in the corresponding notebook.
  *        </dd>
  *
  *    <dt>tagCounts</dt>
  *        <dd>
  *        A mapping from the Tag GUID to the number of notes (from some
  *        selection) that have the corresponding tag.
  *        </dd>
  *
  *    <dt>trashCount</dt>
  *        <dd>
  *        If this is set, then this is the number of notes that are in the trash.
  *        If this is not set, then the number of notes in the trash hasn't been
  *        reported.    (I.e. if there are no notes in the trash, this will be set
  *        to 0.)
  *        </dd>
  *    </dl>
  */
@JSImport("evernote", "Evernote.NoteCollectionCounts")
@js.native
class NoteCollectionCounts () extends js.Object {
  def this(args: AnonNotebookCounts) = this()
  var notebookCounts: StringDictionary[Double] = js.native
  var tagCounts: StringDictionary[Double] = js.native
  var trashCount: Double = js.native
}

