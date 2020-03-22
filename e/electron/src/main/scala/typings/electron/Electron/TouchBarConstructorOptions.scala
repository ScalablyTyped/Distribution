package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarConstructorOptions extends js.Object {
  var escapeItem: js.UndefOr[
    TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer | Null
  ] = js.undefined
  var items: js.UndefOr[
    js.Array[
      TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer
    ]
  ] = js.undefined
}

object TouchBarConstructorOptions {
  @scala.inline
  def apply(
    escapeItem: TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer = null,
    items: js.Array[
      TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer
    ] = null
  ): TouchBarConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (escapeItem != null) __obj.updateDynamic("escapeItem")(escapeItem.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarConstructorOptions]
  }
}

