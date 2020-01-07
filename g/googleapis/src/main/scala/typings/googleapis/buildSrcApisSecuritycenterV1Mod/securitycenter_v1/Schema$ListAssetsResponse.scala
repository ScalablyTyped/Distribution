package typings.googleapis.buildSrcApisSecuritycenterV1Mod.securitycenter_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing assets.
  */
@js.native
trait Schema$ListAssetsResponse extends js.Object {
  /**
    * Assets matching the list request.
    */
  var listAssetsResults: js.UndefOr[js.Array[Schema$ListAssetsResult]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Time used for executing the list request.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * The total number of assets matching the query.
    */
  var totalSize: js.UndefOr[Double] = js.native
}

object Schema$ListAssetsResponse {
  @scala.inline
  def apply(
    listAssetsResults: js.Array[Schema$ListAssetsResult] = null,
    nextPageToken: String = null,
    readTime: String = null,
    totalSize: Int | Double = null
  ): Schema$ListAssetsResponse = {
    val __obj = js.Dynamic.literal()
    if (listAssetsResults != null) __obj.updateDynamic("listAssetsResults")(listAssetsResults.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListAssetsResponse]
  }
}

