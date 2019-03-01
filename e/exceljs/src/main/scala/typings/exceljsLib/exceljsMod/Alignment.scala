package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alignment extends js.Object {
  var horizontal: js.UndefOr[
    exceljsLib.exceljsLibStrings.left | exceljsLib.exceljsLibStrings.center | exceljsLib.exceljsLibStrings.right | exceljsLib.exceljsLibStrings.fill | exceljsLib.exceljsLibStrings.justify | exceljsLib.exceljsLibStrings.centerContinuous | exceljsLib.exceljsLibStrings.distributed
  ] = js.undefined
  var indent: js.UndefOr[scala.Double] = js.undefined
  var readingOrder: js.UndefOr[exceljsLib.exceljsLibStrings.rtl | exceljsLib.exceljsLibStrings.ltr] = js.undefined
  var textRotation: js.UndefOr[scala.Double | exceljsLib.exceljsLibStrings.vertical] = js.undefined
  var vertical: js.UndefOr[
    exceljsLib.exceljsLibStrings.top | exceljsLib.exceljsLibStrings.middle | exceljsLib.exceljsLibStrings.bottom | exceljsLib.exceljsLibStrings.distributed | exceljsLib.exceljsLibStrings.justify
  ] = js.undefined
  var wrapText: js.UndefOr[scala.Boolean] = js.undefined
}

object Alignment {
  @scala.inline
  def apply(
    horizontal: exceljsLib.exceljsLibStrings.left | exceljsLib.exceljsLibStrings.center | exceljsLib.exceljsLibStrings.right | exceljsLib.exceljsLibStrings.fill | exceljsLib.exceljsLibStrings.justify | exceljsLib.exceljsLibStrings.centerContinuous | exceljsLib.exceljsLibStrings.distributed = null,
    indent: scala.Int | scala.Double = null,
    readingOrder: exceljsLib.exceljsLibStrings.rtl | exceljsLib.exceljsLibStrings.ltr = null,
    textRotation: scala.Double | exceljsLib.exceljsLibStrings.vertical = null,
    vertical: exceljsLib.exceljsLibStrings.top | exceljsLib.exceljsLibStrings.middle | exceljsLib.exceljsLibStrings.bottom | exceljsLib.exceljsLibStrings.distributed | exceljsLib.exceljsLibStrings.justify = null,
    wrapText: js.UndefOr[scala.Boolean] = js.undefined
  ): Alignment = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (readingOrder != null) __obj.updateDynamic("readingOrder")(readingOrder.asInstanceOf[js.Any])
    if (textRotation != null) __obj.updateDynamic("textRotation")(textRotation.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapText)) __obj.updateDynamic("wrapText")(wrapText)
    __obj.asInstanceOf[Alignment]
  }
}

