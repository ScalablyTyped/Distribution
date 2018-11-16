package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Condition that the related person had
     */

trait FamilyMemberHistoryCondition extends BackboneElement {
  /**
           * Contains extended information for property 'onsetString'.
           */
  var _onsetString: js.UndefOr[Element] = js.undefined
  /**
           * Condition suffered by relation
           */
  var code: CodeableConcept
  /**
           * Extra information about condition
           */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
           * When condition first manifested
           */
  var onsetAge: js.UndefOr[Age] = js.undefined
  /**
           * When condition first manifested
           */
  var onsetPeriod: js.UndefOr[Period] = js.undefined
  /**
           * When condition first manifested
           */
  var onsetRange: js.UndefOr[Range] = js.undefined
  /**
           * When condition first manifested
           */
  var onsetString: js.UndefOr[java.lang.String] = js.undefined
  /**
           * deceased | permanent disability | etc.
           */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
}

