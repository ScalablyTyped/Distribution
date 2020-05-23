package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsStreamOptions extends js.Object {
  /**
    * Whether the Windows `HANDLE` should be closed when the stream is closed,
    * either through `close()` or future garbage-collection.
    */
  var autoClose: js.UndefOr[Boolean] = js.undefined
}

object WindowsStreamOptions {
  @scala.inline
  def apply(autoClose: js.UndefOr[Boolean] = js.undefined): WindowsStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsStreamOptions]
  }
}

