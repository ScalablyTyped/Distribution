package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`open-choice`
import typings.fhir.fhirStrings.attachment
import typings.fhir.fhirStrings.boolean
import typings.fhir.fhirStrings.choice
import typings.fhir.fhirStrings.date
import typings.fhir.fhirStrings.dateTime
import typings.fhir.fhirStrings.decimal
import typings.fhir.fhirStrings.display
import typings.fhir.fhirStrings.group_
import typings.fhir.fhirStrings.integer
import typings.fhir.fhirStrings.quantity_
import typings.fhir.fhirStrings.question
import typings.fhir.fhirStrings.reference
import typings.fhir.fhirStrings.string
import typings.fhir.fhirStrings.text
import typings.fhir.fhirStrings.time
import typings.fhir.fhirStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuestionnaireItem
  extends StObject
     with BackboneElement {
  
  var _definition: js.UndefOr[Element] = js.undefined
  
  var _initialBoolean: js.UndefOr[Element] = js.undefined
  
  var _initialDate: js.UndefOr[Element] = js.undefined
  
  var _initialDateTime: js.UndefOr[Element] = js.undefined
  
  var _initialString: js.UndefOr[Element] = js.undefined
  
  var _initialTime: js.UndefOr[Element] = js.undefined
  
  var _initialUri: js.UndefOr[Element] = js.undefined
  
  var _linkId: js.UndefOr[Element] = js.undefined
  
  var _prefix: js.UndefOr[Element] = js.undefined
  
  var _readOnly: js.UndefOr[Element] = js.undefined
  
  var _repeats: js.UndefOr[Element] = js.undefined
  
  var _required: js.UndefOr[Element] = js.undefined
  
  var _text: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * The value may come from the ElementDefinition referred to by .definition.
    */
  var code: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * the URI refers to an ElementDefinition in either a [StructureDefinition](structuredefinition.html#) or a [DataElement](dataelement.html#), and always starts with the canonical URL for the target resource. When referring to a StructureDefinition, a fragment identifier is used to specify the element definition by its id [Element.id](element-definitions.html#Element.id). E.g. http://hl7.org/fhir/StructureDefinition/Observation#Observation.value[x]. In the absence of a fragment identifier, the first/root element definition in the target is the matching element definition. Note that [LOINC codes](loinc.html#dataelements) implicitly define DataElement resources.
    */
  var definition: js.UndefOr[String] = js.undefined
  
  /**
    * If multiple repetitions of this extension are present, the item should be enabled when the condition for *any* of the repetitions is true.  I.e. treat "enableWhen"s as being joined by an "or" clause.
    * This element is a modifier because if enableWhen is present for an item, "required" is ignored unless one of the enableWhen conditions is met.
    */
  var enableWhen: js.UndefOr[js.Array[QuestionnaireItemEnableWhen]] = js.undefined
  
  /**
    * The user is allowed to change the value and override the default (unless marked as read-only). If the user doesn't change the value, then this initial value will be persisted when the QuestionnaireResponse is initially created.  Note that default values can influence results.
    * The data type of initial[x] must agree with the item.type.
    */
  var initialAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * The user is allowed to change the value and override the default (unless marked as read-only). If the user doesn't change the value, then this initial value will be persisted when the QuestionnaireResponse is initially created.  Note that default values can influence results.
    * The data type of initial[x] must agree with the item.type.
    */
  var initialBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The user is allowed to change the value and override the default (unless marked as read-only). If the user doesn't change the value, then this initial value will be persisted when the QuestionnaireResponse is initially created.  Note that default values can influence results.
    * The data type of initial[x] must agree with the item.type.
    */
  var initialCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * The user is allowed to change the value and override the default (unless marked as read-only). If the user doesn't change the value, then this initial value will be persisted when the QuestionnaireResponse is initially created.  Note that default values can influence results.
    * The data type of initial[x] must agree with the item.type.
    */
  var initialDate: js.UndefOr[String] = js.undefined
  
  /**
    * The user is allowed to change the value and override the default (unless marked as read-only). If the user doesn't change the value, then this initial value will be persisted when the QuestionnaireResponse is initially created.  Note that default values can influence results.
    * The data type of initial[x] must agree with the item.type.
    */
  var initialDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The user is allowed to change the value and override the default (unless marked as read-only). If the user doesn't change the value, then this initial value will be persisted when the QuestionnaireResponse is initially created.  Note that default values can influence results.
    * The data type of initial[x] must agree with the item.type.
    */
  var initialDecimal: js.UndefOr[Double] = js.undefined
  
  /**
    * The user is allowed to change the value and override the default (unless marked as read-only). If the user doesn't change the value, then this initial value will be persisted when the QuestionnaireResponse is initially created.  Note that default values can influence results.
    * The data type of initial[x] must agree with the item.type.
    */
  var initialInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * The user is allowed to change the value and override the default (unless marked as read-only). If the user doesn't change the value, then this initial value will be persisted when the QuestionnaireResponse is initially created.  Note that default values can influence results.
    * The data type of initial[x] must agree with the item.type.
    */
  var initialQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The user is allowed to change the value and override the default (unless marked as read-only). If the user doesn't change the value, then this initial value will be persisted when the QuestionnaireResponse is initially created.  Note that default values can influence results.
    * The data type of initial[x] must agree with the item.type.
    */
  var initialReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The user is allowed to change the value and override the default (unless marked as read-only). If the user doesn't change the value, then this initial value will be persisted when the QuestionnaireResponse is initially created.  Note that default values can influence results.
    * The data type of initial[x] must agree with the item.type.
    */
  var initialString: js.UndefOr[String] = js.undefined
  
  /**
    * The user is allowed to change the value and override the default (unless marked as read-only). If the user doesn't change the value, then this initial value will be persisted when the QuestionnaireResponse is initially created.  Note that default values can influence results.
    * The data type of initial[x] must agree with the item.type.
    */
  var initialTime: js.UndefOr[String] = js.undefined
  
  /**
    * The user is allowed to change the value and override the default (unless marked as read-only). If the user doesn't change the value, then this initial value will be persisted when the QuestionnaireResponse is initially created.  Note that default values can influence results.
    * The data type of initial[x] must agree with the item.type.
    */
  var initialUri: js.UndefOr[String] = js.undefined
  
  /**
    * There is no specified limit to the depth of nesting.  However, Questionnaire authors are encouraged to consider the impact on the user and user interface of overly deep nesting.
    */
  var item: js.UndefOr[js.Array[QuestionnaireItem]] = js.undefined
  
  /**
    * This ''can'' be a meaningful identifier (e.g. a LOINC code) but is not intended to have any meaning.  GUIDs or sequential numbers are appropriate here.
    */
  var linkId: String
  
  /**
    * For base64binary, reflects the number of characters representing the encoded data, not the number of bytes of the binary data. The value may come from the ElementDefinition referred to by .definition.
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  
  /**
    * This element can be used when the value set machinery of options is deemed too cumbersome or when there's a need to capture options that are not codes.
    */
  var option: js.UndefOr[js.Array[QuestionnaireItemOption]] = js.undefined
  
  /**
    * LOINC defines many useful value sets for questionnaire responses. See [LOINC Answer Lists](loinc.html#alist). The value may come from the ElementDefinition referred to by .definition.
    */
  var options: js.UndefOr[Reference] = js.undefined
  
  /**
    * These are generally unique within a questionnaire, though this is not guaranteed. Some questionnaires may have multiple questions with the same label with logic to control which gets exposed.
    * Typically these won't be used for "display" items, though such use is not prohibited.
    * Systems SHOULD NOT generate their own prefixes if prefixes are defined for any items within a Questionnaire.
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * The value of readOnly elements can be established by asserting  extensions for defaultValues, linkages that support pre-population and/or extensions that support calculation based on other answers.
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If a question is marked as repeats=true, then multiple answers can be provided for the question in the corresponding QuestionnaireResponse.  When rendering the questionnaire, it is up to the rendering software whether to render the question text for each answer repetition or to simply list each of the answers beneath the question.  (Which is most appropriate visually may depend on the type of answer as well as whether there are nested items.). The value may come from the ElementDefinition referred to by .definition.
    */
  var repeats: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Questionnaire.item.required only has meaning for elements that are conditionally enabled with enableWhen if the condition evaluates to true.  If an item that contains other items is marked as required, that does not automatically make the contained elements required (though required groups must contain at least one child element). The value may come from the ElementDefinition referred to by .definition.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of a section, the text of a question or text content for a display item.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Additional constraints on the type of answer can be conveyed by extensions. The value may come from the ElementDefinition referred to by .definition.
    */
  var `type`: group_ | display | question | boolean | decimal | integer | date | dateTime | time | string | text | url | choice | `open-choice` | attachment | reference | quantity_
}
object QuestionnaireItem {
  
  inline def apply(
    linkId: String,
    `type`: group_ | display | question | boolean | decimal | integer | date | dateTime | time | string | text | url | choice | `open-choice` | attachment | reference | quantity_
  ): QuestionnaireItem = {
    val __obj = js.Dynamic.literal(linkId = linkId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuestionnaireItem] (val x: Self) extends AnyVal {
    
    inline def setCode(value: js.Array[Coding]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: Coding*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setEnableWhen(value: js.Array[QuestionnaireItemEnableWhen]): Self = StObject.set(x, "enableWhen", value.asInstanceOf[js.Any])
    
    inline def setEnableWhenUndefined: Self = StObject.set(x, "enableWhen", js.undefined)
    
    inline def setEnableWhenVarargs(value: QuestionnaireItemEnableWhen*): Self = StObject.set(x, "enableWhen", js.Array(value*))
    
    inline def setInitialAttachment(value: Attachment): Self = StObject.set(x, "initialAttachment", value.asInstanceOf[js.Any])
    
    inline def setInitialAttachmentUndefined: Self = StObject.set(x, "initialAttachment", js.undefined)
    
    inline def setInitialBoolean(value: Boolean): Self = StObject.set(x, "initialBoolean", value.asInstanceOf[js.Any])
    
    inline def setInitialBooleanUndefined: Self = StObject.set(x, "initialBoolean", js.undefined)
    
    inline def setInitialCoding(value: Coding): Self = StObject.set(x, "initialCoding", value.asInstanceOf[js.Any])
    
    inline def setInitialCodingUndefined: Self = StObject.set(x, "initialCoding", js.undefined)
    
    inline def setInitialDate(value: String): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
    
    inline def setInitialDateTime(value: String): Self = StObject.set(x, "initialDateTime", value.asInstanceOf[js.Any])
    
    inline def setInitialDateTimeUndefined: Self = StObject.set(x, "initialDateTime", js.undefined)
    
    inline def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
    
    inline def setInitialDecimal(value: Double): Self = StObject.set(x, "initialDecimal", value.asInstanceOf[js.Any])
    
    inline def setInitialDecimalUndefined: Self = StObject.set(x, "initialDecimal", js.undefined)
    
    inline def setInitialInteger(value: Double): Self = StObject.set(x, "initialInteger", value.asInstanceOf[js.Any])
    
    inline def setInitialIntegerUndefined: Self = StObject.set(x, "initialInteger", js.undefined)
    
    inline def setInitialQuantity(value: Quantity): Self = StObject.set(x, "initialQuantity", value.asInstanceOf[js.Any])
    
    inline def setInitialQuantityUndefined: Self = StObject.set(x, "initialQuantity", js.undefined)
    
    inline def setInitialReference(value: Reference): Self = StObject.set(x, "initialReference", value.asInstanceOf[js.Any])
    
    inline def setInitialReferenceUndefined: Self = StObject.set(x, "initialReference", js.undefined)
    
    inline def setInitialString(value: String): Self = StObject.set(x, "initialString", value.asInstanceOf[js.Any])
    
    inline def setInitialStringUndefined: Self = StObject.set(x, "initialString", js.undefined)
    
    inline def setInitialTime(value: String): Self = StObject.set(x, "initialTime", value.asInstanceOf[js.Any])
    
    inline def setInitialTimeUndefined: Self = StObject.set(x, "initialTime", js.undefined)
    
    inline def setInitialUri(value: String): Self = StObject.set(x, "initialUri", value.asInstanceOf[js.Any])
    
    inline def setInitialUriUndefined: Self = StObject.set(x, "initialUri", js.undefined)
    
    inline def setItem(value: js.Array[QuestionnaireItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: QuestionnaireItem*): Self = StObject.set(x, "item", js.Array(value*))
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setOption(value: js.Array[QuestionnaireItemOption]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    inline def setOptionVarargs(value: QuestionnaireItemOption*): Self = StObject.set(x, "option", js.Array(value*))
    
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
    
    inline def setType(
      value: group_ | display | question | boolean | decimal | integer | date | dateTime | time | string | text | url | choice | `open-choice` | attachment | reference | quantity_
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_definition(value: Element): Self = StObject.set(x, "_definition", value.asInstanceOf[js.Any])
    
    inline def set_definitionUndefined: Self = StObject.set(x, "_definition", js.undefined)
    
    inline def set_initialBoolean(value: Element): Self = StObject.set(x, "_initialBoolean", value.asInstanceOf[js.Any])
    
    inline def set_initialBooleanUndefined: Self = StObject.set(x, "_initialBoolean", js.undefined)
    
    inline def set_initialDate(value: Element): Self = StObject.set(x, "_initialDate", value.asInstanceOf[js.Any])
    
    inline def set_initialDateTime(value: Element): Self = StObject.set(x, "_initialDateTime", value.asInstanceOf[js.Any])
    
    inline def set_initialDateTimeUndefined: Self = StObject.set(x, "_initialDateTime", js.undefined)
    
    inline def set_initialDateUndefined: Self = StObject.set(x, "_initialDate", js.undefined)
    
    inline def set_initialString(value: Element): Self = StObject.set(x, "_initialString", value.asInstanceOf[js.Any])
    
    inline def set_initialStringUndefined: Self = StObject.set(x, "_initialString", js.undefined)
    
    inline def set_initialTime(value: Element): Self = StObject.set(x, "_initialTime", value.asInstanceOf[js.Any])
    
    inline def set_initialTimeUndefined: Self = StObject.set(x, "_initialTime", js.undefined)
    
    inline def set_initialUri(value: Element): Self = StObject.set(x, "_initialUri", value.asInstanceOf[js.Any])
    
    inline def set_initialUriUndefined: Self = StObject.set(x, "_initialUri", js.undefined)
    
    inline def set_linkId(value: Element): Self = StObject.set(x, "_linkId", value.asInstanceOf[js.Any])
    
    inline def set_linkIdUndefined: Self = StObject.set(x, "_linkId", js.undefined)
    
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
