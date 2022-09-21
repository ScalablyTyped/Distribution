package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChatV1WidgetMarkupImage extends StObject {
  
  /**
    * The aspect ratio of this image (width/height). This field allows clients to reserve the right height for the image while waiting for it to load. It's not meant to override the native aspect ratio of the image. If unset, the server fills it by prefetching the image.
    */
  var aspectRatio: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The URL of the image.
    */
  var imageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The onclick action.
    */
  var onClick: js.UndefOr[SchemaGoogleChatV1WidgetMarkupOnClick] = js.undefined
}
object SchemaGoogleChatV1WidgetMarkupImage {
  
  inline def apply(): SchemaGoogleChatV1WidgetMarkupImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChatV1WidgetMarkupImage]
  }
  
  extension [Self <: SchemaGoogleChatV1WidgetMarkupImage](x: Self) {
    
    inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioNull: Self = StObject.set(x, "aspectRatio", null)
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlNull: Self = StObject.set(x, "imageUrl", null)
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setOnClick(value: SchemaGoogleChatV1WidgetMarkupOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
