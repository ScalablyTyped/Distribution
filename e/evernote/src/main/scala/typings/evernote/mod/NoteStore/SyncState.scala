package typings.evernote.mod.NoteStore

import typings.evernote.anon.CurrentTime
import typings.evernote.mod.Types.MessageEventID
import typings.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.SyncState")
@js.native
class SyncState () extends StObject {
  def this(args: CurrentTime) = this()
  
  var currentTime: js.UndefOr[Timestamp] = js.native
  
  var fullSyncBefore: js.UndefOr[Timestamp] = js.native
  
  var updateCount: js.UndefOr[Double] = js.native
  
  var uploaded: js.UndefOr[Double] = js.native
  
  var userLastUpdated: js.UndefOr[Timestamp] = js.native
  
  var userMaxMessageEventId: js.UndefOr[MessageEventID] = js.native
}
