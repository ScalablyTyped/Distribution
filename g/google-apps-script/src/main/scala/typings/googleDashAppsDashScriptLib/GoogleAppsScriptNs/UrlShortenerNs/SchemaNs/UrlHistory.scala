package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlShortenerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlHistory extends js.Object {
  var items: js.UndefOr[js.Array[Url]] = js.undefined
  var itemsPerPage: js.UndefOr[scala.Double] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

object UrlHistory {
  @scala.inline
  def apply(
    items: js.Array[Url] = null,
    itemsPerPage: scala.Int | scala.Double = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    totalItems: scala.Int | scala.Double = null
  ): UrlHistory = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlHistory]
  }
}

