package typings.expoPrebuildConfig.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabletBackgroundColor extends StObject {
  
  var backgroundColor: js.UndefOr[String | Null] = js.undefined
  
  var image: js.UndefOr[String | Null] = js.undefined
  
  var tabletBackgroundColor: js.UndefOr[String | Null] = js.undefined
  
  var tabletImage: js.UndefOr[String | Null] = js.undefined
}
object TabletBackgroundColor {
  
  inline def apply(): TabletBackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabletBackgroundColor]
  }
  
  extension [Self <: TabletBackgroundColor](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageNull: Self = StObject.set(x, "image", null)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setTabletBackgroundColor(value: String): Self = StObject.set(x, "tabletBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setTabletBackgroundColorNull: Self = StObject.set(x, "tabletBackgroundColor", null)
    
    inline def setTabletBackgroundColorUndefined: Self = StObject.set(x, "tabletBackgroundColor", js.undefined)
    
    inline def setTabletImage(value: String): Self = StObject.set(x, "tabletImage", value.asInstanceOf[js.Any])
    
    inline def setTabletImageNull: Self = StObject.set(x, "tabletImage", null)
    
    inline def setTabletImageUndefined: Self = StObject.set(x, "tabletImage", js.undefined)
  }
}
