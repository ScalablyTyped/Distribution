package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxTagBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiTagElement extends StObject {
  
  var cancel: js.UndefOr[Boolean] = js.undefined
  
  var component: js.UndefOr[dxTagBox] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var multiTagElement: js.UndefOr[dxElement] = js.undefined
  
  var selectedItems: js.UndefOr[js.Array[String | Double | js.Any]] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object MultiTagElement {
  
  @scala.inline
  def apply(): MultiTagElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiTagElement]
  }
  
  @scala.inline
  implicit class MultiTagElementMutableBuilder[Self <: MultiTagElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setComponent(value: dxTagBox): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
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
    def setMultiTagElement(value: dxElement): Self = StObject.set(x, "multiTagElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiTagElementUndefined: Self = StObject.set(x, "multiTagElement", js.undefined)
    
    @scala.inline
    def setSelectedItems(value: js.Array[String | Double | js.Any]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    @scala.inline
    def setSelectedItemsVarargs(value: (String | Double | js.Any)*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
