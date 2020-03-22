package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JumpListSettings extends js.Object {
  /**
    * The minimum number of items that will be shown in the Jump List (for a more
    * detailed description of this value see the MSDN docs).
    */
  var minItems: Double
  /**
    * Array of `JumpListItem` objects that correspond to items that the user has
    * explicitly removed from custom categories in the Jump List. These items must not
    * be re-added to the Jump List in the **next** call to `app.setJumpList()`,
    * Windows will not display any custom category that contains any of the removed
    * items.
    */
  var removedItems: js.Array[JumpListItem]
}

object JumpListSettings {
  @scala.inline
  def apply(minItems: Double, removedItems: js.Array[JumpListItem]): JumpListSettings = {
    val __obj = js.Dynamic.literal(minItems = minItems.asInstanceOf[js.Any], removedItems = removedItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JumpListSettings]
  }
}

