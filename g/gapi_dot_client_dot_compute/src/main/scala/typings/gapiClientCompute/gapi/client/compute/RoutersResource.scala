package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonFilter
import typings.gapiClientCompute.AnonPrettyPrint
import typings.gapiClientCompute.AnonRegionRouter
import typings.gapiClientCompute.AnonRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutersResource extends js.Object {
  /** Retrieves an aggregated list of routers. */
  def aggregatedList(request: AnonAlt): Request_[RouterAggregatedList]
  /** Deletes the specified Router resource. */
  def delete(request: AnonRouter): Request_[Operation]
  /** Returns the specified Router resource. Get a list of available routers by making a list() request. */
  def get(request: AnonRegionRouter): Request_[Router]
  /** Retrieves runtime information of the specified router. */
  def getRouterStatus(request: AnonRegionRouter): Request_[RouterStatusResponse]
  /** Creates a Router resource in the specified project and region using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves a list of Router resources available to the specified project. */
  def list(request: AnonFilter): Request_[RouterList]
  /**
    * Patches the specified Router resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and
    * processing rules.
    */
  def patch(request: AnonRouter): Request_[Operation]
  /** Preview fields auto-generated during router create and update operations. Calling this method does NOT create or update the router. */
  def preview(request: AnonRegionRouter): Request_[RoutersPreviewResponse]
  /** Updates the specified Router resource with the data included in the request. */
  def update(request: AnonRouter): Request_[Operation]
}

object RoutersResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[RouterAggregatedList],
    delete: AnonRouter => Request_[Operation],
    get: AnonRegionRouter => Request_[Router],
    getRouterStatus: AnonRegionRouter => Request_[RouterStatusResponse],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFilter => Request_[RouterList],
    patch: AnonRouter => Request_[Operation],
    preview: AnonRegionRouter => Request_[RoutersPreviewResponse],
    update: AnonRouter => Request_[Operation]
  ): RoutersResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getRouterStatus = js.Any.fromFunction1(getRouterStatus), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), preview = js.Any.fromFunction1(preview), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RoutersResource]
  }
}

