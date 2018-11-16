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

