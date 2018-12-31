package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specific and identified anatomical location
  */
trait BodySite extends DomainResource {
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Whether this body site record is in active use
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Named anatomical location
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Anatomical location description
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Bodysite identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Attached images
    */
  var image: js.UndefOr[js.Array[Attachment]] = js.undefined
  /**
    * Who this is about
    */
  var patient: Reference
  /**
    * Modification to location code
    */
  var qualifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

