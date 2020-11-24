package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notes extends js.Object {
  
  var notes: js.UndefOr[js.Array[typings.evernote.mod.Types.Note]] = js.native
  
  var searchedWords: js.UndefOr[js.Array[String]] = js.native
  
  var startIndex: js.UndefOr[Double] = js.native
  
  var stoppedWords: js.UndefOr[js.Array[String]] = js.native
  
  var totalNotes: js.UndefOr[Double] = js.native
  
  var updateCount: js.UndefOr[Double] = js.native
}
object Notes {
  
  @scala.inline
  def apply(): Notes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notes]
  }
  
  @scala.inline
  implicit class NotesOps[Self <: Notes] (val x: Self) extends AnyVal {
    
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
    def setNotesVarargs(value: typings.evernote.mod.Types.Note*): Self = this.set("notes", js.Array(value :_*))
    
    @scala.inline
    def setNotes(value: js.Array[typings.evernote.mod.Types.Note]): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setSearchedWordsVarargs(value: String*): Self = this.set("searchedWords", js.Array(value :_*))
    
    @scala.inline
    def setSearchedWords(value: js.Array[String]): Self = this.set("searchedWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchedWords: Self = this.set("searchedWords", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    
    @scala.inline
    def setStoppedWordsVarargs(value: String*): Self = this.set("stoppedWords", js.Array(value :_*))
    
    @scala.inline
    def setStoppedWords(value: js.Array[String]): Self = this.set("stoppedWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoppedWords: Self = this.set("stoppedWords", js.undefined)
    
    @scala.inline
    def setTotalNotes(value: Double): Self = this.set("totalNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalNotes: Self = this.set("totalNotes", js.undefined)
    
    @scala.inline
    def setUpdateCount(value: Double): Self = this.set("updateCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateCount: Self = this.set("updateCount", js.undefined)
  }
}
