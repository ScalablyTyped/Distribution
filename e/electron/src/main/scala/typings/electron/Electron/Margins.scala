package typings.electron.Electron

import typings.electron.electronStrings.custom
import typings.electron.electronStrings.default
import typings.electron.electronStrings.none
import typings.electron.electronStrings.printableArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Margins extends js.Object {
  /**
    * The bottom margin of the printed web page, in pixels.
    */
  var bottom: js.UndefOr[Double] = js.undefined
  /**
    * The left margin of the printed web page, in pixels.
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    * Can be `default`, `none`, `printableArea`, or `custom`. If `custom` is chosen,
    * you will also need to specify `top`, `bottom`, `left`, and `right`.
    */
  var marginType: js.UndefOr[default | none | printableArea | custom] = js.undefined
  /**
    * The right margin of the printed web page, in pixels.
    */
  var right: js.UndefOr[Double] = js.undefined
  /**
    * The top margin of the printed web page, in pixels.
    */
  var top: js.UndefOr[Double] = js.undefined
}

object Margins {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    marginType: default | none | printableArea | custom = null,
    right: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): Margins = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (marginType != null) __obj.updateDynamic("marginType")(marginType.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Margins]
  }
}

