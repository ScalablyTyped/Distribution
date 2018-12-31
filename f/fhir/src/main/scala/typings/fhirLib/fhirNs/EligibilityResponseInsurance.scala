package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details by insurance coverage
  */
trait EligibilityResponseInsurance extends BackboneElement {
  /**
    * Benefits by Category
    */
  var benefitBalance: js.UndefOr[js.Array[EligibilityResponseInsuranceBenefitBalance]] = js.undefined
  /**
    * Contract details
    */
  var contract: js.UndefOr[Reference] = js.undefined
  /**
    * Updated Coverage details
    */
  var coverage: js.UndefOr[Reference] = js.undefined
}

