package typings.evernote.mod.NoteStore

import typings.evernote.anon.IncludeContainingNotebooks
import typings.evernote.mod.Types.RelatedContentType
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.RelatedResultSpec")
@js.native
open class RelatedResultSpec () extends StObject {
  def this(args: IncludeContainingNotebooks) = this()
  
  var includeContainingNotebooks: js.UndefOr[Boolean] = js.native
  
  var includeDebugInfo: js.UndefOr[Boolean] = js.native
  
  var maxExperts: js.UndefOr[Double] = js.native
  
  var maxNotebooks: js.UndefOr[Double] = js.native
  
  var maxNotes: js.UndefOr[Double] = js.native
  
  var maxRelatedContent: js.UndefOr[Double] = js.native
  
  var maxTags: js.UndefOr[Double] = js.native
  
  var relatedContentTypes: js.UndefOr[Set[RelatedContentType]] = js.native
  
  var writableNotebooksOnly: js.UndefOr[Boolean] = js.native
}
