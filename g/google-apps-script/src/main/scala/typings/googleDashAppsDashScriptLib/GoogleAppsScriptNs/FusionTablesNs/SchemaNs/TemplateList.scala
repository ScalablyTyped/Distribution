package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateList extends js.Object {
  var items: js.UndefOr[js.Array[Template]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

object TemplateList {
  @scala.inline
  def apply(
    items: js.Array[Template] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    totalItems: scala.Int | scala.Double = null
  ): TemplateList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateList]
  }
}

