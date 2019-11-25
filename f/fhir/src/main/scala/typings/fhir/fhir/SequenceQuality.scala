package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An set of value as quality of sequence
  */
trait SequenceQuality extends BackboneElement {
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'fScore'.
    */
  var _fScore: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'gtFP'.
    */
  var _gtFP: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'precision'.
    */
  var _precision: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'queryFP'.
    */
  var _queryFP: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'queryTP'.
    */
  var _queryTP: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'recall'.
    */
  var _recall: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'start'.
    */
  var _start: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'truthFN'.
    */
  var _truthFN: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'truthTP'.
    */
  var _truthTP: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * End position of the sequence
    */
  var end: js.UndefOr[integer] = js.undefined
  /**
    * F-score
    */
  var fScore: js.UndefOr[decimal] = js.undefined
  /**
    * False positives where the non-REF alleles in the Truth and Query Call Sets match
    */
  var gtFP: js.UndefOr[decimal] = js.undefined
  /**
    * Method to get quality
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Precision of comparison
    */
  var precision: js.UndefOr[decimal] = js.undefined
  /**
    * False positives
    */
  var queryFP: js.UndefOr[decimal] = js.undefined
  /**
    * True positives from the perspective of the query data
    */
  var queryTP: js.UndefOr[decimal] = js.undefined
  /**
    * Recall of comparison
    */
  var recall: js.UndefOr[decimal] = js.undefined
  /**
    * Quality score for the comparison
    */
  var score: js.UndefOr[Quantity] = js.undefined
  /**
    * Standard sequence for comparison
    */
  var standardSequence: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Start position of the sequence
    */
  var start: js.UndefOr[integer] = js.undefined
  /**
    * False negatives
    */
  var truthFN: js.UndefOr[decimal] = js.undefined
  /**
    * True positives from the perspective of the truth data
    */
  var truthTP: js.UndefOr[decimal] = js.undefined
  /**
    * indel | snp | unknown
    */
  var `type`: code
}

object SequenceQuality {
  @scala.inline
  def apply(
    `type`: code,
    _end: Element = null,
    _fScore: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _gtFP: Element = null,
    _id: Element = null,
    _precision: Element = null,
    _queryFP: Element = null,
    _queryTP: Element = null,
    _recall: Element = null,
    _start: Element = null,
    _truthFN: Element = null,
    _truthTP: Element = null,
    _type: Element = null,
    end: Int | Double = null,
    extension: js.Array[Extension] = null,
    fScore: Int | Double = null,
    fhir_comments: js.Array[String] = null,
    gtFP: Int | Double = null,
    id: String = null,
    method: CodeableConcept = null,
    modifierExtension: js.Array[Extension] = null,
    precision: Int | Double = null,
    queryFP: Int | Double = null,
    queryTP: Int | Double = null,
    recall: Int | Double = null,
    score: Quantity = null,
    standardSequence: CodeableConcept = null,
    start: Int | Double = null,
    truthFN: Int | Double = null,
    truthTP: Int | Double = null
  ): SequenceQuality = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_end != null) __obj.updateDynamic("_end")(_end.asInstanceOf[js.Any])
    if (_fScore != null) __obj.updateDynamic("_fScore")(_fScore.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_gtFP != null) __obj.updateDynamic("_gtFP")(_gtFP.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_precision != null) __obj.updateDynamic("_precision")(_precision.asInstanceOf[js.Any])
    if (_queryFP != null) __obj.updateDynamic("_queryFP")(_queryFP.asInstanceOf[js.Any])
    if (_queryTP != null) __obj.updateDynamic("_queryTP")(_queryTP.asInstanceOf[js.Any])
    if (_recall != null) __obj.updateDynamic("_recall")(_recall.asInstanceOf[js.Any])
    if (_start != null) __obj.updateDynamic("_start")(_start.asInstanceOf[js.Any])
    if (_truthFN != null) __obj.updateDynamic("_truthFN")(_truthFN.asInstanceOf[js.Any])
    if (_truthTP != null) __obj.updateDynamic("_truthTP")(_truthTP.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fScore != null) __obj.updateDynamic("fScore")(fScore.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (gtFP != null) __obj.updateDynamic("gtFP")(gtFP.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (queryFP != null) __obj.updateDynamic("queryFP")(queryFP.asInstanceOf[js.Any])
    if (queryTP != null) __obj.updateDynamic("queryTP")(queryTP.asInstanceOf[js.Any])
    if (recall != null) __obj.updateDynamic("recall")(recall.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (standardSequence != null) __obj.updateDynamic("standardSequence")(standardSequence.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (truthFN != null) __obj.updateDynamic("truthFN")(truthFN.asInstanceOf[js.Any])
    if (truthTP != null) __obj.updateDynamic("truthTP")(truthTP.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceQuality]
  }
}

