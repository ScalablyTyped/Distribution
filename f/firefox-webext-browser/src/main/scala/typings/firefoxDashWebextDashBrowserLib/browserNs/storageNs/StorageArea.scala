package typings
package firefoxDashWebextDashBrowserLib.browserNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageArea extends js.Object {
  /**
    * Gets the amount of space (in bytes) being used by one or more items.
    * @param [keys] A single key or list of keys to get the total usage for. An empty list will return 0\. Pass in
    *     `null` to get the total usage of all of storage.
    * @deprecated Unsupported on Firefox at this time.
    */
  var getBytesInUse: js.UndefOr[
    js.Function1[
      /* keys */ js.UndefOr[java.lang.String | js.Array[java.lang.String]], 
      js.Promise[scala.Double]
    ]
  ] = js.native
  /** Removes all items from storage. */
  def clear(): js.Promise[scala.Unit] = js.native
  /**
    * Gets one or more items from storage.
    * @param [keys] A single key to get, list of keys to get, or a dictionary specifying default values (see
    *     description of the object). An empty list or object will return an empty result object. Pass in `null`
    *     to get the entire contents of storage.
    */
  def get(): js.Promise[_] = js.native
  def get(keys: java.lang.String): js.Promise[_] = js.native
  def get(keys: js.Array[java.lang.String]): js.Promise[_] = js.native
  def get(keys: js.Object): js.Promise[_] = js.native
  /**
    * Removes one or more items from storage.
    * @param keys A single key or a list of keys for items to remove.
    */
  def remove(keys: java.lang.String): js.Promise[scala.Unit] = js.native
  def remove(keys: js.Array[java.lang.String]): js.Promise[scala.Unit] = js.native
  /**
    * Sets multiple items.
    * @param items An object which gives each key/value pair to update storage with. Any other key/value pairs in
    *     storage will not be affected.
    *
    * Primitive values such as numbers will serialize as expected. Values with a `typeof` `"object"` and
    *     `"function"` will typically serialize to `{}`, with the exception of `Array` (serializes as expected),
    *     `Date`, and `Regex` (serialize using their `String` representation).
    */
  def set(items: js.Any): js.Promise[scala.Unit] = js.native
}

