package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxGroupItemWithFilledProps extends FancyBoxGroupItem {
  @JSName("$thumb")
  var $thumb: js.UndefOr[JQuery] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var thumb: js.UndefOr[js.Any] = js.undefined
}

object FancyBoxGroupItemWithFilledProps {
  @scala.inline
  def apply(
    src: java.lang.String,
    $thumb: JQuery = null,
    contentType: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    opts: FancyBoxOptions = null,
    thumb: js.Any = null,
    `type`: fancyboxLib.fancyboxLibStrings.image | fancyboxLib.fancyboxLibStrings.`inline` | fancyboxLib.fancyboxLibStrings.ajax | fancyboxLib.fancyboxLibStrings.iframe | fancyboxLib.fancyboxLibStrings.html = null
  ): FancyBoxGroupItemWithFilledProps = {
    val __obj = js.Dynamic.literal(src = src)
    if ($thumb != null) __obj.updateDynamic("$thumb")($thumb)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (opts != null) __obj.updateDynamic("opts")(opts)
    if (thumb != null) __obj.updateDynamic("thumb")(thumb)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxGroupItemWithFilledProps]
  }
}

