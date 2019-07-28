package typings.gapiDotClientDotDataproc.gapiNs.clientNs.dataprocNs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterMetrics extends js.Object {
  /** The HDFS metrics. */
  var hdfsMetrics: js.UndefOr[Record[String, String]] = js.undefined
  /** The YARN metrics. */
  var yarnMetrics: js.UndefOr[Record[String, String]] = js.undefined
}

object ClusterMetrics {
  @scala.inline
  def apply(hdfsMetrics: Record[String, String] = null, yarnMetrics: Record[String, String] = null): ClusterMetrics = {
    val __obj = js.Dynamic.literal()
    if (hdfsMetrics != null) __obj.updateDynamic("hdfsMetrics")(hdfsMetrics)
    if (yarnMetrics != null) __obj.updateDynamic("yarnMetrics")(yarnMetrics)
    __obj.asInstanceOf[ClusterMetrics]
  }
}

