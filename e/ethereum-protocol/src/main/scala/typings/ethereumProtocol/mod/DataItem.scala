package typings.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataItem extends js.Object {
  var components: js.UndefOr[js.Array[DataItem]] = js.undefined
  var name: String
  var `type`: String
}

object DataItem {
  @scala.inline
  def apply(name: String, `type`: String, components: js.Array[DataItem] = null): DataItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataItem]
  }
}

