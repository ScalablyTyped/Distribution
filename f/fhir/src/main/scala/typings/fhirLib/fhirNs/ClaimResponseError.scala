package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Processing errors
     */

trait ClaimResponseError extends BackboneElement {
  /**
           * Contains extended information for property 'detailSequenceLinkId'.
           */
  var _detailSequenceLinkId: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'sequenceLinkId'.
           */
  var _sequenceLinkId: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'subdetailSequenceLinkId'.
           */
  var _subdetailSequenceLinkId: js.UndefOr[Element] = js.undefined
  /**
           * Error code detailing processing issues
           */
  var code: CodeableConcept
  /**
           * Detail sequence number
           */
  var detailSequenceLinkId: js.UndefOr[positiveInt] = js.undefined
  /**
           * Item sequence number
           */
  var sequenceLinkId: js.UndefOr[positiveInt] = js.undefined
  /**
           * Subdetail sequence number
           */
  var subdetailSequenceLinkId: js.UndefOr[positiveInt] = js.undefined
}

