package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An image component that can be added to grid items.
  */
trait ImageComponent extends StObject {
  
  /**
    * Sets the alternative text of the image.
    */
  def setAltText(altText: String): ImageComponent
  
  /**
    * Sets the border style applied to the image.
    */
  def setBorderStyle(borderStyle: BorderStyle): ImageComponent
  
  /**
    * Sets the crop style for the image.
    */
  def setCropStyle(imageCropStyle: ImageCropStyle): ImageComponent
  
  /**
    * Sets the URL of the image.
    */
  def setImageUrl(url: String): ImageComponent
}
object ImageComponent {
  
  inline def apply(
    setAltText: String => ImageComponent,
    setBorderStyle: BorderStyle => ImageComponent,
    setCropStyle: ImageCropStyle => ImageComponent,
    setImageUrl: String => ImageComponent
  ): ImageComponent = {
    val __obj = js.Dynamic.literal(setAltText = js.Any.fromFunction1(setAltText), setBorderStyle = js.Any.fromFunction1(setBorderStyle), setCropStyle = js.Any.fromFunction1(setCropStyle), setImageUrl = js.Any.fromFunction1(setImageUrl))
    __obj.asInstanceOf[ImageComponent]
  }
  
  extension [Self <: ImageComponent](x: Self) {
    
    inline def setSetAltText(value: String => ImageComponent): Self = StObject.set(x, "setAltText", js.Any.fromFunction1(value))
    
    inline def setSetBorderStyle(value: BorderStyle => ImageComponent): Self = StObject.set(x, "setBorderStyle", js.Any.fromFunction1(value))
    
    inline def setSetCropStyle(value: ImageCropStyle => ImageComponent): Self = StObject.set(x, "setCropStyle", js.Any.fromFunction1(value))
    
    inline def setSetImageUrl(value: String => ImageComponent): Self = StObject.set(x, "setImageUrl", js.Any.fromFunction1(value))
  }
}
