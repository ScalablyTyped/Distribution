package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey[K, V] extends js.Object {
  var key: K
  var value: V
}

object AnonKey {
  @scala.inline
  def apply[K, V](key: K, value: V): AnonKey[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey[K, V]]
  }
}

