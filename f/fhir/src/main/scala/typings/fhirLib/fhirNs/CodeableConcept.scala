package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Concept - reference to a terminology or just  text
  */
trait CodeableConcept extends Element {
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  /**
    * Code defined by a terminology system
    */
  var coding: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Plain text representation of the concept
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

