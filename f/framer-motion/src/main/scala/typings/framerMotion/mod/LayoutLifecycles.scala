package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutLifecycles extends StObject {
  
  var onBeforeLayoutMeasure: js.UndefOr[js.Function1[/* box */ Box, Unit]] = js.undefined
  
  var onLayoutMeasure: js.UndefOr[js.Function2[/* box */ Box, /* prevBox */ Box, Unit]] = js.undefined
}
object LayoutLifecycles {
  
  inline def apply(): LayoutLifecycles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutLifecycles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayoutLifecycles] (val x: Self) extends AnyVal {
    
    inline def setOnBeforeLayoutMeasure(value: /* box */ Box => Unit): Self = StObject.set(x, "onBeforeLayoutMeasure", js.Any.fromFunction1(value))
    
    inline def setOnBeforeLayoutMeasureUndefined: Self = StObject.set(x, "onBeforeLayoutMeasure", js.undefined)
    
    inline def setOnLayoutMeasure(value: (/* box */ Box, /* prevBox */ Box) => Unit): Self = StObject.set(x, "onLayoutMeasure", js.Any.fromFunction2(value))
    
    inline def setOnLayoutMeasureUndefined: Self = StObject.set(x, "onLayoutMeasure", js.undefined)
  }
}
