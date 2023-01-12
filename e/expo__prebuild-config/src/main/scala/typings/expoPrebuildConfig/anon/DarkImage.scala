package typings.expoPrebuildConfig.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DarkImage extends StObject {
  
  var darkImage: String | Null
  
  var darkTabletImage: String | Null
  
  var image: String
  
  var tabletImage: String | Null
}
object DarkImage {
  
  inline def apply(image: String): DarkImage = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], darkImage = null, darkTabletImage = null, tabletImage = null)
    __obj.asInstanceOf[DarkImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DarkImage] (val x: Self) extends AnyVal {
    
    inline def setDarkImage(value: String): Self = StObject.set(x, "darkImage", value.asInstanceOf[js.Any])
    
    inline def setDarkImageNull: Self = StObject.set(x, "darkImage", null)
    
    inline def setDarkTabletImage(value: String): Self = StObject.set(x, "darkTabletImage", value.asInstanceOf[js.Any])
    
    inline def setDarkTabletImageNull: Self = StObject.set(x, "darkTabletImage", null)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setTabletImage(value: String): Self = StObject.set(x, "tabletImage", value.asInstanceOf[js.Any])
    
    inline def setTabletImageNull: Self = StObject.set(x, "tabletImage", null)
  }
}
