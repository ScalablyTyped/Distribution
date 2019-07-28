package typings.fabric.fabricDashImplMod

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
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    repeat: String = null
  ): IFillOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat)
    __obj.asInstanceOf[IFillOptions]
  }
}

