package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltBackendService
import typings.gapiClientCompute.AnonAltBackendServiceFields
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendServicesResource extends js.Object {
  /** Retrieves the list of all BackendService resources, regional and global, available to the specified project. */
  def aggregatedList(request: AnonAlt): Request_[BackendServiceAggregatedList]
  /** Deletes the specified BackendService resource. */
  def delete(request: AnonAltBackendService): Request_[Operation]
  /** Returns the specified BackendService resource. Get a list of available backend services by making a list() request. */
  def get(request: AnonAltBackendServiceFields): Request_[BackendService]
  /** Gets the most recent health check results for this BackendService. */
  def getHealth(request: AnonAltBackendServiceFields): Request_[BackendServiceGroupHealth]
  /**
    * Creates a BackendService resource in the specified project using the data included in the request. There are several restrictions and guidelines to
    * keep in mind when creating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def insert(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
  /** Retrieves the list of BackendService resources available to the specified project. */
  def list(request: AnonAlt): Request_[BackendServiceList]
  /**
    * Patches the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when
    * updating a backend service. Read  Restrictions and Guidelines for more information. This method supports PATCH semantics and uses the JSON merge patch
    * format and processing rules.
    */
  def patch(request: AnonAltBackendService): Request_[Operation]
  /**
    * Updates the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when
    * updating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def update(request: AnonAltBackendService): Request_[Operation]
}

object BackendServicesResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[BackendServiceAggregatedList],
    delete: AnonAltBackendService => Request_[Operation],
    get: AnonAltBackendServiceFields => Request_[BackendService],
    getHealth: AnonAltBackendServiceFields => Request_[BackendServiceGroupHealth],
    insert: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation],
    list: AnonAlt => Request_[BackendServiceList],
    patch: AnonAltBackendService => Request_[Operation],
    update: AnonAltBackendService => Request_[Operation]
  ): BackendServicesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getHealth = js.Any.fromFunction1(getHealth), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[BackendServicesResource]
  }
}

