package typings.gapiClientResourceviews.gapi.client.resourceviews

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientResourceviews.AnonAltFieldsFormat
import typings.gapiClientResourceviews.AnonAltFieldsKey
import typings.gapiClientResourceviews.AnonAltFieldsKeyMaxResults
import typings.gapiClientResourceviews.AnonAltFieldsKeyOauthtoken
import typings.gapiClientResourceviews.AnonAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneViewsResource extends js.Object {
  /** Add resources to the view. */
  def addResources(request: AnonAltFieldsKey): Request_[Operation]
  /** Delete a resource view. */
  def delete(request: AnonAltFieldsKey): Request_[Operation]
  /** Get the information of a zonal resource view. */
  def get(request: AnonAltFieldsKey): Request_[ResourceView]
  /** Get the service information of a resource view or a resource. */
  def getService(request: AnonAltFieldsKeyOauthtoken): Request_[ZoneViewsGetServiceResponse]
  /** Create a resource view. */
  def insert(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Operation]
  /** List resource views. */
  def list(request: AnonAltFieldsKeyMaxResults): Request_[ZoneViewsList]
  /** List the resources of the resource view. */
  def listResources(request: AnonAltFieldsFormat): Request_[ZoneViewsListResourcesResponse]
  /** Remove resources from the view. */
  def removeResources(request: AnonAltFieldsKey): Request_[Operation]
  /** Update the service information of a resource view or a resource. */
  def setService(request: AnonAltFieldsKey): Request_[Operation]
}

object ZoneViewsResource {
  @scala.inline
  def apply(
    addResources: AnonAltFieldsKey => Request_[Operation],
    delete: AnonAltFieldsKey => Request_[Operation],
    get: AnonAltFieldsKey => Request_[ResourceView],
    getService: AnonAltFieldsKeyOauthtoken => Request_[ZoneViewsGetServiceResponse],
    insert: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[Operation],
    list: AnonAltFieldsKeyMaxResults => Request_[ZoneViewsList],
    listResources: AnonAltFieldsFormat => Request_[ZoneViewsListResourcesResponse],
    removeResources: AnonAltFieldsKey => Request_[Operation],
    setService: AnonAltFieldsKey => Request_[Operation]
  ): ZoneViewsResource = {
    val __obj = js.Dynamic.literal(addResources = js.Any.fromFunction1(addResources), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getService = js.Any.fromFunction1(getService), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), listResources = js.Any.fromFunction1(listResources), removeResources = js.Any.fromFunction1(removeResources), setService = js.Any.fromFunction1(setService))
  
    __obj.asInstanceOf[ZoneViewsResource]
  }
}

