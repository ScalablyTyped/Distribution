package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LivegraphBacktraceRecordInfo extends js.Object {
  var dataSourcePublishMsec: js.UndefOr[String] = js.native
  var expId: js.UndefOr[String] = js.native
  var expInfo: js.UndefOr[Schema$LivegraphBacktraceRecordInfoExpInfo] = js.native
  var isRecon: js.UndefOr[Boolean] = js.native
  var isWlmThrottled: js.UndefOr[Boolean] = js.native
  var numberOfTriples: js.UndefOr[String] = js.native
  var priority: js.UndefOr[String] = js.native
  var process: js.UndefOr[String] = js.native
  var proxyReceiveMsec: js.UndefOr[String] = js.native
  var proxySentMsec: js.UndefOr[String] = js.native
  var recordId: js.UndefOr[String] = js.native
  var shouldMonitorLatency: js.UndefOr[Boolean] = js.native
  var subscriberReceiveMsec: js.UndefOr[String] = js.native
  var topicBuildFinishMsec: js.UndefOr[String] = js.native
  var topicBuildStartMsec: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object Schema$LivegraphBacktraceRecordInfo {
  @scala.inline
  def apply(
    dataSourcePublishMsec: String = null,
    expId: String = null,
    expInfo: Schema$LivegraphBacktraceRecordInfoExpInfo = null,
    isRecon: js.UndefOr[Boolean] = js.undefined,
    isWlmThrottled: js.UndefOr[Boolean] = js.undefined,
    numberOfTriples: String = null,
    priority: String = null,
    process: String = null,
    proxyReceiveMsec: String = null,
    proxySentMsec: String = null,
    recordId: String = null,
    shouldMonitorLatency: js.UndefOr[Boolean] = js.undefined,
    subscriberReceiveMsec: String = null,
    topicBuildFinishMsec: String = null,
    topicBuildStartMsec: String = null,
    version: String = null
  ): Schema$LivegraphBacktraceRecordInfo = {
    val __obj = js.Dynamic.literal()
    if (dataSourcePublishMsec != null) __obj.updateDynamic("dataSourcePublishMsec")(dataSourcePublishMsec.asInstanceOf[js.Any])
    if (expId != null) __obj.updateDynamic("expId")(expId.asInstanceOf[js.Any])
    if (expInfo != null) __obj.updateDynamic("expInfo")(expInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(isRecon)) __obj.updateDynamic("isRecon")(isRecon.asInstanceOf[js.Any])
    if (!js.isUndefined(isWlmThrottled)) __obj.updateDynamic("isWlmThrottled")(isWlmThrottled.asInstanceOf[js.Any])
    if (numberOfTriples != null) __obj.updateDynamic("numberOfTriples")(numberOfTriples.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (process != null) __obj.updateDynamic("process")(process.asInstanceOf[js.Any])
    if (proxyReceiveMsec != null) __obj.updateDynamic("proxyReceiveMsec")(proxyReceiveMsec.asInstanceOf[js.Any])
    if (proxySentMsec != null) __obj.updateDynamic("proxySentMsec")(proxySentMsec.asInstanceOf[js.Any])
    if (recordId != null) __obj.updateDynamic("recordId")(recordId.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldMonitorLatency)) __obj.updateDynamic("shouldMonitorLatency")(shouldMonitorLatency.asInstanceOf[js.Any])
    if (subscriberReceiveMsec != null) __obj.updateDynamic("subscriberReceiveMsec")(subscriberReceiveMsec.asInstanceOf[js.Any])
    if (topicBuildFinishMsec != null) __obj.updateDynamic("topicBuildFinishMsec")(topicBuildFinishMsec.asInstanceOf[js.Any])
    if (topicBuildStartMsec != null) __obj.updateDynamic("topicBuildStartMsec")(topicBuildStartMsec.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LivegraphBacktraceRecordInfo]
  }
}

