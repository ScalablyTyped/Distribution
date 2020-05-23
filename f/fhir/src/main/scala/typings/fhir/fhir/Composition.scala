package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of resources composed into a single coherent clinical statement with clinical attestation
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Composition extends DomainResource {
  /**
    * Contains extended information for property 'confidentiality'.
    */
  var _confidentiality: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  /**
    * Attests to accuracy of composition
    */
  var attester: js.UndefOr[js.Array[CompositionAttester]] = js.undefined
  /**
    * Who and/or what authored the composition
    */
  var author: js.Array[Reference]
  /**
    * Categorization of Composition
    */
  var `class`: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * As defined by affinity domain
    */
  var confidentiality: js.UndefOr[code] = js.undefined
  /**
    * Organization which maintains the composition
    */
  var custodian: js.UndefOr[Reference] = js.undefined
  /**
    * Composition editing time
    */
  var date: dateTime
  /**
    * Context of the Composition
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  /**
    * The clinical service(s) being documented
    */
  var event: js.UndefOr[js.Array[CompositionEvent]] = js.undefined
  /**
    * Logical identifier of composition (version-independent)
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Relationships to other compositions/documents
    */
  var relatesTo: js.UndefOr[js.Array[CompositionRelatesTo]] = js.undefined
  /**
    * Composition is broken into sections
    */
  var section: js.UndefOr[js.Array[CompositionSection]] = js.undefined
  /**
    * preliminary | final | amended | entered-in-error
    */
  var status: code
  /**
    * Who and/or what the composition is about
    */
  var subject: Reference
  /**
    * Human Readable name/title
    */
  var title: String
  /**
    * Kind of composition (LOINC if possible)
    */
  var `type`: CodeableConcept
}

object Composition {
  @scala.inline
  def apply(
    author: js.Array[Reference],
    date: dateTime,
    status: code,
    subject: Reference,
    title: String,
    `type`: CodeableConcept,
    _confidentiality: Element = null,
    _date: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    attester: js.Array[CompositionAttester] = null,
    `class`: CodeableConcept = null,
    confidentiality: code = null,
    contained: js.Array[Resource] = null,
    custodian: Reference = null,
    encounter: Reference = null,
    event: js.Array[CompositionEvent] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    relatesTo: js.Array[CompositionRelatesTo] = null,
    resourceType: code = null,
    section: js.Array[CompositionSection] = null,
    text: Narrative = null
  ): Composition = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_confidentiality != null) __obj.updateDynamic("_confidentiality")(_confidentiality.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (attester != null) __obj.updateDynamic("attester")(attester.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (confidentiality != null) __obj.updateDynamic("confidentiality")(confidentiality.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (custodian != null) __obj.updateDynamic("custodian")(custodian.asInstanceOf[js.Any])
    if (encounter != null) __obj.updateDynamic("encounter")(encounter.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (relatesTo != null) __obj.updateDynamic("relatesTo")(relatesTo.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Composition]
  }
}

