package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCardV1ImageCropStyle extends StObject {
  
  /**
    * The aspect ratio to use if the crop type is `RECTANGLE_CUSTOM`.
    */
  var aspectRatio: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The crop type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsCardV1ImageCropStyle {
  
  inline def apply(): SchemaGoogleAppsCardV1ImageCropStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCardV1ImageCropStyle]
  }
  
  extension [Self <: SchemaGoogleAppsCardV1ImageCropStyle](x: Self) {
    
    inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioNull: Self = StObject.set(x, "aspectRatio", null)
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
