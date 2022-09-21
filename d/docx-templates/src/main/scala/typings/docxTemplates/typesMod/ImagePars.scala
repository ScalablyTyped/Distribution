package typings.docxTemplates.typesMod

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
  var data: js.typedarray.ArrayBuffer | String
  
  /**
    * One of '.png', '.gif', '.jpg', '.jpeg', '.svg'.
    */
  var `extension`: ImageExtension
  
  /**
    * Desired height of the image in centimeters.
    */
  var height: Double
  
  /**
    * Optional rotation in degrees, with positive angles moving clockwise.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  
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
  
  inline def apply(
    data: js.typedarray.ArrayBuffer | String,
    `extension`: ImageExtension,
    height: Double,
    width: Double
  ): ImagePars = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePars]
  }
  
  extension [Self <: ImagePars](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setData(value: js.typedarray.ArrayBuffer | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setExtension(value: ImageExtension): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setThumbnail(value: Image): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
