package typings
package envDashToDashObjectLib.envDashToDashObjectMod.envNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- envDashToDashObjectLib.envDashToDashObjectMod.envNs.Mapping because Already inherited */ trait IntegerMapping extends GenericMapping {
  var radix: scala.Double
  @JSName("type")
  var type_IntegerMapping: envDashToDashObjectLib.envDashToDashObjectLibStrings.integer
}

object IntegerMapping {
  @scala.inline
  def apply(
    keypath: java.lang.String,
    radix: scala.Double,
    `type`: envDashToDashObjectLib.envDashToDashObjectLibStrings.integer
  ): IntegerMapping = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("keypath")(keypath)
    __obj.updateDynamic("radix")(radix)
    __obj.asInstanceOf[IntegerMapping]
  }
}

