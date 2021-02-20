package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginalRoute extends StObject {
  
  var component: js.UndefOr[dxMap] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var options: js.UndefOr[js.Any] = js.native
  
  var originalRoute: js.UndefOr[js.Any] = js.native
}
object OriginalRoute {
  
  @scala.inline
  def apply(): OriginalRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginalRoute]
  }
  
  @scala.inline
  implicit class OriginalRouteMutableBuilder[Self <: OriginalRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxMap): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
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
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOriginalRoute(value: js.Any): Self = StObject.set(x, "originalRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalRouteUndefined: Self = StObject.set(x, "originalRoute", js.undefined)
  }
}
