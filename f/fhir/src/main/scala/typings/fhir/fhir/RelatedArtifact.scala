package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Related artifacts for a knowledge resource
  */
trait RelatedArtifact extends Element {
  /**
    * Contains extended information for property 'citation'.
    */
  var _citation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * Bibliographic citation for the artifact
    */
  var citation: js.UndefOr[String] = js.undefined
  /**
    * Brief description of the related artifact
    */
  var display: js.UndefOr[String] = js.undefined
  /**
    * What document is being referenced
    */
  var document: js.UndefOr[Attachment] = js.undefined
  /**
    * What resource is being referenced
    */
  var resource: js.UndefOr[Reference] = js.undefined
  /**
    * documentation | justification | citation | predecessor | successor | derived-from | depends-on | composed-of
    */
  var `type`: code
  /**
    * Where the artifact can be accessed
    */
  var url: js.UndefOr[uri] = js.undefined
}

object RelatedArtifact {
  @scala.inline
  def apply(
    `type`: code,
    _citation: Element = null,
    _display: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _type: Element = null,
    _url: Element = null,
    citation: String = null,
    display: String = null,
    document: Attachment = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    resource: Reference = null,
    url: uri = null
  ): RelatedArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_citation != null) __obj.updateDynamic("_citation")(_citation.asInstanceOf[js.Any])
    if (_display != null) __obj.updateDynamic("_display")(_display.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (citation != null) __obj.updateDynamic("citation")(citation.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedArtifact]
  }
}

