package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data or objects used
  */
trait AuditEventEntity extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'query'.
    */
  var _query: js.UndefOr[Element] = js.undefined
  /**
    * Descriptive text
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Additional Information about the entity
    */
  var detail: js.UndefOr[js.Array[AuditEventEntityDetail]] = js.undefined
  /**
    * Specific instance of object
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Life-cycle stage for the entity
    */
  var lifecycle: js.UndefOr[Coding] = js.undefined
  /**
    * Descriptor for entity
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Query parameters
    */
  var query: js.UndefOr[base64Binary] = js.undefined
  /**
    * Specific instance of resource
    */
  var reference: js.UndefOr[Reference] = js.undefined
  /**
    * What role the entity played
    */
  var role: js.UndefOr[Coding] = js.undefined
  /**
    * Security labels on the entity
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Type of entity involved
    */
  var `type`: js.UndefOr[Coding] = js.undefined
}

object AuditEventEntity {
  @scala.inline
  def apply(
    _description: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    _query: Element = null,
    description: String = null,
    detail: js.Array[AuditEventEntityDetail] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    identifier: Identifier = null,
    lifecycle: Coding = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    query: base64Binary = null,
    reference: Reference = null,
    role: Coding = null,
    securityLabel: js.Array[Coding] = null,
    `type`: Coding = null
  ): AuditEventEntity = {
    val __obj = js.Dynamic.literal()
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_query != null) __obj.updateDynamic("_query")(_query.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (lifecycle != null) __obj.updateDynamic("lifecycle")(lifecycle.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (securityLabel != null) __obj.updateDynamic("securityLabel")(securityLabel.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEventEntity]
  }
}

