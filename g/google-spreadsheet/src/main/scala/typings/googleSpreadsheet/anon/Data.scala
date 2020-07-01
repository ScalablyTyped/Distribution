package typings.googleSpreadsheet.anon

import typings.googleSpreadsheet.mod.WorksheetBasicProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var properties: WorksheetBasicProperties
}

object Data {
  @scala.inline
  def apply(properties: WorksheetBasicProperties, data: js.Any = null): Data = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

