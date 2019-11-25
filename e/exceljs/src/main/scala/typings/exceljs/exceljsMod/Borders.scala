package typings.exceljs.exceljsMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Borders extends js.Object {
  var bottom: Partial[Border]
  var diagonal: Partial[BorderDiagonal]
  var left: Partial[Border]
  var right: Partial[Border]
  var top: Partial[Border]
}

object Borders {
  @scala.inline
  def apply(
    bottom: Partial[Border],
    diagonal: Partial[BorderDiagonal],
    left: Partial[Border],
    right: Partial[Border],
    top: Partial[Border]
  ): Borders = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], diagonal = diagonal.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Borders]
  }
}

