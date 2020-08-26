package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterReroute[T] extends Generic {
  var body: js.UndefOr[T] = js.native
  var dry_run: js.UndefOr[Boolean] = js.native
  var explain: js.UndefOr[Boolean] = js.native
  var master_timeout: js.UndefOr[String] = js.native
  var metric: js.UndefOr[String | js.Array[String]] = js.native
  var retry_failed: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[String] = js.native
}

object ClusterReroute {
  @scala.inline
  def apply[T](): ClusterReroute[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterReroute[T]]
  }
  @scala.inline
  implicit class ClusterRerouteOps[Self <: ClusterReroute[_], T] (val x: Self with ClusterReroute[T]) extends AnyVal {
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
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setDry_run(value: Boolean): Self = this.set("dry_run", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDry_run: Self = this.set("dry_run", js.undefined)
    @scala.inline
    def setExplain(value: Boolean): Self = this.set("explain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplain: Self = this.set("explain", js.undefined)
    @scala.inline
    def setMaster_timeout(value: String): Self = this.set("master_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaster_timeout: Self = this.set("master_timeout", js.undefined)
    @scala.inline
    def setMetricVarargs(value: String*): Self = this.set("metric", js.Array(value :_*))
    @scala.inline
    def setMetric(value: String | js.Array[String]): Self = this.set("metric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    @scala.inline
    def setRetry_failed(value: Boolean): Self = this.set("retry_failed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry_failed: Self = this.set("retry_failed", js.undefined)
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

