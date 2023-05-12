package typings.framerMotion.mod

import typings.framerMotion.framerMotionStrings.all
import typings.framerMotion.framerMotionStrings.any
import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InViewOptions extends StObject {
  
  var amount: js.UndefOr[any | all | Double] = js.undefined
  
  var margin: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[Element | Document] = js.undefined
}
object InViewOptions {
  
  inline def apply(): InViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InViewOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InViewOptions] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: any | all | Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setRoot(value: Element | Document): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
