package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrubberItem extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/scrubber-item
  /**
    * The image to appear in this item.
    */
  var icon: js.UndefOr[NativeImage_] = js.native
  /**
    * The text to appear in this item.
    */
  var label: js.UndefOr[String] = js.native
}

object ScrubberItem {
  @scala.inline
  def apply(): ScrubberItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrubberItem]
  }
  @scala.inline
  implicit class ScrubberItemOps[Self <: ScrubberItem] (val x: Self) extends AnyVal {
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
    def setIcon(value: NativeImage_): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
  
}

