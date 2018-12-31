package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Relationships to other documents
  */
trait DocumentReferenceRelatesTo extends BackboneElement {
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
  var target: Reference
}

