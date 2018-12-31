package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mappings for a concept from the source set
  */
trait ConceptMapGroupElement extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  /**
    * Identifies element being mapped
    */
  var code: js.UndefOr[code] = js.undefined
  /**
    * Display for the code
    */
  var display: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Concept in target system for element
    */
  var target: js.UndefOr[js.Array[ConceptMapGroupElementTarget]] = js.undefined
}

