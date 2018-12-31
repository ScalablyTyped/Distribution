package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An entity used in this activity
  */
trait ProvenanceEntity extends BackboneElement {
  /**
    * Contains extended information for property 'role'.
    */
  var _role: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'whatUri'.
    */
  var _whatUri: js.UndefOr[Element] = js.undefined
  /**
    * Entity is attributed to this agent
    */
  var agent: js.UndefOr[js.Array[ProvenanceAgent]] = js.undefined
  /**
    * derivation | revision | quotation | source | removal
    */
  var role: code
  /**
    * Identity of entity
    */
  var whatIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Identity of entity
    */
  var whatReference: js.UndefOr[Reference] = js.undefined
  /**
    * Identity of entity
    */
  var whatUri: js.UndefOr[uri] = js.undefined
}

