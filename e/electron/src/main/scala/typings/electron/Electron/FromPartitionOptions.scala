package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromPartitionOptions extends js.Object {
  /**
    * Whether to enable cache.
    */
  var cache: Boolean
}

object FromPartitionOptions {
  @scala.inline
  def apply(cache: Boolean): FromPartitionOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromPartitionOptions]
  }
}

