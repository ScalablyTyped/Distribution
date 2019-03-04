package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarConstructorOptions extends js.Object {
  var escapeItem: js.UndefOr[
    TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer | scala.Null
  ] = js.undefined
  var items: js.Array[
    TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer
  ]
}

object TouchBarConstructorOptions {
  @scala.inline
  def apply(
    items: js.Array[
      TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer
    ],
    escapeItem: TouchBarButton | TouchBarColorPicker | TouchBarGroup | TouchBarLabel | TouchBarPopover | TouchBarScrubber | TouchBarSegmentedControl | TouchBarSlider | TouchBarSpacer = null
  ): TouchBarConstructorOptions = {
    val __obj = js.Dynamic.literal(items = items)
    if (escapeItem != null) __obj.updateDynamic("escapeItem")(escapeItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarConstructorOptions]
  }
}

