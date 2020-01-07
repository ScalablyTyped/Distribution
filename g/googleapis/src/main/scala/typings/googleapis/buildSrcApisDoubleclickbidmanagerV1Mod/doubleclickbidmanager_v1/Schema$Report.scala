package typings.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a report.
  */
@js.native
trait Schema$Report extends js.Object {
  /**
    * Key used to identify a report.
    */
  var key: js.UndefOr[Schema$ReportKey] = js.native
  /**
    * Report metadata.
    */
  var metadata: js.UndefOr[Schema$ReportMetadata] = js.native
  /**
    * Report parameters.
    */
  var params: js.UndefOr[Schema$Parameters] = js.native
}

object Schema$Report {
  @scala.inline
  def apply(
    key: Schema$ReportKey = null,
    metadata: Schema$ReportMetadata = null,
    params: Schema$Parameters = null
  ): Schema$Report = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Report]
  }
}

