package typings.floatingUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index extends StObject {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var overflows: js.Array[Overflows]
}
object Index {
  
  inline def apply(overflows: js.Array[Overflows]): Index = {
    val __obj = js.Dynamic.literal(overflows = overflows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setOverflows(value: js.Array[Overflows]): Self = StObject.set(x, "overflows", value.asInstanceOf[js.Any])
    
    inline def setOverflowsVarargs(value: Overflows*): Self = StObject.set(x, "overflows", js.Array(value*))
  }
}
