package typings.evernote.evernoteMod.Evernote

import typings.evernote.Anon_CurrentTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    This structure encapsulates the information about the state of the
  *    user's account for the purpose of "state based" synchronization.
  * <dl>
  *    <dt>currentTime</dt>
  *        <dd>
  *        The server's current date and time.
  *        </dd>
  *
  *    <dt>fullSyncBefore</dt>
  *        <dd>
  *        The cutoff date and time for client caches to be
  *        updated via incremental synchronization.    Any clients that were last
  *        synched with the server before this date/time must do a full resync of all
  *        objects.    This cutoff point will change over time as archival data is
  *        deleted or special circumstances on the service require resynchronization.
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
  *
  *    <dt>uploaded</dt>
  *        <dd>
  *        The total number of bytes that have been uploaded to
  *        this account in the current monthly period.    This can be compared against
  *        Accounting.uploadLimit (from the UserStore) to determine how close the user
  *        is to their monthly upload limit.
  *        This value may not be present if the SyncState has been retrieved by
  *        a caller that only has read access to the account.
  *        </dd>
  *    </dl>
  */
@JSImport("evernote", "Evernote.SyncState")
@js.native
class SyncState () extends js.Object {
  def this(args: Anon_CurrentTime) = this()
  var currentTime: Double = js.native
  var fullSyncBefore: Double = js.native
  var updateCount: Double = js.native
  var uploaded: Double = js.native
}

