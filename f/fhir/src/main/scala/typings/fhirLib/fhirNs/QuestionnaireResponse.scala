package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structured set of questions and their answers
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait QuestionnaireResponse extends DomainResource {
  /**
    * Contains extended information for property 'authored'.
    */
  var _authored: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Person who received and recorded the answers
    */
  var author: js.UndefOr[Reference] = js.undefined
  /**
    * Date the answers were gathered
    */
  var authored: js.UndefOr[dateTime] = js.undefined
  /**
    * Request fulfilled by this QuestionnaireResponse
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Encounter or Episode during which questionnaire was completed
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * Unique id for this set of answers
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Groups and questions
    */
  var item: js.UndefOr[js.Array[QuestionnaireResponseItem]] = js.undefined
  /**
    * Part of this action
    */
  var parent: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Form being answered
    */
  var questionnaire: js.UndefOr[Reference] = js.undefined
  /**
    * The person who answered the questions
    */
  var source: js.UndefOr[Reference] = js.undefined
  /**
    * in-progress | completed | amended | entered-in-error | stopped
    */
  var status: code
  /**
    * The subject of the questions
    */
  var subject: js.UndefOr[Reference] = js.undefined
}

object QuestionnaireResponse {
  @scala.inline
  def apply(
    status: code,
    _authored: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    author: Reference = null,
    authored: dateTime = null,
    basedOn: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    item: js.Array[QuestionnaireResponseItem] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    parent: js.Array[Reference] = null,
    questionnaire: Reference = null,
    resourceType: code = null,
    source: Reference = null,
    subject: Reference = null,
    text: Narrative = null
  ): QuestionnaireResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("status")(status)
    if (_authored != null) __obj.updateDynamic("_authored")(_authored)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (author != null) __obj.updateDynamic("author")(author)
    if (authored != null) __obj.updateDynamic("authored")(authored)
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (context != null) __obj.updateDynamic("context")(context)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (item != null) __obj.updateDynamic("item")(item)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (questionnaire != null) __obj.updateDynamic("questionnaire")(questionnaire)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (source != null) __obj.updateDynamic("source")(source)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[QuestionnaireResponse]
  }
}

