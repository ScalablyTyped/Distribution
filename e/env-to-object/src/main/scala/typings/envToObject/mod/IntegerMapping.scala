package typings.envToObject.mod

import typings.envToObject.envToObjectStrings.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.envToObject.mod.Mapping because Already inherited */ @js.native
trait IntegerMapping extends GenericMapping {
  var radix: Double = js.native
  @JSName("type")
  var type_IntegerMapping: integer = js.native
}

object IntegerMapping {
  @scala.inline
  def apply(keypath: String, radix: Double, `type`: integer): IntegerMapping = {
    val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any], radix = radix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerMapping]
  }
  @scala.inline
  implicit class IntegerMappingOps[Self <: IntegerMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRadix(value: Double): Self = this.set("radix", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: integer): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

