package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structured set of questions
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait Questionnaire extends DomainResource {
  /**
    * Contains extended information for property 'approvalDate'.
    */
  var _approvalDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'lastReviewDate'.
    */
  var _lastReviewDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'purpose'.
    */
  var _purpose: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'subjectType'.
    */
  var _subjectType: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * When the questionnaire was approved by publisher
    */
  var approvalDate: js.UndefOr[date] = js.undefined
  /**
    * Concept that represents the overall questionnaire
    */
  var code: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.undefined
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Natural language description of the questionnaire
    */
  var description: js.UndefOr[markdown] = js.undefined
  /**
    * When the questionnaire is expected to be used
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Additional identifier for the questionnaire
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Questions and sections within the Questionnaire
    */
  var item: js.UndefOr[js.Array[QuestionnaireItem]] = js.undefined
  /**
    * Intended jurisdiction for questionnaire (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * When the questionnaire was last reviewed
    */
  var lastReviewDate: js.UndefOr[date] = js.undefined
  /**
    * Name for this questionnaire (computer friendly)
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Why this questionnaire is defined
    */
  var purpose: js.UndefOr[markdown] = js.undefined
  /**
    * draft | active | retired | unknown
    */
  var status: code
  /**
    * Resource that can be subject of QuestionnaireResponse
    */
  var subjectType: js.UndefOr[js.Array[code]] = js.undefined
  /**
    * Name for this questionnaire (human friendly)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Logical URI to reference this questionnaire (globally unique)
    */
  var url: js.UndefOr[uri] = js.undefined
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  /**
    * Business version of the questionnaire
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Questionnaire {
  @scala.inline
  def apply(
    status: code,
    _approvalDate: Element = null,
    _copyright: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _lastReviewDate: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _subjectType: js.Array[Element] = null,
    _title: Element = null,
    _url: Element = null,
    _version: Element = null,
    approvalDate: date = null,
    code: js.Array[Coding] = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    copyright: markdown = null,
    date: dateTime = null,
    description: markdown = null,
    effectivePeriod: Period = null,
    experimental: js.UndefOr[scala.Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    item: js.Array[QuestionnaireItem] = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    lastReviewDate: date = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: java.lang.String = null,
    publisher: java.lang.String = null,
    purpose: markdown = null,
    resourceType: code = null,
    subjectType: js.Array[code] = null,
    text: Narrative = null,
    title: java.lang.String = null,
    url: uri = null,
    useContext: js.Array[UsageContext] = null,
    version: java.lang.String = null
  ): Questionnaire = {
    val __obj = js.Dynamic.literal(status = status)
    if (_approvalDate != null) __obj.updateDynamic("_approvalDate")(_approvalDate)
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright)
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_lastReviewDate != null) __obj.updateDynamic("_lastReviewDate")(_lastReviewDate)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher)
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_subjectType != null) __obj.updateDynamic("_subjectType")(_subjectType)
    if (_title != null) __obj.updateDynamic("_title")(_title)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (_version != null) __obj.updateDynamic("_version")(_version)
    if (approvalDate != null) __obj.updateDynamic("approvalDate")(approvalDate)
    if (code != null) __obj.updateDynamic("code")(code)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (date != null) __obj.updateDynamic("date")(date)
    if (description != null) __obj.updateDynamic("description")(description)
    if (effectivePeriod != null) __obj.updateDynamic("effectivePeriod")(effectivePeriod)
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (item != null) __obj.updateDynamic("item")(item)
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction)
    if (language != null) __obj.updateDynamic("language")(language)
    if (lastReviewDate != null) __obj.updateDynamic("lastReviewDate")(lastReviewDate)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (purpose != null) __obj.updateDynamic("purpose")(purpose)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (subjectType != null) __obj.updateDynamic("subjectType")(subjectType)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (useContext != null) __obj.updateDynamic("useContext")(useContext)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Questionnaire]
  }
}

