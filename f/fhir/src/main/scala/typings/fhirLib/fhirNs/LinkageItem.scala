package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Item to be linked
  */
trait LinkageItem extends BackboneElement {
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Resource being linked
    */
  var resource: Reference
  /**
    * source | alternate | historical
    */
  var `type`: code
}

