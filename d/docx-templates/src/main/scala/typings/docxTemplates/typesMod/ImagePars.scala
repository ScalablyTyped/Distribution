package typings.docxTemplates.typesMod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagePars extends StObject {
  
  /**
    * Optional alt text.
    */
  var alt: js.UndefOr[String] = js.undefined
  
  /**
    * Either an ArrayBuffer or a base64 string with the image data.
    */
  var data: ArrayBuffer | String
  
  /**
    * One of '.png', '.gif', '.jpg', '.jpeg', '.svg'.
    */
  var `extension`: ImageExtension
  
  /**
    * Desired height of the image in centimeters.
    */
  var height: Double
  
  /**
    * Optional. When injecting an SVG image, a fallback non-SVG (png/jpg/gif, etc.) image can be provided. This thumbnail is used when SVG images are not supported (e.g. older versions of Word) or when the document is previewed by e.g. Windows Explorer. See usage example below.
    */
  var thumbnail: js.UndefOr[Image] = js.undefined
  
  /**
    * Desired width of the image in centimeters.
    */
  var width: Double
}
object ImagePars {
  
  @scala.inline
  def apply(data: ArrayBuffer | String, `extension`: ImageExtension, height: Double, width: Double): ImagePars = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePars]
  }
  
  @scala.inline
  implicit class ImageParsMutableBuilder[Self <: ImagePars] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setData(value: ArrayBuffer | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension(value: ImageExtension): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: Image): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
