package typings.gapiDotClientDotResourceviews.gapiNs.clientNs.resourceviewsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotResourceviews.Anon_AltFieldsFormat
import typings.gapiDotClientDotResourceviews.Anon_AltFieldsKey
import typings.gapiDotClientDotResourceviews.Anon_AltFieldsKeyMaxResults
import typings.gapiDotClientDotResourceviews.Anon_AltFieldsKeyOauthtoken
import typings.gapiDotClientDotResourceviews.Anon_AltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneViewsResource extends js.Object {
  /** Add resources to the view. */
  def addResources(request: Anon_AltFieldsKey): Request[Operation]
  /** Delete a resource view. */
  def delete(request: Anon_AltFieldsKey): Request[Operation]
  /** Get the information of a zonal resource view. */
  def get(request: Anon_AltFieldsKey): Request[ResourceView]
  /** Get the service information of a resource view or a resource. */
  def getService(request: Anon_AltFieldsKeyOauthtoken): Request[ZoneViewsGetServiceResponse]
  /** Create a resource view. */
  def insert(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** List resource views. */
  def list(request: Anon_AltFieldsKeyMaxResults): Request[ZoneViewsList]
  /** List the resources of the resource view. */
  def listResources(request: Anon_AltFieldsFormat): Request[ZoneViewsListResourcesResponse]
  /** Remove resources from the view. */
  def removeResources(request: Anon_AltFieldsKey): Request[Operation]
  /** Update the service information of a resource view or a resource. */
  def setService(request: Anon_AltFieldsKey): Request[Operation]
}

object ZoneViewsResource {
  @scala.inline
  def apply(
    addResources: Anon_AltFieldsKey => Request[Operation],
    delete: Anon_AltFieldsKey => Request[Operation],
    get: Anon_AltFieldsKey => Request[ResourceView],
    getService: Anon_AltFieldsKeyOauthtoken => Request[ZoneViewsGetServiceResponse],
    insert: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    list: Anon_AltFieldsKeyMaxResults => Request[ZoneViewsList],
    listResources: Anon_AltFieldsFormat => Request[ZoneViewsListResourcesResponse],
    removeResources: Anon_AltFieldsKey => Request[Operation],
    setService: Anon_AltFieldsKey => Request[Operation]
  ): ZoneViewsResource = {
    val __obj = js.Dynamic.literal(addResources = js.Any.fromFunction1(addResources), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getService = js.Any.fromFunction1(getService), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), listResources = js.Any.fromFunction1(listResources), removeResources = js.Any.fromFunction1(removeResources), setService = js.Any.fromFunction1(setService))
  
    __obj.asInstanceOf[ZoneViewsResource]
  }
}

