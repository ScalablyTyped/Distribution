package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxGroupItem extends js.Object {
  var opts: js.UndefOr[FancyBoxOptions] = js.undefined
  var src: java.lang.String
  var `type`: js.UndefOr[
    fancyboxLib.fancyboxLibStrings.image | fancyboxLib.fancyboxLibStrings.`inline` | fancyboxLib.fancyboxLibStrings.ajax | fancyboxLib.fancyboxLibStrings.iframe | fancyboxLib.fancyboxLibStrings.html
  ] = js.undefined
}

object FancyBoxGroupItem {
  @scala.inline
  def apply(
    src: java.lang.String,
    opts: FancyBoxOptions = null,
    `type`: fancyboxLib.fancyboxLibStrings.image | fancyboxLib.fancyboxLibStrings.`inline` | fancyboxLib.fancyboxLibStrings.ajax | fancyboxLib.fancyboxLibStrings.iframe | fancyboxLib.fancyboxLibStrings.html = null
  ): FancyBoxGroupItem = {
    val __obj = js.Dynamic.literal(src = src)
    if (opts != null) __obj.updateDynamic("opts")(opts)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxGroupItem]
  }
}

