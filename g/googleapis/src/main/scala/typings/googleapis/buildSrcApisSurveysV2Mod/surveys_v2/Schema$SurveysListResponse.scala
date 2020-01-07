package typings.googleapis.buildSrcApisSurveysV2Mod.surveys_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SurveysListResponse extends js.Object {
  var pageInfo: js.UndefOr[Schema$PageInfo] = js.native
  /**
    * Unique request ID used for logging and debugging. Please include in any
    * error reporting or troubleshooting requests.
    */
  var requestId: js.UndefOr[String] = js.native
  /**
    * An individual survey resource.
    */
  var resources: js.UndefOr[js.Array[Schema$Survey]] = js.native
  var tokenPagination: js.UndefOr[Schema$TokenPagination] = js.native
}

object Schema$SurveysListResponse {
  @scala.inline
  def apply(
    pageInfo: Schema$PageInfo = null,
    requestId: String = null,
    resources: js.Array[Schema$Survey] = null,
    tokenPagination: Schema$TokenPagination = null
  ): Schema$SurveysListResponse = {
    val __obj = js.Dynamic.literal()
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SurveysListResponse]
  }
}

