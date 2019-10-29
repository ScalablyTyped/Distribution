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
    val __obj = js.Dynamic.literal(bottom = bottom, diagonal = diagonal, left = left, right = right, top = top)
  
    __obj.asInstanceOf[Borders]
  }
}

