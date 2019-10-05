package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedStatusExample extends js.Object {
  /** The ID of the example item. */
  var itemId: js.UndefOr[String] = js.undefined
  /** Line number in the data feed where the example is found. */
  var lineNumber: js.UndefOr[String] = js.undefined
  /** The problematic value. */
  var value: js.UndefOr[String] = js.undefined
}

object DatafeedStatusExample {
  @scala.inline
  def apply(itemId: String = null, lineNumber: String = null, value: String = null): DatafeedStatusExample = {
    val __obj = js.Dynamic.literal()
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DatafeedStatusExample]
  }
}

