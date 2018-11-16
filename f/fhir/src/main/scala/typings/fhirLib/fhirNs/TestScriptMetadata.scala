package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Required capability that is assumed to function correctly on the FHIR server being tested
     */

trait TestScriptMetadata extends BackboneElement {
  /**
           * Capabilities  that are assumed to function correctly on the FHIR server being tested
           */
  var capability: js.Array[TestScriptMetadataCapability]
  /**
           * Links to the FHIR specification
           */
  var link: js.UndefOr[js.Array[TestScriptMetadataLink]] = js.undefined
}

