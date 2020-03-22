package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonBackendServiceFields
import typings.gapiClientCompute.AnonFilter
import typings.gapiClientCompute.AnonPrettyPrint
import typings.gapiClientCompute.AnonProjectQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionBackendServicesResource extends js.Object {
  /** Deletes the specified regional BackendService resource. */
  def delete(request: AnonBackendServiceFields): Request_[Operation]
  /** Returns the specified regional BackendService resource. */
  def get(request: AnonProjectQuotaUser): Request_[BackendService]
  /** Gets the most recent health check results for this regional BackendService. */
  def getHealth(request: AnonProjectQuotaUser): Request_[BackendServiceGroupHealth]
  /**
    * Creates a regional BackendService resource in the specified project using the data included in the request. There are several restrictions and
    * guidelines to keep in mind when creating a regional backend service. Read  Restrictions and Guidelines for more information.
    */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves the list of regional BackendService resources available to the specified project in the given region. */
  def list(request: AnonFilter): Request_[BackendServiceList]
  /**
    * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in
    * mind when updating a backend service. Read  Restrictions and Guidelines for more information. This method supports PATCH semantics and uses the JSON
    * merge patch format and processing rules.
    */
  def patch(request: AnonBackendServiceFields): Request_[Operation]
  /**
    * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in
    * mind when updating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def update(request: AnonBackendServiceFields): Request_[Operation]
}

object RegionBackendServicesResource {
  @scala.inline
  def apply(
    delete: AnonBackendServiceFields => Request_[Operation],
    get: AnonProjectQuotaUser => Request_[BackendService],
    getHealth: AnonProjectQuotaUser => Request_[BackendServiceGroupHealth],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFilter => Request_[BackendServiceList],
    patch: AnonBackendServiceFields => Request_[Operation],
    update: AnonBackendServiceFields => Request_[Operation]
  ): RegionBackendServicesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getHealth = js.Any.fromFunction1(getHealth), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RegionBackendServicesResource]
  }
}

