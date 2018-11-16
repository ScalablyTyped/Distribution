package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * What other data should be reported with the measure
     */

trait MeasureSupplementalData extends BackboneElement {
  /**
           * Contains extended information for property 'criteria'.
           */
  var _criteria: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'path'.
           */
  var _path: js.UndefOr[Element] = js.undefined
  /**
           * Expression describing additional data to be reported
           */
  var criteria: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Identifier, unique within the measure
           */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Path to the supplemental data element
           */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
           * supplemental-data | risk-adjustment-factor
           */
  var usage: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

