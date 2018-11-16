package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * An instance of a medical-related component of a medical device
     */

trait DeviceComponent extends DomainResource {
  /**
           * Contains extended information for property 'lastSystemChange'.
           */
  var _lastSystemChange: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'measurementPrinciple'.
           */
  var _measurementPrinciple: js.UndefOr[Element] = js.undefined
  /**
           * Instance id assigned by the software stack
           */
  var identifier: Identifier
  /**
           * Language code for the human-readable text strings produced by the device
           */
  var languageCode: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Recent system change timestamp
           */
  var lastSystemChange: js.UndefOr[instant] = js.undefined
  /**
           * other | chemical | electrical | impedance | nuclear | optical | thermal | biological | mechanical | acoustical | manual+
           */
  var measurementPrinciple: js.UndefOr[code] = js.undefined
  /**
           * Current operational status of the component, for example On, Off or Standby
           */
  var operationalStatus: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Current supported parameter group
           */
  var parameterGroup: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Parent resource link
           */
  var parent: js.UndefOr[Reference] = js.undefined
  /**
           * Specification details such as Component Revisions, or Serial Numbers
           */
  var productionSpecification: js.UndefOr[js.Array[DeviceComponentProductionSpecification]] = js.undefined
  /**
           * Top-level device resource link
           */
  var source: js.UndefOr[Reference] = js.undefined
  /**
           * What kind of component it is
           */
  var `type`: CodeableConcept
}

