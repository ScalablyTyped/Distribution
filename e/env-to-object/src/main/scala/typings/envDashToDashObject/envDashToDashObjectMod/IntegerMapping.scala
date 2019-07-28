package typings.envDashToDashObject.envDashToDashObjectMod

import typings.envDashToDashObject.envDashToDashObjectStrings.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.envDashToDashObject.envDashToDashObjectMod.Mapping because Already inherited */ trait IntegerMapping extends GenericMapping {
  var radix: Double
  @JSName("type")
  var type_IntegerMapping: integer
}

object IntegerMapping {
  @scala.inline
  def apply(keypath: String, radix: Double, `type`: integer): IntegerMapping = {
    val __obj = js.Dynamic.literal(keypath = keypath, radix = radix)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IntegerMapping]
  }
}

