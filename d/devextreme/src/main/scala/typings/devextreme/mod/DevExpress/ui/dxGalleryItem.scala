package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxGalleryItem
  extends StObject
     with CollectionWidgetItem {
  
  /**
    * Specifies the text passed to the alt attribute of the image markup element.
    */
  var imageAlt: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the URL of the image displayed by the item.
    */
  var imageSrc: js.UndefOr[String] = js.undefined
}
object dxGalleryItem {
  
  inline def apply(): dxGalleryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGalleryItem]
  }
  
  extension [Self <: dxGalleryItem](x: Self) {
    
    inline def setImageAlt(value: String): Self = StObject.set(x, "imageAlt", value.asInstanceOf[js.Any])
    
    inline def setImageAltUndefined: Self = StObject.set(x, "imageAlt", js.undefined)
    
    inline def setImageSrc(value: String): Self = StObject.set(x, "imageSrc", value.asInstanceOf[js.Any])
    
    inline def setImageSrcUndefined: Self = StObject.set(x, "imageSrc", js.undefined)
  }
}
