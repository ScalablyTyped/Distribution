package typings.expressBrute.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryStoreOptions extends js.Object {
  /**
    * @summary Key prefix.
    * @type {string}
    */
  var prefix: String
}

object MemoryStoreOptions {
  @scala.inline
  def apply(prefix: String): MemoryStoreOptions = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryStoreOptions]
  }
}

