package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.BackendServiceFields
import typings.gapiClientCompute.anon.Filter
import typings.gapiClientCompute.anon.PrettyPrint
import typings.gapiClientCompute.anon.ProjectQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionBackendServicesResource extends js.Object {
  /** Deletes the specified regional BackendService resource. */
  def delete(request: BackendServiceFields): Request[Operation]
  /** Returns the specified regional BackendService resource. */
  def get(request: ProjectQuotaUser): Request[BackendService]
  /** Gets the most recent health check results for this regional BackendService. */
  def getHealth(request: ProjectQuotaUser): Request[BackendServiceGroupHealth]
  /**
    * Creates a regional BackendService resource in the specified project using the data included in the request. There are several restrictions and
    * guidelines to keep in mind when creating a regional backend service. Read  Restrictions and Guidelines for more information.
    */
  def insert(request: PrettyPrint): Request[Operation]
  /** Retrieves the list of regional BackendService resources available to the specified project in the given region. */
  def list(request: Filter): Request[BackendServiceList]
  /**
    * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in
    * mind when updating a backend service. Read  Restrictions and Guidelines for more information. This method supports PATCH semantics and uses the JSON
    * merge patch format and processing rules.
    */
  def patch(request: BackendServiceFields): Request[Operation]
  /**
    * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in
    * mind when updating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def update(request: BackendServiceFields): Request[Operation]
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
}

