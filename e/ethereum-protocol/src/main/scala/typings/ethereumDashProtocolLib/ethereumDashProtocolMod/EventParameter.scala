package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventParameter extends DataItem {
  var indexed: scala.Boolean
}

object EventParameter {
  @scala.inline
  def apply(
    indexed: scala.Boolean,
    name: java.lang.String,
    `type`: java.lang.String,
    components: js.Array[DataItem] = null
  ): EventParameter = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("indexed")(indexed)
    __obj.updateDynamic("name")(name)
    if (components != null) __obj.updateDynamic("components")(components)
    __obj.asInstanceOf[EventParameter]
  }
}

