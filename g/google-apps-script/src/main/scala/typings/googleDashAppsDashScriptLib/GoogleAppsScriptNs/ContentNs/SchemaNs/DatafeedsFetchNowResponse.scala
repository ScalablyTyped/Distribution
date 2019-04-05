package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedsFetchNowResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object DatafeedsFetchNowResponse {
  @scala.inline
  def apply(kind: java.lang.String = null): DatafeedsFetchNowResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[DatafeedsFetchNowResponse]
  }
}

