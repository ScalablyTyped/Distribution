package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Select codes/concepts by their properties (including relationships)
  */
trait ValueSetComposeIncludeFilter extends BackboneElement {
  /**
    * Contains extended information for property 'op'.
    */
  var _op: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'property'.
    */
  var _property: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  /**
    * = | is-a | descendent-of | is-not-a | regex | in | not-in | generalizes | exists
    */
  var op: code
  /**
    * A property defined by the code system
    */
  var property: code
  /**
    * Code from the system, or regex criteria, or boolean value for exists
    */
  var value: code
}

