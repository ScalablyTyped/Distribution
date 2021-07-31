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
  
  @scala.inline
  def apply(): PartialInputGroupAddonPro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInputGroupAddonPro]
  }
  
  @scala.inline
  implicit class PartialInputGroupAddonProMutableBuilder[Self <: PartialInputGroupAddonPro] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    @scala.inline
    def setIsButton(value: Boolean): Self = StObject.set(x, "isButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsButtonUndefined: Self = StObject.set(x, "isButton", js.undefined)
  }
}
