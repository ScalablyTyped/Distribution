package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseComboboxGetItemPropsOptions[Item]
  extends GetItemPropsOptions[Item]
     with GetPropsWithRefKey

object UseComboboxGetItemPropsOptions {
  @scala.inline
  def apply[Item](GetItemPropsOptions: GetItemPropsOptions[Item], GetPropsWithRefKey: GetPropsWithRefKey = null): UseComboboxGetItemPropsOptions[Item] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, GetItemPropsOptions)
    if (GetPropsWithRefKey != null) js.Dynamic.global.Object.assign(__obj, GetPropsWithRefKey)
    __obj.asInstanceOf[UseComboboxGetItemPropsOptions[Item]]
  }
}

