package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxLookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleElement extends StObject {
  
  var component: js.UndefOr[dxLookup] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var titleElement: js.UndefOr[dxElement] = js.undefined
}
object TitleElement {
  
  @scala.inline
  def apply(): TitleElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleElement]
  }
  
  @scala.inline
  implicit class TitleElementMutableBuilder[Self <: TitleElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxLookup): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
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
    def setTitleElement(value: dxElement): Self = StObject.set(x, "titleElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleElementUndefined: Self = StObject.set(x, "titleElement", js.undefined)
  }
}
