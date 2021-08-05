package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCardHeader extends StObject {
  
  /**
    * The image&#39;s type (e.g. square border or circular border).
    */
  var imageStyle: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the image in the card header.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The subtitle of the card header.
    */
  var subtitle: js.UndefOr[String] = js.undefined
  
  /**
    * The title must be specified. The header has a fixed height: if both a
    * title and subtitle is specified, each will take up 1 line. If only the
    * title is specified, it will take up both lines.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaCardHeader {
  
  inline def apply(): SchemaCardHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCardHeader]
  }
  
  extension [Self <: SchemaCardHeader](x: Self) {
    
    inline def setImageStyle(value: String): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
    
    inline def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
