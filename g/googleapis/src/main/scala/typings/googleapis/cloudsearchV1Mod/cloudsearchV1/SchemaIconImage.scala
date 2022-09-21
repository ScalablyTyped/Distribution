package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIconImage extends StObject {
  
  /**
    * The alternative text of this icon_url which will be used for accessibility.
    */
  var altText: js.UndefOr[String | Null] = js.undefined
  
  var icon: js.UndefOr[String | Null] = js.undefined
  
  var iconUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The image cropping style. Note that icons with a CIRCLE style are rendered larger than the default icon size.
    */
  var imageStyle: js.UndefOr[String | Null] = js.undefined
}
object SchemaIconImage {
  
  inline def apply(): SchemaIconImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIconImage]
  }
  
  extension [Self <: SchemaIconImage](x: Self) {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextNull: Self = StObject.set(x, "altText", null)
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlNull: Self = StObject.set(x, "iconUrl", null)
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setImageStyle(value: String): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
    
    inline def setImageStyleNull: Self = StObject.set(x, "imageStyle", null)
    
    inline def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
  }
}
