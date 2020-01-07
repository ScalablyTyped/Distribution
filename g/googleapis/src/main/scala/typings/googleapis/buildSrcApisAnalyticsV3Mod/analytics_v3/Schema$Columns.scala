package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists columns (dimensions and metrics) for a particular report type.
  */
@js.native
trait Schema$Columns extends js.Object {
  /**
    * List of attributes names returned by columns.
    */
  var attributeNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Etag of collection. This etag can be compared with the last response etag
    * to check if response has changed.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * List of columns for a report type.
    */
  var items: js.UndefOr[js.Array[Schema$Column]] = js.native
  /**
    * Collection type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Total number of columns returned in the response.
    */
  var totalResults: js.UndefOr[Double] = js.native
}

object Schema$Columns {
  @scala.inline
  def apply(
    attributeNames: js.Array[String] = null,
    etag: String = null,
    items: js.Array[Schema$Column] = null,
    kind: String = null,
    totalResults: Int | Double = null
  ): Schema$Columns = {
    val __obj = js.Dynamic.literal()
    if (attributeNames != null) __obj.updateDynamic("attributeNames")(attributeNames.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Columns]
  }
}

