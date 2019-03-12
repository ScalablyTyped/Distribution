package typings
package freedomLib.freedomNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage extends js.Object {
  // Remove all data from storage.
  def clear(): js.Promise[scala.Unit]
  // Fetch a value for a key.
  def get(key: java.lang.String): js.Promise[java.lang.String]
  // Fetch array of all keys.
  def keys(): js.Promise[js.Array[java.lang.String]]
  // Remove a single key. Fulfills promise with previous value, if exists.
  def remove(key: java.lang.String): js.Promise[java.lang.String]
  // Sets a value to a key. Fulfills promise with the previous value, if it
  // exists.
  def set(key: java.lang.String, value: java.lang.String): js.Promise[java.lang.String]
}

object Storage {
  @scala.inline
  def apply(
    clear: () => js.Promise[scala.Unit],
    get: java.lang.String => js.Promise[java.lang.String],
    keys: () => js.Promise[js.Array[java.lang.String]],
    remove: java.lang.String => js.Promise[java.lang.String],
    set: (java.lang.String, java.lang.String) => js.Promise[java.lang.String]
  ): Storage = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), keys = js.Any.fromFunction0(keys), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[Storage]
  }
}

