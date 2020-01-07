package typings.googleapis.buildSrcApisSecuritycenterV1Mod.securitycenter_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing findings.
  */
@js.native
trait Schema$ListFindingsResponse extends js.Object {
  /**
    * Findings matching the list request.
    */
  var listFindingsResults: js.UndefOr[js.Array[Schema$ListFindingsResult]] = js.native
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
    * The total number of findings matching the query.
    */
  var totalSize: js.UndefOr[Double] = js.native
}

object Schema$ListFindingsResponse {
  @scala.inline
  def apply(
    listFindingsResults: js.Array[Schema$ListFindingsResult] = null,
    nextPageToken: String = null,
    readTime: String = null,
    totalSize: Int | Double = null
  ): Schema$ListFindingsResponse = {
    val __obj = js.Dynamic.literal()
    if (listFindingsResults != null) __obj.updateDynamic("listFindingsResults")(listFindingsResults.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListFindingsResponse]
  }
}

