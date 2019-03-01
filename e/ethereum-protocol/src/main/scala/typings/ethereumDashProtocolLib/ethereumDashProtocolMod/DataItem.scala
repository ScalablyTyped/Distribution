package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataItem extends js.Object {
  var components: js.UndefOr[js.Array[DataItem]] = js.undefined
  var name: java.lang.String
  var `type`: java.lang.String
}

object DataItem {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String, components: js.Array[DataItem] = null): DataItem = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    if (components != null) __obj.updateDynamic("components")(components)
    __obj.asInstanceOf[DataItem]
  }
}

