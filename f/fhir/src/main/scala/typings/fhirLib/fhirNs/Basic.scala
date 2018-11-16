package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Resource for non-supported content
     */

trait Basic extends DomainResource {
  /**
           * Contains extended information for property 'created'.
           */
  var _created: js.UndefOr[Element] = js.undefined
  /**
           * Who created
           */
  var author: js.UndefOr[Reference] = js.undefined
  /**
           * Kind of Resource
           */
  var code: CodeableConcept
  /**
           * When created
           */
  var created: js.UndefOr[date] = js.undefined
  /**
           * Business identifier
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Identifies the focus of this resource
           */
  var subject: js.UndefOr[Reference] = js.undefined
}

