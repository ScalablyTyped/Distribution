package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A digital Signature - XML DigSig, JWT, Graphical image of signature, etc.
  */
@js.native
trait Signature extends Element {
  /**
    * Contains extended information for property 'blob'.
    */
  var _blob: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'contentType'.
    */
  var _contentType: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'onBehalfOfUri'.
    */
  var _onBehalfOfUri: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'when'.
    */
  var _when: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'whoUri'.
    */
  var _whoUri: js.UndefOr[Element] = js.native
  /**
    * The actual signature content (XML DigSig. JWT, picture, etc.)
    */
  var blob: js.UndefOr[base64Binary] = js.native
  /**
    * The technical format of the signature
    */
  var contentType: js.UndefOr[code] = js.native
  /**
    * The party represented
    */
  var onBehalfOfReference: js.UndefOr[Reference] = js.native
  /**
    * The party represented
    */
  var onBehalfOfUri: js.UndefOr[uri] = js.native
  /**
    * Indication of the reason the entity signed the object(s)
    */
  var `type`: js.Array[Coding] = js.native
  /**
    * When the signature was created
    */
  var when: instant = js.native
  /**
    * Who signed
    */
  var whoReference: js.UndefOr[Reference] = js.native
  /**
    * Who signed
    */
  var whoUri: js.UndefOr[uri] = js.native
}

object Signature {
  @scala.inline
  def apply(`type`: js.Array[Coding], when: instant): Signature = {
    val __obj = js.Dynamic.literal(when = when.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signature]
  }
  @scala.inline
  implicit class SignatureOps[Self <: Signature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTypeVarargs(value: Coding*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: js.Array[Coding]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhen(value: instant): Self = this.set("when", value.asInstanceOf[js.Any])
    @scala.inline
    def set_blob(value: Element): Self = this.set("_blob", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_blob: Self = this.set("_blob", js.undefined)
    @scala.inline
    def set_contentType(value: Element): Self = this.set("_contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_contentType: Self = this.set("_contentType", js.undefined)
    @scala.inline
    def set_onBehalfOfUri(value: Element): Self = this.set("_onBehalfOfUri", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_onBehalfOfUri: Self = this.set("_onBehalfOfUri", js.undefined)
    @scala.inline
    def set_when(value: Element): Self = this.set("_when", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_when: Self = this.set("_when", js.undefined)
    @scala.inline
    def set_whoUri(value: Element): Self = this.set("_whoUri", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_whoUri: Self = this.set("_whoUri", js.undefined)
    @scala.inline
    def setBlob(value: base64Binary): Self = this.set("blob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlob: Self = this.set("blob", js.undefined)
    @scala.inline
    def setContentType(value: code): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setOnBehalfOfReference(value: Reference): Self = this.set("onBehalfOfReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBehalfOfReference: Self = this.set("onBehalfOfReference", js.undefined)
    @scala.inline
    def setOnBehalfOfUri(value: uri): Self = this.set("onBehalfOfUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBehalfOfUri: Self = this.set("onBehalfOfUri", js.undefined)
    @scala.inline
    def setWhoReference(value: Reference): Self = this.set("whoReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoReference: Self = this.set("whoReference", js.undefined)
    @scala.inline
    def setWhoUri(value: uri): Self = this.set("whoUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhoUri: Self = this.set("whoUri", js.undefined)
  }
  
}

