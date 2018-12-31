package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Who or what is in group
  */
trait GroupMember extends BackboneElement {
  /**
    * Contains extended information for property 'inactive'.
    */
  var _inactive: js.UndefOr[Element] = js.undefined
  /**
    * Reference to the group member
    */
  var entity: Reference
  /**
    * If member is no longer in group
    */
  var inactive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Period member belonged to the group
    */
  var period: js.UndefOr[Period] = js.undefined
}

