package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.basePointObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementTarget extends StObject {
  
  var component: js.UndefOr[js.Any] = js.native
  
  var element: js.UndefOr[js.Any] = js.native
  
  var target: js.UndefOr[basePointObject] = js.native
}
object ElementTarget {
  
  @scala.inline
  def apply(): ElementTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementTarget]
  }
  
  @scala.inline
  implicit class ElementTargetMutableBuilder[Self <: ElementTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: js.Any): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setTarget(value: basePointObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
