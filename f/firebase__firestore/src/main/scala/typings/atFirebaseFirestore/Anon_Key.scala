package typings.atFirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key[K, V] extends js.Object {
  var key: K
  var value: V
}

object Anon_Key {
  @scala.inline
  def apply[K, V](key: K, value: V): Anon_Key[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Key[K, V]]
  }
}

