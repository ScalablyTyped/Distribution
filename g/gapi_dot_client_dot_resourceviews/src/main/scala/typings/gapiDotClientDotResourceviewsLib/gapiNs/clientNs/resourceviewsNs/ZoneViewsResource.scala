package typings
package gapiDotClientDotResourceviewsLib.gapiNs.clientNs.resourceviewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneViewsResource extends js.Object {
  /** Add resources to the view. */
  def addResources(request: gapiDotClientDotResourceviewsLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Delete a resource view. */
  def delete(request: gapiDotClientDotResourceviewsLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Get the information of a zonal resource view. */
  def get(request: gapiDotClientDotResourceviewsLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[ResourceView]
  /** Get the service information of a resource view or a resource. */
  def getService(request: gapiDotClientDotResourceviewsLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[ZoneViewsGetServiceResponse]
  /** Create a resource view. */
  def insert(request: gapiDotClientDotResourceviewsLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** List resource views. */
  def list(request: gapiDotClientDotResourceviewsLib.Anon_AltFieldsKeyMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[ZoneViewsList]
  /** List the resources of the resource view. */
  def listResources(request: gapiDotClientDotResourceviewsLib.Anon_AltFieldsFormat): gapiDotClientLib.gapiNs.clientNs.Request[ZoneViewsListResourcesResponse]
  /** Remove resources from the view. */
  def removeResources(request: gapiDotClientDotResourceviewsLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Update the service information of a resource view or a resource. */
  def setService(request: gapiDotClientDotResourceviewsLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object ZoneViewsResource {
  @scala.inline
  def apply(
    addResources: gapiDotClientDotResourceviewsLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    delete: gapiDotClientDotResourceviewsLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    get: gapiDotClientDotResourceviewsLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[ResourceView],
    getService: gapiDotClientDotResourceviewsLib.Anon_AltFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[ZoneViewsGetServiceResponse],
    insert: gapiDotClientDotResourceviewsLib.Anon_AltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    list: gapiDotClientDotResourceviewsLib.Anon_AltFieldsKeyMaxResults => gapiDotClientLib.gapiNs.clientNs.Request[ZoneViewsList],
    listResources: gapiDotClientDotResourceviewsLib.Anon_AltFieldsFormat => gapiDotClientLib.gapiNs.clientNs.Request[ZoneViewsListResourcesResponse],
    removeResources: gapiDotClientDotResourceviewsLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    setService: gapiDotClientDotResourceviewsLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  ): ZoneViewsResource = {
    val __obj = js.Dynamic.literal(addResources = js.Any.fromFunction1(addResources), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getService = js.Any.fromFunction1(getService), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), listResources = js.Any.fromFunction1(listResources), removeResources = js.Any.fromFunction1(removeResources), setService = js.Any.fromFunction1(setService))
  
    __obj.asInstanceOf[ZoneViewsResource]
  }
}

