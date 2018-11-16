package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Additional rule -  addition or removal of permissions
     */

trait ConsentExcept extends BackboneElement {
  /**
           * Contains extended information for property 'type'.
           */
  var _type: js.UndefOr[Element] = js.undefined
  /**
           * Actions controlled by this exception
           */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Who|what controlled by this exception (or group, by role)
           */
  var actor: js.UndefOr[js.Array[ConsentExceptActor]] = js.undefined
  /**
           * e.g. Resource Type, Profile, or CDA etc
           */
  var `class`: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
           * e.g. LOINC or SNOMED CT code, etc in the content
           */
  var code: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
           * Data controlled by this exception
           */
  var data: js.UndefOr[js.Array[ConsentExceptData]] = js.undefined
  /**
           * Timeframe for data controlled by this exception
           */
  var dataPeriod: js.UndefOr[Period] = js.undefined
  /**
           * Timeframe for this exception
           */
  var period: js.UndefOr[Period] = js.undefined
  /**
           * Context of activities covered by this exception
           */
  var purpose: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
           * Security Labels that define affected resources
           */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
           * deny | permit
           */
  var `type`: code
}

