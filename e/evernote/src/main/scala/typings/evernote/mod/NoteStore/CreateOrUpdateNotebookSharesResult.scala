package typings.evernote.mod.NoteStore

import typings.evernote.anon.MatchingShares
import typings.evernote.mod.Types.SharedNotebook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.CreateOrUpdateNotebookSharesResult")
@js.native
open class CreateOrUpdateNotebookSharesResult () extends StObject {
  def this(args: MatchingShares) = this()
  
  var matchingShares: js.UndefOr[js.Array[SharedNotebook]] = js.native
  
  var updateSequenceNum: js.UndefOr[Double] = js.native
}
