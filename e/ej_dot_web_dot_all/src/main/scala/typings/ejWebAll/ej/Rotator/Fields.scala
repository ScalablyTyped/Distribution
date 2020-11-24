package typings.ejWebAll.ej.Rotator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fields extends js.Object {
  
  /** Specifies a link for the image.
    */
  var linkAttribute: js.UndefOr[String] = js.native
  
  /** Specifies where to open a given link.
    */
  var targetAttribute: js.UndefOr[String] = js.native
  
  /** Specifies a caption for the image.
    */
  var text: js.UndefOr[String] = js.native
  
  /** Specifies a caption for the thumbnail image.
    */
  var thumbnailText: js.UndefOr[String] = js.native
  
  /** Specifies the URL for an thumbnail image.
    */
  var thumbnailUrl: js.UndefOr[String] = js.native
  
  /** Specifies the URL for an image.
    */
  var url: js.UndefOr[String] = js.native
}
object Fields {
  
  @scala.inline
  def apply(): Fields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fields]
  }
  
  @scala.inline
  implicit class FieldsOps[Self <: Fields] (val x: Self) extends AnyVal {
    
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
    def setLinkAttribute(value: String): Self = this.set("linkAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkAttribute: Self = this.set("linkAttribute", js.undefined)
    
    @scala.inline
    def setTargetAttribute(value: String): Self = this.set("targetAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetAttribute: Self = this.set("targetAttribute", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setThumbnailText(value: String): Self = this.set("thumbnailText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailText: Self = this.set("thumbnailText", js.undefined)
    
    @scala.inline
    def setThumbnailUrl(value: String): Self = this.set("thumbnailUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailUrl: Self = this.set("thumbnailUrl", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
