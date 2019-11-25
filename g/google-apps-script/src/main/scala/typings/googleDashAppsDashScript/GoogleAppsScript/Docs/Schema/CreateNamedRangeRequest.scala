package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNamedRangeRequest extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[Range] = js.undefined
}

object CreateNamedRangeRequest {
  @scala.inline
  def apply(name: String = null, range: Range = null): CreateNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNamedRangeRequest]
  }
}

