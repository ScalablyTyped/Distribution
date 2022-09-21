package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A widget that shows an icon image.
  *
  *     var icon = CardService.newIconImage().setAltText("A nice icon").setIconUrl("https://example.com/icon.png");
  */
trait IconImage extends StObject {
  
  def setAltText(altText: String): IconImage
  
  def setIcon(icon: Icon): IconImage
  
  def setIconUrl(url: String): IconImage
  
  def setImageCropType(imageCropType: ImageCropType): IconImage
}
object IconImage {
  
  inline def apply(
    setAltText: String => IconImage,
    setIcon: Icon => IconImage,
    setIconUrl: String => IconImage,
    setImageCropType: ImageCropType => IconImage
  ): IconImage = {
    val __obj = js.Dynamic.literal(setAltText = js.Any.fromFunction1(setAltText), setIcon = js.Any.fromFunction1(setIcon), setIconUrl = js.Any.fromFunction1(setIconUrl), setImageCropType = js.Any.fromFunction1(setImageCropType))
    __obj.asInstanceOf[IconImage]
  }
  
  extension [Self <: IconImage](x: Self) {
    
    inline def setSetAltText(value: String => IconImage): Self = StObject.set(x, "setAltText", js.Any.fromFunction1(value))
    
    inline def setSetIcon(value: Icon => IconImage): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
    
    inline def setSetIconUrl(value: String => IconImage): Self = StObject.set(x, "setIconUrl", js.Any.fromFunction1(value))
    
    inline def setSetImageCropType(value: ImageCropType => IconImage): Self = StObject.set(x, "setImageCropType", js.Any.fromFunction1(value))
  }
}
