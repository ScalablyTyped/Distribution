package typings.fundamentalReact

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowData extends js.Object {
  var rowData: js.Array[String | ReactNode]
}

object AnonRowData {
  @scala.inline
  def apply(rowData: js.Array[String | ReactNode]): AnonRowData = {
    val __obj = js.Dynamic.literal(rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRowData]
  }
}

