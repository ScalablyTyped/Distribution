package typings.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsideBackground extends StObject {
  
  // Example: '#000000'
  var asideBackground: js.UndefOr[String] = js.undefined
  
  // Example: 'rgba(67,66,70,1)'
  var bottomMenuBackground: js.UndefOr[String] = js.undefined
  
  // Example: '#ffffff'
  var canvasBackground: js.UndefOr[String] = js.undefined
  
  var topMenuBackground: js.UndefOr[String] = js.undefined
}
object AsideBackground {
  
  inline def apply(): AsideBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsideBackground]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsideBackground] (val x: Self) extends AnyVal {
    
    inline def setAsideBackground(value: String): Self = StObject.set(x, "asideBackground", value.asInstanceOf[js.Any])
    
    inline def setAsideBackgroundUndefined: Self = StObject.set(x, "asideBackground", js.undefined)
    
    inline def setBottomMenuBackground(value: String): Self = StObject.set(x, "bottomMenuBackground", value.asInstanceOf[js.Any])
    
    inline def setBottomMenuBackgroundUndefined: Self = StObject.set(x, "bottomMenuBackground", js.undefined)
    
    inline def setCanvasBackground(value: String): Self = StObject.set(x, "canvasBackground", value.asInstanceOf[js.Any])
    
    inline def setCanvasBackgroundUndefined: Self = StObject.set(x, "canvasBackground", js.undefined)
    
    inline def setTopMenuBackground(value: String): Self = StObject.set(x, "topMenuBackground", value.asInstanceOf[js.Any])
    
    inline def setTopMenuBackgroundUndefined: Self = StObject.set(x, "topMenuBackground", js.undefined)
  }
}
