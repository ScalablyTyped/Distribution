package typings.evernote.evernoteMod.Evernote

import typings.evernote.Anon_IncludeExpunged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    This structure is used with the 'getFilteredSyncChunk' call to provide
  *    fine-grained control over the data that's returned when a client needs
  *    to synchronize with the service. Each flag in this structure specifies
  *    whether to include one class of data in the results of that call.
  *
  * <dl>
  *    <dt>includeNotes</dt>
  *        <dd>
  *        If true, then the server will include the SyncChunks.notes field
  *        </dd>
  *
  *    <dt>includeNoteResources</dt>
  *        <dd>
  *        If true, then the server will include the 'resources' field on all of
  *        the Notes that are in SyncChunk.notes.
  *        If 'includeNotes' is false, then this will have no effect.
  *        </dd>
  *
  *    <dt>includeNoteAttributes</dt>
  *        <dd>
  *        If true, then the server will include the 'attributes' field on all of
  *        the Notes that are in SyncChunks.notes.
  *        If 'includeNotes' is false, then this will have no effect.
  *        </dd>
  *
  *    <dt>includeNotebooks</dt>
  *        <dd>
  *        If true, then the server will include the SyncChunks.notebooks field
  *        </dd>
  *
  *    <dt>includeTags</dt>
  *        <dd>
  *        If true, then the server will include the SyncChunks.tags field
  *        </dd>
  *
  *    <dt>includeSearches</dt>
  *        <dd>
  *        If true, then the server will include the SyncChunks.searches field
  *        </dd>
  *
  *    <dt>includeResources</dt>
  *        <dd>
  *        If true, then the server will include the SyncChunks.resources field.
  *        Since the Resources are also provided with their Note
  *        (in the Notes.resources list), this is primarily useful for clients that
  *        want to watch for changes to individual Resources due to recognition data
  *        being added.
  *        </dd>
  *
  *    <dt>includeLinkedNotebooks</dt>
  *        <dd>
  *        If true, then the server will include the SyncChunks.linkedNotebooks field.
  *        </dd>
  *
  *    <dt>includeExpunged</dt>
  *        <dd>
  *        If true, then the server will include the 'expunged' data for any type
  *        of included data.    For example, if 'includeTags' and 'includeExpunged'
  *        are both true, then the SyncChunks.expungedTags field will be set with
  *        the GUIDs of tags that have been expunged from the server.
  *        </dd>
  *
  *    <dt>includeNoteApplicationDataFullMap</dt>
  *        <dd>
  *        If true, then the values for the applicationData map will be filled
  *        in, assuming notes and note attributes are being returned.    Otherwise,
  *        only the keysOnly field will be filled in.
  *        </dd>
  *
  *    <dt>includeResourceApplicationDataFullMap</dt>
  *        <dd>
  *        If true, then the fullMap values for the applicationData map will be
  *        filled in, assuming resources and resource attributes are being returned
  *        (includeResources is true).    Otherwise, only the keysOnly field will be
  *        filled in.
  *        </dd>
  *
  *    <dt>includeNoteResourceApplicationDataFullMap</dt>
  *        <dd>
  *        If true, then the fullMap values for the applicationData map will be
  *        filled in for resources found inside of notes, assuming resources are
  *        being returned in notes (includeNoteResources is true).    Otherwise,
  *        only the keysOnly field will be filled in.
  *        </dd>
  *
  *    <dt>requireNoteContentClass</dt>
  *        <dd>
  *        If set, then only send notes whose content class matches this value.
  *        The value can be a literal match or, if the last character is an
  *        asterisk, a prefix match.
  *        </dd>
  *    </dl>
  */
@JSImport("evernote", "Evernote.SyncChunkFilter")
@js.native
class SyncChunkFilter () extends js.Object {
  def this(args: Anon_IncludeExpunged) = this()
  var includeExpunged: Boolean = js.native
  var includeLinkedNotebooks: Boolean = js.native
  var includeNoteApplicationDataFullMap: Boolean = js.native
  var includeNoteAttributes: Boolean = js.native
  var includeNoteResourceApplicationDataFullMap: Boolean = js.native
  var includeNoteResources: Boolean = js.native
  var includeNotebooks: Boolean = js.native
  var includeNotes: Boolean = js.native
  var includeResourceApplicationDataFullMap: Boolean = js.native
  var includeResources: Boolean = js.native
  var includeSearches: Boolean = js.native
  var includeTags: Boolean = js.native
  var requireNoteContentClass: String = js.native
}

