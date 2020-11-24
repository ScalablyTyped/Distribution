package typings.evernote.anon

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookCounts extends js.Object {
  
  var notebookCounts: js.UndefOr[Map[typings.evernote.mod.Types.Guid, Double]] = js.native
  
  var tagCounts: js.UndefOr[Map[typings.evernote.mod.Types.Guid, Double]] = js.native
  
  var trashCount: js.UndefOr[Double] = js.native
}
object NotebookCounts {
  
  @scala.inline
  def apply(): NotebookCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookCounts]
  }
  
  @scala.inline
  implicit class NotebookCountsOps[Self <: NotebookCounts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNotebookCounts(value: Map[typings.evernote.mod.Types.Guid, Double]): Self = this.set("notebookCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookCounts: Self = this.set("notebookCounts", js.undefined)
    
    @scala.inline
    def setTagCounts(value: Map[typings.evernote.mod.Types.Guid, Double]): Self = this.set("tagCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagCounts: Self = this.set("tagCounts", js.undefined)
    
    @scala.inline
    def setTrashCount(value: Double): Self = this.set("trashCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrashCount: Self = this.set("trashCount", js.undefined)
  }
}
