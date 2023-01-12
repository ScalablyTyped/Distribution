package typings.diff.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayOptions[TLeft, TRight]
  extends StObject
     with BaseOptions {
  
  /**
    * Comparator for custom equality checks.
    */
  var comparator: js.UndefOr[js.Function2[/* left */ TLeft, /* right */ TRight, Boolean]] = js.undefined
}
object ArrayOptions {
  
  inline def apply[TLeft, TRight](): ArrayOptions[TLeft, TRight] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayOptions[TLeft, TRight]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayOptions[?, ?], TLeft, TRight] (val x: Self & (ArrayOptions[TLeft, TRight])) extends AnyVal {
    
    inline def setComparator(value: (/* left */ TLeft, /* right */ TRight) => Boolean): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
  }
}
