package typings
package fhirLib.fhirNs

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
  var cigar: js.UndefOr[java.lang.String] = js.undefined
  /**
    * End position of the variant on the reference sequence
    */
  var end: js.UndefOr[integer] = js.undefined
  /**
    * Allele that was observed
    */
  var observedAllele: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allele in the reference sequence
    */
  var referenceAllele: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Start position of the variant on the  reference sequence
    */
  var start: js.UndefOr[integer] = js.undefined
  /**
    * Pointer to observed variant information
    */
  var variantPointer: js.UndefOr[Reference] = js.undefined
}

