package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Questions and sections within the Questionnaire
  */
@js.native
trait QuestionnaireItem extends BackboneElement {
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'initialBoolean'.
    */
  var _initialBoolean: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'initialDate'.
    */
  var _initialDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'initialDateTime'.
    */
  var _initialDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'initialDecimal'.
    */
  var _initialDecimal: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'initialInteger'.
    */
  var _initialInteger: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'initialString'.
    */
  var _initialString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'initialTime'.
    */
  var _initialTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'initialUri'.
    */
  var _initialUri: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'linkId'.
    */
  var _linkId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'maxLength'.
    */
  var _maxLength: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'prefix'.
    */
  var _prefix: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'readOnly'.
    */
  var _readOnly: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'repeats'.
    */
  var _repeats: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'required'.
    */
  var _required: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Corresponding concept for this item in a terminology
    */
  var code: js.UndefOr[js.Array[Coding]] = js.native
  /**
    * ElementDefinition - details for the item
    */
  var definition: js.UndefOr[uri] = js.native
  /**
    * Only allow data when
    */
  var enableWhen: js.UndefOr[js.Array[QuestionnaireItemEnableWhen]] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialBoolean: js.UndefOr[Boolean] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialCoding: js.UndefOr[Coding] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialDate: js.UndefOr[date] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialDecimal: js.UndefOr[decimal] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialInteger: js.UndefOr[integer] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialReference: js.UndefOr[Reference] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialString: js.UndefOr[String] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialTime: js.UndefOr[time] = js.native
  /**
    * Default value when item is first rendered
    */
  var initialUri: js.UndefOr[uri] = js.native
  /**
    * Nested questionnaire items
    */
  var item: js.UndefOr[js.Array[QuestionnaireItem]] = js.native
  /**
    * Unique id for item in questionnaire
    */
  var linkId: String = js.native
  /**
    * No more than this many characters
    */
  var maxLength: js.UndefOr[integer] = js.native
  /**
    * Permitted answer
    */
  var option: js.UndefOr[js.Array[QuestionnaireItemOption]] = js.native
  /**
    * Valueset containing permitted answers
    */
  var options: js.UndefOr[Reference] = js.native
  /**
    * E.g. "1(a)", "2.5.3"
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Don't allow human editing
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /**
    * Whether the item may repeat
    */
  var repeats: js.UndefOr[Boolean] = js.native
  /**
    * Whether the item must be included in data results
    */
  var required: js.UndefOr[Boolean] = js.native
  /**
    * Primary text for the item
    */
  var text: js.UndefOr[String] = js.native
  /**
    * group | display | boolean | decimal | integer | date | dateTime +
    */
  var `type`: code = js.native
}

