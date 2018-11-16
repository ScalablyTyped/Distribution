package typings
package gapiDotClientDotSurveysLib.gapiNs.clientNs.surveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MobileAppPanelsListResponse extends js.Object {
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  /** Unique request ID used for logging and debugging. Please include in any error reporting or troubleshooting requests. */
  var requestId: js.UndefOr[java.lang.String] = js.undefined
  /** An individual predefined panel of Opinion Rewards mobile users. */
  var resources: js.UndefOr[js.Array[MobileAppPanel]] = js.undefined
  var tokenPagination: js.UndefOr[TokenPagination] = js.undefined
}

