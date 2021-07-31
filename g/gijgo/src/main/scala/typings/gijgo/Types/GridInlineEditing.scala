package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridInlineEditing extends StObject {
  
  var managementColumn: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
}
object GridInlineEditing {
  
  @scala.inline
  def apply(): GridInlineEditing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridInlineEditing]
  }
  
  @scala.inline
  implicit class GridInlineEditingMutableBuilder[Self <: GridInlineEditing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagementColumn(value: Boolean): Self = StObject.set(x, "managementColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagementColumnUndefined: Self = StObject.set(x, "managementColumn", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
