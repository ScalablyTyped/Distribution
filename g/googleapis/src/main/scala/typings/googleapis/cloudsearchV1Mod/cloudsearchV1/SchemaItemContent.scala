package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Content of an item to be indexed and surfaced by Cloud Search.
  */
@js.native
trait SchemaItemContent extends js.Object {
  
  /**
    * Upload reference ID of a previously uploaded content via write method.
    */
  var contentDataRef: js.UndefOr[SchemaUploadItemRef] = js.native
  
  var contentFormat: js.UndefOr[String] = js.native
  
  /**
    * Hashing info calculated and provided by the API client for content. Can
    * be used with the items.push method to calculate modified state. The
    * maximum length is 2048 characters.
    */
  var hash: js.UndefOr[String] = js.native
  
  /**
    * Content that is supplied inlined within the update method. The maximum
    * length is 102400 bytes (100 KiB).
    */
  var inlineContent: js.UndefOr[String] = js.native
}
object SchemaItemContent {
  
  @scala.inline
  def apply(): SchemaItemContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItemContent]
  }
  
  @scala.inline
  implicit class SchemaItemContentOps[Self <: SchemaItemContent] (val x: Self) extends AnyVal {
    
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
    def setContentDataRef(value: SchemaUploadItemRef): Self = this.set("contentDataRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentDataRef: Self = this.set("contentDataRef", js.undefined)
    
    @scala.inline
    def setContentFormat(value: String): Self = this.set("contentFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentFormat: Self = this.set("contentFormat", js.undefined)
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setInlineContent(value: String): Self = this.set("inlineContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineContent: Self = this.set("inlineContent", js.undefined)
  }
}
