package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides guide for interpretation
  */
@js.native
trait ObservationReferenceRange extends BackboneElement {
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  /**
    * Applicable age range, if relevant
    */
  var age: js.UndefOr[Range] = js.native
  /**
    * Reference range population
    */
  var appliesTo: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * High Range, if relevant
    */
  var high: js.UndefOr[Quantity] = js.native
  /**
    * Low Range, if relevant
    */
  var low: js.UndefOr[Quantity] = js.native
  /**
    * Text based reference range in an observation
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Reference range qualifier
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}

object ObservationReferenceRange {
  @scala.inline
  def apply(): ObservationReferenceRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservationReferenceRange]
  }
  @scala.inline
  implicit class ObservationReferenceRangeOps[Self <: ObservationReferenceRange] (val x: Self) extends AnyVal {
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
    def set_text(value: Element): Self = this.set("_text", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_text: Self = this.set("_text", js.undefined)
    @scala.inline
    def setAge(value: Range): Self = this.set("age", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAge: Self = this.set("age", js.undefined)
    @scala.inline
    def setAppliesToVarargs(value: CodeableConcept*): Self = this.set("appliesTo", js.Array(value :_*))
    @scala.inline
    def setAppliesTo(value: js.Array[CodeableConcept]): Self = this.set("appliesTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppliesTo: Self = this.set("appliesTo", js.undefined)
    @scala.inline
    def setHigh(value: Quantity): Self = this.set("high", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHigh: Self = this.set("high", js.undefined)
    @scala.inline
    def setLow(value: Quantity): Self = this.set("low", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLow: Self = this.set("low", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

