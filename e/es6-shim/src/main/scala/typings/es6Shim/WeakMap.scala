package typings.es6Shim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeakMap[K /* <: js.Object */, V] extends js.Object {
  
  def delete(key: K): Boolean = js.native
  
  def get(key: K): js.UndefOr[V] = js.native
  
  def has(key: K): Boolean = js.native
  
  def set(key: K, value: V): WeakMap[K, V] = js.native
}
object WeakMap {
  
  @scala.inline
  def apply[K /* <: js.Object */, V](delete: K => Boolean, get: K => js.UndefOr[V], has: K => Boolean, set: (K, V) => WeakMap[K, V]): WeakMap[K, V] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[WeakMap[K, V]]
  }
  
  @scala.inline
  implicit class WeakMapOps[Self <: WeakMap[_, _], K /* <: js.Object */, V] (val x: Self with (WeakMap[K, V])) extends AnyVal {
    
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
    def setDelete(value: K => Boolean): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: K => js.UndefOr[V]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: K => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (K, V) => WeakMap[K, V]): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
