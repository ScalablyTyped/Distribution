package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Responsible for the account
     */

trait AccountGuarantor extends BackboneElement {
  /**
           * Contains extended information for property 'onHold'.
           */
  var _onHold: js.UndefOr[Element] = js.undefined
  /**
           * Credit or other hold applied
           */
  var onHold: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Responsible entity
           */
  var party: Reference
  /**
           * Guarrantee account during
           */
  var period: js.UndefOr[Period] = js.undefined
}

