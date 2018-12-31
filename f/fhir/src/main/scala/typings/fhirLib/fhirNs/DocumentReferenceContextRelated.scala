package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Related identifiers or resources
  */
trait DocumentReferenceContextRelated extends BackboneElement {
  /**
    * Identifier of related objects or events
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Related Resource
    */
  var ref: js.UndefOr[Reference] = js.undefined
}

