package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDataSources extends js.Object {
  /** Collection of custom data sources. */
  var items: js.UndefOr[js.Array[CustomDataSource]] = js.undefined
  /**
    * The maximum number of resources the response can contain, regardless of the actual number of resources returned. Its value ranges from 1 to 1000 with a
    * value of 1000 by default, or otherwise specified by the max-results query parameter.
    */
  var itemsPerPage: js.UndefOr[scala.Double] = js.undefined
  /** Collection type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Link to next page for this custom data source collection. */
  var nextLink: js.UndefOr[java.lang.String] = js.undefined
  /** Link to previous page for this custom data source collection. */
  var previousLink: js.UndefOr[java.lang.String] = js.undefined
  /** The starting index of the resources, which is 1 by default or otherwise specified by the start-index query parameter. */
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  /** The total number of results for the query, regardless of the number of results in the response. */
  var totalResults: js.UndefOr[scala.Double] = js.undefined
  /** Email ID of the authenticated user */
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object CustomDataSources {
  @scala.inline
  def apply(
    items: js.Array[CustomDataSource] = null,
    itemsPerPage: scala.Int | scala.Double = null,
    kind: java.lang.String = null,
    nextLink: java.lang.String = null,
    previousLink: java.lang.String = null,
    startIndex: scala.Int | scala.Double = null,
    totalResults: scala.Int | scala.Double = null,
    username: java.lang.String = null
  ): CustomDataSources = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink)
    if (previousLink != null) __obj.updateDynamic("previousLink")(previousLink)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[CustomDataSources]
  }
}

