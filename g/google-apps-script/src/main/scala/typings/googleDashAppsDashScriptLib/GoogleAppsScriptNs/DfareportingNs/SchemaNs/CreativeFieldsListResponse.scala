package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldsListResponse extends js.Object {
  var creativeFields: js.UndefOr[js.Array[CreativeField]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object CreativeFieldsListResponse {
  @scala.inline
  def apply(
    creativeFields: js.Array[CreativeField] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): CreativeFieldsListResponse = {
    val __obj = js.Dynamic.literal()
    if (creativeFields != null) __obj.updateDynamic("creativeFields")(creativeFields)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[CreativeFieldsListResponse]
  }
}

