package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoResizeOptions extends StObject {
  
  /**
    * If `true`, the view's height will grow and shrink together with the window.
    * `false` by default.
    */
  var height: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the view's x position and width will grow and shrink proportionally
    * with the window. `false` by default.
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the view's y position and height will grow and shrink proportionally
    * with the window. `false` by default.
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the view's width will grow and shrink together with the window.
    * `false` by default.
    */
  var width: js.UndefOr[Boolean] = js.undefined
}
object AutoResizeOptions {
  
  inline def apply(): AutoResizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoResizeOptions]
  }
  
  extension [Self <: AutoResizeOptions](x: Self) {
    
    inline def setHeight(value: Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    
    inline def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
