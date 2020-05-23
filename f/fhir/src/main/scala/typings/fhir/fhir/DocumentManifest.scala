package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list that defines a set of documents
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait DocumentManifest extends DomainResource {
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'source'.
    */
  var _source: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Who and/or what authored the manifest
    */
  var author: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * The items included
    */
  var content: js.Array[DocumentManifestContent]
  /**
    * When this document manifest created
    */
  var created: js.UndefOr[dateTime] = js.undefined
  /**
    * Human-readable description (title)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Other identifiers for the manifest
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Unique Identifier for the set of documents
    */
  var masterIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Intended to get notified about this set of documents
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Related things
    */
  var related: js.UndefOr[js.Array[DocumentManifestRelated]] = js.undefined
  /**
    * The source system/application/software
    */
  var source: js.UndefOr[uri] = js.undefined
  /**
    * current | superseded | entered-in-error
    */
  var status: code
  /**
    * The subject of the set of documents
    */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
    * Kind of document set
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

object DocumentManifest {
  @scala.inline
  def apply(
    content: js.Array[DocumentManifestContent],
    status: code,
    _created: Element = null,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _source: Element = null,
    _status: Element = null,
    author: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    description: String = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    masterIdentifier: Identifier = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    recipient: js.Array[Reference] = null,
    related: js.Array[DocumentManifestRelated] = null,
    resourceType: code = null,
    source: uri = null,
    subject: Reference = null,
    text: Narrative = null,
    `type`: CodeableConcept = null
  ): DocumentManifest = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_source != null) __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (masterIdentifier != null) __obj.updateDynamic("masterIdentifier")(masterIdentifier.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (recipient != null) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    if (related != null) __obj.updateDynamic("related")(related.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentManifest]
  }
}

