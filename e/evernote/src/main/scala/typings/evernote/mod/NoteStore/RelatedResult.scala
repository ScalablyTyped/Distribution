package typings.evernote.mod.NoteStore

import typings.evernote.anon.CacheExpires
import typings.evernote.mod.Types.Note
import typings.evernote.mod.Types.Notebook
import typings.evernote.mod.Types.NotebookDescriptor
import typings.evernote.mod.Types.RelatedContent
import typings.evernote.mod.Types.Tag
import typings.evernote.mod.Types.UserProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.RelatedResult")
@js.native
class RelatedResult () extends StObject {
  def this(args: CacheExpires) = this()
  
  var cacheExpires: js.UndefOr[Double] = js.native
  
  var cacheKey: js.UndefOr[String] = js.native
  
  var containingNotebooks: js.UndefOr[js.Array[NotebookDescriptor]] = js.native
  
  var debugInfo: js.UndefOr[String] = js.native
  
  var experts: js.UndefOr[js.Array[UserProfile]] = js.native
  
  var notebooks: js.UndefOr[js.Array[Notebook]] = js.native
  
  var notes: js.UndefOr[js.Array[Note]] = js.native
  
  var relatedContent: js.UndefOr[js.Array[RelatedContent]] = js.native
  
  var tags: js.UndefOr[js.Array[Tag]] = js.native
}
