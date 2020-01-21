package typings.firebaseFirestore.sortedMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry[K, V] extends js.Object {
  var key: K
  var value: V
}

object Entry {
  @scala.inline
  def apply[K, V](key: K, value: V): Entry[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Entry[K, V]]
  }
}

