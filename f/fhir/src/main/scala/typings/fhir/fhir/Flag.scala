package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Key information to flag to healthcare providers
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Flag extends DomainResource {
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Flag creator
    */
  var author: js.UndefOr[Reference] = js.undefined
  /**
    * Clinical, administrative, etc.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Coded or textual message to display to user
    */
  var code: CodeableConcept
  /**
    * Alert relevant during encounter
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Time period when flag is active
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * active | inactive | entered-in-error
    */
  var status: code
  /**
    * Who/What is flag about?
    */
  var subject: Reference
}

object Flag {
  @scala.inline
  def apply(
    code: CodeableConcept,
    status: code,
    subject: Reference,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    author: Reference = null,
    category: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    encounter: Reference = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    period: Period = null,
    resourceType: code = null,
    text: Narrative = null
  ): Flag = {
    val __obj = js.Dynamic.literal(code = code, status = status, subject = subject)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (author != null) __obj.updateDynamic("author")(author)
    if (category != null) __obj.updateDynamic("category")(category)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (encounter != null) __obj.updateDynamic("encounter")(encounter)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (period != null) __obj.updateDynamic("period")(period)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Flag]
  }
}

