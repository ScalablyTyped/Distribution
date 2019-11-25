package typings.exceljs.exceljsMod

import typings.exceljs.exceljsStrings.bottom
import typings.exceljs.exceljsStrings.center
import typings.exceljs.exceljsStrings.centerContinuous
import typings.exceljs.exceljsStrings.distributed
import typings.exceljs.exceljsStrings.fill
import typings.exceljs.exceljsStrings.justify
import typings.exceljs.exceljsStrings.left
import typings.exceljs.exceljsStrings.ltr
import typings.exceljs.exceljsStrings.middle
import typings.exceljs.exceljsStrings.right
import typings.exceljs.exceljsStrings.rtl
import typings.exceljs.exceljsStrings.top
import typings.exceljs.exceljsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alignment extends js.Object {
  var horizontal: left | center | right | fill | justify | centerContinuous | distributed
  var indent: Double
  var readingOrder: rtl | ltr
  var shrinkToFit: Boolean
  var textRotation: Double | vertical
  var vertical: top | middle | bottom | distributed | justify
  var wrapText: Boolean
}

object Alignment {
  @scala.inline
  def apply(
    horizontal: left | center | right | fill | justify | centerContinuous | distributed,
    indent: Double,
    readingOrder: rtl | ltr,
    shrinkToFit: Boolean,
    textRotation: Double | vertical,
    vertical: top | middle | bottom | distributed | justify,
    wrapText: Boolean
  ): Alignment = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], readingOrder = readingOrder.asInstanceOf[js.Any], shrinkToFit = shrinkToFit.asInstanceOf[js.Any], textRotation = textRotation.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], wrapText = wrapText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Alignment]
  }
}

