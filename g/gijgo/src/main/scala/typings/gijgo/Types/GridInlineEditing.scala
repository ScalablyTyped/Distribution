package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridInlineEditing extends js.Object {
  var managementColumn: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
}

object GridInlineEditing {
  @scala.inline
  def apply(managementColumn: js.UndefOr[Boolean] = js.undefined, mode: String = null): GridInlineEditing = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(managementColumn)) __obj.updateDynamic("managementColumn")(managementColumn)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[GridInlineEditing]
  }
}

