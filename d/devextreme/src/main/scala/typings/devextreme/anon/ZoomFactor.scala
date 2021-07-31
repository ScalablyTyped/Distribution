package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.viz.dxVectorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoomFactor extends StObject {
  
  var component: js.UndefOr[dxVectorMap] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var zoomFactor: js.UndefOr[Double] = js.undefined
}
object ZoomFactor {
  
  @scala.inline
  def apply(): ZoomFactor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomFactor]
  }
  
  @scala.inline
  implicit class ZoomFactorMutableBuilder[Self <: ZoomFactor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxVectorMap): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
  }
}
