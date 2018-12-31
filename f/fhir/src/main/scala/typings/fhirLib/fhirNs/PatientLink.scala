package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Link to another patient resource that concerns the same actual person
  */
trait PatientLink extends BackboneElement {
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * The other patient or related person resource that the link refers to
    */
  var other: Reference
  /**
    * replaced-by | replaces | refer | seealso - type of link
    */
  var `type`: code
}

