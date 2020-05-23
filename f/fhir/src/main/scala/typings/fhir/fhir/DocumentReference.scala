package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a document
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait DocumentReference extends DomainResource {
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'docStatus'.
    */
  var _docStatus: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'indexed'.
    */
  var _indexed: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Who/what authenticated the document
    */
  var authenticator: js.UndefOr[Reference] = js.undefined
  /**
    * Who and/or what authored the document
    */
  var author: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Categorization of document
    */
  var `class`: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Document referenced
    */
  var content: js.Array[DocumentReferenceContent]
  /**
    * Clinical context of document
    */
  var context: js.UndefOr[DocumentReferenceContext] = js.undefined
  /**
    * Document creation time
    */
  var created: js.UndefOr[dateTime] = js.undefined
  /**
    * Organization which maintains the document
    */
  var custodian: js.UndefOr[Reference] = js.undefined
  /**
    * Human-readable description (title)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * preliminary | final | appended | amended | entered-in-error
    */
  var docStatus: js.UndefOr[code] = js.undefined
  /**
    * Other identifiers for the document
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * When this document reference was created
    */
  var indexed: instant
  /**
    * Master Version Specific Identifier
    */
  var masterIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Relationships to other documents
    */
  var relatesTo: js.UndefOr[js.Array[DocumentReferenceRelatesTo]] = js.undefined
  /**
    * Document security-tags
    */
  var securityLabel: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * current | superseded | entered-in-error
    */
  var status: code
  /**
    * Who/what is the subject of the document
    */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
    * Kind of document (LOINC if possible)
    */
  var `type`: CodeableConcept
}

object DocumentReference {
  @scala.inline
  def apply(
    content: js.Array[DocumentReferenceContent],
    indexed: instant,
    status: code,
    `type`: CodeableConcept,
    _created: Element = null,
    _description: Element = null,
    _docStatus: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _indexed: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    authenticator: Reference = null,
    author: js.Array[Reference] = null,
    `class`: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    context: DocumentReferenceContext = null,
    created: dateTime = null,
    custodian: Reference = null,
    description: String = null,
    docStatus: code = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    masterIdentifier: Identifier = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    relatesTo: js.Array[DocumentReferenceRelatesTo] = null,
    resourceType: code = null,
    securityLabel: js.Array[CodeableConcept] = null,
    subject: Reference = null,
    text: Narrative = null
  ): DocumentReference = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], indexed = indexed.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_docStatus != null) __obj.updateDynamic("_docStatus")(_docStatus.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_indexed != null) __obj.updateDynamic("_indexed")(_indexed.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (authenticator != null) __obj.updateDynamic("authenticator")(authenticator.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (custodian != null) __obj.updateDynamic("custodian")(custodian.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (docStatus != null) __obj.updateDynamic("docStatus")(docStatus.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (masterIdentifier != null) __obj.updateDynamic("masterIdentifier")(masterIdentifier.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (relatesTo != null) __obj.updateDynamic("relatesTo")(relatesTo.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (securityLabel != null) __obj.updateDynamic("securityLabel")(securityLabel.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentReference]
  }
}

