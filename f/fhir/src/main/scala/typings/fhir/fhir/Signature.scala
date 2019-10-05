package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A digital Signature - XML DigSig, JWT, Graphical image of signature, etc.
  */
trait Signature extends Element {
  /**
    * Contains extended information for property 'blob'.
    */
  var _blob: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'contentType'.
    */
  var _contentType: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'onBehalfOfUri'.
    */
  var _onBehalfOfUri: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'when'.
    */
  var _when: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'whoUri'.
    */
  var _whoUri: js.UndefOr[Element] = js.undefined
  /**
    * The actual signature content (XML DigSig. JWT, picture, etc.)
    */
  var blob: js.UndefOr[base64Binary] = js.undefined
  /**
    * The technical format of the signature
    */
  var contentType: js.UndefOr[code] = js.undefined
  /**
    * The party represented
    */
  var onBehalfOfReference: js.UndefOr[Reference] = js.undefined
  /**
    * The party represented
    */
  var onBehalfOfUri: js.UndefOr[uri] = js.undefined
  /**
    * Indication of the reason the entity signed the object(s)
    */
  var `type`: js.Array[Coding]
  /**
    * When the signature was created
    */
  var when: instant
  /**
    * Who signed
    */
  var whoReference: js.UndefOr[Reference] = js.undefined
  /**
    * Who signed
    */
  var whoUri: js.UndefOr[uri] = js.undefined
}

object Signature {
  @scala.inline
  def apply(
    `type`: js.Array[Coding],
    when: instant,
    _blob: Element = null,
    _contentType: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _onBehalfOfUri: Element = null,
    _when: Element = null,
    _whoUri: Element = null,
    blob: base64Binary = null,
    contentType: code = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    onBehalfOfReference: Reference = null,
    onBehalfOfUri: uri = null,
    whoReference: Reference = null,
    whoUri: uri = null
  ): Signature = {
    val __obj = js.Dynamic.literal(when = when)
    __obj.updateDynamic("type")(`type`)
    if (_blob != null) __obj.updateDynamic("_blob")(_blob)
    if (_contentType != null) __obj.updateDynamic("_contentType")(_contentType)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_onBehalfOfUri != null) __obj.updateDynamic("_onBehalfOfUri")(_onBehalfOfUri)
    if (_when != null) __obj.updateDynamic("_when")(_when)
    if (_whoUri != null) __obj.updateDynamic("_whoUri")(_whoUri)
    if (blob != null) __obj.updateDynamic("blob")(blob)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onBehalfOfReference != null) __obj.updateDynamic("onBehalfOfReference")(onBehalfOfReference)
    if (onBehalfOfUri != null) __obj.updateDynamic("onBehalfOfUri")(onBehalfOfUri)
    if (whoReference != null) __obj.updateDynamic("whoReference")(whoReference)
    if (whoUri != null) __obj.updateDynamic("whoUri")(whoUri)
    __obj.asInstanceOf[Signature]
  }
}

