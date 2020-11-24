package typings.es6Shim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IterableShim[T] extends js.Object {
  
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
  implicit class IterableShimOps[Self <: IterableShim[_], T] (val x: Self with IterableShim[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def `set_es6-shim iterator_`(value: () => Iterator[T]): Self = this.set("_es6-shim iterator_", js.Any.fromFunction0(value))
  }
}
