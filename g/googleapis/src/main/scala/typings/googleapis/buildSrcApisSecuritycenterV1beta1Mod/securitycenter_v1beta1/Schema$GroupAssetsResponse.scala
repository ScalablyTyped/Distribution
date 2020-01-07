package typings.googleapis.buildSrcApisSecuritycenterV1beta1Mod.securitycenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for grouping by assets.
  */
@js.native
trait Schema$GroupAssetsResponse extends js.Object {
  /**
    * Group results. There exists an element for each existing unique
    * combination of property/values. The element contains a count for the
    * number of times those specific property/values appear.
    */
  var groupByResults: js.UndefOr[js.Array[Schema$GroupResult]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Time used for executing the groupBy request.
    */
  var readTime: js.UndefOr[String] = js.native
}

object Schema$GroupAssetsResponse {
  @scala.inline
  def apply(
    groupByResults: js.Array[Schema$GroupResult] = null,
    nextPageToken: String = null,
    readTime: String = null
  ): Schema$GroupAssetsResponse = {
    val __obj = js.Dynamic.literal()
    if (groupByResults != null) __obj.updateDynamic("groupByResults")(groupByResults.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GroupAssetsResponse]
  }
}

