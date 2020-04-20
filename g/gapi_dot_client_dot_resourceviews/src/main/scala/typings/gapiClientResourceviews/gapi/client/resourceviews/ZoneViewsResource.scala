package typings.gapiClientResourceviews.gapi.client.resourceviews

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientResourceviews.AnonFormat
import typings.gapiClientResourceviews.AnonMaxResults
import typings.gapiClientResourceviews.AnonOauthtoken
import typings.gapiClientResourceviews.AnonPrettyPrint
import typings.gapiClientResourceviews.AnonProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneViewsResource extends js.Object {
  /** Add resources to the view. */
  def addResources(request: AnonOauthtoken): Request_[Operation]
  /** Delete a resource view. */
  def delete(request: AnonOauthtoken): Request_[Operation]
  /** Get the information of a zonal resource view. */
  def get(request: AnonOauthtoken): Request_[ResourceView]
  /** Get the service information of a resource view or a resource. */
  def getService(request: AnonPrettyPrint): Request_[ZoneViewsGetServiceResponse]
  /** Create a resource view. */
  def insert(request: AnonProject): Request_[Operation]
  /** List resource views. */
  def list(request: AnonMaxResults): Request_[ZoneViewsList]
  /** List the resources of the resource view. */
  def listResources(request: AnonFormat): Request_[ZoneViewsListResourcesResponse]
  /** Remove resources from the view. */
  def removeResources(request: AnonOauthtoken): Request_[Operation]
  /** Update the service information of a resource view or a resource. */
  def setService(request: AnonOauthtoken): Request_[Operation]
}

object ZoneViewsResource {
  @scala.inline
  def apply(
    addResources: AnonOauthtoken => Request_[Operation],
    delete: AnonOauthtoken => Request_[Operation],
    get: AnonOauthtoken => Request_[ResourceView],
    getService: AnonPrettyPrint => Request_[ZoneViewsGetServiceResponse],
    insert: AnonProject => Request_[Operation],
    list: AnonMaxResults => Request_[ZoneViewsList],
    listResources: AnonFormat => Request_[ZoneViewsListResourcesResponse],
    removeResources: AnonOauthtoken => Request_[Operation],
    setService: AnonOauthtoken => Request_[Operation]
  ): ZoneViewsResource = {
    val __obj = js.Dynamic.literal(addResources = js.Any.fromFunction1(addResources), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getService = js.Any.fromFunction1(getService), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), listResources = js.Any.fromFunction1(listResources), removeResources = js.Any.fromFunction1(removeResources), setService = js.Any.fromFunction1(setService))
    __obj.asInstanceOf[ZoneViewsResource]
  }
}

