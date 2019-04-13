package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a structure used by Map to hold key-value pairs.
  */
trait KeyValuePair[K, V] extends js.Object {
  // undocumented
  var key: K
  var value: V
}

object KeyValuePair {
  @scala.inline
  def apply[K, V](key: K, value: V): KeyValuePair[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyValuePair[K, V]]
  }
}

