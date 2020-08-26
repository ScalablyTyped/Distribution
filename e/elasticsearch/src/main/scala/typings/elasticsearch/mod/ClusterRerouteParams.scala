package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterRerouteParams extends GenericParams {
  var dryRun: js.UndefOr[Boolean] = js.native
  var explain: js.UndefOr[Boolean] = js.native
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  var metric: js.UndefOr[NameList] = js.native
  var retryFailed: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[TimeSpan] = js.native
}

object ClusterRerouteParams {
  @scala.inline
  def apply(): ClusterRerouteParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterRerouteParams]
  }
  @scala.inline
  implicit class ClusterRerouteParamsOps[Self <: ClusterRerouteParams] (val x: Self) extends AnyVal {
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
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
    @scala.inline
    def setExplain(value: Boolean): Self = this.set("explain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplain: Self = this.set("explain", js.undefined)
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = this.set("masterTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterTimeout: Self = this.set("masterTimeout", js.undefined)
    @scala.inline
    def setMetricVarargs(value: String*): Self = this.set("metric", js.Array(value :_*))
    @scala.inline
    def setMetric(value: NameList): Self = this.set("metric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    @scala.inline
    def setRetryFailed(value: Boolean): Self = this.set("retryFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryFailed: Self = this.set("retryFailed", js.undefined)
    @scala.inline
    def setTimeout(value: TimeSpan): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

