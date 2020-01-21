package typings.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventParameter extends DataItem {
  var indexed: Boolean
}

object EventParameter {
  @scala.inline
  def apply(indexed: Boolean, name: String, `type`: String, components: js.Array[DataItem] = null): EventParameter = {
    val __obj = js.Dynamic.literal(indexed = indexed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventParameter]
  }
}

