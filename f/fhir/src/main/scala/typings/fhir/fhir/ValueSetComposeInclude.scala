package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Include one or more codes from a code system or other value set(s)
  */
@js.native
trait ValueSetComposeInclude extends BackboneElement {
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueSet'.
    */
  var _valueSet: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  /**
    * A concept defined in the system
    */
  var concept: js.UndefOr[js.Array[ValueSetComposeIncludeConcept]] = js.native
  /**
    * Select codes/concepts by their properties (including relationships)
    */
  var filter: js.UndefOr[js.Array[ValueSetComposeIncludeFilter]] = js.native
  /**
    * The system the codes come from
    */
  var system: js.UndefOr[uri] = js.native
  /**
    * Select only contents included in this value set
    */
  var valueSet: js.UndefOr[js.Array[uri]] = js.native
  /**
    * Specific version of the code system referred to
    */
  var version: js.UndefOr[String] = js.native
}

object ValueSetComposeInclude {
  @scala.inline
  def apply(): ValueSetComposeInclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueSetComposeInclude]
  }
  @scala.inline
  implicit class ValueSetComposeIncludeOps[Self <: ValueSetComposeInclude] (val x: Self) extends AnyVal {
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
    def set_system(value: Element): Self = this.set("_system", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_system: Self = this.set("_system", js.undefined)
    @scala.inline
    def set_valueSetVarargs(value: Element*): Self = this.set("_valueSet", js.Array(value :_*))
    @scala.inline
    def set_valueSet(value: js.Array[Element]): Self = this.set("_valueSet", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueSet: Self = this.set("_valueSet", js.undefined)
    @scala.inline
    def set_version(value: Element): Self = this.set("_version", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
    @scala.inline
    def setConceptVarargs(value: ValueSetComposeIncludeConcept*): Self = this.set("concept", js.Array(value :_*))
    @scala.inline
    def setConcept(value: js.Array[ValueSetComposeIncludeConcept]): Self = this.set("concept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcept: Self = this.set("concept", js.undefined)
    @scala.inline
    def setFilterVarargs(value: ValueSetComposeIncludeFilter*): Self = this.set("filter", js.Array(value :_*))
    @scala.inline
    def setFilter(value: js.Array[ValueSetComposeIncludeFilter]): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setSystem(value: uri): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
    @scala.inline
    def setValueSetVarargs(value: uri*): Self = this.set("valueSet", js.Array(value :_*))
    @scala.inline
    def setValueSet(value: js.Array[uri]): Self = this.set("valueSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueSet: Self = this.set("valueSet", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

