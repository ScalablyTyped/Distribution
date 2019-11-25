package typings.gapiDotClientDotServicemanagement.gapi.client.servicemanagement

import typings.std.Record
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
  var newConfig: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * Service configuration against which the comparison will be done.
    * For this version of API, the supported types are
    * google.api.servicemanagement.v1.ConfigRef,
    * google.api.servicemanagement.v1.ConfigSource,
    * and google.api.Service
    */
  var oldConfig: js.UndefOr[Record[String, _]] = js.undefined
}

object GenerateConfigReportRequest {
  @scala.inline
  def apply(newConfig: Record[String, _] = null, oldConfig: Record[String, _] = null): GenerateConfigReportRequest = {
    val __obj = js.Dynamic.literal()
    if (newConfig != null) __obj.updateDynamic("newConfig")(newConfig.asInstanceOf[js.Any])
    if (oldConfig != null) __obj.updateDynamic("oldConfig")(oldConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateConfigReportRequest]
  }
}

