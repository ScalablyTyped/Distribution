package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A sequence used as reference
  */
trait SequenceReferenceSeq extends BackboneElement {
  /**
    * Contains extended information for property 'genomeBuild'.
    */
  var _genomeBuild: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'referenceSeqString'.
    */
  var _referenceSeqString: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'strand'.
    */
  var _strand: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'windowEnd'.
    */
  var _windowEnd: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'windowStart'.
    */
  var _windowStart: js.UndefOr[Element] = js.undefined
  /**
    * Chromosome containing genetic finding
    */
  var chromosome: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'
    */
  var genomeBuild: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Reference identifier
    */
  var referenceSeqId: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * A Pointer to another Sequence entity as reference sequence
    */
  var referenceSeqPointer: js.UndefOr[Reference] = js.undefined
  /**
    * A string to represent reference sequence
    */
  var referenceSeqString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Directionality of DNA ( +1/-1)
    */
  var strand: js.UndefOr[integer] = js.undefined
  /**
    * End position of the window on the reference sequence
    */
  var windowEnd: integer
  /**
    * Start position of the window on the  reference sequence
    */
  var windowStart: integer
}

