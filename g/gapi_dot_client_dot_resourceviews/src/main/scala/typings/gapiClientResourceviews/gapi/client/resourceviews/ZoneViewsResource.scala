package typings.gapiClientResourceviews.gapi.client.resourceviews

import typings.gapiClient.gapi.client.Request
import typings.gapiClientResourceviews.anon.Format
import typings.gapiClientResourceviews.anon.MaxResults
import typings.gapiClientResourceviews.anon.Oauthtoken
import typings.gapiClientResourceviews.anon.PrettyPrint
import typings.gapiClientResourceviews.anon.Project
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneViewsResource extends js.Object {
  /** Add resources to the view. */
  def addResources(request: Oauthtoken): Request[Operation]
  /** Delete a resource view. */
  def delete(request: Oauthtoken): Request[Operation]
  /** Get the information of a zonal resource view. */
  def get(request: Oauthtoken): Request[ResourceView]
  /** Get the service information of a resource view or a resource. */
  def getService(request: PrettyPrint): Request[ZoneViewsGetServiceResponse]
  /** Create a resource view. */
  def insert(request: Project): Request[Operation]
  /** List resource views. */
  def list(request: MaxResults): Request[ZoneViewsList]
  /** List the resources of the resource view. */
  def listResources(request: Format): Request[ZoneViewsListResourcesResponse]
  /** Remove resources from the view. */
  def removeResources(request: Oauthtoken): Request[Operation]
  /** Update the service information of a resource view or a resource. */
  def setService(request: Oauthtoken): Request[Operation]
}

object ZoneViewsResource {
  @scala.inline
  def apply(
    addResources: Oauthtoken => Request[Operation],
    delete: Oauthtoken => Request[Operation],
    get: Oauthtoken => Request[ResourceView],
    getService: PrettyPrint => Request[ZoneViewsGetServiceResponse],
    insert: Project => Request[Operation],
    list: MaxResults => Request[ZoneViewsList],
    listResources: Format => Request[ZoneViewsListResourcesResponse],
    removeResources: Oauthtoken => Request[Operation],
    setService: Oauthtoken => Request[Operation]
  ): ZoneViewsResource = {
    val __obj = js.Dynamic.literal(addResources = js.Any.fromFunction1(addResources), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getService = js.Any.fromFunction1(getService), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), listResources = js.Any.fromFunction1(listResources), removeResources = js.Any.fromFunction1(removeResources), setService = js.Any.fromFunction1(setService))
    __obj.asInstanceOf[ZoneViewsResource]
  }
}

