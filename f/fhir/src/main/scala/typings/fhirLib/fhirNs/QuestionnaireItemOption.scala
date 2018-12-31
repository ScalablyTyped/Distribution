package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permitted answer
  */
trait QuestionnaireItemOption extends BackboneElement {
  /**
    * Contains extended information for property 'valueDate'.
    */
  var _valueDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueTime'.
    */
  var _valueTime: js.UndefOr[Element] = js.undefined
  /**
    * Answer value
    */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  /**
    * Answer value
    */
  var valueDate: js.UndefOr[date] = js.undefined
  /**
    * Answer value
    */
  var valueInteger: js.UndefOr[integer] = js.undefined
  /**
    * Answer value
    */
  var valueString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Answer value
    */
  var valueTime: js.UndefOr[time] = js.undefined
}

