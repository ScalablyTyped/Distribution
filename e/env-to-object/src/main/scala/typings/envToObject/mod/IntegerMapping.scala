package typings.envToObject.mod

import typings.envToObject.envToObjectStrings.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.envToObject.mod.Mapping because Already inherited */ trait IntegerMapping extends GenericMapping {
  var radix: Double
  @JSName("type")
  var type_IntegerMapping: integer
}

object IntegerMapping {
  @scala.inline
  def apply(keypath: String, radix: Double, `type`: integer): IntegerMapping = {
    val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any], radix = radix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerMapping]
  }
}

