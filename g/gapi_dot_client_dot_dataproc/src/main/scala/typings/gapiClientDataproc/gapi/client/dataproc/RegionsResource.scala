package typings.gapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionsResource extends js.Object {
  var clusters: ClustersResource = js.native
  var jobs: JobsResource = js.native
  var operations: OperationsResource = js.native
}

object RegionsResource {
  @scala.inline
  def apply(clusters: ClustersResource, jobs: JobsResource, operations: OperationsResource): RegionsResource = {
    val __obj = js.Dynamic.literal(clusters = clusters.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionsResource]
  }
  @scala.inline
  implicit class RegionsResourceOps[Self <: RegionsResource] (val x: Self) extends AnyVal {
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
    def setClusters(value: ClustersResource): Self = this.set("clusters", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobs(value: JobsResource): Self = this.set("jobs", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperations(value: OperationsResource): Self = this.set("operations", value.asInstanceOf[js.Any])
  }
  
}

