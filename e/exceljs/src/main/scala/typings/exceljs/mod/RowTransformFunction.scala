package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowTransformFunction extends js.Object {
  def apply(row: Rows): Rows = js.native
  def apply(row: Rows, callback: RowTransformCallback): Unit = js.native
}

