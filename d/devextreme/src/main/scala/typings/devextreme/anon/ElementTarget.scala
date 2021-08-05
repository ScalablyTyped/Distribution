package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.basePointObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementTarget extends StObject {
  
  var component: js.UndefOr[js.Any] = js.undefined
  
  var element: js.UndefOr[js.Any] = js.undefined
  
  var target: js.UndefOr[basePointObject] = js.undefined
}
object ElementTarget {
  
  inline def apply(): ElementTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementTarget]
  }
  
  extension [Self <: ElementTarget](x: Self) {
    
    inline def setComponent(value: js.Any): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setTarget(value: basePointObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
