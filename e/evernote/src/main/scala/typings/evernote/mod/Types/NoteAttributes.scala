package typings.evernote.mod.Types

import typings.evernote.anon.Altitude
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.NoteAttributes")
@js.native
class NoteAttributes () extends StObject {
  def this(args: Altitude) = this()
  
  var altitude: js.UndefOr[Double] = js.native
  
  var applicationData: js.UndefOr[LazyMap] = js.native
  
  var author: js.UndefOr[String] = js.native
  
  var classifications: js.UndefOr[Map[String, String]] = js.native
  
  var conflictSourceNoteGuid: js.UndefOr[Guid] = js.native
  
  var contentClass: js.UndefOr[String] = js.native
  
  var creatorId: js.UndefOr[UserID] = js.native
  
  var lastEditedBy: js.UndefOr[String] = js.native
  
  var lastEditorId: js.UndefOr[UserID] = js.native
  
  var latitude: js.UndefOr[Double] = js.native
  
  var longitude: js.UndefOr[Double] = js.native
  
  var noteTitleQuality: js.UndefOr[Double] = js.native
  
  var placeName: js.UndefOr[String] = js.native
  
  var reminderDoneTime: js.UndefOr[Timestamp] = js.native
  
  var reminderOrder: js.UndefOr[Double] = js.native
  
  var reminderTime: js.UndefOr[Timestamp] = js.native
  
  var shareDate: js.UndefOr[Timestamp] = js.native
  
  var sharedWithBusiness: js.UndefOr[Boolean] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var sourceApplication: js.UndefOr[String] = js.native
  
  var sourceURL: js.UndefOr[String] = js.native
  
  var subjectDate: js.UndefOr[Timestamp] = js.native
}
