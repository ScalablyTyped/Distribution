package typings.fabric.fabricImplMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUtilDomStyle extends StObject {
  
  /**
    * Cross-browser wrapper for setting element's style
    */
  def setStyle(element: HTMLElement, styles: Any): HTMLElement
}
object IUtilDomStyle {
  
  inline def apply(setStyle: (HTMLElement, Any) => HTMLElement): IUtilDomStyle = {
    val __obj = js.Dynamic.literal(setStyle = js.Any.fromFunction2(setStyle))
    __obj.asInstanceOf[IUtilDomStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUtilDomStyle] (val x: Self) extends AnyVal {
    
    inline def setSetStyle(value: (HTMLElement, Any) => HTMLElement): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
  }
}
