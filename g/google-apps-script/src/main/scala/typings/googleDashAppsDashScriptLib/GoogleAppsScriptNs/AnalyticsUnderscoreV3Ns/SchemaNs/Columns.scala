package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns extends js.Object {
  var attributeNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[Column]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var totalResults: js.UndefOr[scala.Double] = js.undefined
}

object Columns {
  @scala.inline
  def apply(
    attributeNames: js.Array[java.lang.String] = null,
    etag: java.lang.String = null,
    items: js.Array[Column] = null,
    kind: java.lang.String = null,
    totalResults: scala.Int | scala.Double = null
  ): Columns = {
    val __obj = js.Dynamic.literal()
    if (attributeNames != null) __obj.updateDynamic("attributeNames")(attributeNames)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
}

