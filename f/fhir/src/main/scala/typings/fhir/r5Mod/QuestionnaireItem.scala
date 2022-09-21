package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`protected`
import typings.fhir.fhirStrings.all
import typings.fhir.fhirStrings.any
import typings.fhir.fhirStrings.attachment
import typings.fhir.fhirStrings.boolean
import typings.fhir.fhirStrings.coding_
import typings.fhir.fhirStrings.date
import typings.fhir.fhirStrings.dateTime
import typings.fhir.fhirStrings.decimal
import typings.fhir.fhirStrings.display
import typings.fhir.fhirStrings.group_
import typings.fhir.fhirStrings.hidden
import typings.fhir.fhirStrings.integer
import typings.fhir.fhirStrings.optionsOnly
import typings.fhir.fhirStrings.optionsOrString
import typings.fhir.fhirStrings.optionsOrType
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
  
  var _answerConstraint: js.UndefOr[Element] = js.undefined
  
  var _answerValueSet: js.UndefOr[Element] = js.undefined
  
  var _definition: js.UndefOr[Element] = js.undefined
  
  var _disabledDisplay: js.UndefOr[Element] = js.undefined
  
  var _enableBehavior: js.UndefOr[Element] = js.undefined
  
  var _linkId: js.UndefOr[Element] = js.undefined
  
  var _prefix: js.UndefOr[Element] = js.undefined
  
  var _readOnly: js.UndefOr[Element] = js.undefined
  
  var _repeats: js.UndefOr[Element] = js.undefined
  
  var _required: js.UndefOr[Element] = js.undefined
  
  var _text: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * For items that have a defined set of allowed answers (via answerOption or answerValueset), indicates whether values *other* than those specified can be selected.
    */
  var answerConstraint: js.UndefOr[optionsOnly | optionsOrType | optionsOrString] = js.undefined
  
  /**
    * This element can be used when the value set machinery of answerValueSet is deemed too cumbersome or when there's a need to capture possible answers that are not codes.
    */
  var answerOption: js.UndefOr[js.Array[QuestionnaireItemAnswerOption]] = js.undefined
  
  /**
    * LOINC defines many useful value sets for questionnaire responses. See [LOINC Answer Lists](loinc.html#alist). The value may come from the ElementDefinition referred to by .definition.
    */
  var answerValueSet: js.UndefOr[String] = js.undefined
  
  /**
    * The value may come from the ElementDefinition referred to by .definition.
    */
  var code: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * The uri refers to an ElementDefinition in a [StructureDefinition](structuredefinition.html#) and always starts with the [canonical URL](references.html#canonical) for the target resource. When referring to a StructureDefinition, a fragment identifier is used to specify the element definition by its id [Element.id](types-definitions.html#Element.id). E.g. http://hl7.org/fhir/StructureDefinition/Observation#Observation.value[x]. In the absence of a fragment identifier, the first/root element definition in the target is the matching element definition.
    */
  var definition: js.UndefOr[String] = js.undefined
  
  /**
    * If not specified, rendering behavior is up to the client.  This element is only meaningful if enableWhen or an equivalent extension is present
    */
  var disabledDisplay: js.UndefOr[hidden | `protected`] = js.undefined
  
  /**
    * This element must be specified if more than one enableWhen value is provided.
    */
  var enableBehavior: js.UndefOr[all | any] = js.undefined
  
  /**
    * If multiple repetitions of this extension are present, the interpretation is driven by enableBehavior (either all repetitions must evaluate to true for this item to be enabled, or only one must evaluate to true for the item to be  enabled).  If the enableWhen.question has multiple answers, the condition evaluates to true if *any* of the answers for the referenced item match the enableWhen condition.  This element is a modifier because if enableWhen is present for an item, "required" is ignored unless one of the enableWhen conditions is met. When an item is disabled, all of its descendants are disabled, regardless of what their own enableWhen logic might evaluate to.  If enableWhen logic depends on an item that is disabled, the logic should proceed as though the item is not valued - even if a default value or other value might be retained in memory in the event of the item being re-enabled.
    */
  var enableWhen: js.UndefOr[js.Array[QuestionnaireItemEnableWhen]] = js.undefined
  
  /**
    * The user is allowed to change the value and override the default (unless marked as read-only). If the user doesn't change the value, then this initial value will be persisted when the QuestionnaireResponse is initially created.  Note that initial values can influence results.  The data type of initial.answer[x] must agree with the item.type, and only repeating items can have more then one initial value.
    */
  var initial: js.UndefOr[js.Array[QuestionnaireItemInitial]] = js.undefined
  
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
    * These are generally unique within a questionnaire, though this is not guaranteed. Some questionnaires may have multiple questions with the same label with logic to control which gets exposed.  Typically, these won't be used for "display" items, though such use is not prohibited.  Systems SHOULD NOT generate their own prefixes if prefixes are defined for any items within a Questionnaire.
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * If specified on a 'group', then all items beneath the specified group are read only.  For questions, this only marks the answer associated with the specific item read only.  Descendant questions are not impacted.  The value of readOnly elements can be established by asserting extensions for defaultValues, linkages that support pre-population and/or extensions that support calculation based on other answers.
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If a question is marked as repeats=true, then multiple answers can be provided for the question in the corresponding QuestionnaireResponse.  When rendering the questionnaire, it is up to the rendering software whether to render the question text for each answer repetition (i.e. "repeat the question") or to simply allow entry/selection of multiple answers for the question (repeat the answers).  Which is most appropriate visually may depend on the type of answer as well as whether there are nested items.
    * The resulting QuestionnaireResponse will be populated the same way regardless of rendering - one 'question' item with multiple answer values.
    *  The value may come from the ElementDefinition referred to by .definition.
    */
  var repeats: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Questionnaire.item.required only has meaning for elements that are conditionally enabled with enableWhen if the condition evaluates to true.  It also only has meaning if the parent element is present.  If a non-required 'group' item contains a 'required' question item, it's completely fine to omit the group (because it's not required) despite it having a required child.  Similarly, if an item that contains other items is marked as required, that does not automatically make the contained elements required (though required groups must contain at least one descendant item with a populated answer). The value for 'required' may come from the ElementDefinition referred to by .definition.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When using this element to represent the name of a section, use group type item and also make sure to limit the text element to a short string suitable for display as a section heading.  Group item instructions should be included as a display type item within the group.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Additional constraints on the type of answer can be conveyed by extensions. The value may come from the ElementDefinition referred to by .definition.
    */
  var `type`: group_ | display | question | boolean | decimal | integer | date | dateTime | time | string | text | url | coding_ | attachment | reference | quantity_
}
object QuestionnaireItem {
  
