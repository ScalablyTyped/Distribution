package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromIndexItemData extends StObject {
  
  var fromIndex: js.UndefOr[Double] = js.undefined
  
  var itemData: js.UndefOr[js.Any] = js.undefined
  
  var itemElement: js.UndefOr[dxElement] = js.undefined
}
object FromIndexItemData {
  
  @scala.inline
  def apply(): FromIndexItemData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromIndexItemData]
  }
  
  @scala.inline
  implicit class FromIndexItemDataMutableBuilder[Self <: FromIndexItemData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromIndexUndefined: Self = StObject.set(x, "fromIndex", js.undefined)
    
    @scala.inline
    def setItemData(value: js.Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
    
    @scala.inline
    def setItemElement(value: dxElement): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
  }
}
