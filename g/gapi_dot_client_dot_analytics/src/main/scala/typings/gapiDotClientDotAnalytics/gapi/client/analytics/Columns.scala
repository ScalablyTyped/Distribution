package typings.gapiDotClientDotAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns extends js.Object {
  /** List of attributes names returned by columns. */
  var attributeNames: js.UndefOr[js.Array[String]] = js.undefined
  /** Etag of collection. This etag can be compared with the last response etag to check if response has changed. */
  var etag: js.UndefOr[String] = js.undefined
  /** List of columns for a report type. */
  var items: js.UndefOr[js.Array[Column]] = js.undefined
  /** Collection type. */
  var kind: js.UndefOr[String] = js.undefined
  /** Total number of columns returned in the response. */
  var totalResults: js.UndefOr[Double] = js.undefined
}

object Columns {
  @scala.inline
  def apply(
    attributeNames: js.Array[String] = null,
    etag: String = null,
    items: js.Array[Column] = null,
    kind: String = null,
    totalResults: Int | Double = null
  ): Columns = {
    val __obj = js.Dynamic.literal()
    if (attributeNames != null) __obj.updateDynamic("attributeNames")(attributeNames.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
}

