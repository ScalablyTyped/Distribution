package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Benefits by Category
     */

trait EligibilityResponseInsuranceBenefitBalance extends BackboneElement {
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'excluded'.
           */
  var _excluded: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Type of services covered
           */
  var category: CodeableConcept
  /**
           * Description of the benefit or services covered
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Excluded from the plan
           */
  var excluded: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Benefit Summary
           */
  var financial: js.UndefOr[js.Array[EligibilityResponseInsuranceBenefitBalanceFinancial]] = js.undefined
  /**
           * Short name for the benefit
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * In or out of network
           */
  var network: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Detailed services covered within the type
           */
  var subCategory: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Annual or lifetime
           */
  var term: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Individual or family
           */
  var unit: js.UndefOr[CodeableConcept] = js.undefined
}

