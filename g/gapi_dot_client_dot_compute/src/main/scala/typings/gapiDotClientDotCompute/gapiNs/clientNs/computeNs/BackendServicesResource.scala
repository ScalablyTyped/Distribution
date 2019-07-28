package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltBackendService
import typings.gapiDotClientDotCompute.Anon_AltBackendServiceFields
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendServicesResource extends js.Object {
  /** Retrieves the list of all BackendService resources, regional and global, available to the specified project. */
  def aggregatedList(request: Anon_Alt): Request[BackendServiceAggregatedList]
  /** Deletes the specified BackendService resource. */
  def delete(request: Anon_AltBackendService): Request[Operation]
  /** Returns the specified BackendService resource. Get a list of available backend services by making a list() request. */
  def get(request: Anon_AltBackendServiceFields): Request[BackendService]
  /** Gets the most recent health check results for this BackendService. */
  def getHealth(request: Anon_AltBackendServiceFields): Request[BackendServiceGroupHealth]
  /**
    * Creates a BackendService resource in the specified project using the data included in the request. There are several restrictions and guidelines to
    * keep in mind when creating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def insert(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Retrieves the list of BackendService resources available to the specified project. */
  def list(request: Anon_Alt): Request[BackendServiceList]
  /**
    * Patches the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when
    * updating a backend service. Read  Restrictions and Guidelines for more information. This method supports PATCH semantics and uses the JSON merge patch
    * format and processing rules.
    */
  def patch(request: Anon_AltBackendService): Request[Operation]
  /**
    * Updates the specified BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in mind when
    * updating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def update(request: Anon_AltBackendService): Request[Operation]
}

object BackendServicesResource {
  @scala.inline
  def apply(
    aggregatedList: Anon_Alt => Request[BackendServiceAggregatedList],
    delete: Anon_AltBackendService => Request[Operation],
    get: Anon_AltBackendServiceFields => Request[BackendService],
    getHealth: Anon_AltBackendServiceFields => Request[BackendServiceGroupHealth],
    insert: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    list: Anon_Alt => Request[BackendServiceList],
    patch: Anon_AltBackendService => Request[Operation],
    update: Anon_AltBackendService => Request[Operation]
  ): BackendServicesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getHealth = js.Any.fromFunction1(getHealth), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[BackendServicesResource]
  }
}

