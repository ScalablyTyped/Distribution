package typings.fhir.fhirNs

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
  var genomeBuild: js.UndefOr[String] = js.undefined
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
  var referenceSeqString: js.UndefOr[String] = js.undefined
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

object SequenceReferenceSeq {
  @scala.inline
  def apply(
    windowEnd: integer,
    windowStart: integer,
    _fhir_comments: js.Array[Element] = null,
    _genomeBuild: Element = null,
    _id: Element = null,
    _referenceSeqString: Element = null,
    _strand: Element = null,
    _windowEnd: Element = null,
    _windowStart: Element = null,
    chromosome: CodeableConcept = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    genomeBuild: String = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    referenceSeqId: CodeableConcept = null,
    referenceSeqPointer: Reference = null,
    referenceSeqString: String = null,
    strand: js.UndefOr[integer] = js.undefined
  ): SequenceReferenceSeq = {
    val __obj = js.Dynamic.literal(windowEnd = windowEnd, windowStart = windowStart)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_genomeBuild != null) __obj.updateDynamic("_genomeBuild")(_genomeBuild)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_referenceSeqString != null) __obj.updateDynamic("_referenceSeqString")(_referenceSeqString)
    if (_strand != null) __obj.updateDynamic("_strand")(_strand)
    if (_windowEnd != null) __obj.updateDynamic("_windowEnd")(_windowEnd)
    if (_windowStart != null) __obj.updateDynamic("_windowStart")(_windowStart)
    if (chromosome != null) __obj.updateDynamic("chromosome")(chromosome)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (genomeBuild != null) __obj.updateDynamic("genomeBuild")(genomeBuild)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (referenceSeqId != null) __obj.updateDynamic("referenceSeqId")(referenceSeqId)
    if (referenceSeqPointer != null) __obj.updateDynamic("referenceSeqPointer")(referenceSeqPointer)
    if (referenceSeqString != null) __obj.updateDynamic("referenceSeqString")(referenceSeqString)
    if (!js.isUndefined(strand)) __obj.updateDynamic("strand")(strand)
    __obj.asInstanceOf[SequenceReferenceSeq]
  }
}

