package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLivegraphBacktraceRecordInfo extends js.Object {
  var dataSourcePublishMsec: js.UndefOr[String] = js.native
  var expId: js.UndefOr[String] = js.native
  var expInfo: js.UndefOr[SchemaLivegraphBacktraceRecordInfoExpInfo] = js.native
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

object SchemaLivegraphBacktraceRecordInfo {
  @scala.inline
  def apply(): SchemaLivegraphBacktraceRecordInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLivegraphBacktraceRecordInfo]
  }
  @scala.inline
  implicit class SchemaLivegraphBacktraceRecordInfoOps[Self <: SchemaLivegraphBacktraceRecordInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataSourcePublishMsec(value: String): Self = this.set("dataSourcePublishMsec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourcePublishMsec: Self = this.set("dataSourcePublishMsec", js.undefined)
    @scala.inline
    def setExpId(value: String): Self = this.set("expId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpId: Self = this.set("expId", js.undefined)
    @scala.inline
    def setExpInfo(value: SchemaLivegraphBacktraceRecordInfoExpInfo): Self = this.set("expInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpInfo: Self = this.set("expInfo", js.undefined)
    @scala.inline
    def setIsRecon(value: Boolean): Self = this.set("isRecon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRecon: Self = this.set("isRecon", js.undefined)
    @scala.inline
    def setIsWlmThrottled(value: Boolean): Self = this.set("isWlmThrottled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsWlmThrottled: Self = this.set("isWlmThrottled", js.undefined)
    @scala.inline
    def setNumberOfTriples(value: String): Self = this.set("numberOfTriples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfTriples: Self = this.set("numberOfTriples", js.undefined)
    @scala.inline
    def setPriority(value: String): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setProcess(value: String): Self = this.set("process", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcess: Self = this.set("process", js.undefined)
    @scala.inline
    def setProxyReceiveMsec(value: String): Self = this.set("proxyReceiveMsec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyReceiveMsec: Self = this.set("proxyReceiveMsec", js.undefined)
    @scala.inline
    def setProxySentMsec(value: String): Self = this.set("proxySentMsec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxySentMsec: Self = this.set("proxySentMsec", js.undefined)
    @scala.inline
    def setRecordId(value: String): Self = this.set("recordId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordId: Self = this.set("recordId", js.undefined)
    @scala.inline
    def setShouldMonitorLatency(value: Boolean): Self = this.set("shouldMonitorLatency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldMonitorLatency: Self = this.set("shouldMonitorLatency", js.undefined)
    @scala.inline
    def setSubscriberReceiveMsec(value: String): Self = this.set("subscriberReceiveMsec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriberReceiveMsec: Self = this.set("subscriberReceiveMsec", js.undefined)
    @scala.inline
    def setTopicBuildFinishMsec(value: String): Self = this.set("topicBuildFinishMsec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicBuildFinishMsec: Self = this.set("topicBuildFinishMsec", js.undefined)
    @scala.inline
    def setTopicBuildStartMsec(value: String): Self = this.set("topicBuildStartMsec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicBuildStartMsec: Self = this.set("topicBuildStartMsec", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

