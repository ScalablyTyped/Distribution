package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response(s) to the question
  */
trait QuestionnaireResponseItemAnswer extends BackboneElement {
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueDate'.
    */
  var _valueDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueDecimal'.
    */
  var _valueDecimal: js.UndefOr[Element] = js.undefined
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
    * Contains extended information for property 'valueUri'.
    */
  var _valueUri: js.UndefOr[Element] = js.undefined
  /**
    * Nested groups and questions
    */
  var item: js.UndefOr[js.Array[QuestionnaireResponseItem]] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueDate: js.UndefOr[date] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueDecimal: js.UndefOr[decimal] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueInteger: js.UndefOr[integer] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueReference: js.UndefOr[Reference] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueTime: js.UndefOr[time] = js.undefined
  /**
    * Single-valued answer to the question
    */
  var valueUri: js.UndefOr[uri] = js.undefined
}

