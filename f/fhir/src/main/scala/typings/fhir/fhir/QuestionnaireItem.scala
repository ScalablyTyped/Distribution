package typings.fhir.fhir

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
  var initialBoolean: js.UndefOr[Boolean] = js.undefined
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
  var initialString: js.UndefOr[String] = js.undefined
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
  var linkId: String
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
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * Don't allow human editing
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the item may repeat
    */
  var repeats: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the item must be included in data results
    */
  var required: js.UndefOr[Boolean] = js.undefined
  /**
    * Primary text for the item
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * group | display | boolean | decimal | integer | date | dateTime +
    */
  var `type`: code
}

object QuestionnaireItem {
  @scala.inline
  def apply(
    linkId: String,
    `type`: code,
    _definition: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _initialBoolean: Element = null,
    _initialDate: Element = null,
    _initialDateTime: Element = null,
    _initialDecimal: Element = null,
    _initialInteger: Element = null,
    _initialString: Element = null,
    _initialTime: Element = null,
    _initialUri: Element = null,
    _linkId: Element = null,
    _maxLength: Element = null,
    _prefix: Element = null,
    _readOnly: Element = null,
    _repeats: Element = null,
    _required: Element = null,
    _text: Element = null,
    _type: Element = null,
    code: js.Array[Coding] = null,
    definition: uri = null,
    enableWhen: js.Array[QuestionnaireItemEnableWhen] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    initialAttachment: Attachment = null,
    initialBoolean: js.UndefOr[Boolean] = js.undefined,
    initialCoding: Coding = null,
    initialDate: date = null,
    initialDateTime: dateTime = null,
    initialDecimal: js.UndefOr[decimal] = js.undefined,
    initialInteger: js.UndefOr[integer] = js.undefined,
    initialQuantity: Quantity = null,
    initialReference: Reference = null,
    initialString: String = null,
    initialTime: time = null,
    initialUri: uri = null,
    item: js.Array[QuestionnaireItem] = null,
    maxLength: js.UndefOr[integer] = js.undefined,
    modifierExtension: js.Array[Extension] = null,
    option: js.Array[QuestionnaireItemOption] = null,
    options: Reference = null,
    prefix: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    repeats: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    text: String = null
  ): QuestionnaireItem = {
    val __obj = js.Dynamic.literal(linkId = linkId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_definition != null) __obj.updateDynamic("_definition")(_definition.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_initialBoolean != null) __obj.updateDynamic("_initialBoolean")(_initialBoolean.asInstanceOf[js.Any])
    if (_initialDate != null) __obj.updateDynamic("_initialDate")(_initialDate.asInstanceOf[js.Any])
    if (_initialDateTime != null) __obj.updateDynamic("_initialDateTime")(_initialDateTime.asInstanceOf[js.Any])
    if (_initialDecimal != null) __obj.updateDynamic("_initialDecimal")(_initialDecimal.asInstanceOf[js.Any])
    if (_initialInteger != null) __obj.updateDynamic("_initialInteger")(_initialInteger.asInstanceOf[js.Any])
    if (_initialString != null) __obj.updateDynamic("_initialString")(_initialString.asInstanceOf[js.Any])
    if (_initialTime != null) __obj.updateDynamic("_initialTime")(_initialTime.asInstanceOf[js.Any])
    if (_initialUri != null) __obj.updateDynamic("_initialUri")(_initialUri.asInstanceOf[js.Any])
    if (_linkId != null) __obj.updateDynamic("_linkId")(_linkId.asInstanceOf[js.Any])
    if (_maxLength != null) __obj.updateDynamic("_maxLength")(_maxLength.asInstanceOf[js.Any])
    if (_prefix != null) __obj.updateDynamic("_prefix")(_prefix.asInstanceOf[js.Any])
    if (_readOnly != null) __obj.updateDynamic("_readOnly")(_readOnly.asInstanceOf[js.Any])
    if (_repeats != null) __obj.updateDynamic("_repeats")(_repeats.asInstanceOf[js.Any])
    if (_required != null) __obj.updateDynamic("_required")(_required.asInstanceOf[js.Any])
    if (_text != null) __obj.updateDynamic("_text")(_text.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (enableWhen != null) __obj.updateDynamic("enableWhen")(enableWhen.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initialAttachment != null) __obj.updateDynamic("initialAttachment")(initialAttachment.asInstanceOf[js.Any])
    if (!js.isUndefined(initialBoolean)) __obj.updateDynamic("initialBoolean")(initialBoolean.get.asInstanceOf[js.Any])
    if (initialCoding != null) __obj.updateDynamic("initialCoding")(initialCoding.asInstanceOf[js.Any])
    if (initialDate != null) __obj.updateDynamic("initialDate")(initialDate.asInstanceOf[js.Any])
    if (initialDateTime != null) __obj.updateDynamic("initialDateTime")(initialDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(initialDecimal)) __obj.updateDynamic("initialDecimal")(initialDecimal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialInteger)) __obj.updateDynamic("initialInteger")(initialInteger.get.asInstanceOf[js.Any])
    if (initialQuantity != null) __obj.updateDynamic("initialQuantity")(initialQuantity.asInstanceOf[js.Any])
    if (initialReference != null) __obj.updateDynamic("initialReference")(initialReference.asInstanceOf[js.Any])
    if (initialString != null) __obj.updateDynamic("initialString")(initialString.asInstanceOf[js.Any])
    if (initialTime != null) __obj.updateDynamic("initialTime")(initialTime.asInstanceOf[js.Any])
    if (initialUri != null) __obj.updateDynamic("initialUri")(initialUri.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repeats)) __obj.updateDynamic("repeats")(repeats.get.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireItem]
  }
}

