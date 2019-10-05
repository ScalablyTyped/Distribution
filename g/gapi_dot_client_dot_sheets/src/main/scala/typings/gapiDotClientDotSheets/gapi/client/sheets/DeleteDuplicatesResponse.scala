package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDuplicatesResponse extends js.Object {
  /** The number of duplicate rows removed. */
  var duplicatesRemovedCount: js.UndefOr[Double] = js.undefined
}

object DeleteDuplicatesResponse {
  @scala.inline
  def apply(duplicatesRemovedCount: Int | Double = null): DeleteDuplicatesResponse = {
    val __obj = js.Dynamic.literal()
    if (duplicatesRemovedCount != null) __obj.updateDynamic("duplicatesRemovedCount")(duplicatesRemovedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDuplicatesResponse]
  }
}

