package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class that represents a crop style that can be applied to image components.
  */
trait ImageCropStyle extends StObject {
  
  /**
    * Sets the aspect ratio to use if the crop type is RECTANGLE_CUSTOM. The ratio must be a positive value.
    */
  def setAspectRatio(ratio: Double): ImageCropStyle
  
  /**
    * Sets the crop type for the image.
    */
  def setImageCropType(`type`: ImageCropType): ImageCropStyle
}
object ImageCropStyle {
  
  inline def apply(setAspectRatio: Double => ImageCropStyle, setImageCropType: ImageCropType => ImageCropStyle): ImageCropStyle = {
    val __obj = js.Dynamic.literal(setAspectRatio = js.Any.fromFunction1(setAspectRatio), setImageCropType = js.Any.fromFunction1(setImageCropType))
    __obj.asInstanceOf[ImageCropStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageCropStyle] (val x: Self) extends AnyVal {
    
    inline def setSetAspectRatio(value: Double => ImageCropStyle): Self = StObject.set(x, "setAspectRatio", js.Any.fromFunction1(value))
    
    inline def setSetImageCropType(value: ImageCropType => ImageCropStyle): Self = StObject.set(x, "setImageCropType", js.Any.fromFunction1(value))
  }
}
