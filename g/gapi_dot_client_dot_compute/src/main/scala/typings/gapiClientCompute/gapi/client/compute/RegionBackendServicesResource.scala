package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.BackendServiceFields
import typings.gapiClientCompute.anon.Filter
import typings.gapiClientCompute.anon.PrettyPrint
import typings.gapiClientCompute.anon.ProjectQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionBackendServicesResource extends js.Object {
  /** Deletes the specified regional BackendService resource. */
  def delete(request: BackendServiceFields): Request[Operation] = js.native
  /** Returns the specified regional BackendService resource. */
  def get(request: ProjectQuotaUser): Request[BackendService] = js.native
  /** Gets the most recent health check results for this regional BackendService. */
  def getHealth(request: ProjectQuotaUser): Request[BackendServiceGroupHealth] = js.native
  /**
    * Creates a regional BackendService resource in the specified project using the data included in the request. There are several restrictions and
    * guidelines to keep in mind when creating a regional backend service. Read  Restrictions and Guidelines for more information.
    */
  def insert(request: PrettyPrint): Request[Operation] = js.native
  /** Retrieves the list of regional BackendService resources available to the specified project in the given region. */
  def list(request: Filter): Request[BackendServiceList] = js.native
  /**
    * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in
    * mind when updating a backend service. Read  Restrictions and Guidelines for more information. This method supports PATCH semantics and uses the JSON
    * merge patch format and processing rules.
    */
  def patch(request: BackendServiceFields): Request[Operation] = js.native
  /**
    * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in
    * mind when updating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def update(request: BackendServiceFields): Request[Operation] = js.native
}

object RegionBackendServicesResource {
  @scala.inline
  def apply(
    delete: BackendServiceFields => Request[Operation],
    get: ProjectQuotaUser => Request[BackendService],
    getHealth: ProjectQuotaUser => Request[BackendServiceGroupHealth],
    insert: PrettyPrint => Request[Operation],
    list: Filter => Request[BackendServiceList],
    patch: BackendServiceFields => Request[Operation],
    update: BackendServiceFields => Request[Operation]
  ): RegionBackendServicesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getHealth = js.Any.fromFunction1(getHealth), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RegionBackendServicesResource]
  }
  @scala.inline
  implicit class RegionBackendServicesResourceOps[Self <: RegionBackendServicesResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: BackendServiceFields => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: ProjectQuotaUser => Request[BackendService]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetHealth(value: ProjectQuotaUser => Request[BackendServiceGroupHealth]): Self = this.set("getHealth", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: PrettyPrint => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Filter => Request[BackendServiceList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: BackendServiceFields => Request[Operation]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: BackendServiceFields => Request[Operation]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

