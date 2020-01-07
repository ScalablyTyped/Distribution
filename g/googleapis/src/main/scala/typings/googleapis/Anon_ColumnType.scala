package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ColumnType extends js.Object {
  var columnType: js.UndefOr[String] = js.native
  var dataType: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
}

object Anon_ColumnType {
  @scala.inline
  def apply(columnType: String = null, dataType: String = null, name: String = null): Anon_ColumnType = {
    val __obj = js.Dynamic.literal()
    if (columnType != null) __obj.updateDynamic("columnType")(columnType.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnType]
  }
}

