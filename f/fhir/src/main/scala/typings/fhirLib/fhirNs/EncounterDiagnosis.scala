package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The list of diagnosis relevant to this encounter
  */
trait EncounterDiagnosis extends BackboneElement {
  /**
    * Contains extended information for property 'rank'.
    */
  var _rank: js.UndefOr[Element] = js.undefined
  /**
    * Reason the encounter takes place (resource)
    */
  var condition: Reference
  /**
    * Ranking of the diagnosis (for each role type)
    */
  var rank: js.UndefOr[positiveInt] = js.undefined
  /**
    * Role that this diagnosis has within the encounter (e.g. admission, billing, discharge …)
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}

