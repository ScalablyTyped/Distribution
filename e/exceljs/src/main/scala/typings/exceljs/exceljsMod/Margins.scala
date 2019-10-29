package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Margins extends js.Object {
  var bottom: Double
  var footer: Double
  var header: Double
  var left: Double
  var right: Double
  var top: Double
}

object Margins {
  @scala.inline
  def apply(bottom: Double, footer: Double, header: Double, left: Double, right: Double, top: Double): Margins = {
    val __obj = js.Dynamic.literal(bottom = bottom, footer = footer, header = header, left = left, right = right, top = top)
  
    __obj.asInstanceOf[Margins]
  }
}

