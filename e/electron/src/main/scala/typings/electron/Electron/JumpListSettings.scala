package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JumpListSettings extends js.Object {
  /**
    * The minimum number of items that will be shown in the Jump List (for a more
    * detailed description of this value see the MSDN docs).
    */
  var minItems: Double = js.native
  /**
    * Array of `JumpListItem` objects that correspond to items that the user has
    * explicitly removed from custom categories in the Jump List. These items must not
    * be re-added to the Jump List in the **next** call to `app.setJumpList()`,
    * Windows will not display any custom category that contains any of the removed
    * items.
    */
  var removedItems: js.Array[JumpListItem] = js.native
}

object JumpListSettings {
  @scala.inline
  def apply(minItems: Double, removedItems: js.Array[JumpListItem]): JumpListSettings = {
    val __obj = js.Dynamic.literal(minItems = minItems.asInstanceOf[js.Any], removedItems = removedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[JumpListSettings]
  }
  @scala.inline
  implicit class JumpListSettingsOps[Self <: JumpListSettings] (val x: Self) extends AnyVal {
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
    def setMinItems(value: Double): Self = this.set("minItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovedItemsVarargs(value: JumpListItem*): Self = this.set("removedItems", js.Array(value :_*))
    @scala.inline
    def setRemovedItems(value: js.Array[JumpListItem]): Self = this.set("removedItems", value.asInstanceOf[js.Any])
  }
  
}

