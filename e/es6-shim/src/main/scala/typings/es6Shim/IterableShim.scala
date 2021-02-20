package typings.es6Shim

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IterableShim[T] extends StObject {
  
  /**
    * Shim for an ES6 iterable. Not intended for direct use by user code.
    */
  def `_es6-shim iterator_`(): Iterator[T] = js.native
}
object IterableShim {
  
  @scala.inline
  def apply[T](`_es6-shim iterator_`: () => Iterator[T]): IterableShim[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_es6-shim iterator_")(js.Any.fromFunction0(`_es6-shim iterator_`))
    __obj.asInstanceOf[IterableShim[T]]
  }
  
  @scala.inline
  implicit class IterableShimMutableBuilder[Self <: IterableShim[_], T] (val x: Self with IterableShim[T]) extends AnyVal {
    
    @scala.inline
    def `set_es6-shim iterator_`(value: () => Iterator[T]): Self = StObject.set(x, "_es6-shim iterator_", js.Any.fromFunction0(value))
  }
}
