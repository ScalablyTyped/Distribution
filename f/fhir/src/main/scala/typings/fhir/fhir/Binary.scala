package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pure binary content defined by a format other than FHIR
  */
@js.native
trait Binary
  extends ResourceBase
     with Resource {
  /**
    * Contains extended information for property 'content'.
    */
  var _content: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'contentType'.
    */
  var _contentType: js.UndefOr[Element] = js.native
  /**
    * The actual content
    */
  var content: base64Binary = js.native
  /**
    * MimeType of the binary content
    */
  var contentType: code = js.native
  /**
    * Access Control Management
    */
  var securityContext: js.UndefOr[Reference] = js.native
}

object Binary {
  @scala.inline
  def apply(content: base64Binary, contentType: code): Binary = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
  @scala.inline
  implicit class BinaryOps[Self <: Binary] (val x: Self) extends AnyVal {
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
    def setContent(value: base64Binary): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: code): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def set_content(value: Element): Self = this.set("_content", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_content: Self = this.set("_content", js.undefined)
    @scala.inline
    def set_contentType(value: Element): Self = this.set("_contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_contentType: Self = this.set("_contentType", js.undefined)
    @scala.inline
    def setSecurityContext(value: Reference): Self = this.set("securityContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityContext: Self = this.set("securityContext", js.undefined)
  }
  
}

