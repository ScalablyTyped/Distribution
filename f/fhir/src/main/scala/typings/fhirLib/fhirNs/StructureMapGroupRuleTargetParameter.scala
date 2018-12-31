package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters to the transform
  */
trait StructureMapGroupRuleTargetParameter extends BackboneElement {
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueDecimal'.
    */
  var _valueDecimal: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueId'.
    */
  var _valueId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.undefined
  /**
    * Parameter value - variable or literal
    */
  var valueBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Parameter value - variable or literal
    */
  var valueDecimal: js.UndefOr[decimal] = js.undefined
  /**
    * Parameter value - variable or literal
    */
  var valueId: js.UndefOr[id] = js.undefined
  /**
    * Parameter value - variable or literal
    */
  var valueInteger: js.UndefOr[integer] = js.undefined
  /**
    * Parameter value - variable or literal
    */
  var valueString: js.UndefOr[java.lang.String] = js.undefined
}

