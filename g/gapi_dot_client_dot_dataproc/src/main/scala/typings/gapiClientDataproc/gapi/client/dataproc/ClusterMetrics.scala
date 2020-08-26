package typings.gapiClientDataproc.gapi.client.dataproc

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterMetrics extends js.Object {
  /** The HDFS metrics. */
  var hdfsMetrics: js.UndefOr[Record[String, String]] = js.native
  /** The YARN metrics. */
  var yarnMetrics: js.UndefOr[Record[String, String]] = js.native
}

object ClusterMetrics {
  @scala.inline
  def apply(): ClusterMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterMetrics]
  }
  @scala.inline
  implicit class ClusterMetricsOps[Self <: ClusterMetrics] (val x: Self) extends AnyVal {
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
    def setHdfsMetrics(value: Record[String, String]): Self = this.set("hdfsMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHdfsMetrics: Self = this.set("hdfsMetrics", js.undefined)
    @scala.inline
    def setYarnMetrics(value: Record[String, String]): Self = this.set("yarnMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYarnMetrics: Self = this.set("yarnMetrics", js.undefined)
  }
  
}

