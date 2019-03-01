package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionsResource extends js.Object {
  var clusters: ClustersResource
  var jobs: JobsResource
  var operations: OperationsResource
}

object RegionsResource {
  @scala.inline
  def apply(clusters: ClustersResource, jobs: JobsResource, operations: OperationsResource): RegionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clusters")(clusters)
    __obj.updateDynamic("jobs")(jobs)
    __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[RegionsResource]
  }
}

