package typings.framerMotion.distThreeEntryMod

import typings.framerMotion.framerMotionStrings.all
import typings.framerMotion.framerMotionStrings.some
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewportOptions extends StObject {
  
  var amount: js.UndefOr[some | all | Double] = js.undefined
  
  var margin: js.UndefOr[String] = js.undefined
  
  var once: js.UndefOr[Boolean] = js.undefined
  
  var root: js.UndefOr[RefObject[Element]] = js.undefined
}
object ViewportOptions {
  
  inline def apply(): ViewportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewportOptions] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: some | all | Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    inline def setRoot(value: RefObject[Element]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
