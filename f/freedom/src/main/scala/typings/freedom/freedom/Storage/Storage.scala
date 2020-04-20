package typings.freedom.freedom.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage extends js.Object {
  // Remove all data from storage.
  def clear(): js.Promise[Unit]
  // Fetch a value for a key.
  def get(key: String): js.Promise[String]
  // Fetch array of all keys.
  def keys(): js.Promise[js.Array[String]]
  // Remove a single key. Fulfills promise with previous value, if exists.
  def remove(key: String): js.Promise[String]
  // Sets a value to a key. Fulfills promise with the previous value, if it
  // exists.
  def set(key: String, value: String): js.Promise[String]
}

object Storage {
  @scala.inline
  def apply(
    clear: () => js.Promise[Unit],
    get: String => js.Promise[String],
    keys: () => js.Promise[js.Array[String]],
    remove: String => js.Promise[String],
    set: (String, String) => js.Promise[String]
  ): Storage = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), keys = js.Any.fromFunction0(keys), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Storage]
  }
}

