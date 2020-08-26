package typings.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a structure used by Map to hold key-value pairs.
  */
@js.native
trait KeyValuePair[K, V] extends js.Object {
  // undocumented
  var key: K = js.native
  var value: V = js.native
}

object KeyValuePair {
  @scala.inline
  def apply[K, V](key: K, value: V): KeyValuePair[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValuePair[K, V]]
  }
  @scala.inline
  implicit class KeyValuePairOps[Self <: KeyValuePair[_, _], K, V] (val x: Self with (KeyValuePair[K, V])) extends AnyVal {
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
    def setKey(value: K): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: V): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

