package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFieldsFilter
import typings.gapiClientCompute.AnonAltFieldsKey
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutersResource extends js.Object {
  /** Retrieves an aggregated list of routers. */
  def aggregatedList(request: AnonAlt): Request_[RouterAggregatedList]
  /** Deletes the specified Router resource. */
  def delete(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId): Request_[Operation]
  /** Returns the specified Router resource. Get a list of available routers by making a list() request. */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter): Request_[Router]
  /** Retrieves runtime information of the specified router. */
  def getRouterStatus(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter): Request_[RouterStatusResponse]
  /** Creates a Router resource in the specified project and region using the data included in the request. */
  def insert(request: AnonAltFieldsKey): Request_[Operation]
  /** Retrieves a list of Router resources available to the specified project. */
  def list(request: AnonAltFieldsFilter): Request_[RouterList]
  /**
    * Patches the specified Router resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and
    * processing rules.
    */
  def patch(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId): Request_[Operation]
  /** Preview fields auto-generated during router create and update operations. Calling this method does NOT create or update the router. */
  def preview(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter): Request_[RoutersPreviewResponse]
  /** Updates the specified Router resource with the data included in the request. */
  def update(request: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId): Request_[Operation]
}

object RoutersResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[RouterAggregatedList],
    delete: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId => Request_[Operation],
    get: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter => Request_[Router],
    getRouterStatus: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter => Request_[RouterStatusResponse],
    insert: AnonAltFieldsKey => Request_[Operation],
    list: AnonAltFieldsFilter => Request_[RouterList],
    patch: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId => Request_[Operation],
    preview: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter => Request_[RoutersPreviewResponse],
    update: AnonAltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId => Request_[Operation]
  ): RoutersResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getRouterStatus = js.Any.fromFunction1(getRouterStatus), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), preview = js.Any.fromFunction1(preview), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RoutersResource]
  }
}

