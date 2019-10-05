package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsFilter
import typings.gapiDotClientDotCompute.Anon_AltFieldsKey
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutersResource extends js.Object {
  /** Retrieves an aggregated list of routers. */
  def aggregatedList(request: Anon_Alt): Request[RouterAggregatedList]
  /** Deletes the specified Router resource. */
  def delete(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId): Request[Operation]
  /** Returns the specified Router resource. Get a list of available routers by making a list() request. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter): Request[Router]
  /** Retrieves runtime information of the specified router. */
  def getRouterStatus(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter): Request[RouterStatusResponse]
  /** Creates a Router resource in the specified project and region using the data included in the request. */
  def insert(request: Anon_AltFieldsKey): Request[Operation]
  /** Retrieves a list of Router resources available to the specified project. */
  def list(request: Anon_AltFieldsFilter): Request[RouterList]
  /**
    * Patches the specified Router resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and
    * processing rules.
    */
  def patch(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId): Request[Operation]
  /** Preview fields auto-generated during router create and update operations. Calling this method does NOT create or update the router. */
  def preview(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter): Request[RoutersPreviewResponse]
  /** Updates the specified Router resource with the data included in the request. */
  def update(request: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId): Request[Operation]
}

object RoutersResource {
  @scala.inline
  def apply(
    aggregatedList: Anon_Alt => Request[RouterAggregatedList],
    delete: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId => Request[Operation],
    get: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter => Request[Router],
    getRouterStatus: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter => Request[RouterStatusResponse],
    insert: Anon_AltFieldsKey => Request[Operation],
    list: Anon_AltFieldsFilter => Request[RouterList],
    patch: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId => Request[Operation],
    preview: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter => Request[RoutersPreviewResponse],
    update: Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId => Request[Operation]
  ): RoutersResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getRouterStatus = js.Any.fromFunction1(getRouterStatus), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), preview = js.Any.fromFunction1(preview), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RoutersResource]
  }
}

