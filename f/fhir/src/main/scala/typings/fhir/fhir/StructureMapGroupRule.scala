package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transform Rule from source to target
  */
@js.native
trait StructureMapGroupRule extends BackboneElement {
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Which other rules to apply in the context of this rule
    */
  var dependent: js.UndefOr[js.Array[StructureMapGroupRuleDependent]] = js.native
  /**
    * Documentation for this instance of data
    */
  var documentation: js.UndefOr[String] = js.native
  /**
    * Name of the rule for internal references
    */
  var name: id = js.native
  /**
    * Rules contained in this rule
    */
  var rule: js.UndefOr[js.Array[StructureMapGroupRule]] = js.native
  /**
    * Source inputs to the mapping
    */
  var source: js.Array[StructureMapGroupRuleSource] = js.native
  /**
    * Content to create because of this mapping rule
    */
  var target: js.UndefOr[js.Array[StructureMapGroupRuleTarget]] = js.native
}

object StructureMapGroupRule {
  @scala.inline
  def apply(name: id, source: js.Array[StructureMapGroupRuleSource]): StructureMapGroupRule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroupRule]
  }
  @scala.inline
  implicit class StructureMapGroupRuleOps[Self <: StructureMapGroupRule] (val x: Self) extends AnyVal {
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
    def setName(value: id): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceVarargs(value: StructureMapGroupRuleSource*): Self = this.set("source", js.Array(value :_*))
    @scala.inline
    def setSource(value: js.Array[StructureMapGroupRuleSource]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def set_documentation(value: Element): Self = this.set("_documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_documentation: Self = this.set("_documentation", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def setDependentVarargs(value: StructureMapGroupRuleDependent*): Self = this.set("dependent", js.Array(value :_*))
    @scala.inline
    def setDependent(value: js.Array[StructureMapGroupRuleDependent]): Self = this.set("dependent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependent: Self = this.set("dependent", js.undefined)
    @scala.inline
    def setDocumentation(value: String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    @scala.inline
    def setRuleVarargs(value: StructureMapGroupRule*): Self = this.set("rule", js.Array(value :_*))
    @scala.inline
    def setRule(value: js.Array[StructureMapGroupRule]): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
    @scala.inline
    def setTargetVarargs(value: StructureMapGroupRuleTarget*): Self = this.set("target", js.Array(value :_*))
    @scala.inline
    def setTarget(value: js.Array[StructureMapGroupRuleTarget]): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

