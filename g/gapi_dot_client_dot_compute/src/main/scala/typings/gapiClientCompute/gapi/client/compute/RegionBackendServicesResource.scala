package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAltBackendServiceFieldsKey
import typings.gapiClientCompute.AnonAltBackendServiceFieldsKeyOauthtoken
import typings.gapiClientCompute.AnonAltFieldsFilter
import typings.gapiClientCompute.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionBackendServicesResource extends js.Object {
  /** Deletes the specified regional BackendService resource. */
  def delete(request: AnonAltBackendServiceFieldsKey): Request_[Operation]
  /** Returns the specified regional BackendService resource. */
  def get(request: AnonAltBackendServiceFieldsKeyOauthtoken): Request_[BackendService]
  /** Gets the most recent health check results for this regional BackendService. */
  def getHealth(request: AnonAltBackendServiceFieldsKeyOauthtoken): Request_[BackendServiceGroupHealth]
  /**
    * Creates a regional BackendService resource in the specified project using the data included in the request. There are several restrictions and
    * guidelines to keep in mind when creating a regional backend service. Read  Restrictions and Guidelines for more information.
    */
  def insert(request: AnonAltFieldsKey): Request_[Operation]
  /** Retrieves the list of regional BackendService resources available to the specified project in the given region. */
  def list(request: AnonAltFieldsFilter): Request_[BackendServiceList]
  /**
    * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in
    * mind when updating a backend service. Read  Restrictions and Guidelines for more information. This method supports PATCH semantics and uses the JSON
    * merge patch format and processing rules.
    */
  def patch(request: AnonAltBackendServiceFieldsKey): Request_[Operation]
  /**
    * Updates the specified regional BackendService resource with the data included in the request. There are several restrictions and guidelines to keep in
    * mind when updating a backend service. Read  Restrictions and Guidelines for more information.
    */
  def update(request: AnonAltBackendServiceFieldsKey): Request_[Operation]
}

object RegionBackendServicesResource {
  @scala.inline
  def apply(
    delete: AnonAltBackendServiceFieldsKey => Request_[Operation],
    get: AnonAltBackendServiceFieldsKeyOauthtoken => Request_[BackendService],
    getHealth: AnonAltBackendServiceFieldsKeyOauthtoken => Request_[BackendServiceGroupHealth],
    insert: AnonAltFieldsKey => Request_[Operation],
    list: AnonAltFieldsFilter => Request_[BackendServiceList],
    patch: AnonAltBackendServiceFieldsKey => Request_[Operation],
    update: AnonAltBackendServiceFieldsKey => Request_[Operation]
  ): RegionBackendServicesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getHealth = js.Any.fromFunction1(getHealth), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RegionBackendServicesResource]
  }
}

