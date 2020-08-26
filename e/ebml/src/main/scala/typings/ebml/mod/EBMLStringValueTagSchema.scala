package typings.ebml.mod

import typings.ebml.ebmlStrings.s
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.ebml.mod.EBMLTagSchema because Already inherited */ @js.native
trait EBMLStringValueTagSchema extends EBMLDefaultableTagSchema {
  @JSName("type")
  var type_EBMLStringValueTagSchema: s = js.native
}

object EBMLStringValueTagSchema {
  @scala.inline
  def apply(description: String, level: Double, name: String, `type`: s): EBMLStringValueTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLStringValueTagSchema]
  }
  @scala.inline
  implicit class EBMLStringValueTagSchemaOps[Self <: EBMLStringValueTagSchema] (val x: Self) extends AnyVal {
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
    def setType(value: s): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

