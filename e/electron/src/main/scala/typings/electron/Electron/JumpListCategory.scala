package typings.electron.Electron

import typings.electron.electronStrings.custom
import typings.electron.electronStrings.frequent
import typings.electron.electronStrings.recent
import typings.electron.electronStrings.tasks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JumpListCategory extends StObject {
  
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
  implicit class JumpListCategoryMutableBuilder[Self <: JumpListCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[JumpListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: JumpListItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: tasks | frequent | recent | custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
