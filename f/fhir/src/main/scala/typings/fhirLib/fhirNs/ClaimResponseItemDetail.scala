package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Detail line items
     */

trait ClaimResponseItemDetail extends BackboneElement {
  /**
           * Contains extended information for property 'noteNumber'.
           */
  var _noteNumber: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'sequenceLinkId'.
           */
  var _sequenceLinkId: js.UndefOr[Element] = js.undefined
  /**
           * Detail level adjudication details
           */
  var adjudication: js.UndefOr[js.Array[ClaimResponseItemAdjudication]] = js.undefined
  /**
           * List of note numbers which apply
           */
  var noteNumber: js.UndefOr[js.Array[positiveInt]] = js.undefined
  /**
           * Service instance
           */
  var sequenceLinkId: positiveInt
  /**
           * Subdetail line items
           */
  var subDetail: js.UndefOr[js.Array[ClaimResponseItemDetailSubDetail]] = js.undefined
}

