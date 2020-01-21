package typings.evernote.mod.Evernote

import typings.evernote.AnonChunkHighUSN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    This structure is given out by the NoteStore when a client asks to
  *    receive the current state of an account.    The client asks for the server's
  *    state one chunk at a time in order to allow clients to retrieve the state
  *    of a large account without needing to transfer the entire account in
  *    a single message.
  *
  *    The server always gives SyncChunks using an ascending series of Update
  *    Sequence Numbers (USNs).
  *
  * <dl>
  *    <dt>currentTime</dt>
  *        <dd>
  *        The server's current date and time.
  *        </dd>
  *
  *    <dt>chunkHighUSN</dt>
  *        <dd>
  *        The highest USN for any of the data objects represented
  *        in this sync chunk.    If there are no objects in the chunk, this will not be
  *        set.
  *        </dd>
  *
  *    <dt>updateCount</dt>
  *        <dd>
  *        The total number of updates that have been performed in
  *        the service for this account.    This is equal to the highest USN within the
  *        account at the point that this SyncChunk was generated.    If updateCount
  *        and chunkHighUSN are identical, that means that this is the last chunk
  *        in the account ... there is no more recent information.
  *        </dd>
  *
  *    <dt>notes</dt>
  *        <dd>
  *        If present, this is a list of non-expunged notes that
  *        have a USN in this chunk.    This will include notes that are "deleted"
  *        but not expunged (i.e. in the trash).    The notes will include their list
  *        of tags and resources, but the note content, resource content, resource
  *        recognition data and resource alternate data will not be supplied.
  *        </dd>
  *
  *    <dt>notebooks</dt>
  *        <dd>
  *        If present, this is a list of non-expunged notebooks that
  *        have a USN in this chunk.    This will include notebooks that are "deleted"
  *        but not expunged (i.e. in the trash).
  *        </dd>
  *
  *    <dt>tags</dt>
  *        <dd>
  *        If present, this is a list of the non-expunged tags that have a
  *        USN in this chunk.
  *        </dd>
  *
  *    <dt>searches</dt>
  *        <dd>
  *        If present, this is a list of non-expunged searches that
  *        have a USN in this chunk.
  *        </dd>
  *
  *    <dt>resources</dt>
  *        <dd>
  *        If present, this is a list of the non-expunged resources
  *        that have a USN in this chunk.    This will include the metadata for each
  *        resource, but not its binary contents or recognition data, which must be
  *        retrieved separately.
  *        </dd>
  *
  *    <dt>expungedNotes</dt>
  *        <dd>
  *        If present, the GUIDs of all of the notes that were
  *        permanently expunged in this chunk.
  *        </dd>
  *
  *    <dt>expungedNotebooks</dt>
  *        <dd>
  *        If present, the GUIDs of all of the notebooks that
  *        were permanently expunged in this chunk.    When a notebook is expunged,
  *        this implies that all of its child notes (and their resources) were
  *        also expunged.
  *        </dd>
  *
  *    <dt>expungedTags</dt>
  *        <dd>
  *        If present, the GUIDs of all of the tags that were
  *        permanently expunged in this chunk.
  *        </dd>
  *
  *    <dt>expungedSearches</dt>
  *        <dd>
  *        If present, the GUIDs of all of the saved searches
  *        that were permanently expunged in this chunk.
  *        </dd>
  *
  *    <dt>linkedNotebooks</dt>
  *        <dd>
  *        If present, this is a list of non-expunged LinkedNotebooks that
  *        have a USN in this chunk.
  *        </dd>
  *
  *    <dt>expungedLinkedNotebooks</dt>
  *        <dd>
  *        If present, the GUIDs of all of the LinkedNotebooks
  *        that were permanently expunged in this chunk.
  *        </dd>
  *    </dl>
  */
@JSImport("evernote", "Evernote.SyncChunk")
@js.native
class SyncChunk () extends js.Object {
  def this(args: AnonChunkHighUSN) = this()
  var chunkHighUSN: Double = js.native
  var currentTime: Double = js.native
  var expungedLinkedNotebooks: js.Array[String] = js.native
  var expungedNotebooks: js.Array[String] = js.native
  var expungedNotes: js.Array[String] = js.native
  var expungedSearches: js.Array[String] = js.native
  var expungedTags: js.Array[String] = js.native
  var linkedNotebooks: js.Array[LinkedNotebook] = js.native
  var notebooks: js.Array[Notebook] = js.native
  var notes: js.Array[Note] = js.native
  var resources: js.Array[Resource] = js.native
  var searches: js.Array[SavedSearch] = js.native
  var tags: js.Array[Tag] = js.native
  var updateCount: Double = js.native
}

