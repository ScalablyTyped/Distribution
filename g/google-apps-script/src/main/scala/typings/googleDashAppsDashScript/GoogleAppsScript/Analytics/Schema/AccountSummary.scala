package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountSummary extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var starred: js.UndefOr[Boolean] = js.undefined
  var webProperties: js.UndefOr[js.Array[WebPropertySummary]] = js.undefined
}

object AccountSummary {
  @scala.inline
  def apply(
    id: String = null,
    kind: String = null,
    name: String = null,
    starred: js.UndefOr[Boolean] = js.undefined,
    webProperties: js.Array[WebPropertySummary] = null
  ): AccountSummary = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred)
    if (webProperties != null) __obj.updateDynamic("webProperties")(webProperties)
    __obj.asInstanceOf[AccountSummary]
  }
}

