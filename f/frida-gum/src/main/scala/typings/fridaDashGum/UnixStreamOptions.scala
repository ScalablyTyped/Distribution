package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnixStreamOptions extends js.Object {
  /**
    * Whether the file descriptor should be closed when the stream is closed,
    * either through `close()` or future garbage-collection.
    */
  var autoClose: js.UndefOr[Boolean] = js.undefined
}

object UnixStreamOptions {
  @scala.inline
  def apply(autoClose: js.UndefOr[Boolean] = js.undefined): UnixStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixStreamOptions]
  }
}

