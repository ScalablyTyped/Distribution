package typings.evernote.anon

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookCounts extends StObject {
  
  var notebookCounts: js.UndefOr[Map[typings.evernote.mod.Types.Guid, Double]] = js.undefined
  
  var tagCounts: js.UndefOr[Map[typings.evernote.mod.Types.Guid, Double]] = js.undefined
  
  var trashCount: js.UndefOr[Double] = js.undefined
}
object NotebookCounts {
  
  @scala.inline
  def apply(): NotebookCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookCounts]
  }
  
  @scala.inline
  implicit class NotebookCountsMutableBuilder[Self <: NotebookCounts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebookCounts(value: Map[typings.evernote.mod.Types.Guid, Double]): Self = StObject.set(x, "notebookCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookCountsUndefined: Self = StObject.set(x, "notebookCounts", js.undefined)
    
    @scala.inline
    def setTagCounts(value: Map[typings.evernote.mod.Types.Guid, Double]): Self = StObject.set(x, "tagCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagCountsUndefined: Self = StObject.set(x, "tagCounts", js.undefined)
    
    @scala.inline
    def setTrashCount(value: Double): Self = StObject.set(x, "trashCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrashCountUndefined: Self = StObject.set(x, "trashCount", js.undefined)
  }
}
