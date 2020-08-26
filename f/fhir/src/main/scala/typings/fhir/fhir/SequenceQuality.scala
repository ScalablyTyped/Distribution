package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An set of value as quality of sequence
  */
@js.native
trait SequenceQuality extends BackboneElement {
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'fScore'.
    */
  var _fScore: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'gtFP'.
    */
  var _gtFP: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'precision'.
    */
  var _precision: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'queryFP'.
    */
  var _queryFP: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'queryTP'.
    */
  var _queryTP: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'recall'.
    */
  var _recall: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'start'.
    */
  var _start: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'truthFN'.
    */
  var _truthFN: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'truthTP'.
    */
  var _truthTP: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * End position of the sequence
    */
  var end: js.UndefOr[integer] = js.native
  /**
    * F-score
    */
  var fScore: js.UndefOr[decimal] = js.native
  /**
    * False positives where the non-REF alleles in the Truth and Query Call Sets match
    */
  var gtFP: js.UndefOr[decimal] = js.native
  /**
    * Method to get quality
    */
  var method: js.UndefOr[CodeableConcept] = js.native
  /**
    * Precision of comparison
    */
  var precision: js.UndefOr[decimal] = js.native
  /**
    * False positives
    */
  var queryFP: js.UndefOr[decimal] = js.native
  /**
    * True positives from the perspective of the query data
    */
  var queryTP: js.UndefOr[decimal] = js.native
  /**
    * Recall of comparison
    */
  var recall: js.UndefOr[decimal] = js.native
  /**
    * Quality score for the comparison
    */
  var score: js.UndefOr[Quantity] = js.native
  /**
    * Standard sequence for comparison
    */
  var standardSequence: js.UndefOr[CodeableConcept] = js.native
  /**
    * Start position of the sequence
    */
  var start: js.UndefOr[integer] = js.native
  /**
    * False negatives
    */
  var truthFN: js.UndefOr[decimal] = js.native
  /**
    * True positives from the perspective of the truth data
    */
  var truthTP: js.UndefOr[decimal] = js.native
  /**
    * indel | snp | unknown
    */
  var `type`: code = js.native
}

object SequenceQuality {
  @scala.inline
  def apply(`type`: code): SequenceQuality = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceQuality]
  }
  @scala.inline
  implicit class SequenceQualityOps[Self <: SequenceQuality] (val x: Self) extends AnyVal {
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
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def set_end(value: Element): Self = this.set("_end", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_end: Self = this.set("_end", js.undefined)
    @scala.inline
    def set_fScore(value: Element): Self = this.set("_fScore", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_fScore: Self = this.set("_fScore", js.undefined)
    @scala.inline
    def set_gtFP(value: Element): Self = this.set("_gtFP", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_gtFP: Self = this.set("_gtFP", js.undefined)
    @scala.inline
    def set_precision(value: Element): Self = this.set("_precision", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_precision: Self = this.set("_precision", js.undefined)
    @scala.inline
    def set_queryFP(value: Element): Self = this.set("_queryFP", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_queryFP: Self = this.set("_queryFP", js.undefined)
    @scala.inline
    def set_queryTP(value: Element): Self = this.set("_queryTP", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_queryTP: Self = this.set("_queryTP", js.undefined)
    @scala.inline
    def set_recall(value: Element): Self = this.set("_recall", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_recall: Self = this.set("_recall", js.undefined)
    @scala.inline
    def set_start(value: Element): Self = this.set("_start", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_start: Self = this.set("_start", js.undefined)
    @scala.inline
    def set_truthFN(value: Element): Self = this.set("_truthFN", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_truthFN: Self = this.set("_truthFN", js.undefined)
    @scala.inline
    def set_truthTP(value: Element): Self = this.set("_truthTP", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_truthTP: Self = this.set("_truthTP", js.undefined)
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    @scala.inline
    def setEnd(value: integer): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setFScore(value: decimal): Self = this.set("fScore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFScore: Self = this.set("fScore", js.undefined)
    @scala.inline
    def setGtFP(value: decimal): Self = this.set("gtFP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGtFP: Self = this.set("gtFP", js.undefined)
    @scala.inline
    def setMethod(value: CodeableConcept): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setPrecision(value: decimal): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setQueryFP(value: decimal): Self = this.set("queryFP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryFP: Self = this.set("queryFP", js.undefined)
    @scala.inline
    def setQueryTP(value: decimal): Self = this.set("queryTP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryTP: Self = this.set("queryTP", js.undefined)
    @scala.inline
    def setRecall(value: decimal): Self = this.set("recall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecall: Self = this.set("recall", js.undefined)
    @scala.inline
    def setScore(value: Quantity): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
    @scala.inline
    def setStandardSequence(value: CodeableConcept): Self = this.set("standardSequence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardSequence: Self = this.set("standardSequence", js.undefined)
    @scala.inline
    def setStart(value: integer): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setTruthFN(value: decimal): Self = this.set("truthFN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruthFN: Self = this.set("truthFN", js.undefined)
    @scala.inline
    def setTruthTP(value: decimal): Self = this.set("truthTP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruthTP: Self = this.set("truthTP", js.undefined)
  }
  
}

