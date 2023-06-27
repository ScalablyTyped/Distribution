package typings.floatingUiDom.srcTypesMod

import typings.floatingUiCore.srcTypesMod.Padding
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @floating-ui/dom.@floating-ui/dom/src/types.Prettify<std.Omit<@floating-ui/core.@floating-ui/core.ArrowOptions, 'element'> & {  element :std.Element}> */
trait ArrowOptions extends StObject {
  
  var element: Element
  
  var padding: js.UndefOr[Padding] = js.undefined
}
object ArrowOptions {
  
  inline def apply(element: Element): ArrowOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrowOptions] (val x: Self) extends AnyVal {
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
