package typings.ebml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.ebml.mod.EBMLTagSchema because Already inherited */ @js.native
trait EBMLBinaryTagSchema extends EBMLTagSchemaBase {
  var bytesize: js.UndefOr[Double] = js.native
}

object EBMLBinaryTagSchema {
  @scala.inline
  def apply(description: String, level: Double, name: String, `type`: TagType): EBMLBinaryTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLBinaryTagSchema]
  }
  @scala.inline
  implicit class EBMLBinaryTagSchemaOps[Self <: EBMLBinaryTagSchema] (val x: Self) extends AnyVal {
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
    def setBytesize(value: Double): Self = this.set("bytesize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesize: Self = this.set("bytesize", js.undefined)
  }
  
}

