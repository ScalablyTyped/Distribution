package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImageComponent extends StObject {
  
  var altText: js.UndefOr[String | Null] = js.undefined
  
  var borderStyle: js.UndefOr[SchemaBorderStyle] = js.undefined
  
  var cropStyle: js.UndefOr[SchemaImageCropStyle] = js.undefined
  
  var imageUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaImageComponent {
  
  inline def apply(): SchemaImageComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageComponent]
  }
  
  extension [Self <: SchemaImageComponent](x: Self) {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextNull: Self = StObject.set(x, "altText", null)
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setBorderStyle(value: SchemaBorderStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setCropStyle(value: SchemaImageCropStyle): Self = StObject.set(x, "cropStyle", value.asInstanceOf[js.Any])
    
    inline def setCropStyleUndefined: Self = StObject.set(x, "cropStyle", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlNull: Self = StObject.set(x, "imageUrl", null)
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
  }
}
