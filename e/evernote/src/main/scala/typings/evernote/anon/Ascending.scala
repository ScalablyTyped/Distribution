package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ascending extends js.Object {
  
  var ascending: js.UndefOr[Boolean] = js.native
  
  var emphasized: js.UndefOr[String] = js.native
  
  var inactive: js.UndefOr[Boolean] = js.native
  
  var notebookGuid: js.UndefOr[String] = js.native
  
  var order: js.UndefOr[Double] = js.native
  
  var tagGuids: js.UndefOr[js.Array[String]] = js.native
  
  var timeZone: js.UndefOr[String] = js.native
  
  var words: js.UndefOr[String] = js.native
}
object Ascending {
  
  @scala.inline
  def apply(): Ascending = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ascending]
  }
  
  @scala.inline
  implicit class AscendingOps[Self <: Ascending] (val x: Self) extends AnyVal {
    
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
    def setAscending(value: Boolean): Self = this.set("ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAscending: Self = this.set("ascending", js.undefined)
    
    @scala.inline
    def setEmphasized(value: String): Self = this.set("emphasized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmphasized: Self = this.set("emphasized", js.undefined)
    
    @scala.inline
    def setInactive(value: Boolean): Self = this.set("inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactive: Self = this.set("inactive", js.undefined)
    
    @scala.inline
    def setNotebookGuid(value: String): Self = this.set("notebookGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookGuid: Self = this.set("notebookGuid", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setTagGuidsVarargs(value: String*): Self = this.set("tagGuids", js.Array(value :_*))
    
    @scala.inline
    def setTagGuids(value: js.Array[String]): Self = this.set("tagGuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagGuids: Self = this.set("tagGuids", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setWords(value: String): Self = this.set("words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWords: Self = this.set("words", js.undefined)
  }
}
