package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCardHeader extends StObject {
  
  /**
    * The alternative text of this image which will be used for accessibility.
    */
  var imageAltText: js.UndefOr[String | Null] = js.undefined
  
  var imageStyle: js.UndefOr[String | Null] = js.undefined
  
  var imageUrl: js.UndefOr[String | Null] = js.undefined
  
  var subtitle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The title must be specified. The header has a fixed height: if both a title and subtitle is specified, each will take up 1 line. If only the title is specified, it will take up both lines. The header is rendered in collapsed and detailed view.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaCardHeader {
  
  inline def apply(): SchemaCardHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCardHeader]
  }
  
  extension [Self <: SchemaCardHeader](x: Self) {
    
    inline def setImageAltText(value: String): Self = StObject.set(x, "imageAltText", value.asInstanceOf[js.Any])
    
    inline def setImageAltTextNull: Self = StObject.set(x, "imageAltText", null)
    
    inline def setImageAltTextUndefined: Self = StObject.set(x, "imageAltText", js.undefined)
    
    inline def setImageStyle(value: String): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
    
    inline def setImageStyleNull: Self = StObject.set(x, "imageStyle", null)
    
    inline def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
    
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
