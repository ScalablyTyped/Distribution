package typings.fsTreeDiff.anon

import typings.fsTreeDiff.entryMod.BaseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entries[T /* <: BaseEntry */] extends js.Object {
  
  var entries: js.UndefOr[js.Array[T]] = js.native
  
  var sortAndExpand: js.UndefOr[Boolean] = js.native
}
object Entries {
  
  @scala.inline
  def apply[T /* <: BaseEntry */](): Entries[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Entries[T]]
  }
  
  @scala.inline
  implicit class EntriesOps[Self <: Entries[_], T /* <: BaseEntry */] (val x: Self with Entries[T]) extends AnyVal {
    
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
    def setEntriesVarargs(value: T*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[T]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    
    @scala.inline
    def setSortAndExpand(value: Boolean): Self = this.set("sortAndExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortAndExpand: Self = this.set("sortAndExpand", js.undefined)
  }
}
