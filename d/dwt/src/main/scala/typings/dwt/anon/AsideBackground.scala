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
  
  @scala.inline
  def apply(): AsideBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsideBackground]
  }
  
  @scala.inline
  implicit class AsideBackgroundMutableBuilder[Self <: AsideBackground] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsideBackground(value: String): Self = StObject.set(x, "asideBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsideBackgroundUndefined: Self = StObject.set(x, "asideBackground", js.undefined)
    
    @scala.inline
    def setBottomMenuBackground(value: String): Self = StObject.set(x, "bottomMenuBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomMenuBackgroundUndefined: Self = StObject.set(x, "bottomMenuBackground", js.undefined)
    
    @scala.inline
    def setCanvasBackground(value: String): Self = StObject.set(x, "canvasBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasBackgroundUndefined: Self = StObject.set(x, "canvasBackground", js.undefined)
    
    @scala.inline
    def setTopMenuBackground(value: String): Self = StObject.set(x, "topMenuBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopMenuBackgroundUndefined: Self = StObject.set(x, "topMenuBackground", js.undefined)
  }
}
