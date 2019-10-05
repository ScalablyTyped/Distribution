package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Variant in sequence
  */
trait SequenceVariant extends BackboneElement {
  /**
    * Contains extended information for property 'cigar'.
    */
  var _cigar: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'observedAllele'.
    */
  var _observedAllele: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'referenceAllele'.
    */
  var _referenceAllele: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'start'.
    */
  var _start: js.UndefOr[Element] = js.undefined
  /**
    * Extended CIGAR string for aligning the sequence with reference bases
    */
  var cigar: js.UndefOr[String] = js.undefined
  /**
    * End position of the variant on the reference sequence
    */
  var end: js.UndefOr[integer] = js.undefined
  /**
    * Allele that was observed
    */
  var observedAllele: js.UndefOr[String] = js.undefined
  /**
    * Allele in the reference sequence
    */
  var referenceAllele: js.UndefOr[String] = js.undefined
  /**
    * Start position of the variant on the  reference sequence
    */
  var start: js.UndefOr[integer] = js.undefined
  /**
    * Pointer to observed variant information
    */
  var variantPointer: js.UndefOr[Reference] = js.undefined
}

object SequenceVariant {
  @scala.inline
  def apply(
    _cigar: Element = null,
    _end: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _observedAllele: Element = null,
    _referenceAllele: Element = null,
    _start: Element = null,
    cigar: String = null,
    end: Int | Double = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    observedAllele: String = null,
    referenceAllele: String = null,
    start: Int | Double = null,
    variantPointer: Reference = null
  ): SequenceVariant = {
    val __obj = js.Dynamic.literal()
    if (_cigar != null) __obj.updateDynamic("_cigar")(_cigar)
    if (_end != null) __obj.updateDynamic("_end")(_end)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_observedAllele != null) __obj.updateDynamic("_observedAllele")(_observedAllele)
    if (_referenceAllele != null) __obj.updateDynamic("_referenceAllele")(_referenceAllele)
    if (_start != null) __obj.updateDynamic("_start")(_start)
    if (cigar != null) __obj.updateDynamic("cigar")(cigar)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (observedAllele != null) __obj.updateDynamic("observedAllele")(observedAllele)
    if (referenceAllele != null) __obj.updateDynamic("referenceAllele")(referenceAllele)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (variantPointer != null) __obj.updateDynamic("variantPointer")(variantPointer)
    __obj.asInstanceOf[SequenceVariant]
  }
}

