package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocsNs.SchemaNs

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
    if (name != null) __obj.updateDynamic("name")(name)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[CreateNamedRangeRequest]
  }
}

