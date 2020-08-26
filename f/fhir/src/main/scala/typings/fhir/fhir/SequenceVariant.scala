package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Variant in sequence
  */
@js.native
trait SequenceVariant extends BackboneElement {
  /**
    * Contains extended information for property 'cigar'.
    */
  var _cigar: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'observedAllele'.
    */
  var _observedAllele: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'referenceAllele'.
    */
  var _referenceAllele: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'start'.
    */
  var _start: js.UndefOr[Element] = js.native
  /**
    * Extended CIGAR string for aligning the sequence with reference bases
    */
  var cigar: js.UndefOr[String] = js.native
  /**
    * End position of the variant on the reference sequence
    */
  var end: js.UndefOr[integer] = js.native
  /**
    * Allele that was observed
    */
  var observedAllele: js.UndefOr[String] = js.native
  /**
    * Allele in the reference sequence
    */
  var referenceAllele: js.UndefOr[String] = js.native
  /**
    * Start position of the variant on the  reference sequence
    */
  var start: js.UndefOr[integer] = js.native
  /**
    * Pointer to observed variant information
    */
  var variantPointer: js.UndefOr[Reference] = js.native
}

object SequenceVariant {
  @scala.inline
  def apply(): SequenceVariant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceVariant]
  }
  @scala.inline
  implicit class SequenceVariantOps[Self <: SequenceVariant] (val x: Self) extends AnyVal {
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
    def set_cigar(value: Element): Self = this.set("_cigar", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_cigar: Self = this.set("_cigar", js.undefined)
    @scala.inline
    def set_end(value: Element): Self = this.set("_end", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_end: Self = this.set("_end", js.undefined)
    @scala.inline
    def set_observedAllele(value: Element): Self = this.set("_observedAllele", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_observedAllele: Self = this.set("_observedAllele", js.undefined)
    @scala.inline
    def set_referenceAllele(value: Element): Self = this.set("_referenceAllele", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_referenceAllele: Self = this.set("_referenceAllele", js.undefined)
    @scala.inline
    def set_start(value: Element): Self = this.set("_start", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_start: Self = this.set("_start", js.undefined)
    @scala.inline
    def setCigar(value: String): Self = this.set("cigar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCigar: Self = this.set("cigar", js.undefined)
    @scala.inline
    def setEnd(value: integer): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setObservedAllele(value: String): Self = this.set("observedAllele", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObservedAllele: Self = this.set("observedAllele", js.undefined)
    @scala.inline
    def setReferenceAllele(value: String): Self = this.set("referenceAllele", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceAllele: Self = this.set("referenceAllele", js.undefined)
    @scala.inline
    def setStart(value: integer): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setVariantPointer(value: Reference): Self = this.set("variantPointer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariantPointer: Self = this.set("variantPointer", js.undefined)
  }
  
}

