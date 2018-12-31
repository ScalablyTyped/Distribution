package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Relationships to other compositions/documents
  */
trait CompositionRelatesTo extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * replaces | transforms | signs | appends
    */
  var code: code
  /**
    * Target of the relationship
    */
  var targetIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Target of the relationship
    */
  var targetReference: js.UndefOr[Reference] = js.undefined
}

