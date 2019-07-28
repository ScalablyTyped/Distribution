package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldsListResponse extends js.Object {
  var creativeFields: js.UndefOr[js.Array[CreativeField]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object CreativeFieldsListResponse {
  @scala.inline
  def apply(creativeFields: js.Array[CreativeField] = null, kind: String = null, nextPageToken: String = null): CreativeFieldsListResponse = {
    val __obj = js.Dynamic.literal()
    if (creativeFields != null) __obj.updateDynamic("creativeFields")(creativeFields)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[CreativeFieldsListResponse]
  }
}

