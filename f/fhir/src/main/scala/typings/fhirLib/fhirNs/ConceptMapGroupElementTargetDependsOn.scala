package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Other elements required for this mapping (from context)
  */
trait ConceptMapGroupElementTargetDependsOn extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'property'.
    */
  var _property: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  /**
    * Value of the referenced element
    */
  var code: java.lang.String
  /**
    * Display for the code
    */
  var display: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Reference to property mapping depends on
    */
  var property: uri
  /**
    * Code System (if necessary)
    */
  var system: js.UndefOr[uri] = js.undefined
}

