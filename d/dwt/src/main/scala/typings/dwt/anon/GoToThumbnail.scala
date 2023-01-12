package typings.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoToThumbnail extends StObject {
  
  // Example: '#0000ff',
  var goToThumbnail: js.UndefOr[Boolean] = js.undefined
  
  var iconClass: js.UndefOr[String] = js.undefined
  
  // Example: 'icon-tree',
  var selectedColor: js.UndefOr[String] = js.undefined
  
  var visibility: js.UndefOr[Boolean] = js.undefined
}
object GoToThumbnail {
  
  inline def apply(): GoToThumbnail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoToThumbnail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoToThumbnail] (val x: Self) extends AnyVal {
    
    inline def setGoToThumbnail(value: Boolean): Self = StObject.set(x, "goToThumbnail", value.asInstanceOf[js.Any])
    
    inline def setGoToThumbnailUndefined: Self = StObject.set(x, "goToThumbnail", js.undefined)
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
    
    inline def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
