package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IViewport
  extends StObject
     with typings.extjs.Ext.container.IContainer {
  
  /** [Property] (Boolean) */
  var isViewport: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IViewport: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IViewport {
  
  @scala.inline
  def apply(): IViewport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IViewport]
  }
  
  @scala.inline
  implicit class IViewportMutableBuilder[Self <: IViewport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsViewport(value: Boolean): Self = StObject.set(x, "isViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsViewportUndefined: Self = StObject.set(x, "isViewport", js.undefined)
    
    @scala.inline
    def setOnRender(value: () => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
  }
}
