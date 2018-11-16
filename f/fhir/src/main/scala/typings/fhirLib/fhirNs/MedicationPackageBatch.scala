package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Identifies a single production run
     */

trait MedicationPackageBatch extends BackboneElement {
  /**
           * Contains extended information for property 'expirationDate'.
           */
  var _expirationDate: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'lotNumber'.
           */
  var _lotNumber: js.UndefOr[Element] = js.undefined
  /**
           * When batch will expire
           */
  var expirationDate: js.UndefOr[dateTime] = js.undefined
  /**
           * Identifier assigned to batch
           */
  var lotNumber: js.UndefOr[java.lang.String] = js.undefined
}

