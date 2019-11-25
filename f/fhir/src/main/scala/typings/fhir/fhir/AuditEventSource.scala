package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Audit Event Reporter
  */
trait AuditEventSource extends BackboneElement {
  /**
    * Contains extended information for property 'site'.
    */
  var _site: js.UndefOr[Element] = js.undefined
  /**
    * The identity of source detecting the event
    */
  var identifier: Identifier
  /**
    * Logical source location within the enterprise
    */
  var site: js.UndefOr[String] = js.undefined
  /**
    * The type of source where event originated
    */
  var `type`: js.UndefOr[js.Array[Coding]] = js.undefined
}

object AuditEventSource {
  @scala.inline
  def apply(
    identifier: Identifier,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _site: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    site: String = null,
    `type`: js.Array[Coding] = null
  ): AuditEventSource = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_site != null) __obj.updateDynamic("_site")(_site.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEventSource]
  }
}

