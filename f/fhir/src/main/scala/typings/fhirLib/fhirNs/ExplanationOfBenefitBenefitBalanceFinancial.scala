package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Benefit Summary
     */

trait ExplanationOfBenefitBenefitBalanceFinancial extends BackboneElement {
  /**
           * Contains extended information for property 'allowedString'.
           */
  var _allowedString: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'allowedUnsignedInt'.
           */
  var _allowedUnsignedInt: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'usedUnsignedInt'.
           */
  var _usedUnsignedInt: js.UndefOr[Element] = js.undefined
  /**
           * Benefits allowed
           */
  var allowedMoney: js.UndefOr[Money] = js.undefined
  /**
           * Benefits allowed
           */
  var allowedString: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Benefits allowed
           */
  var allowedUnsignedInt: js.UndefOr[unsignedInt] = js.undefined
  /**
           * Deductable, visits, benefit amount
           */
  var `type`: CodeableConcept
  /**
           * Benefits used
           */
  var usedMoney: js.UndefOr[Money] = js.undefined
  /**
           * Benefits used
           */
  var usedUnsignedInt: js.UndefOr[unsignedInt] = js.undefined
}

