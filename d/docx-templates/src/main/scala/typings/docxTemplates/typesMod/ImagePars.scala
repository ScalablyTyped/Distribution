package typings.docxTemplates.typesMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePars extends js.Object {
  
  /**
    * Optional alt text.
    */
  var alt: js.UndefOr[String] = js.native
  
  /**
    * Either an ArrayBuffer or a base64 string with the image data.
    */
  var data: ArrayBuffer | String = js.native
  
  /**
    * One of '.png', '.gif', '.jpg', '.jpeg', '.svg'.
    */
  var extension: ImageExtension = js.native
  
  /**
    * Desired height of the image in centimeters.
    */
  var height: Double = js.native
  
  /**
    * Optional. When injecting an SVG image, a fallback non-SVG (png/jpg/gif, etc.) image can be provided. This thumbnail is used when SVG images are not supported (e.g. older versions of Word) or when the document is previewed by e.g. Windows Explorer. See usage example below.
    */
  var thumbnail: js.UndefOr[Image] = js.native
  
  /**
    * Desired width of the image in centimeters.
    */
  var width: Double = js.native
}
object ImagePars {
  
  @scala.inline
  def apply(data: ArrayBuffer | String, extension: ImageExtension, height: Double, width: Double): ImagePars = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePars]
  }
  
  @scala.inline
  implicit class ImageParsOps[Self <: ImagePars] (val x: Self) extends AnyVal {
    
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
    def setData(value: ArrayBuffer | String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension(value: ImageExtension): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setThumbnail(value: Image): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
  }
}
