package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterMetrics extends js.Object {
  /** The HDFS metrics. */
  var hdfsMetrics: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The YARN metrics. */
  var yarnMetrics: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

object ClusterMetrics {
  @scala.inline
  def apply(
    hdfsMetrics: stdLib.Record[java.lang.String, java.lang.String] = null,
    yarnMetrics: stdLib.Record[java.lang.String, java.lang.String] = null
  ): ClusterMetrics = {
    val __obj = js.Dynamic.literal()
    if (hdfsMetrics != null) __obj.updateDynamic("hdfsMetrics")(hdfsMetrics)
    if (yarnMetrics != null) __obj.updateDynamic("yarnMetrics")(yarnMetrics)
    __obj.asInstanceOf[ClusterMetrics]
  }
}

