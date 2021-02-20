package typings.diff.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayOptions[TLeft, TRight] extends BaseOptions {
  
  /**
    * Comparator for custom equality checks.
    */
  var comparator: js.UndefOr[js.Function2[/* left */ TLeft, /* right */ TRight, Boolean]] = js.native
}
object ArrayOptions {
  
  @scala.inline
  def apply[TLeft, TRight](): ArrayOptions[TLeft, TRight] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayOptions[TLeft, TRight]]
  }
  
  @scala.inline
  implicit class ArrayOptionsMutableBuilder[Self <: ArrayOptions[_, _], TLeft, TRight] (val x: Self with (ArrayOptions[TLeft, TRight])) extends AnyVal {
    
    @scala.inline
    def setComparator(value: (/* left */ TLeft, /* right */ TRight) => Boolean): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
  }
}
