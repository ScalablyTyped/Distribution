package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Link to a resource that concerns the same actual person
  */
trait PersonLink extends BackboneElement {
  /**
    * Contains extended information for property 'assurance'.
    */
  var _assurance: js.UndefOr[Element] = js.undefined
  /**
    * level1 | level2 | level3 | level4
    */
  var assurance: js.UndefOr[code] = js.undefined
  /**
    * The resource to which this actual person is associated
    */
  var target: Reference
}

