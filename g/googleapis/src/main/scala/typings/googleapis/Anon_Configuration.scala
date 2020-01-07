package typings.googleapis

import typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Schema$ErrorProto
import typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Schema$JobConfiguration
import typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Schema$JobReference
import typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Schema$JobStatistics
import typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Schema$JobStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Configuration extends js.Object {
  var configuration: js.UndefOr[Schema$JobConfiguration] = js.native
  var errorResult: js.UndefOr[Schema$ErrorProto] = js.native
  var id: js.UndefOr[String] = js.native
  var jobReference: js.UndefOr[Schema$JobReference] = js.native
  var kind: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
  var statistics: js.UndefOr[Schema$JobStatistics] = js.native
  var status: js.UndefOr[Schema$JobStatus] = js.native
  var user_email: js.UndefOr[String] = js.native
}

object Anon_Configuration {
  @scala.inline
  def apply(
    configuration: Schema$JobConfiguration = null,
    errorResult: Schema$ErrorProto = null,
    id: String = null,
    jobReference: Schema$JobReference = null,
    kind: String = null,
    state: String = null,
    statistics: Schema$JobStatistics = null,
    status: Schema$JobStatus = null,
    user_email: String = null
  ): Anon_Configuration = {
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
    __obj.asInstanceOf[Anon_Configuration]
  }
}

