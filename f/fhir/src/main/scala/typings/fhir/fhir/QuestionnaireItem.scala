package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Questions and sections within the Questionnaire
  */
trait QuestionnaireItem
  extends StObject
     with BackboneElement {
  
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
  
  inline def apply(linkId: String, `type`: code): QuestionnaireItem = {
    val __obj = js.Dynamic.literal(linkId = linkId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireItem]
  }
  
  extension [Self <: QuestionnaireItem](x: Self) {
    
    inline def setCode(value: js.Array[Coding]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: Coding*): Self = StObject.set(x, "code", js.Array(value :_*))
    
    inline def setDefinition(value: uri): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setEnableWhen(value: js.Array[QuestionnaireItemEnableWhen]): Self = StObject.set(x, "enableWhen", value.asInstanceOf[js.Any])
    
    inline def setEnableWhenUndefined: Self = StObject.set(x, "enableWhen", js.undefined)
    
    inline def setEnableWhenVarargs(value: QuestionnaireItemEnableWhen*): Self = StObject.set(x, "enableWhen", js.Array(value :_*))
    
    inline def setInitialAttachment(value: Attachment): Self = StObject.set(x, "initialAttachment", value.asInstanceOf[js.Any])
    
    inline def setInitialAttachmentUndefined: Self = StObject.set(x, "initialAttachment", js.undefined)
    
    inline def setInitialBoolean(value: Boolean): Self = StObject.set(x, "initialBoolean", value.asInstanceOf[js.Any])
    
    inline def setInitialBooleanUndefined: Self = StObject.set(x, "initialBoolean", js.undefined)
    
    inline def setInitialCoding(value: Coding): Self = StObject.set(x, "initialCoding", value.asInstanceOf[js.Any])
    
    inline def setInitialCodingUndefined: Self = StObject.set(x, "initialCoding", js.undefined)
    
    inline def setInitialDate(value: date): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
    
    inline def setInitialDateTime(value: dateTime): Self = StObject.set(x, "initialDateTime", value.asInstanceOf[js.Any])
    
    inline def setInitialDateTimeUndefined: Self = StObject.set(x, "initialDateTime", js.undefined)
    
    inline def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
    
    inline def setInitialDecimal(value: decimal): Self = StObject.set(x, "initialDecimal", value.asInstanceOf[js.Any])
    
    inline def setInitialDecimalUndefined: Self = StObject.set(x, "initialDecimal", js.undefined)
    
    inline def setInitialInteger(value: integer): Self = StObject.set(x, "initialInteger", value.asInstanceOf[js.Any])
    
    inline def setInitialIntegerUndefined: Self = StObject.set(x, "initialInteger", js.undefined)
    
    inline def setInitialQuantity(value: Quantity): Self = StObject.set(x, "initialQuantity", value.asInstanceOf[js.Any])
    
    inline def setInitialQuantityUndefined: Self = StObject.set(x, "initialQuantity", js.undefined)
    
    inline def setInitialReference(value: Reference): Self = StObject.set(x, "initialReference", value.asInstanceOf[js.Any])
    
    inline def setInitialReferenceUndefined: Self = StObject.set(x, "initialReference", js.undefined)
    
    inline def setInitialString(value: String): Self = StObject.set(x, "initialString", value.asInstanceOf[js.Any])
    
    inline def setInitialStringUndefined: Self = StObject.set(x, "initialString", js.undefined)
    
    inline def setInitialTime(value: time): Self = StObject.set(x, "initialTime", value.asInstanceOf[js.Any])
    
    inline def setInitialTimeUndefined: Self = StObject.set(x, "initialTime", js.undefined)
    
    inline def setInitialUri(value: uri): Self = StObject.set(x, "initialUri", value.asInstanceOf[js.Any])
    
    inline def setInitialUriUndefined: Self = StObject.set(x, "initialUri", js.undefined)
    
    inline def setItem(value: js.Array[QuestionnaireItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: QuestionnaireItem*): Self = StObject.set(x, "item", js.Array(value :_*))
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: integer): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setOption(value: js.Array[QuestionnaireItemOption]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    inline def setOptionVarargs(value: QuestionnaireItemOption*): Self = StObject.set(x, "option", js.Array(value :_*))
    
    inline def setOptions(value: Reference): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRepeats(value: Boolean): Self = StObject.set(x, "repeats", value.asInstanceOf[js.Any])
    
    inline def setRepeatsUndefined: Self = StObject.set(x, "repeats", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_definition(value: Element): Self = StObject.set(x, "_definition", value.asInstanceOf[js.Any])
    
    inline def set_definitionUndefined: Self = StObject.set(x, "_definition", js.undefined)
    
    inline def set_initialBoolean(value: Element): Self = StObject.set(x, "_initialBoolean", value.asInstanceOf[js.Any])
    
    inline def set_initialBooleanUndefined: Self = StObject.set(x, "_initialBoolean", js.undefined)
    
    inline def set_initialDate(value: Element): Self = StObject.set(x, "_initialDate", value.asInstanceOf[js.Any])
    
    inline def set_initialDateTime(value: Element): Self = StObject.set(x, "_initialDateTime", value.asInstanceOf[js.Any])
    
    inline def set_initialDateTimeUndefined: Self = StObject.set(x, "_initialDateTime", js.undefined)
    
    inline def set_initialDateUndefined: Self = StObject.set(x, "_initialDate", js.undefined)
    
    inline def set_initialDecimal(value: Element): Self = StObject.set(x, "_initialDecimal", value.asInstanceOf[js.Any])
    
    inline def set_initialDecimalUndefined: Self = StObject.set(x, "_initialDecimal", js.undefined)
    
    inline def set_initialInteger(value: Element): Self = StObject.set(x, "_initialInteger", value.asInstanceOf[js.Any])
    
    inline def set_initialIntegerUndefined: Self = StObject.set(x, "_initialInteger", js.undefined)
    
    inline def set_initialString(value: Element): Self = StObject.set(x, "_initialString", value.asInstanceOf[js.Any])
    
    inline def set_initialStringUndefined: Self = StObject.set(x, "_initialString", js.undefined)
    
    inline def set_initialTime(value: Element): Self = StObject.set(x, "_initialTime", value.asInstanceOf[js.Any])
    
    inline def set_initialTimeUndefined: Self = StObject.set(x, "_initialTime", js.undefined)
    
    inline def set_initialUri(value: Element): Self = StObject.set(x, "_initialUri", value.asInstanceOf[js.Any])
    
    inline def set_initialUriUndefined: Self = StObject.set(x, "_initialUri", js.undefined)
    
    inline def set_linkId(value: Element): Self = StObject.set(x, "_linkId", value.asInstanceOf[js.Any])
    
    inline def set_linkIdUndefined: Self = StObject.set(x, "_linkId", js.undefined)
    
    inline def set_maxLength(value: Element): Self = StObject.set(x, "_maxLength", value.asInstanceOf[js.Any])
    
    inline def set_maxLengthUndefined: Self = StObject.set(x, "_maxLength", js.undefined)
    
    inline def set_prefix(value: Element): Self = StObject.set(x, "_prefix", value.asInstanceOf[js.Any])
    
    inline def set_prefixUndefined: Self = StObject.set(x, "_prefix", js.undefined)
    
    inline def set_readOnly(value: Element): Self = StObject.set(x, "_readOnly", value.asInstanceOf[js.Any])
    
    inline def set_readOnlyUndefined: Self = StObject.set(x, "_readOnly", js.undefined)
    
    inline def set_repeats(value: Element): Self = StObject.set(x, "_repeats", value.asInstanceOf[js.Any])
    
    inline def set_repeatsUndefined: Self = StObject.set(x, "_repeats", js.undefined)
    
    inline def set_required(value: Element): Self = StObject.set(x, "_required", value.asInstanceOf[js.Any])
    
    inline def set_requiredUndefined: Self = StObject.set(x, "_required", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
