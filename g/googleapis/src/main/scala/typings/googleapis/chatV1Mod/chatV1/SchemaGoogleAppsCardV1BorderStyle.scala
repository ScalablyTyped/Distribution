package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCardV1BorderStyle extends StObject {
  
  /**
    * The corner radius for the border.
    */
  var cornerRadius: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The colors to use when the type is `BORDER_TYPE_STROKE`.
    */
  var strokeColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The border type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsCardV1BorderStyle {
  
  inline def apply(): SchemaGoogleAppsCardV1BorderStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCardV1BorderStyle]
  }
  
  extension [Self <: SchemaGoogleAppsCardV1BorderStyle](x: Self) {
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusNull: Self = StObject.set(x, "cornerRadius", null)
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setStrokeColor(value: SchemaColor): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
