package typings.fabric.fabricImplMod

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFillOptions extends js.Object {
  /**
    * Pattern horizontal offset from object's left/top corner
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  /**
    * Pattern vertical offset from object's left/top corner
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  /**
    * Repeat property of a pattern (one of repeat, repeat-x, repeat-y or no-repeat)
    */
  var repeat: js.UndefOr[String] = js.undefined
  /**
    * options.source Pattern source
    */
  var source: String | HTMLImageElement
}

object IFillOptions {
  @scala.inline
  def apply(
    source: String | HTMLImageElement,
    offsetX: js.UndefOr[Double] = js.undefined,
    offsetY: js.UndefOr[Double] = js.undefined,
    repeat: String = null
  ): IFillOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.get.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFillOptions]
  }
}

