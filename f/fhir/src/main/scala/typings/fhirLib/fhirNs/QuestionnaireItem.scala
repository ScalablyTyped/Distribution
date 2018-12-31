package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Questions and sections within the Questionnaire
  */
trait QuestionnaireItem extends BackboneElement {
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'initialBoolean'.
    */
  var _initialBoolean: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'initialDate'.
    */
  var _initialDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'initialDateTime'.
    */
  var _initialDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'initialDecimal'.
    */
  var _initialDecimal: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'initialInteger'.
    */
  var _initialInteger: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'initialString'.
    */
  var _initialString: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'initialTime'.
    */
  var _initialTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'initialUri'.
    */
  var _initialUri: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'linkId'.
    */
  var _linkId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'maxLength'.
    */
  var _maxLength: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'prefix'.
    */
  var _prefix: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'readOnly'.
    */
  var _readOnly: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'repeats'.
    */
  var _repeats: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'required'.
    */
  var _required: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Corresponding concept for this item in a terminology
    */
  var code: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * ElementDefinition - details for the item
    */
  var definition: js.UndefOr[uri] = js.undefined
  /**
    * Only allow data when
    */
  var enableWhen: js.UndefOr[js.Array[QuestionnaireItemEnableWhen]] = js.undefined
  /**
    * Default value when item is first rendered
    */
  var initialAttachment: js.UndefOr[Attachment] = js.undefined
  /**
    * Default value when item is first rendered
    */
  var initialBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default value when item is first rendered
    */
  var initialCoding: js.UndefOr[Coding] = js.undefined
  /**
    * Default value when item is first rendered
    */
  var initialDate: js.UndefOr[date] = js.undefined
  /**
    * Default value when item is first rendered
    */
  var initialDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Default value when item is first rendered
    */
  var initialDecimal: js.UndefOr[decimal] = js.undefined
  /**
    * Default value when item is first rendered
    */
  var initialInteger: js.UndefOr[integer] = js.undefined
  /**
    * Default value when item is first rendered
    */
  var initialQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Default value when item is first rendered
    */
  var initialReference: js.UndefOr[Reference] = js.undefined
  /**
    * Default value when item is first rendered
    */
  var initialString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default value when item is first rendered
    */
  var initialTime: js.UndefOr[time] = js.undefined
  /**
    * Default value when item is first rendered
    */
  var initialUri: js.UndefOr[uri] = js.undefined
  /**
    * Nested questionnaire items
    */
  var item: js.UndefOr[js.Array[QuestionnaireItem]] = js.undefined
  /**
    * Unique id for item in questionnaire
    */
  var linkId: java.lang.String
  /**
    * No more than this many characters
    */
  var maxLength: js.UndefOr[integer] = js.undefined
  /**
    * Permitted answer
    */
  var option: js.UndefOr[js.Array[QuestionnaireItemOption]] = js.undefined
  /**
    * Valueset containing permitted answers
    */
  var options: js.UndefOr[Reference] = js.undefined
  /**
    * E.g. "1(a)", "2.5.3"
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Don't allow human editing
    */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the item may repeat
    */
  var repeats: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the item must be included in data results
    */
  var required: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Primary text for the item
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * group | display | boolean | decimal | integer | date | dateTime +
    */
  var `type`: code
}

