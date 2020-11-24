package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxGalleryItem extends CollectionWidgetItem {
  
  /**
    * [descr:dxGalleryItem.imageAlt]
    */
  var imageAlt: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxGalleryItem.imageSrc]
    */
  var imageSrc: js.UndefOr[String] = js.native
}
object dxGalleryItem {
  
  @scala.inline
  def apply(): dxGalleryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGalleryItem]
  }
  
  @scala.inline
  implicit class dxGalleryItemOps[Self <: dxGalleryItem] (val x: Self) extends AnyVal {
    
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
    def setImageAlt(value: String): Self = this.set("imageAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageAlt: Self = this.set("imageAlt", js.undefined)
    
    @scala.inline
    def setImageSrc(value: String): Self = this.set("imageSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSrc: Self = this.set("imageSrc", js.undefined)
  }
}