  inline def apply(
    linkId: String,
    `type`: group_ | display | question | boolean | decimal | integer | date | dateTime | time | string | text | url | coding_ | attachment | reference | quantity_
  ): QuestionnaireItem = {
    val __obj = js.Dynamic.literal(linkId = linkId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireItem]
  }
  
  extension [Self <: QuestionnaireItem](x: Self) {
    
    inline def setAnswerConstraint(value: optionsOnly | optionsOrType | optionsOrString): Self = StObject.set(x, "answerConstraint", value.asInstanceOf[js.Any])
    
    inline def setAnswerConstraintUndefined: Self = StObject.set(x, "answerConstraint", js.undefined)
    
    inline def setAnswerOption(value: js.Array[QuestionnaireItemAnswerOption]): Self = StObject.set(x, "answerOption", value.asInstanceOf[js.Any])
    
    inline def setAnswerOptionUndefined: Self = StObject.set(x, "answerOption", js.undefined)
    
    inline def setAnswerOptionVarargs(value: QuestionnaireItemAnswerOption*): Self = StObject.set(x, "answerOption", js.Array(value*))
    
    inline def setAnswerValueSet(value: String): Self = StObject.set(x, "answerValueSet", value.asInstanceOf[js.Any])
    
    inline def setAnswerValueSetUndefined: Self = StObject.set(x, "answerValueSet", js.undefined)
    
    inline def setCode(value: js.Array[Coding]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: Coding*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDisabledDisplay(value: hidden | `protected`): Self = StObject.set(x, "disabledDisplay", value.asInstanceOf[js.Any])
    
    inline def setDisabledDisplayUndefined: Self = StObject.set(x, "disabledDisplay", js.undefined)
    
    inline def setEnableBehavior(value: all | any): Self = StObject.set(x, "enableBehavior", value.asInstanceOf[js.Any])
    
    inline def setEnableBehaviorUndefined: Self = StObject.set(x, "enableBehavior", js.undefined)
    
    inline def setEnableWhen(value: js.Array[QuestionnaireItemEnableWhen]): Self = StObject.set(x, "enableWhen", value.asInstanceOf[js.Any])
    
    inline def setEnableWhenUndefined: Self = StObject.set(x, "enableWhen", js.undefined)
    
    inline def setEnableWhenVarargs(value: QuestionnaireItemEnableWhen*): Self = StObject.set(x, "enableWhen", js.Array(value*))
    
    inline def setInitial(value: js.Array[QuestionnaireItemInitial]): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setInitialVarargs(value: QuestionnaireItemInitial*): Self = StObject.set(x, "initial", js.Array(value*))
    
    inline def setItem(value: js.Array[QuestionnaireItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: QuestionnaireItem*): Self = StObject.set(x, "item", js.Array(value*))
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
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
      value: group_ | display | question | boolean | decimal | integer | date | dateTime | time | string | text | url | coding_ | attachment | reference | quantity_
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_answerConstraint(value: Element): Self = StObject.set(x, "_answerConstraint", value.asInstanceOf[js.Any])
    
    inline def set_answerConstraintUndefined: Self = StObject.set(x, "_answerConstraint", js.undefined)
    
    inline def set_answerValueSet(value: Element): Self = StObject.set(x, "_answerValueSet", value.asInstanceOf[js.Any])
    
    inline def set_answerValueSetUndefined: Self = StObject.set(x, "_answerValueSet", js.undefined)
    
    inline def set_definition(value: Element): Self = StObject.set(x, "_definition", value.asInstanceOf[js.Any])
    
    inline def set_definitionUndefined: Self = StObject.set(x, "_definition", js.undefined)
    
    inline def set_disabledDisplay(value: Element): Self = StObject.set(x, "_disabledDisplay", value.asInstanceOf[js.Any])
    
    inline def set_disabledDisplayUndefined: Self = StObject.set(x, "_disabledDisplay", js.undefined)
    
    inline def set_enableBehavior(value: Element): Self = StObject.set(x, "_enableBehavior", value.asInstanceOf[js.Any])
    
    inline def set_enableBehaviorUndefined: Self = StObject.set(x, "_enableBehavior", js.undefined)
    
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
