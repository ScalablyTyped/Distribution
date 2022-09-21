package typings.evernote.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookCounts extends StObject {
  
  var notebookCounts: js.UndefOr[Record[typings.evernote.mod.Types.Guid, Double]] = js.undefined
  
  var tagCounts: js.UndefOr[Record[typings.evernote.mod.Types.Guid, Double]] = js.undefined
  
  var trashCount: js.UndefOr[Double] = js.undefined
}
object NotebookCounts {
  
  inline def apply(): NotebookCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookCounts]
  }
  
  extension [Self <: NotebookCounts](x: Self) {
    
    inline def setNotebookCounts(value: Record[typings.evernote.mod.Types.Guid, Double]): Self = StObject.set(x, "notebookCounts", value.asInstanceOf[js.Any])
    
    inline def setNotebookCountsUndefined: Self = StObject.set(x, "notebookCounts", js.undefined)
    
    inline def setTagCounts(value: Record[typings.evernote.mod.Types.Guid, Double]): Self = StObject.set(x, "tagCounts", value.asInstanceOf[js.Any])
    
    inline def setTagCountsUndefined: Self = StObject.set(x, "tagCounts", js.undefined)
    
    inline def setTrashCount(value: Double): Self = StObject.set(x, "trashCount", value.asInstanceOf[js.Any])
    
    inline def setTrashCountUndefined: Self = StObject.set(x, "trashCount", js.undefined)
  }
}
