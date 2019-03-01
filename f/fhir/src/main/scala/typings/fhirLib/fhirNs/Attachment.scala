package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Content in a format defined elsewhere
  */
trait Attachment extends Element {
  /**
    * Contains extended information for property 'contentType'.
    */
  var _contentType: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'creation'.
    */
  var _creation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'data'.
    */
  var _data: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'hash'.
    */
  var _hash: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'size'.
    */
  var _size: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * Mime type of the content, with charset etc.
    */
  var contentType: js.UndefOr[code] = js.undefined
  /**
    * Date attachment was first created
    */
  var creation: js.UndefOr[dateTime] = js.undefined
  /**
    * Data inline, base64ed
    */
  var data: js.UndefOr[base64Binary] = js.undefined
  /**
    * Hash of the data (sha-1, base64ed)
    */
  var hash: js.UndefOr[base64Binary] = js.undefined
  /**
    * Human language of the content (BCP-47)
    */
  var language: js.UndefOr[code] = js.undefined
  /**
    * Number of bytes of content (if url provided)
    */
  var size: js.UndefOr[unsignedInt] = js.undefined
  /**
    * Label to display in place of the data
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Uri where the data can be found
    */
  var url: js.UndefOr[uri] = js.undefined
}

object Attachment {
  @scala.inline
  def apply(
    _contentType: Element = null,
    _creation: Element = null,
    _data: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _hash: Element = null,
    _id: Element = null,
    _language: Element = null,
    _size: Element = null,
    _title: Element = null,
    _url: Element = null,
    contentType: code = null,
    creation: dateTime = null,
    data: base64Binary = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    hash: base64Binary = null,
    id: java.lang.String = null,
    language: code = null,
    size: js.UndefOr[unsignedInt] = js.undefined,
    title: java.lang.String = null,
    url: uri = null
  ): Attachment = {
    val __obj = js.Dynamic.literal()
    if (_contentType != null) __obj.updateDynamic("_contentType")(_contentType)
    if (_creation != null) __obj.updateDynamic("_creation")(_creation)
    if (_data != null) __obj.updateDynamic("_data")(_data)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_hash != null) __obj.updateDynamic("_hash")(_hash)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_size != null) __obj.updateDynamic("_size")(_size)
    if (_title != null) __obj.updateDynamic("_title")(_title)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (creation != null) __obj.updateDynamic("creation")(creation)
    if (data != null) __obj.updateDynamic("data")(data)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (id != null) __obj.updateDynamic("id")(id)
    if (language != null) __obj.updateDynamic("language")(language)
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Attachment]
  }
}

