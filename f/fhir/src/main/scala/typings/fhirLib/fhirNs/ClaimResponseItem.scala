package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Line items
     */

trait ClaimResponseItem extends BackboneElement {
  /**
           * Contains extended information for property 'noteNumber'.
           */
  var _noteNumber: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'sequenceLinkId'.
           */
  var _sequenceLinkId: js.UndefOr[Element] = js.undefined
  /**
           * Adjudication details
           */
  var adjudication: js.UndefOr[js.Array[ClaimResponseItemAdjudication]] = js.undefined
  /**
           * Detail line items
           */
  var detail: js.UndefOr[js.Array[ClaimResponseItemDetail]] = js.undefined
  /**
           * List of note numbers which apply
           */
  var noteNumber: js.UndefOr[js.Array[positiveInt]] = js.undefined
  /**
           * Service instance
           */
  var sequenceLinkId: positiveInt
}

