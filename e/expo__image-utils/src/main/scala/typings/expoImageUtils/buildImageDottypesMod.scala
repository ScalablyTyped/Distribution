package typings.expoImageUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildImageDottypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoImageUtils.expoImageUtilsStrings.input
    - typings.expoImageUtils.expoImageUtilsStrings.jpeg
    - typings.expoImageUtils.expoImageUtilsStrings.jpg
    - typings.expoImageUtils.expoImageUtilsStrings.png
    - typings.expoImageUtils.expoImageUtilsStrings.raw
    - typings.expoImageUtils.expoImageUtilsStrings.tiff
    - typings.expoImageUtils.expoImageUtilsStrings.webp
  */
  trait ImageFormat extends StObject
  object ImageFormat {
    
    inline def input: typings.expoImageUtils.expoImageUtilsStrings.input = "input".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.input]
    
    inline def jpeg: typings.expoImageUtils.expoImageUtilsStrings.jpeg = "jpeg".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.jpeg]
    
    inline def jpg: typings.expoImageUtils.expoImageUtilsStrings.jpg = "jpg".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.jpg]
    
    inline def png: typings.expoImageUtils.expoImageUtilsStrings.png = "png".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.png]
    
    inline def raw: typings.expoImageUtils.expoImageUtilsStrings.raw = "raw".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.raw]
    
    inline def tiff: typings.expoImageUtils.expoImageUtilsStrings.tiff = "tiff".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.tiff]
    
    inline def webp: typings.expoImageUtils.expoImageUtilsStrings.webp = "webp".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.webp]
  }
  
  trait ImageOptions extends StObject {
    
    var backgroundColor: String
    
    var borderRadius: js.UndefOr[Double] = js.undefined
    
    var height: Double
    
    var name: js.UndefOr[String] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var removeTransparency: js.UndefOr[Boolean] = js.undefined
    
    var resizeMode: ResizeMode
    
    var src: String
    
    var width: Double
  }
  object ImageOptions {
    
    inline def apply(backgroundColor: String, height: Double, resizeMode: ResizeMode, src: String, width: Double): ImageOptions = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], resizeMode = resizeMode.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageOptions] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRemoveTransparency(value: Boolean): Self = StObject.set(x, "removeTransparency", value.asInstanceOf[js.Any])
      
      inline def setRemoveTransparencyUndefined: Self = StObject.set(x, "removeTransparency", js.undefined)
      
      inline def setResizeMode(value: ResizeMode): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoImageUtils.expoImageUtilsStrings.contain
    - typings.expoImageUtils.expoImageUtilsStrings.cover
    - typings.expoImageUtils.expoImageUtilsStrings.fill
    - typings.expoImageUtils.expoImageUtilsStrings.inside
    - typings.expoImageUtils.expoImageUtilsStrings.outside
  */
  trait ResizeMode extends StObject
  object ResizeMode {
    
    inline def contain: typings.expoImageUtils.expoImageUtilsStrings.contain = "contain".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.contain]
    
    inline def cover: typings.expoImageUtils.expoImageUtilsStrings.cover = "cover".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.cover]
    
    inline def fill: typings.expoImageUtils.expoImageUtilsStrings.fill = "fill".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.fill]
    
    inline def inside: typings.expoImageUtils.expoImageUtilsStrings.inside = "inside".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.inside]
    
    inline def outside: typings.expoImageUtils.expoImageUtilsStrings.outside = "outside".asInstanceOf[typings.expoImageUtils.expoImageUtilsStrings.outside]
  }
}
