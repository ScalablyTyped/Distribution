package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What codes are expected
  */
@js.native
trait DataRequirementCodeFilter extends Element {
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'valueCode'.
    */
  var _valueCode: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'valueSetString'.
    */
  var _valueSetString: js.UndefOr[Element] = js.native
  /**
    * The code-valued attribute of the filter
    */
  var path: String = js.native
  /**
    * What code is expected
    */
  var valueCode: js.UndefOr[js.Array[code]] = js.native
  /**
    * What CodeableConcept is expected
    */
  var valueCodeableConcept: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * What Coding is expected
    */
  var valueCoding: js.UndefOr[js.Array[Coding]] = js.native
  /**
    * Valueset for the filter
    */
  var valueSetReference: js.UndefOr[Reference] = js.native
  /**
    * Valueset for the filter
    */
  var valueSetString: js.UndefOr[String] = js.native
}

object DataRequirementCodeFilter {
  @scala.inline
  def apply(path: String): DataRequirementCodeFilter = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRequirementCodeFilter]
  }
  @scala.inline
  implicit class DataRequirementCodeFilterOps[Self <: DataRequirementCodeFilter] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def set_path(value: Element): Self = this.set("_path", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_path: Self = this.set("_path", js.undefined)
    @scala.inline
    def set_valueCodeVarargs(value: Element*): Self = this.set("_valueCode", js.Array(value :_*))
    @scala.inline
    def set_valueCode(value: js.Array[Element]): Self = this.set("_valueCode", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueCode: Self = this.set("_valueCode", js.undefined)
    @scala.inline
    def set_valueSetString(value: Element): Self = this.set("_valueSetString", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_valueSetString: Self = this.set("_valueSetString", js.undefined)
    @scala.inline
    def setValueCodeVarargs(value: code*): Self = this.set("valueCode", js.Array(value :_*))
    @scala.inline
    def setValueCode(value: js.Array[code]): Self = this.set("valueCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueCode: Self = this.set("valueCode", js.undefined)
    @scala.inline
    def setValueCodeableConceptVarargs(value: CodeableConcept*): Self = this.set("valueCodeableConcept", js.Array(value :_*))
    @scala.inline
    def setValueCodeableConcept(value: js.Array[CodeableConcept]): Self = this.set("valueCodeableConcept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueCodeableConcept: Self = this.set("valueCodeableConcept", js.undefined)
    @scala.inline
    def setValueCodingVarargs(value: Coding*): Self = this.set("valueCoding", js.Array(value :_*))
    @scala.inline
    def setValueCoding(value: js.Array[Coding]): Self = this.set("valueCoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueCoding: Self = this.set("valueCoding", js.undefined)
    @scala.inline
    def setValueSetReference(value: Reference): Self = this.set("valueSetReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueSetReference: Self = this.set("valueSetReference", js.undefined)
    @scala.inline
    def setValueSetString(value: String): Self = this.set("valueSetString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueSetString: Self = this.set("valueSetString", js.undefined)
  }
  
}

