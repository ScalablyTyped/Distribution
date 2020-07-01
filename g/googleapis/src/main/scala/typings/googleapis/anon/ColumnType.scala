package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnType extends js.Object {
  var columnType: js.UndefOr[String] = js.native
  var dataType: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
}

object ColumnType {
  @scala.inline
  def apply(columnType: String = null, dataType: String = null, name: String = null): ColumnType = {
    val __obj = js.Dynamic.literal()
    if (columnType != null) __obj.updateDynamic("columnType")(columnType.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnType]
  }
}

