package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import typings.googleapis.Anon_Clustering
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TableList extends js.Object {
  /**
    * A hash of this page of results.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The type of list.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A token to request the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Tables in the requested dataset.
    */
  var tables: js.UndefOr[js.Array[Anon_Clustering]] = js.native
  /**
    * The total number of tables in the dataset.
    */
  var totalItems: js.UndefOr[Double] = js.native
}

object Schema$TableList {
  @scala.inline
  def apply(
    etag: String = null,
    kind: String = null,
    nextPageToken: String = null,
    tables: js.Array[Anon_Clustering] = null,
    totalItems: Int | Double = null
  ): Schema$TableList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableList]
  }
}

