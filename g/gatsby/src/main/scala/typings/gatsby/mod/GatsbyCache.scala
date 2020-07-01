package typings.gatsby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatsbyCache extends js.Object {
  /**
    * Retrieve cached value
    * @param key Cache key
    * @returns Promise resolving to cached value
    * @example
    * const value = await cache.get(`unique-key`)
    */
  def get(key: String): js.Promise[_]
  /**
    * Cache value
    * @param key Cache key
    * @param value Value to be cached
    * @returns Promise resolving to cached value
    * @example
    * await cache.set(`unique-key`, value)
    */
  def set(key: String, value: js.Any): js.Promise[_]
}

object GatsbyCache {
  @scala.inline
  def apply(get: String => js.Promise[_], set: (String, js.Any) => js.Promise[_]): GatsbyCache = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[GatsbyCache]
  }
}

