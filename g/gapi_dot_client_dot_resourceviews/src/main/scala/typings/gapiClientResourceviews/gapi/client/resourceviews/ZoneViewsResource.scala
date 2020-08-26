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

@js.native
trait ZoneViewsResource extends js.Object {
  /** Add resources to the view. */
  def addResources(request: Oauthtoken): Request[Operation] = js.native
  /** Delete a resource view. */
  def delete(request: Oauthtoken): Request[Operation] = js.native
  /** Get the information of a zonal resource view. */
  def get(request: Oauthtoken): Request[ResourceView] = js.native
  /** Get the service information of a resource view or a resource. */
  def getService(request: PrettyPrint): Request[ZoneViewsGetServiceResponse] = js.native
  /** Create a resource view. */
  def insert(request: Project): Request[Operation] = js.native
  /** List resource views. */
  def list(request: MaxResults): Request[ZoneViewsList] = js.native
  /** List the resources of the resource view. */
  def listResources(request: Format): Request[ZoneViewsListResourcesResponse] = js.native
  /** Remove resources from the view. */
  def removeResources(request: Oauthtoken): Request[Operation] = js.native
  /** Update the service information of a resource view or a resource. */
  def setService(request: Oauthtoken): Request[Operation] = js.native
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
  @scala.inline
  implicit class ZoneViewsResourceOps[Self <: ZoneViewsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddResources(value: Oauthtoken => Request[Operation]): Self = this.set("addResources", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Oauthtoken => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Oauthtoken => Request[ResourceView]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetService(value: PrettyPrint => Request[ZoneViewsGetServiceResponse]): Self = this.set("getService", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Project => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: MaxResults => Request[ZoneViewsList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setListResources(value: Format => Request[ZoneViewsListResourcesResponse]): Self = this.set("listResources", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveResources(value: Oauthtoken => Request[Operation]): Self = this.set("removeResources", js.Any.fromFunction1(value))
    @scala.inline
    def setSetService(value: Oauthtoken => Request[Operation]): Self = this.set("setService", js.Any.fromFunction1(value))
  }
  
}

