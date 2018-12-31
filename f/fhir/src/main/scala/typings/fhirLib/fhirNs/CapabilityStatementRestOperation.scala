package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of an operation or a custom query
  */
trait CapabilityStatementRestOperation extends BackboneElement {
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * The defined operation/query
    */
  var definition: Reference
  /**
    * Name by which the operation/query is invoked
    */
  var name: java.lang.String
}

