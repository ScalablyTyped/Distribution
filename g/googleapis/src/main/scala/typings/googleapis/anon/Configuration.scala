package typings.googleapis.anon

import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaErrorProto
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaJobConfiguration
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaJobReference
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaJobStatistics
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaJobStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  var configuration: js.UndefOr[SchemaJobConfiguration] = js.native
  var errorResult: js.UndefOr[SchemaErrorProto] = js.native
  var id: js.UndefOr[String] = js.native
  var jobReference: js.UndefOr[SchemaJobReference] = js.native
  var kind: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
  var statistics: js.UndefOr[SchemaJobStatistics] = js.native
  var status: js.UndefOr[SchemaJobStatus] = js.native
  var user_email: js.UndefOr[String] = js.native
}

object Configuration {
  @scala.inline
  def apply(
    configuration: SchemaJobConfiguration = null,
    errorResult: SchemaErrorProto = null,
    id: String = null,
    jobReference: SchemaJobReference = null,
    kind: String = null,
    state: String = null,
    statistics: SchemaJobStatistics = null,
    status: SchemaJobStatus = null,
    user_email: String = null
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (errorResult != null) __obj.updateDynamic("errorResult")(errorResult.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (jobReference != null) __obj.updateDynamic("jobReference")(jobReference.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (user_email != null) __obj.updateDynamic("user_email")(user_email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

