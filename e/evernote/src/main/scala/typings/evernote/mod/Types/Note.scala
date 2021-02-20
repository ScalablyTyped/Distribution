package typings.evernote.mod.Types

import typings.evernote.anon.Active
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.Note")
@js.native
class Note () extends StObject {
  def this(args: Active) = this()
  
  var active: js.UndefOr[Boolean] = js.native
  
  var attributes: js.UndefOr[NoteAttributes] = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var contentHash: js.UndefOr[String] = js.native
  
  var contentLength: js.UndefOr[Double] = js.native
  
  var created: js.UndefOr[Double] = js.native
  
  var deleted: js.UndefOr[Double] = js.native
  
  var guid: js.UndefOr[Guid] = js.native
  
  var limits: js.UndefOr[NoteLimits] = js.native
  
  var notebookGuid: js.UndefOr[Guid] = js.native
  
  var resources: js.UndefOr[js.Array[Resource]] = js.native
  
  var restrictions: js.UndefOr[NoteRestrictions] = js.native
  
  var sharedNotes: js.UndefOr[js.Array[SharedNote]] = js.native
  
  var tagGuids: js.UndefOr[js.Array[String]] = js.native
  
  var tagNames: js.UndefOr[js.Array[String]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var updateSequenceNum: js.UndefOr[Double] = js.native
  
  var updated: js.UndefOr[Double] = js.native
}
