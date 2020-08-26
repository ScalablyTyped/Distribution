package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search parameters supported by implementation
  */
@js.native
trait CapabilityStatementRestResourceSearchParam extends BackboneElement {
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Source of definition for parameter
    */
  var definition: js.UndefOr[uri] = js.native
  /**
    * Server-specific usage
    */
  var documentation: js.UndefOr[String] = js.native
  /**
    * Name of search parameter
    */
  var name: String = js.native
  /**
    * number | date | string | token | reference | composite | quantity | uri
    */
  var `type`: code = js.native
}

object CapabilityStatementRestResourceSearchParam {
  @scala.inline
  def apply(name: String, `type`: code): CapabilityStatementRestResourceSearchParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRestResourceSearchParam]
  }
  @scala.inline
  implicit class CapabilityStatementRestResourceSearchParamOps[Self <: CapabilityStatementRestResourceSearchParam] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def set_definition(value: Element): Self = this.set("_definition", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_definition: Self = this.set("_definition", js.undefined)
    @scala.inline
    def set_documentation(value: Element): Self = this.set("_documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_documentation: Self = this.set("_documentation", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    @scala.inline
    def setDefinition(value: uri): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    @scala.inline
    def setDocumentation(value: String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
  }
  
}

