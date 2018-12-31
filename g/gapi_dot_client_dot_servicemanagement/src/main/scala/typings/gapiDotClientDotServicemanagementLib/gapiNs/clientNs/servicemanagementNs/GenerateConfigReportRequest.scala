package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateConfigReportRequest extends js.Object {
  /**
    * Service configuration for which we want to generate the report.
    * For this version of API, the supported types are
    * google.api.servicemanagement.v1.ConfigRef,
    * google.api.servicemanagement.v1.ConfigSource,
    * and google.api.Service
    */
  var newConfig: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /**
    * Service configuration against which the comparison will be done.
    * For this version of API, the supported types are
    * google.api.servicemanagement.v1.ConfigRef,
    * google.api.servicemanagement.v1.ConfigSource,
    * and google.api.Service
    */
  var oldConfig: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

