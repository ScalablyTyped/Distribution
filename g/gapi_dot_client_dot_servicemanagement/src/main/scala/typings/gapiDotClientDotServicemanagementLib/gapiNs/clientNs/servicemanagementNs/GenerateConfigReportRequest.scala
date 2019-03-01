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

object GenerateConfigReportRequest {
  @scala.inline
  def apply(
    newConfig: stdLib.Record[java.lang.String, _] = null,
    oldConfig: stdLib.Record[java.lang.String, _] = null
  ): GenerateConfigReportRequest = {
    val __obj = js.Dynamic.literal()
    if (newConfig != null) __obj.updateDynamic("newConfig")(newConfig)
    if (oldConfig != null) __obj.updateDynamic("oldConfig")(oldConfig)
    __obj.asInstanceOf[GenerateConfigReportRequest]
  }
}

