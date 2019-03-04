package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list that defines a set of documents
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait DocumentManifest extends DomainResource {
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
  var description: js.UndefOr[java.lang.String] = js.undefined
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
    description: java.lang.String = null,
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
    val __obj = js.Dynamic.literal(content = content, status = status)
    if (_created != null) __obj.updateDynamic("_created")(_created)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_source != null) __obj.updateDynamic("_source")(_source)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (author != null) __obj.updateDynamic("author")(author)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (created != null) __obj.updateDynamic("created")(created)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (masterIdentifier != null) __obj.updateDynamic("masterIdentifier")(masterIdentifier)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (recipient != null) __obj.updateDynamic("recipient")(recipient)
    if (related != null) __obj.updateDynamic("related")(related)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (source != null) __obj.updateDynamic("source")(source)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DocumentManifest]
  }
}

