package typings.fancybox

import typings.fancybox.fancyboxStrings.`inline`
import typings.fancybox.fancyboxStrings.ajax
import typings.fancybox.fancyboxStrings.html
import typings.fancybox.fancyboxStrings.iframe
import typings.fancybox.fancyboxStrings.image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxGroupItem extends js.Object {
  var opts: js.UndefOr[FancyBoxOptions] = js.undefined
  var src: String
  var `type`: js.UndefOr[image | `inline` | ajax | iframe | html] = js.undefined
}

object FancyBoxGroupItem {
  @scala.inline
  def apply(src: String, opts: FancyBoxOptions = null, `type`: image | `inline` | ajax | iframe | html = null): FancyBoxGroupItem = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (opts != null) __obj.updateDynamic("opts")(opts.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxGroupItem]
  }
}

