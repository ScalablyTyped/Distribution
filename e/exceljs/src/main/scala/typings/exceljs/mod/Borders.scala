package typings.exceljs.mod

import typings.exceljs.anon.PartialBorder
import typings.exceljs.anon.PartialBorderDiagonal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Borders extends js.Object {
  var bottom: PartialBorder
  var diagonal: PartialBorderDiagonal
  var left: PartialBorder
  var right: PartialBorder
  var top: PartialBorder
}

object Borders {
  @scala.inline
  def apply(
    bottom: PartialBorder,
    diagonal: PartialBorderDiagonal,
    left: PartialBorder,
    right: PartialBorder,
    top: PartialBorder
  ): Borders = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], diagonal = diagonal.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borders]
  }
}

