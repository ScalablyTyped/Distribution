package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutersResource extends js.Object {
  /** Retrieves an aggregated list of routers. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[RouterAggregatedList]
  /** Deletes the specified Router resource. */
  def delete(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified Router resource. Get a list of available routers by making a list() request. */
  def get(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter
  ): gapiDotClientLib.gapiNs.clientNs.Request[Router]
  /** Retrieves runtime information of the specified router. */
  def getRouterStatus(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter
  ): gapiDotClientLib.gapiNs.clientNs.Request[RouterStatusResponse]
  /** Creates a Router resource in the specified project and region using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of Router resources available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_AltFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[RouterList]
  /**
    * Patches the specified Router resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and
    * processing rules.
    */
  def patch(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Preview fields auto-generated during router create and update operations. Calling this method does NOT create or update the router. */
  def preview(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter
  ): gapiDotClientLib.gapiNs.clientNs.Request[RoutersPreviewResponse]
  /** Updates the specified Router resource with the data included in the request. */
  def update(
    request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object RoutersResource {
  @scala.inline
  def apply(
    aggregatedList: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[RouterAggregatedList]
    ],
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter, 
      gapiDotClientLib.gapiNs.clientNs.Request[Router]
    ],
    getRouterStatus: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter, 
      gapiDotClientLib.gapiNs.clientNs.Request[RouterStatusResponse]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[RouterList]
    ],
    patch: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    preview: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRouter, 
      gapiDotClientLib.gapiNs.clientNs.Request[RoutersPreviewResponse]
    ],
    update: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserRegionRequestId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): RoutersResource = {
    val __obj = js.Dynamic.literal(aggregatedList = aggregatedList, delete = delete, get = get, getRouterStatus = getRouterStatus, insert = insert, list = list, patch = patch, preview = preview, update = update)
  
    __obj.asInstanceOf[RoutersResource]
  }
}