object QuestionnaireItem {
  @scala.inline
  def apply(linkId: String, `type`: code): QuestionnaireItem = {
    val __obj = js.Dynamic.literal(linkId = linkId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireItem]
  }
  @scala.inline
  implicit class QuestionnaireItemOps[Self <: QuestionnaireItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLinkId(value: String): Self = this.set("linkId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def set_definition(value: Element): Self = this.set("_definition", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_definition: Self = this.set("_definition", js.undefined)
    @scala.inline
    def set_initialBoolean(value: Element): Self = this.set("_initialBoolean", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_initialBoolean: Self = this.set("_initialBoolean", js.undefined)
    @scala.inline
    def set_initialDate(value: Element): Self = this.set("_initialDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_initialDate: Self = this.set("_initialDate", js.undefined)
    @scala.inline
    def set_initialDateTime(value: Element): Self = this.set("_initialDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_initialDateTime: Self = this.set("_initialDateTime", js.undefined)
    @scala.inline
    def set_initialDecimal(value: Element): Self = this.set("_initialDecimal", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_initialDecimal: Self = this.set("_initialDecimal", js.undefined)
    @scala.inline
    def set_initialInteger(value: Element): Self = this.set("_initialInteger", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_initialInteger: Self = this.set("_initialInteger", js.undefined)
    @scala.inline
    def set_initialString(value: Element): Self = this.set("_initialString", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_initialString: Self = this.set("_initialString", js.undefined)
    @scala.inline
    def set_initialTime(value: Element): Self = this.set("_initialTime", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_initialTime: Self = this.set("_initialTime", js.undefined)
    @scala.inline
    def set_initialUri(value: Element): Self = this.set("_initialUri", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_initialUri: Self = this.set("_initialUri", js.undefined)
    @scala.inline
    def set_linkId(value: Element): Self = this.set("_linkId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_linkId: Self = this.set("_linkId", js.undefined)
    @scala.inline
    def set_maxLength(value: Element): Self = this.set("_maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_maxLength: Self = this.set("_maxLength", js.undefined)
    @scala.inline
    def set_prefix(value: Element): Self = this.set("_prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_prefix: Self = this.set("_prefix", js.undefined)
    @scala.inline
    def set_readOnly(value: Element): Self = this.set("_readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_readOnly: Self = this.set("_readOnly", js.undefined)
    @scala.inline
    def set_repeats(value: Element): Self = this.set("_repeats", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_repeats: Self = this.set("_repeats", js.undefined)
    @scala.inline
    def set_required(value: Element): Self = this.set("_required", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_required: Self = this.set("_required", js.undefined)
    @scala.inline
    def set_text(value: Element): Self = this.set("_text", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_text: Self = this.set("_text", js.undefined)
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    @scala.inline
    def setCodeVarargs(value: Coding*): Self = this.set("code", js.Array(value :_*))
    @scala.inline
    def setCode(value: js.Array[Coding]): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setDefinition(value: uri): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    @scala.inline
    def setEnableWhenVarargs(value: QuestionnaireItemEnableWhen*): Self = this.set("enableWhen", js.Array(value :_*))
    @scala.inline
    def setEnableWhen(value: js.Array[QuestionnaireItemEnableWhen]): Self = this.set("enableWhen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableWhen: Self = this.set("enableWhen", js.undefined)
    @scala.inline
    def setInitialAttachment(value: Attachment): Self = this.set("initialAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialAttachment: Self = this.set("initialAttachment", js.undefined)
    @scala.inline
    def setInitialBoolean(value: Boolean): Self = this.set("initialBoolean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialBoolean: Self = this.set("initialBoolean", js.undefined)
    @scala.inline
    def setInitialCoding(value: Coding): Self = this.set("initialCoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialCoding: Self = this.set("initialCoding", js.undefined)
    @scala.inline
    def setInitialDate(value: date): Self = this.set("initialDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialDate: Self = this.set("initialDate", js.undefined)
    @scala.inline
    def setInitialDateTime(value: dateTime): Self = this.set("initialDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialDateTime: Self = this.set("initialDateTime", js.undefined)
    @scala.inline
    def setInitialDecimal(value: decimal): Self = this.set("initialDecimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialDecimal: Self = this.set("initialDecimal", js.undefined)
    @scala.inline
    def setInitialInteger(value: integer): Self = this.set("initialInteger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialInteger: Self = this.set("initialInteger", js.undefined)
    @scala.inline
    def setInitialQuantity(value: Quantity): Self = this.set("initialQuantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialQuantity: Self = this.set("initialQuantity", js.undefined)
    @scala.inline
    def setInitialReference(value: Reference): Self = this.set("initialReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialReference: Self = this.set("initialReference", js.undefined)
    @scala.inline
    def setInitialString(value: String): Self = this.set("initialString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialString: Self = this.set("initialString", js.undefined)
    @scala.inline
    def setInitialTime(value: time): Self = this.set("initialTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialTime: Self = this.set("initialTime", js.undefined)
    @scala.inline
    def setInitialUri(value: uri): Self = this.set("initialUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialUri: Self = this.set("initialUri", js.undefined)
    @scala.inline
    def setItemVarargs(value: QuestionnaireItem*): Self = this.set("item", js.Array(value :_*))
    @scala.inline
    def setItem(value: js.Array[QuestionnaireItem]): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setMaxLength(value: integer): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setOptionVarargs(value: QuestionnaireItemOption*): Self = this.set("option", js.Array(value :_*))
    @scala.inline
    def setOption(value: js.Array[QuestionnaireItemOption]): Self = this.set("option", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOption: Self = this.set("option", js.undefined)
    @scala.inline
    def setOptions(value: Reference): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRepeats(value: Boolean): Self = this.set("repeats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeats: Self = this.set("repeats", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

