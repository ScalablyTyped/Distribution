package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Step taken to address
     */

trait DetectedIssueMitigation extends BackboneElement {
  /**
           * Contains extended information for property 'date'.
           */
  var _date: js.UndefOr[Element] = js.undefined
  /**
           * What mitigation?
           */
  var action: CodeableConcept
  /**
           * Who is committing?
           */
  var author: js.UndefOr[Reference] = js.undefined
  /**
           * Date committed
           */
  var date: js.UndefOr[dateTime] = js.undefined
}

