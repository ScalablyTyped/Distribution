package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

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
    if (key != null) __obj.updateDynamic("key")(key)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Report]
  }
}

