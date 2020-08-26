package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A concept defined in the system
  */
@js.native
trait ValueSetComposeIncludeConcept extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.native
  /**
    * Code or expression from system
    */
  var code: typings.fhir.fhir.code = js.native
  /**
    * Additional representations for this concept
    */
  var designation: js.UndefOr[js.Array[ValueSetComposeIncludeConceptDesignation]] = js.native
  /**
    * Text to display for this code for this value set in this valueset
    */
  var display: js.UndefOr[String] = js.native
}

object ValueSetComposeIncludeConcept {
  @scala.inline
  def apply(code: code): ValueSetComposeIncludeConcept = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetComposeIncludeConcept]
  }
  @scala.inline
  implicit class ValueSetComposeIncludeConceptOps[Self <: ValueSetComposeIncludeConcept] (val x: Self) extends AnyVal {
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
    def setCode(value: code): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def set_code(value: Element): Self = this.set("_code", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_code: Self = this.set("_code", js.undefined)
    @scala.inline
    def set_display(value: Element): Self = this.set("_display", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_display: Self = this.set("_display", js.undefined)
    @scala.inline
    def setDesignationVarargs(value: ValueSetComposeIncludeConceptDesignation*): Self = this.set("designation", js.Array(value :_*))
    @scala.inline
    def setDesignation(value: js.Array[ValueSetComposeIncludeConceptDesignation]): Self = this.set("designation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesignation: Self = this.set("designation", js.undefined)
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
  }
  
}

