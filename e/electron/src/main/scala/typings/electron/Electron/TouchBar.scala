package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBar extends js.Object {
  var escapeItem: TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer | Null
}

object TouchBar {
  @scala.inline
  def apply(
    escapeItem: TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer = null
  ): TouchBar = {
    val __obj = js.Dynamic.literal(escapeItem = escapeItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBar]
  }
}

