package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseComboboxGetItemPropsOptions[Item]
  extends GetItemPropsOptions[Item]
     with GetPropsWithRefKey

object UseComboboxGetItemPropsOptions {
  @scala.inline
  def apply[Item](GetItemPropsOptions: GetItemPropsOptions[Item]): UseComboboxGetItemPropsOptions[Item] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, GetItemPropsOptions)
    __obj.asInstanceOf[UseComboboxGetItemPropsOptions[Item]]
  }
}

