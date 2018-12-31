package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Concepts in the code system
  */
trait CodeSystemConcept extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  /**
    * Code that identifies concept
    */
  var code: code
  /**
    * Child Concepts (is-a/contains/categorizes)
    */
  var concept: js.UndefOr[js.Array[CodeSystemConcept]] = js.undefined
  /**
    * Formal definition
    */
  var definition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Additional representations for the concept
    */
  var designation: js.UndefOr[js.Array[CodeSystemConceptDesignation]] = js.undefined
  /**
    * Text to display to the user
    */
  var display: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Property value for the concept
    */
  var property: js.UndefOr[js.Array[CodeSystemConceptProperty]] = js.undefined
}

