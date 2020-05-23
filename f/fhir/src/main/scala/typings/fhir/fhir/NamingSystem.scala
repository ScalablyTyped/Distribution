package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * System of unique identification
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait NamingSystem extends DomainResource {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'kind'.
    */
  var _kind: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'responsible'.
    */
  var _responsible: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'usage'.
    */
  var _usage: js.UndefOr[Element] = js.undefined
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
    * Date this was last changed
    */
  var date: dateTime
  /**
    * Natural language description of the naming system
    */
  var description: js.UndefOr[markdown] = js.undefined
  /**
    * Intended jurisdiction for naming system (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * codesystem | identifier | root
    */
  var kind: code
  /**
    * Name for this naming system (computer friendly)
    */
  var name: String
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.undefined
  /**
    * Use this instead
    */
  var replacedBy: js.UndefOr[Reference] = js.undefined
  /**
    * Who maintains system namespace?
    */
  var responsible: js.UndefOr[String] = js.undefined
  /**
    * draft | active | retired | unknown
    */
  var status: code
  /**
    * e.g. driver,  provider,  patient, bank etc.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Unique identifiers used for system
    */
  var uniqueId: js.Array[NamingSystemUniqueId]
  /**
    * How/where is it used
    */
  var usage: js.UndefOr[String] = js.undefined
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
}

object NamingSystem {
  @scala.inline
  def apply(
    date: dateTime,
    kind: code,
    name: String,
    status: code,
    uniqueId: js.Array[NamingSystemUniqueId],
    _date: Element = null,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _kind: Element = null,
    _language: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _resourceType: Element = null,
    _responsible: Element = null,
    _status: Element = null,
    _usage: Element = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    description: markdown = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    publisher: String = null,
    replacedBy: Reference = null,
    resourceType: code = null,
    responsible: String = null,
    text: Narrative = null,
    `type`: CodeableConcept = null,
    usage: String = null,
    useContext: js.Array[UsageContext] = null
  ): NamingSystem = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_kind != null) __obj.updateDynamic("_kind")(_kind.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_responsible != null) __obj.updateDynamic("_responsible")(_responsible.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_usage != null) __obj.updateDynamic("_usage")(_usage.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (replacedBy != null) __obj.updateDynamic("replacedBy")(replacedBy.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (responsible != null) __obj.updateDynamic("responsible")(responsible.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamingSystem]
  }
}

