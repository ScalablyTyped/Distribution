package typings.fancybox

import typings.fancybox.fancyboxStrings.`inline`
import typings.fancybox.fancyboxStrings.ajax
import typings.fancybox.fancyboxStrings.html
import typings.fancybox.fancyboxStrings.iframe
import typings.fancybox.fancyboxStrings.image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxGroupItemWithFilledProps extends FancyBoxGroupItem {
  @JSName("$thumb")
  var $thumb: js.UndefOr[JQuery] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var thumb: js.UndefOr[js.Any] = js.undefined
}

object FancyBoxGroupItemWithFilledProps {
  @scala.inline
  def apply(
    src: String,
    $thumb: JQuery = null,
    contentType: String = null,
    index: js.UndefOr[Double] = js.undefined,
    opts: FancyBoxOptions = null,
    thumb: js.Any = null,
    `type`: image | `inline` | ajax | iframe | html = null
  ): FancyBoxGroupItemWithFilledProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if ($thumb != null) __obj.updateDynamic("$thumb")($thumb.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (opts != null) __obj.updateDynamic("opts")(opts.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxGroupItemWithFilledProps]
  }
}

