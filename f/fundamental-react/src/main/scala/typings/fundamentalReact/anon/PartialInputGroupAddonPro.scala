package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/InputGroup/InputGroup.InputGroupAddonProps> */
trait PartialInputGroupAddonPro extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var compact: js.UndefOr[Boolean] = js.undefined
  
  var isButton: js.UndefOr[Boolean] = js.undefined
}
object PartialInputGroupAddonPro {
  
  inline def apply(): PartialInputGroupAddonPro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInputGroupAddonPro]
  }
  
  extension [Self <: PartialInputGroupAddonPro](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    inline def setIsButton(value: Boolean): Self = StObject.set(x, "isButton", value.asInstanceOf[js.Any])
    
    inline def setIsButtonUndefined: Self = StObject.set(x, "isButton", js.undefined)
  }
}
