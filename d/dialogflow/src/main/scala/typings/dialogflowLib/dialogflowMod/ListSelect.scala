package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSelect extends js.Object {
  var items: js.Array[Item]
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ListSelect {
  @scala.inline
  def apply(items: js.Array[Item], title: java.lang.String = null): ListSelect = {
    val __obj = js.Dynamic.literal(items = items)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ListSelect]
  }
}

