package typings.entriaRelayExperimental.lrucacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cache[T] extends js.Object {
  
  def capacity(): Double = js.native
  
  def clear(): Unit = js.native
  
  def delete(key: String): Unit = js.native
  
  def get(key: String): T | Null = js.native
  
  def has(key: String): Boolean = js.native
  
  def set(key: String, value: T): Unit = js.native
  
  def size(): Double = js.native
}
object Cache {
  
  @scala.inline
  def apply[T](
    capacity: () => Double,
    clear: () => Unit,
    delete: String => Unit,
    get: String => T | Null,
    has: String => Boolean,
    set: (String, T) => Unit,
    size: () => Double
  ): Cache[T] = {
    val __obj = js.Dynamic.literal(capacity = js.Any.fromFunction0(capacity), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[Cache[T]]
  }
  
  @scala.inline
  implicit class CacheOps[Self <: Cache[_], T] (val x: Self with Cache[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCapacity(value: () => Double): Self = this.set("capacity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: String => Unit): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => T | Null): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, T) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
  }
}
