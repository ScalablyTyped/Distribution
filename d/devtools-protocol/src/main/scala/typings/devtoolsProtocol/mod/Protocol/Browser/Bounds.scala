package typings.devtoolsProtocol.mod.Protocol.Browser

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bounds extends StObject {
  
  /**
    * The window height in pixels.
    */
  var height: js.UndefOr[integer] = js.undefined
  
  /**
    * The offset from the left edge of the screen to the window in pixels.
    */
  var left: js.UndefOr[integer] = js.undefined
  
  /**
    * The offset from the top edge of the screen to the window in pixels.
    */
  var top: js.UndefOr[integer] = js.undefined
  
  /**
    * The window width in pixels.
    */
  var width: js.UndefOr[integer] = js.undefined
  
  /**
    * The window state. Default to normal.
    */
  var windowState: js.UndefOr[WindowState] = js.undefined
}
object Bounds {
  
  @scala.inline
  def apply(): Bounds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bounds]
  }
  
  @scala.inline
  implicit class BoundsMutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLeft(value: integer): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setTop(value: integer): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWindowState(value: WindowState): Self = StObject.set(x, "windowState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowStateUndefined: Self = StObject.set(x, "windowState", js.undefined)
  }
}
