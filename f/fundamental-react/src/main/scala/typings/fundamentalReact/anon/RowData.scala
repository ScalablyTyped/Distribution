package typings.fundamentalReact.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowData extends js.Object {
  var rowData: js.Array[String | ReactNode]
}

object RowData {
  @scala.inline
  def apply(rowData: js.Array[String | ReactNode]): RowData = {
    val __obj = js.Dynamic.literal(rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowData]
  }
}

