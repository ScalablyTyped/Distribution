package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Processing notes
     */

trait ExplanationOfBenefitProcessNote extends BackboneElement {
  /**
           * Contains extended information for property 'number'.
           */
  var _number: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'text'.
           */
  var _text: js.UndefOr[Element] = js.undefined
  /**
           * Language if different from the resource
           */
  var language: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Sequence number for this note
           */
  var number: js.UndefOr[positiveInt] = js.undefined
  /**
           * Note explanitory text
           */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
           * display | print | printoper
           */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

