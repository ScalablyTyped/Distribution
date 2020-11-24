package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Content in a format defined elsewhere
  */
@js.native
trait Attachment extends Element {
  
  /**
    * Contains extended information for property 'contentType'.
    */
  var _contentType: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'creation'.
    */
  var _creation: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'data'.
    */
  var _data: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'hash'.
    */
  var _hash: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'size'.
    */
  var _size: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  
  /**
    * Mime type of the content, with charset etc.
    */
  var contentType: js.UndefOr[code] = js.native
  
  /**
    * Date attachment was first created
    */
  var creation: js.UndefOr[dateTime] = js.native
  
  /**
    * Data inline, base64ed
    */
  var data: js.UndefOr[base64Binary] = js.native
  
  /**
    * Hash of the data (sha-1, base64ed)
    */
  var hash: js.UndefOr[base64Binary] = js.native
  
  /**
    * Human language of the content (BCP-47)
    */
  var language: js.UndefOr[code] = js.native
  
  /**
    * Number of bytes of content (if url provided)
    */
  var size: js.UndefOr[unsignedInt] = js.native
  
  /**
    * Label to display in place of the data
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Uri where the data can be found
    */
  var url: js.UndefOr[uri] = js.native
}
object Attachment {
  
  @scala.inline
  def apply(): Attachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attachment]
  }
  
  @scala.inline
  implicit class AttachmentOps[Self <: Attachment] (val x: Self) extends AnyVal {
    
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
    def set_contentType(value: Element): Self = this.set("_contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_contentType: Self = this.set("_contentType", js.undefined)
    
    @scala.inline
    def set_creation(value: Element): Self = this.set("_creation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_creation: Self = this.set("_creation", js.undefined)
    
    @scala.inline
    def set_data(value: Element): Self = this.set("_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_data: Self = this.set("_data", js.undefined)
    
    @scala.inline
    def set_hash(value: Element): Self = this.set("_hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_hash: Self = this.set("_hash", js.undefined)
    
    @scala.inline
    def set_language(value: Element): Self = this.set("_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_language: Self = this.set("_language", js.undefined)
    
    @scala.inline
    def set_size(value: Element): Self = this.set("_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_size: Self = this.set("_size", js.undefined)
    
    @scala.inline
    def set_title(value: Element): Self = this.set("_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_title: Self = this.set("_title", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = this.set("_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_url: Self = this.set("_url", js.undefined)
    
    @scala.inline
    def setContentType(value: code): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setCreation(value: dateTime): Self = this.set("creation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreation: Self = this.set("creation", js.undefined)
    
    @scala.inline
    def setData(value: base64Binary): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setHash(value: base64Binary): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setLanguage(value: code): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setSize(value: unsignedInt): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUrl(value: uri): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
