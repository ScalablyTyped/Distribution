package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedStatusExample extends js.Object {
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  var lineNumber: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object DatafeedStatusExample {
  @scala.inline
  def apply(
    itemId: java.lang.String = null,
    lineNumber: java.lang.String = null,
    value: java.lang.String = null
  ): DatafeedStatusExample = {
    val __obj = js.Dynamic.literal()
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DatafeedStatusExample]
  }
}

