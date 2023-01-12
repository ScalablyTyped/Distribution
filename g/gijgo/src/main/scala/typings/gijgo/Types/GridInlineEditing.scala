package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridInlineEditing extends StObject {
  
  var managementColumn: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
}
object GridInlineEditing {
  
  inline def apply(): GridInlineEditing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridInlineEditing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridInlineEditing] (val x: Self) extends AnyVal {
    
    inline def setManagementColumn(value: Boolean): Self = StObject.set(x, "managementColumn", value.asInstanceOf[js.Any])
    
    inline def setManagementColumnUndefined: Self = StObject.set(x, "managementColumn", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
