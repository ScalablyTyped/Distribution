package typings.expoPrebuildConfig.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColor extends StObject {
  
  var backgroundColor: String | Null
  
  var backgroundImage: String | Null
  
  var foregroundImage: String | Null
  
  var monochromeImage: String | Null
}
object BackgroundColor {
  
  inline def apply(): BackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = null, backgroundImage = null, foregroundImage = null, monochromeImage = null)
    __obj.asInstanceOf[BackgroundColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundColor] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
    
    inline def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageNull: Self = StObject.set(x, "backgroundImage", null)
    
    inline def setForegroundImage(value: String): Self = StObject.set(x, "foregroundImage", value.asInstanceOf[js.Any])
    
    inline def setForegroundImageNull: Self = StObject.set(x, "foregroundImage", null)
    
    inline def setMonochromeImage(value: String): Self = StObject.set(x, "monochromeImage", value.asInstanceOf[js.Any])
    
    inline def setMonochromeImageNull: Self = StObject.set(x, "monochromeImage", null)
  }
}
