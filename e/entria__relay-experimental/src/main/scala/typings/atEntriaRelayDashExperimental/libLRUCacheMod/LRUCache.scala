package typings.atEntriaRelayDashExperimental.libLRUCacheMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait LRUCache[T] extends Cache[T] {
  var _capacity: Double
  var _map: Map[String, T]
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
    val __obj = js.Dynamic.literal(_capacity = _capacity, _map = _map, capacity = js.Any.fromFunction0(capacity), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size))
  
    __obj.asInstanceOf[LRUCache[T]]
  }
}

