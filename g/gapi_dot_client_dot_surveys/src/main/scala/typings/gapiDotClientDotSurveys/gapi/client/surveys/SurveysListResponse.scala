package typings.gapiDotClientDotSurveys.gapi.client.surveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveysListResponse extends js.Object {
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  /** Unique request ID used for logging and debugging. Please include in any error reporting or troubleshooting requests. */
  var requestId: js.UndefOr[String] = js.undefined
  /** An individual survey resource. */
  var resources: js.UndefOr[js.Array[Survey]] = js.undefined
  var tokenPagination: js.UndefOr[TokenPagination] = js.undefined
}

object SurveysListResponse {
  @scala.inline
  def apply(
    pageInfo: PageInfo = null,
    requestId: String = null,
    resources: js.Array[Survey] = null,
    tokenPagination: TokenPagination = null
  ): SurveysListResponse = {
    val __obj = js.Dynamic.literal()
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurveysListResponse]
  }
}

