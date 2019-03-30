package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentCategoriesListResponse extends js.Object {
  var contentCategories: js.UndefOr[js.Array[ContentCategory]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ContentCategoriesListResponse {
  @scala.inline
  def apply(
    contentCategories: js.Array[ContentCategory] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): ContentCategoriesListResponse = {
    val __obj = js.Dynamic.literal()
    if (contentCategories != null) __obj.updateDynamic("contentCategories")(contentCategories)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ContentCategoriesListResponse]
  }
}

