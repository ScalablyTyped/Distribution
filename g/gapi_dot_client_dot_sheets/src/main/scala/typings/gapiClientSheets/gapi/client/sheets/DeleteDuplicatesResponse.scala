package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDuplicatesResponse extends js.Object {
  /** The number of duplicate rows removed. */
  var duplicatesRemovedCount: js.UndefOr[Double] = js.undefined
}

object DeleteDuplicatesResponse {
  @scala.inline
  def apply(duplicatesRemovedCount: js.UndefOr[Double] = js.undefined): DeleteDuplicatesResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duplicatesRemovedCount)) __obj.updateDynamic("duplicatesRemovedCount")(duplicatesRemovedCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDuplicatesResponse]
  }
}

