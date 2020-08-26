package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsStreamOptions extends js.Object {
  /**
    * Whether the Windows `HANDLE` should be closed when the stream is closed,
    * either through `close()` or future garbage-collection.
    */
  var autoClose: js.UndefOr[Boolean] = js.native
}

object WindowsStreamOptions {
  @scala.inline
  def apply(): WindowsStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsStreamOptions]
  }
  @scala.inline
  implicit class WindowsStreamOptionsOps[Self <: WindowsStreamOptions] (val x: Self) extends AnyVal {
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
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
  }
  
}

