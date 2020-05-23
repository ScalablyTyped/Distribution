package typings.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key[K, V] extends js.Object {
  var key: K
  var value: V
}

object Key {
  @scala.inline
  def apply[K, V](key: K, value: V): Key[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key[K, V]]
  }
}

