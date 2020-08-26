package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreMouseEventsOptions extends js.Object {
  /**
    * If true, forwards mouse move messages to Chromium, enabling mouse related events
    * such as `mouseleave`. Only used when `ignore` is true. If `ignore` is false,
    * forwarding is always disabled regardless of this value.
    *
    * @platform darwin,win32
    */
  var forward: js.UndefOr[Boolean] = js.native
}

object IgnoreMouseEventsOptions {
  @scala.inline
  def apply(): IgnoreMouseEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreMouseEventsOptions]
  }
  @scala.inline
  implicit class IgnoreMouseEventsOptionsOps[Self <: IgnoreMouseEventsOptions] (val x: Self) extends AnyVal {
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
    def setForward(value: Boolean): Self = this.set("forward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForward: Self = this.set("forward", js.undefined)
  }
  
}

