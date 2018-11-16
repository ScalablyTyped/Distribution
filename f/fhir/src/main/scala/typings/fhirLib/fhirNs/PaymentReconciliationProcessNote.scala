package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Processing comments
     */

trait PaymentReconciliationProcessNote extends BackboneElement {
  /**
           * Contains extended information for property 'text'.
           */
  var _text: js.UndefOr[Element] = js.undefined
  /**
           * Comment on the processing
           */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
           * display | print | printoper
           */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

