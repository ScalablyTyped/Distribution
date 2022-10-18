package typings.floatingUiDom.anon

import typings.floatingUiCore.srcTypesMod.Padding
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var element: HTMLElement
  
  var padding: js.UndefOr[Padding] = js.undefined
}
object Element {
  
  inline def apply(element: HTMLElement): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
