package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCardV1ImageComponent extends StObject {
  
  /**
    * The accessibility label for the image.
    */
  var altText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The border style to apply to the image.
    */
  var borderStyle: js.UndefOr[SchemaGoogleAppsCardV1BorderStyle] = js.undefined
  
  /**
    * The crop style to apply to the image.
    */
  var cropStyle: js.UndefOr[SchemaGoogleAppsCardV1ImageCropStyle] = js.undefined
  
  /**
    * The image URL.
    */
  var imageUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsCardV1ImageComponent {
  
  inline def apply(): SchemaGoogleAppsCardV1ImageComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCardV1ImageComponent]
  }
  
  extension [Self <: SchemaGoogleAppsCardV1ImageComponent](x: Self) {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextNull: Self = StObject.set(x, "altText", null)
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setBorderStyle(value: SchemaGoogleAppsCardV1BorderStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setCropStyle(value: SchemaGoogleAppsCardV1ImageCropStyle): Self = StObject.set(x, "cropStyle", value.asInstanceOf[js.Any])
    
    inline def setCropStyleUndefined: Self = StObject.set(x, "cropStyle", js.undefined)
    
    inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriNull: Self = StObject.set(x, "imageUri", null)
    
    inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
  }
}
