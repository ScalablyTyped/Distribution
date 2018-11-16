package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Key information to flag to healthcare providers
     */

trait Flag extends DomainResource {
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Flag creator
           */
  var author: js.UndefOr[Reference] = js.undefined
  /**
           * Clinical, administrative, etc.
           */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Coded or textual message to display to user
           */
  var code: CodeableConcept
  /**
           * Alert relevant during encounter
           */
  var encounter: js.UndefOr[Reference] = js.undefined
  /**
           * Business identifier
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Time period when flag is active
           */
  var period: js.UndefOr[Period] = js.undefined
  /**
           * active | inactive | entered-in-error
           */
  var status: code
  /**
           * Who/What is flag about?
           */
  var subject: Reference
}

