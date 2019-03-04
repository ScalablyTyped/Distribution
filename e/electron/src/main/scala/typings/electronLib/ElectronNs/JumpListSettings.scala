package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JumpListSettings extends js.Object {
  /**
    * The minimum number of items that will be shown in the Jump List (for a more
    * detailed description of this value see the ).
    */
  var minItems: scala.Double
  /**
    * Array of JumpListItem objects that correspond to items that the user has
    * explicitly removed from custom categories in the Jump List. These items must not
    * be re-added to the Jump List in the call to app.setJumpList(), Windows will not
    * display any custom category that contains any of the removed items.
    */
  var removedItems: js.Array[JumpListItem]
}

object JumpListSettings {
  @scala.inline
  def apply(minItems: scala.Double, removedItems: js.Array[JumpListItem]): JumpListSettings = {
    val __obj = js.Dynamic.literal(minItems = minItems, removedItems = removedItems)
  
    __obj.asInstanceOf[JumpListSettings]
  }
}

