package typings.gapiClientDataproc.gapi.client.dataproc

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDataproc.anon.Accesstoken
import typings.gapiClientDataproc.anon.Alt
import typings.gapiClientDataproc.anon.Bearertoken
import typings.gapiClientDataproc.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClustersResource extends js.Object {
  /** Creates a cluster in a project. */
  def create(request: Accesstoken): Request[Operation] = js.native
  /** Deletes a cluster in a project. */
  def delete(request: Alt): Request[Operation] = js.native
  /** Gets cluster diagnostic information. After the operation completes, the Operation.response field contains DiagnoseClusterOutputLocation. */
  def diagnose(request: Alt): Request[Operation] = js.native
  /** Gets the resource representation for a cluster in a project. */
  def get(request: Alt): Request[Cluster] = js.native
  /** Lists all regions/{region}/clusters in a project. */
  def list(request: Bearertoken): Request[ListClustersResponse] = js.native
  /** Updates a cluster in a project. */
  def patch(request: Callback): Request[Operation] = js.native
}

object ClustersResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[Operation],
    delete: Alt => Request[Operation],
    diagnose: Alt => Request[Operation],
    get: Alt => Request[Cluster],
    list: Bearertoken => Request[ListClustersResponse],
    patch: Callback => Request[Operation]
  ): ClustersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), diagnose = js.Any.fromFunction1(diagnose), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[ClustersResource]
  }
  @scala.inline
  implicit class ClustersResourceOps[Self <: ClustersResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Accesstoken => Request[Operation]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Alt => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setDiagnose(value: Alt => Request[Operation]): Self = this.set("diagnose", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Alt => Request[Cluster]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Bearertoken => Request[ListClustersResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Callback => Request[Operation]): Self = this.set("patch", js.Any.fromFunction1(value))
  }
  
}

