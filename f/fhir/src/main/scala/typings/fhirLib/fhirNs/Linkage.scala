package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Links records for 'same' item
  */
trait Linkage extends DomainResource {
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.undefined
  /**
    * Whether this linkage assertion is active or not
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Who is responsible for linkages
    */
  var author: js.UndefOr[Reference] = js.undefined
  /**
    * Item to be linked
    */
  var item: js.Array[LinkageItem]
}

