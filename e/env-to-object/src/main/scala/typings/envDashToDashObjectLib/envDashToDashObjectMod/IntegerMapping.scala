package typings
package envDashToDashObjectLib.envDashToDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- envDashToDashObjectLib.envDashToDashObjectMod.Mapping because Already inherited */ trait IntegerMapping extends GenericMapping {
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
    val __obj = js.Dynamic.literal(keypath = keypath, radix = radix)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IntegerMapping]
  }
}

