package typings.gapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accounts extends js.Object {
  /** A list of accounts. */
  var items: js.UndefOr[js.Array[Account]] = js.undefined
  /**
    * The maximum number of entries the response can contain, regardless of the actual number of entries returned. Its value ranges from 1 to 1000 with a
    * value of 1000 by default, or otherwise specified by the max-results query parameter.
    */
  var itemsPerPage: js.UndefOr[Double] = js.undefined
  /** Collection type. */
  var kind: js.UndefOr[String] = js.undefined
  /** Next link for this account collection. */
  var nextLink: js.UndefOr[String] = js.undefined
  /** Previous link for this account collection. */
  var previousLink: js.UndefOr[String] = js.undefined
  /** The starting index of the entries, which is 1 by default or otherwise specified by the start-index query parameter. */
  var startIndex: js.UndefOr[Double] = js.undefined
  /** The total number of results for the query, regardless of the number of results in the response. */
  var totalResults: js.UndefOr[Double] = js.undefined
  /** Email ID of the authenticated user */
  var username: js.UndefOr[String] = js.undefined
}

object Accounts {
  @scala.inline
  def apply(
    items: js.Array[Account] = null,
    itemsPerPage: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    nextLink: String = null,
    previousLink: String = null,
    startIndex: js.UndefOr[Double] = js.undefined,
    totalResults: js.UndefOr[Double] = js.undefined,
    username: String = null
  ): Accounts = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(itemsPerPage)) __obj.updateDynamic("itemsPerPage")(itemsPerPage.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink.asInstanceOf[js.Any])
    if (previousLink != null) __obj.updateDynamic("previousLink")(previousLink.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalResults)) __obj.updateDynamic("totalResults")(totalResults.get.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accounts]
  }
}

