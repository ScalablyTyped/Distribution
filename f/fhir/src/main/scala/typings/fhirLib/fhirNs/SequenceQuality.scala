package typings
package fhirLib.fhirNs

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
    end: js.UndefOr[integer] = js.undefined,
    extension: js.Array[Extension] = null,
    fScore: js.UndefOr[decimal] = js.undefined,
    fhir_comments: js.Array[java.lang.String] = null,
    gtFP: js.UndefOr[decimal] = js.undefined,
    id: java.lang.String = null,
    method: CodeableConcept = null,
    modifierExtension: js.Array[Extension] = null,
    precision: js.UndefOr[decimal] = js.undefined,
    queryFP: js.UndefOr[decimal] = js.undefined,
    queryTP: js.UndefOr[decimal] = js.undefined,
    recall: js.UndefOr[decimal] = js.undefined,
    score: Quantity = null,
    standardSequence: CodeableConcept = null,
    start: js.UndefOr[integer] = js.undefined,
    truthFN: js.UndefOr[decimal] = js.undefined,
    truthTP: js.UndefOr[decimal] = js.undefined
  ): SequenceQuality = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (_end != null) __obj.updateDynamic("_end")(_end)
    if (_fScore != null) __obj.updateDynamic("_fScore")(_fScore)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_gtFP != null) __obj.updateDynamic("_gtFP")(_gtFP)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_precision != null) __obj.updateDynamic("_precision")(_precision)
    if (_queryFP != null) __obj.updateDynamic("_queryFP")(_queryFP)
    if (_queryTP != null) __obj.updateDynamic("_queryTP")(_queryTP)
    if (_recall != null) __obj.updateDynamic("_recall")(_recall)
    if (_start != null) __obj.updateDynamic("_start")(_start)
    if (_truthFN != null) __obj.updateDynamic("_truthFN")(_truthFN)
    if (_truthTP != null) __obj.updateDynamic("_truthTP")(_truthTP)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (!js.isUndefined(fScore)) __obj.updateDynamic("fScore")(fScore)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (!js.isUndefined(gtFP)) __obj.updateDynamic("gtFP")(gtFP)
    if (id != null) __obj.updateDynamic("id")(id)
    if (method != null) __obj.updateDynamic("method")(method)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision)
    if (!js.isUndefined(queryFP)) __obj.updateDynamic("queryFP")(queryFP)
    if (!js.isUndefined(queryTP)) __obj.updateDynamic("queryTP")(queryTP)
    if (!js.isUndefined(recall)) __obj.updateDynamic("recall")(recall)
    if (score != null) __obj.updateDynamic("score")(score)
    if (standardSequence != null) __obj.updateDynamic("standardSequence")(standardSequence)
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start)
    if (!js.isUndefined(truthFN)) __obj.updateDynamic("truthFN")(truthFN)
    if (!js.isUndefined(truthTP)) __obj.updateDynamic("truthTP")(truthTP)
    __obj.asInstanceOf[SequenceQuality]
  }
}

