package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedsFetchNowResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
}

object DatafeedsFetchNowResponse {
  @scala.inline
  def apply(kind: String = null): DatafeedsFetchNowResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[DatafeedsFetchNowResponse]
  }
}

