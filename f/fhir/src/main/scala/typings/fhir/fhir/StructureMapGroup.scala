package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Named sections for reader convenience
  */
@js.native
trait StructureMapGroup extends BackboneElement {
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'extends'.
    */
  var _extends: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'typeMode'.
    */
  var _typeMode: js.UndefOr[Element] = js.native
  /**
    * Additional description/explaination for group
    */
  var documentation: js.UndefOr[String] = js.native
  /**
    * Another group that this group adds rules to
    */
  var `extends`: js.UndefOr[id] = js.native
  /**
    * Named instance provided when invoking the map
    */
  var input: js.Array[StructureMapGroupInput] = js.native
  /**
    * Human-readable label
    */
  var name: id = js.native
  /**
    * Transform Rule from source to target
    */
  var rule: js.Array[StructureMapGroupRule] = js.native
  /**
    * none | types | type-and-types
    */
  var typeMode: code = js.native
}

object StructureMapGroup {
  @scala.inline
  def apply(
    input: js.Array[StructureMapGroupInput],
    name: id,
    rule: js.Array[StructureMapGroupRule],
    typeMode: code
  ): StructureMapGroup = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], typeMode = typeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroup]
  }
  @scala.inline
  implicit class StructureMapGroupOps[Self <: StructureMapGroup] (val x: Self) extends AnyVal {
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
    def setInputVarargs(value: StructureMapGroupInput*): Self = this.set("input", js.Array(value :_*))
    @scala.inline
    def setInput(value: js.Array[StructureMapGroupInput]): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: id): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleVarargs(value: StructureMapGroupRule*): Self = this.set("rule", js.Array(value :_*))
    @scala.inline
    def setRule(value: js.Array[StructureMapGroupRule]): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeMode(value: code): Self = this.set("typeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def set_documentation(value: Element): Self = this.set("_documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_documentation: Self = this.set("_documentation", js.undefined)
    @scala.inline
    def set_extends(value: Element): Self = this.set("_extends", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_extends: Self = this.set("_extends", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def set_typeMode(value: Element): Self = this.set("_typeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_typeMode: Self = this.set("_typeMode", js.undefined)
    @scala.inline
    def setDocumentation(value: String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    @scala.inline
    def setExtends(value: id): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
  }
  
}

