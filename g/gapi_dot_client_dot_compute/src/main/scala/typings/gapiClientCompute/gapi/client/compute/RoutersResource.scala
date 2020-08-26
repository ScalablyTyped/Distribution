package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Filter
import typings.gapiClientCompute.anon.PrettyPrint
import typings.gapiClientCompute.anon.RegionRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoutersResource extends js.Object {
  /** Retrieves an aggregated list of routers. */
  def aggregatedList(request: Alt): Request[RouterAggregatedList] = js.native
  /** Deletes the specified Router resource. */
  def delete(request: typings.gapiClientCompute.anon.Router): Request[Operation] = js.native
  /** Returns the specified Router resource. Get a list of available routers by making a list() request. */
  def get(request: RegionRouter): Request[Router] = js.native
  /** Retrieves runtime information of the specified router. */
  def getRouterStatus(request: RegionRouter): Request[RouterStatusResponse] = js.native
  /** Creates a Router resource in the specified project and region using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation] = js.native
  /** Retrieves a list of Router resources available to the specified project. */
  def list(request: Filter): Request[RouterList] = js.native
  /**
    * Patches the specified Router resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and
    * processing rules.
    */
  def patch(request: typings.gapiClientCompute.anon.Router): Request[Operation] = js.native
  /** Preview fields auto-generated during router create and update operations. Calling this method does NOT create or update the router. */
  def preview(request: RegionRouter): Request[RoutersPreviewResponse] = js.native
  /** Updates the specified Router resource with the data included in the request. */
  def update(request: typings.gapiClientCompute.anon.Router): Request[Operation] = js.native
}

object RoutersResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[RouterAggregatedList],
    delete: typings.gapiClientCompute.anon.Router => Request[Operation],
    get: RegionRouter => Request[Router],
    getRouterStatus: RegionRouter => Request[RouterStatusResponse],
    insert: PrettyPrint => Request[Operation],
    list: Filter => Request[RouterList],
    patch: typings.gapiClientCompute.anon.Router => Request[Operation],
    preview: RegionRouter => Request[RoutersPreviewResponse],
    update: typings.gapiClientCompute.anon.Router => Request[Operation]
  ): RoutersResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getRouterStatus = js.Any.fromFunction1(getRouterStatus), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), preview = js.Any.fromFunction1(preview), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RoutersResource]
  }
  @scala.inline
  implicit class RoutersResourceOps[Self <: RoutersResource] (val x: Self) extends AnyVal {
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
    def setAggregatedList(value: Alt => Request[RouterAggregatedList]): Self = this.set("aggregatedList", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: typings.gapiClientCompute.anon.Router => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: RegionRouter => Request[Router]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRouterStatus(value: RegionRouter => Request[RouterStatusResponse]): Self = this.set("getRouterStatus", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: PrettyPrint => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Filter => Request[RouterList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: typings.gapiClientCompute.anon.Router => Request[Operation]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setPreview(value: RegionRouter => Request[RoutersPreviewResponse]): Self = this.set("preview", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: typings.gapiClientCompute.anon.Router => Request[Operation]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

