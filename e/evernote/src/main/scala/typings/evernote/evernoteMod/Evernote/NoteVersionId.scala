package typings.evernote.evernoteMod.Evernote

import typings.evernote.Anon_Saved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifying information about previous versions of a note that are backed up
  * within Evernote's servers.    Used in the return value of the listNoteVersions
  * call.
  *
  * <dl>
  *    <dt>updateSequenceNum</dt>
  *    <dd>
  *        The update sequence number for the Note when it last had this content.
  *        This serves to uniquely identify each version of the note, since USN
  *        values are unique within an account for each update.
  *    </dd>
  *    <dt>updated</dt>
  *    <dd>
  *        The 'updated' time that was set on the Note when it had this version
  *        of the content.    This is the user-modifiable modification time on the
  *        note, so it's not reliable for guaranteeing the order of various
  *        versions.    (E.g. if someone modifies the note, then changes this time
  *        manually into the past and then updates the note again.)
  *    </dd>
  *    <dt>saved</dt>
  *    <dd>
  *        A timestamp that holds the date and time when this version of the note
  *        was backed up by Evernote's servers.    This
  *    </dd>
  *    <dt>title</dt>
  *    <dd>
  *        The title of the note when this particular version was saved.    (The
  *        current title of the note may differ from this value.)
  *    </dd>
  * </dl>
  */
@JSImport("evernote", "Evernote.NoteVersionId")
@js.native
class NoteVersionId () extends js.Object {
  def this(args: Anon_Saved) = this()
  var saved: Double = js.native
  var title: String = js.native
  var updateSequenceNum: Double = js.native
  var updated: Double = js.native
}

