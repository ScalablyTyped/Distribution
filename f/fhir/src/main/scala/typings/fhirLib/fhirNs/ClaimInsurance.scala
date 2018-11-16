package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Insurance or medical plan
     */

trait ClaimInsurance extends BackboneElement {
  /**
           * Contains extended information for property 'businessArrangement'.
           */
  var _businessArrangement: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'focal'.
           */
  var _focal: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'preAuthRef'.
           */
  var _preAuthRef: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'sequence'.
           */
  var _sequence: js.UndefOr[Element] = js.undefined
  /**
           * Business agreement
           */
  var businessArrangement: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Adjudication results
           */
  var claimResponse: js.UndefOr[Reference] = js.undefined
  /**
           * Insurance information
           */
  var coverage: Reference
  /**
           * Is the focal Coverage
           */
  var focal: scala.Boolean
  /**
           * Pre-Authorization/Determination Reference
           */
  var preAuthRef: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Service instance identifier
           */
  var sequence: positiveInt
}

