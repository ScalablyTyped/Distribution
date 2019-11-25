package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteContentRangeRequest extends js.Object {
  var range: js.UndefOr[Range] = js.undefined
}

object DeleteContentRangeRequest {
  @scala.inline
  def apply(range: Range = null): DeleteContentRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContentRangeRequest]
  }
}

