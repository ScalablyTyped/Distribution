package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReportRequest extends js.Object {
  /**
               * Operations to be reported.
               *
               * Typically the service should report one operation per request.
               * Putting multiple operations into a single request is allowed, but should
               * be used only when multiple operations are natually available at the time
               * of the report.
               *
               * If multiple operations are in a single request, the total request size
               * should be no larger than 1MB. See ReportResponse.report_errors for
               * partial failure behavior.
               */
  var operations: js.UndefOr[js.Array[Operation]] = js.undefined
  /**
               * Specifies which version of service config should be used to process the
               * request.
               *
               * If unspecified or no matching version can be found, the
               * latest one will be used.
               */
  var serviceConfigId: js.UndefOr[java.lang.String] = js.undefined
}

