package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.viz.basePointObject
import typings.devextreme.mod.DevExpress.viz.dxChartAnnotationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementModelTarget[T] extends StObject {
  
  var component: js.UndefOr[T] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var target: js.UndefOr[basePointObject | dxChartAnnotationConfig | js.Any] = js.undefined
}
object ElementModelTarget {
  
  @scala.inline
  def apply[T](): ElementModelTarget[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementModelTarget[T]]
  }
  
  @scala.inline
  implicit class ElementModelTargetMutableBuilder[Self <: ElementModelTarget[?], T] (val x: Self & ElementModelTarget[T]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
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
    def setTarget(value: basePointObject | dxChartAnnotationConfig | js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
