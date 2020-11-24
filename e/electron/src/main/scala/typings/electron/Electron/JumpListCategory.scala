package typings.electron.Electron

import typings.electron.electronStrings.custom
import typings.electron.electronStrings.frequent
import typings.electron.electronStrings.recent
import typings.electron.electronStrings.tasks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JumpListCategory extends js.Object {
  
  // Docs: https://electronjs.org/docs/api/structures/jump-list-category
  /**
    * Array of `JumpListItem` objects if `type` is `tasks` or `custom`, otherwise it
    * should be omitted.
    */
  var items: js.UndefOr[js.Array[JumpListItem]] = js.native
  
  /**
    * Must be set if `type` is `custom`, otherwise it should be omitted.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * One of the following:
    */
  var `type`: js.UndefOr[tasks | frequent | recent | custom] = js.native
}
object JumpListCategory {
  
  @scala.inline
  def apply(): JumpListCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JumpListCategory]
  }
  
  @scala.inline
  implicit class JumpListCategoryOps[Self <: JumpListCategory] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: JumpListItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[JumpListItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(value: tasks | frequent | recent | custom): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
