package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pure binary content defined by a format other than FHIR
  */
trait Binary
  extends ResourceBase
     with Resource {
  /**
    * Contains extended information for property 'content'.
    */
  var _content: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'contentType'.
    */
  var _contentType: js.UndefOr[Element] = js.undefined
  /**
    * The actual content
    */
  var content: base64Binary
  /**
    * MimeType of the binary content
    */
  var contentType: code
  /**
    * Access Control Management
    */
  var securityContext: js.UndefOr[Reference] = js.undefined
}

object Binary {
  @scala.inline
  def apply(
    content: base64Binary,
    contentType: code,
    _content: Element = null,
    _contentType: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    resourceType: code = null,
    securityContext: Reference = null
  ): Binary = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    if (_content != null) __obj.updateDynamic("_content")(_content.asInstanceOf[js.Any])
    if (_contentType != null) __obj.updateDynamic("_contentType")(_contentType.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (securityContext != null) __obj.updateDynamic("securityContext")(securityContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
}

