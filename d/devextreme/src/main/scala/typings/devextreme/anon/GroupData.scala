package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupData extends StObject {
  
  var component: js.UndefOr[dxList] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var groupData: js.UndefOr[js.Any] = js.native
  
  var groupElement: js.UndefOr[dxElement] = js.native
  
  var groupIndex: js.UndefOr[Double] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
}
object GroupData {
  
  @scala.inline
  def apply(): GroupData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupData]
  }
  
  @scala.inline
  implicit class GroupDataMutableBuilder[Self <: GroupData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxList): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setGroupData(value: js.Any): Self = StObject.set(x, "groupData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupDataUndefined: Self = StObject.set(x, "groupData", js.undefined)
    
    @scala.inline
    def setGroupElement(value: dxElement): Self = StObject.set(x, "groupElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupElementUndefined: Self = StObject.set(x, "groupElement", js.undefined)
    
    @scala.inline
    def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
