package typings.ethereumDashProtocol.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventParameter extends DataItem {
  var indexed: Boolean
}

object EventParameter {
  @scala.inline
  def apply(indexed: Boolean, name: String, `type`: String, components: js.Array[DataItem] = null): EventParameter = {
    val __obj = js.Dynamic.literal(indexed = indexed, name = name)
    __obj.updateDynamic("type")(`type`)
    if (components != null) __obj.updateDynamic("components")(components)
    __obj.asInstanceOf[EventParameter]
  }
}

