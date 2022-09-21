package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCardV1Image extends StObject {
  
  /**
    * The alternative text of this image, used for accessibility.
    */
  var altText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An image URL.
    */
  var imageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The action triggered by an `onClick` event.
    */
  var onClick: js.UndefOr[SchemaGoogleAppsCardV1OnClick] = js.undefined
}
object SchemaGoogleAppsCardV1Image {
  
  inline def apply(): SchemaGoogleAppsCardV1Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCardV1Image]
  }
  
  extension [Self <: SchemaGoogleAppsCardV1Image](x: Self) {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextNull: Self = StObject.set(x, "altText", null)
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlNull: Self = StObject.set(x, "imageUrl", null)
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setOnClick(value: SchemaGoogleAppsCardV1OnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
