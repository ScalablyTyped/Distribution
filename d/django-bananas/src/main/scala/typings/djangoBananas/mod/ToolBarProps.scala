package typings.djangoBananas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolBarProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
}
object ToolBarProps {
  
  inline def apply(): ToolBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolBarProps]
  }
  
  extension [Self <: ToolBarProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
