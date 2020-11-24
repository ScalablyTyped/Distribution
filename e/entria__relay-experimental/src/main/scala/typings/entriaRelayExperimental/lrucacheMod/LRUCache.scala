package typings.entriaRelayExperimental.lrucacheMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JS maps (both plain objects and Map) maintain key insertion
  * order, which means there is an easy way to simulate LRU behavior
  * that should also perform quite well:
  *
  * To insert a new value, first delete the key from the inner _map,
  * then _map.set(k, v). By deleting and reinserting, you ensure that the
  * map sees the key as the last inserted key.
  *
  * Get does the same: if the key is present, delete and reinsert it.
  */
@js.native
trait LRUCache[T] extends Cache[T] {
  
  var _capacity: Double = js.native
  
  var _map: Map[String, T] = js.native
}
object LRUCache {
  
  @scala.inline
  def apply[T](
    _capacity: Double,
    _map: Map[String, T],
    capacity: () => Double,
    clear: () => Unit,
    delete: String => Unit,
    get: String => T | Null,
    has: String => Boolean,
    set: (String, T) => Unit,
    size: () => Double
  ): LRUCache[T] = {
    val __obj = js.Dynamic.literal(_capacity = _capacity.asInstanceOf[js.Any], _map = _map.asInstanceOf[js.Any], capacity = js.Any.fromFunction0(capacity), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[LRUCache[T]]
  }
  
  @scala.inline
  implicit class LRUCacheOps[Self <: LRUCache[_], T] (val x: Self with LRUCache[T]) extends AnyVal {
    
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
    def set_capacity(value: Double): Self = this.set("_capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_map(value: Map[String, T]): Self = this.set("_map", value.asInstanceOf[js.Any])
  }
}
