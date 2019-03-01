package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns extends js.Object {
  /** List of attributes names returned by columns. */
  var attributeNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Etag of collection. This etag can be compared with the last response etag to check if response has changed. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** List of columns for a report type. */
  var items: js.UndefOr[js.Array[Column]] = js.undefined
  /** Collection type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Total number of columns returned in the response. */
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

