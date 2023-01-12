package typings.expoPrebuildConfig.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundImage extends StObject {
  
  var backgroundColor: String | Null
  
  var backgroundImage: String | Null
  
  var icon: String | Null
  
  var isAdaptive: Boolean
}
object BackgroundImage {
  
  inline def apply(isAdaptive: Boolean): BackgroundImage = {
    val __obj = js.Dynamic.literal(isAdaptive = isAdaptive.asInstanceOf[js.Any], backgroundColor = null, backgroundImage = null, icon = null)
    __obj.asInstanceOf[BackgroundImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundImage] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
    
    inline def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageNull: Self = StObject.set(x, "backgroundImage", null)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIsAdaptive(value: Boolean): Self = StObject.set(x, "isAdaptive", value.asInstanceOf[js.Any])
  }
}
