package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedImage extends StObject {
  
  /**
    * The alternative text of this image, used for accessibility.
    */
  var altText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An image URL.
    */
  var imageUrl: js.UndefOr[String | Null] = js.undefined
  
  var onClick: js.UndefOr[SchemaAppsDynamiteSharedOnClick] = js.undefined
}
object SchemaAppsDynamiteSharedImage {
  
  inline def apply(): SchemaAppsDynamiteSharedImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedImage]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedImage](x: Self) {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextNull: Self = StObject.set(x, "altText", null)
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlNull: Self = StObject.set(x, "imageUrl", null)
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setOnClick(value: SchemaAppsDynamiteSharedOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
