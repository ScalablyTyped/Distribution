package typings
package gapiDotClientDotConsumersurveysLib.gapiNs.clientNs.consumersurveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurveysListResponse extends js.Object {
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  /** Unique request ID used for logging and debugging. Please include in any error reporting or troubleshooting requests. */
  var requestId: js.UndefOr[java.lang.String] = js.undefined
  /** An individual survey resource. */
  var resources: js.UndefOr[js.Array[Survey]] = js.undefined
  var tokenPagination: js.UndefOr[TokenPagination] = js.undefined
}

