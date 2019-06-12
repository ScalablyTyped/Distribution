package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnixStreamOptions extends js.Object {
  /**
    * Whether the file descriptor should be closed when the stream is closed,
    * either through `close()` or future garbage-collection.
    */
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
}

object UnixStreamOptions {
  @scala.inline
  def apply(autoClose: js.UndefOr[scala.Boolean] = js.undefined): UnixStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    __obj.asInstanceOf[UnixStreamOptions]
  }
}

