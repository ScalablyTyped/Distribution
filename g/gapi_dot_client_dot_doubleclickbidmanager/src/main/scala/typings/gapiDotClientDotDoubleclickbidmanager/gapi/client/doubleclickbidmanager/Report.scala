package typings.gapiDotClientDotDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Report extends js.Object {
  /** Key used to identify a report. */
  var key: js.UndefOr[ReportKey] = js.undefined
  /** Report metadata. */
  var metadata: js.UndefOr[ReportMetadata] = js.undefined
  /** Report parameters. */
  var params: js.UndefOr[Parameters] = js.undefined
}

object Report {
  @scala.inline
  def apply(key: ReportKey = null, metadata: ReportMetadata = null, params: Parameters = null): Report = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Report]
  }
}

