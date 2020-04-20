package typings.gapiClientDataproc.gapi.client.dataproc

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
    val __obj = js.Dynamic.literal(clusters = clusters.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionsResource]
  }
}

