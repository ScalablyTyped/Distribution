package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A concept defined in the system
  */
trait ValueSetComposeIncludeConcept extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  /**
    * Code or expression from system
    */
  var code: code
  /**
    * Additional representations for this concept
    */
  var designation: js.UndefOr[js.Array[ValueSetComposeIncludeConceptDesignation]] = js.undefined
  /**
    * Text to display for this code for this value set in this valueset
    */
  var display: js.UndefOr[java.lang.String] = js.undefined
}

