package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Insurance or medical plan
     */

trait ExplanationOfBenefitInsurance extends BackboneElement {
  /**
           * Contains extended information for property 'preAuthRef'.
           */
  var _preAuthRef: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Insurance information
           */
  var coverage: js.UndefOr[Reference] = js.undefined
  /**
           * Pre-Authorization/Determination Reference
           */
  var preAuthRef: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

