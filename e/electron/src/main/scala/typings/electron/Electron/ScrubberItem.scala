package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrubberItem extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/scrubber-item
  /**
    * The image to appear in this item.
    */
  var icon: js.UndefOr[NativeImage_] = js.undefined
  /**
    * The text to appear in this item.
    */
  var label: js.UndefOr[String] = js.undefined
}

object ScrubberItem {
  @scala.inline
  def apply(icon: NativeImage_ = null, label: String = null): ScrubberItem = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrubberItem]
  }
}

