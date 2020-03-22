package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseSelectGetItemPropsOptions[Item]
  extends GetItemPropsOptions[Item]
     with GetPropsWithRefKey

object UseSelectGetItemPropsOptions {
  @scala.inline
  def apply[Item](GetItemPropsOptions: GetItemPropsOptions[Item], GetPropsWithRefKey: GetPropsWithRefKey = null): UseSelectGetItemPropsOptions[Item] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, GetItemPropsOptions)
    if (GetPropsWithRefKey != null) js.Dynamic.global.Object.assign(__obj, GetPropsWithRefKey)
    __obj.asInstanceOf[UseSelectGetItemPropsOptions[Item]]
  }
}

