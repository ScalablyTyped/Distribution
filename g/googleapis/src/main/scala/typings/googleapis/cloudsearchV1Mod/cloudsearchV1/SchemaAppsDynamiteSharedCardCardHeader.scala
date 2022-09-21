package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedCardCardHeader extends StObject {
  
  /**
    * The alternative text of this image which is used for accessibility.
    */
  var imageAltText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The image's type.
    */
  var imageType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of the image in the card header.
    */
  var imageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The subtitle of the card header.
    */
  var subtitle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The title of the card header. The title must be specified. The header has a fixed height: if both a title and subtitle are specified, each takes up one line. If only the title is specified, it takes up both lines.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedCardCardHeader {
  
  inline def apply(): SchemaAppsDynamiteSharedCardCardHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedCardCardHeader]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedCardCardHeader](x: Self) {
    
    inline def setImageAltText(value: String): Self = StObject.set(x, "imageAltText", value.asInstanceOf[js.Any])
    
    inline def setImageAltTextNull: Self = StObject.set(x, "imageAltText", null)
    
    inline def setImageAltTextUndefined: Self = StObject.set(x, "imageAltText", js.undefined)
    
    inline def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
    
    inline def setImageTypeNull: Self = StObject.set(x, "imageType", null)
    
    inline def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlNull: Self = StObject.set(x, "imageUrl", null)
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
