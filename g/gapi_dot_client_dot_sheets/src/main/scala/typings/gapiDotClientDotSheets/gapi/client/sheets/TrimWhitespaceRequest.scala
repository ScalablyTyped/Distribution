package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrimWhitespaceRequest extends js.Object {
  /** The range whose cells to trim. */
  var range: js.UndefOr[GridRange] = js.undefined
}

object TrimWhitespaceRequest {
  @scala.inline
  def apply(range: GridRange = null): TrimWhitespaceRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrimWhitespaceRequest]
  }
}

