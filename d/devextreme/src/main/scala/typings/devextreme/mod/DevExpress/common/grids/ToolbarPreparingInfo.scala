package typings.devextreme.mod.DevExpress.common.grids

import typings.devextreme.mod.DevExpress.ui.dxToolbar.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarPreparingInfo extends StObject {
  
  var toolbarOptions: Properties[Any, Any]
}
object ToolbarPreparingInfo {
  
  inline def apply(toolbarOptions: Properties[Any, Any]): ToolbarPreparingInfo = {
    val __obj = js.Dynamic.literal(toolbarOptions = toolbarOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarPreparingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToolbarPreparingInfo] (val x: Self) extends AnyVal {
    
    inline def setToolbarOptions(value: Properties[Any, Any]): Self = StObject.set(x, "toolbarOptions", value.asInstanceOf[js.Any])
  }
}
