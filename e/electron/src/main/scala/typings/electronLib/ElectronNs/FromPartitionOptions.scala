package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromPartitionOptions extends js.Object {
  /**
    * Whether to enable cache.
    */
  var cache: scala.Boolean
}

object FromPartitionOptions {
  @scala.inline
  def apply(cache: scala.Boolean): FromPartitionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cache")(cache)
    __obj.asInstanceOf[FromPartitionOptions]
  }
}

