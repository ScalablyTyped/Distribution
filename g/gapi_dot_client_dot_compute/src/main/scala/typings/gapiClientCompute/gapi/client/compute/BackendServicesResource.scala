package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltBackendService
import typings.gapiClientCompute.AnonAltFields
import typings.gapiClientCompute.AnonBackendService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendServicesResource extends js.Object {
  /** Retrieves the list of all BackendService resources, regional and global, available to the specified project. */
  def aggregatedList(request: AnonAlt): Request_[BackendServiceAggregatedList]
  /** Deletes the specified BackendService resource. */
  def delete(request: AnonBackendService): Request_[Operation]
  /** Returns the specified BackendService resource. Get a list of available backend services by making a list() request. */
  def get(request: AnonAltBackendService): Request_[BackendService]
  /** Gets the most recent health check results for this BackendService. */
  def getHealth(request: AnonAltBackendService): Request_[BackendServiceGroupHealth]
  /**
    * Creates a BackendService resource in the specified project using the data included in the request. There are several restrictions and guidelines to
    * keep in mind when creating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of BackendService resources available to the specified project. */
  def list(request: AnonAlt): Request_[BackendServiceList]
  /**
    * Patches the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when
    * updating a backend service. Read  Restrictions and Guidelines for more information. This method supports PATCH semantics and uses the JSON merge patch
    * format and processing rules.
    */
  def patch(request: AnonBackendService): Request_[Operation]
  /**
    * Updates the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when
    * updating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def update(request: AnonBackendService): Request_[Operation]
}

object BackendServicesResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[BackendServiceAggregatedList],
    delete: AnonBackendService => Request_[Operation],
    get: AnonAltBackendService => Request_[BackendService],
    getHealth: AnonAltBackendService => Request_[BackendServiceGroupHealth],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[BackendServiceList],
    patch: AnonBackendService => Request_[Operation],
    update: AnonBackendService => Request_[Operation]
  ): BackendServicesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getHealth = js.Any.fromFunction1(getHealth), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[BackendServicesResource]
  }
}

