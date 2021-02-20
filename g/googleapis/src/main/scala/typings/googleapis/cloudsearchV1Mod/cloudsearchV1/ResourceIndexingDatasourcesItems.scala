package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Indexing$Datasources$Items")
@js.native
class ResourceIndexingDatasourcesItems protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudsearch.indexing.datasources.items.delete
    * @desc Deletes Item resource for the specified resource name.
    * @alias cloudsearch.indexing.datasources.items.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.connectorName Name of connector making this call. <br />Format: datasources/{source_id}/connectors/{ID}
    * @param {boolean=} params.debugOptions.enableDebugging If set, the request will enable debugging features of Cloud Search. Only turn on this field, if asked by Google to help with debugging.
    * @param {string=} params.mode Required. The RequestMode for this request.
    * @param {string} params.name Required. Name of the item to delete. Format: datasources/{source_id}/items/{item_id}
    * @param {string=} params.version Required. The incremented version of the item to delete from the index. The indexing system stores the version from the datasource as a byte string and compares the Item version in the index to the version of the queued Item using lexical ordering. <br /><br /> Cloud Search Indexing won't delete any queued item with a version value that is less than or equal to the version of the currently indexed item. The maximum length for this field is 1024 bytes.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceIndexingDatasourcesItemsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceIndexingDatasourcesItemsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceIndexingDatasourcesItemsDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceIndexingDatasourcesItemsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceIndexingDatasourcesItemsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * cloudsearch.indexing.datasources.items.deleteQueueItems
    * @desc Deletes all items in a queue. This method is useful for deleting
    * stale items.
    * @alias cloudsearch.indexing.datasources.items.deleteQueueItems
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the Data Source to delete items in a queue. Format: datasources/{source_id}
    * @param {().DeleteQueueItemsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteQueueItems(): GaxiosPromise[SchemaOperation] = js.native
  def deleteQueueItems(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def deleteQueueItems(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteQueueItems(params: ParamsResourceIndexingDatasourcesItemsDeletequeueitems): GaxiosPromise[SchemaOperation] = js.native
  def deleteQueueItems(
    params: ParamsResourceIndexingDatasourcesItemsDeletequeueitems,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deleteQueueItems(
    params: ParamsResourceIndexingDatasourcesItemsDeletequeueitems,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deleteQueueItems(params: ParamsResourceIndexingDatasourcesItemsDeletequeueitems, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteQueueItems(
    params: ParamsResourceIndexingDatasourcesItemsDeletequeueitems,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * cloudsearch.indexing.datasources.items.get
    * @desc Gets Item resource by item name.
    * @alias cloudsearch.indexing.datasources.items.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.connectorName Name of connector making this call. <br />Format: datasources/{source_id}/connectors/{ID}
    * @param {boolean=} params.debugOptions.enableDebugging If set, the request will enable debugging features of Cloud Search. Only turn on this field, if asked by Google to help with debugging.
    * @param {string} params.name Name of the item to get info. Format: datasources/{source_id}/items/{item_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaItem] = js.native
  def get(callback: BodyResponseCallback[SchemaItem]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaItem] = js.native
  def get(params: ParamsResourceIndexingDatasourcesItemsGet): GaxiosPromise[SchemaItem] = js.native
  def get(params: ParamsResourceIndexingDatasourcesItemsGet, callback: BodyResponseCallback[SchemaItem]): Unit = js.native
  def get(
    params: ParamsResourceIndexingDatasourcesItemsGet,
    options: BodyResponseCallback[SchemaItem],
    callback: BodyResponseCallback[SchemaItem]
  ): Unit = js.native
  def get(params: ParamsResourceIndexingDatasourcesItemsGet, options: MethodOptions): GaxiosPromise[SchemaItem] = js.native
  def get(
    params: ParamsResourceIndexingDatasourcesItemsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaItem]
  ): Unit = js.native
  
  /**
    * cloudsearch.indexing.datasources.items.index
    * @desc Updates Item ACL, metadata, and content. It will insert the Item if
    * it does not exist. This method does not support partial updates.  Fields
    * with no provided values are cleared out in the Cloud Search index.
    * @alias cloudsearch.indexing.datasources.items.index
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the Item. Format: datasources/{source_id}/items/{item_id} <br />This is a required field. The maximum length is 1536 characters.
    * @param {().IndexItemRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def index(): GaxiosPromise[SchemaOperation] = js.native
  def index(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def index(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def index(params: ParamsResourceIndexingDatasourcesItemsIndex): GaxiosPromise[SchemaOperation] = js.native
  def index(
    params: ParamsResourceIndexingDatasourcesItemsIndex,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def index(
    params: ParamsResourceIndexingDatasourcesItemsIndex,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def index(params: ParamsResourceIndexingDatasourcesItemsIndex, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def index(
    params: ParamsResourceIndexingDatasourcesItemsIndex,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * cloudsearch.indexing.datasources.items.list
    * @desc Lists all or a subset of Item resources.
    * @alias cloudsearch.indexing.datasources.items.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.brief When set to true, the indexing system only populates the following fields: name, version, metadata.hash, structured_data.hash, content.hash. <br />If this value is false, then all the fields are populated in Item.
    * @param {string=} params.connectorName Name of connector making this call. <br />Format: datasources/{source_id}/connectors/{ID}
    * @param {boolean=} params.debugOptions.enableDebugging If set, the request will enable debugging features of Cloud Search. Only turn on this field, if asked by Google to help with debugging.
    * @param {string} params.name Name of the Data Source to list Items.  Format: datasources/{source_id}
    * @param {integer=} params.pageSize Maximum number of items to fetch in a request. The max value is 1000 when brief is true.  The max value is 10 if brief is false. <br />The default value is 10
    * @param {string=} params.pageToken The next_page_token value returned from a previous List request, if any.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListItemsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListItemsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListItemsResponse] = js.native
  def list(params: ParamsResourceIndexingDatasourcesItemsList): GaxiosPromise[SchemaListItemsResponse] = js.native
  def list(
    params: ParamsResourceIndexingDatasourcesItemsList,
    callback: BodyResponseCallback[SchemaListItemsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceIndexingDatasourcesItemsList,
    options: BodyResponseCallback[SchemaListItemsResponse],
    callback: BodyResponseCallback[SchemaListItemsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceIndexingDatasourcesItemsList, options: MethodOptions): GaxiosPromise[SchemaListItemsResponse] = js.native
  def list(
    params: ParamsResourceIndexingDatasourcesItemsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListItemsResponse]
  ): Unit = js.native
  
  /**
    * cloudsearch.indexing.datasources.items.poll
    * @desc Polls for unreserved items from the indexing queue and marks a set
    * as reserved, starting with items that have the oldest timestamp from the
    * highest priority ItemStatus. The priority order is as follows: <br />
    * ERROR <br /> MODIFIED <br /> NEW_ITEM <br /> ACCEPTED <br /> Reserving
    * items ensures that polling from other threads cannot create overlapping
    * sets.  After handling the reserved items, the client should put items
    * back into the unreserved state, either by calling index, or by calling
    * push with the type REQUEUE.  Items automatically become available
    * (unreserved) after 4 hours even if no update or push method is called.
    * @alias cloudsearch.indexing.datasources.items.poll
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the Data Source to poll items. Format: datasources/{source_id}
    * @param {().PollItemsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def poll(): GaxiosPromise[SchemaPollItemsResponse] = js.native
  def poll(callback: BodyResponseCallback[SchemaPollItemsResponse]): Unit = js.native
  def poll(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPollItemsResponse] = js.native
  def poll(params: ParamsResourceIndexingDatasourcesItemsPoll): GaxiosPromise[SchemaPollItemsResponse] = js.native
  def poll(
    params: ParamsResourceIndexingDatasourcesItemsPoll,
    callback: BodyResponseCallback[SchemaPollItemsResponse]
  ): Unit = js.native
  def poll(
    params: ParamsResourceIndexingDatasourcesItemsPoll,
    options: BodyResponseCallback[SchemaPollItemsResponse],
    callback: BodyResponseCallback[SchemaPollItemsResponse]
  ): Unit = js.native
  def poll(params: ParamsResourceIndexingDatasourcesItemsPoll, options: MethodOptions): GaxiosPromise[SchemaPollItemsResponse] = js.native
  def poll(
    params: ParamsResourceIndexingDatasourcesItemsPoll,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPollItemsResponse]
  ): Unit = js.native
  
  /**
    * cloudsearch.indexing.datasources.items.push
    * @desc Pushes an item onto a queue for later polling and updating.
    * @alias cloudsearch.indexing.datasources.items.push
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the item to push into the indexing queue.<br /> Format: datasources/{source_id}/items/{ID} <br />This is a required field. The maximum length is 1536 characters.
    * @param {().PushItemRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def push(): GaxiosPromise[SchemaItem] = js.native
  def push(callback: BodyResponseCallback[SchemaItem]): Unit = js.native
  def push(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaItem] = js.native
  def push(params: ParamsResourceIndexingDatasourcesItemsPush): GaxiosPromise[SchemaItem] = js.native
  def push(params: ParamsResourceIndexingDatasourcesItemsPush, callback: BodyResponseCallback[SchemaItem]): Unit = js.native
  def push(
    params: ParamsResourceIndexingDatasourcesItemsPush,
    options: BodyResponseCallback[SchemaItem],
    callback: BodyResponseCallback[SchemaItem]
  ): Unit = js.native
  def push(params: ParamsResourceIndexingDatasourcesItemsPush, options: MethodOptions): GaxiosPromise[SchemaItem] = js.native
  def push(
    params: ParamsResourceIndexingDatasourcesItemsPush,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaItem]
  ): Unit = js.native
  
  /**
    * cloudsearch.indexing.datasources.items.unreserve
    * @desc Unreserves all items from a queue, making them all eligible to be
    * polled.  This method is useful for resetting the indexing queue after a
    * connector has been restarted.
    * @alias cloudsearch.indexing.datasources.items.unreserve
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the Data Source to unreserve all items. Format: datasources/{source_id}
    * @param {().UnreserveItemsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def unreserve(): GaxiosPromise[SchemaOperation] = js.native
  def unreserve(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def unreserve(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def unreserve(params: ParamsResourceIndexingDatasourcesItemsUnreserve): GaxiosPromise[SchemaOperation] = js.native
  def unreserve(
    params: ParamsResourceIndexingDatasourcesItemsUnreserve,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def unreserve(
    params: ParamsResourceIndexingDatasourcesItemsUnreserve,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def unreserve(params: ParamsResourceIndexingDatasourcesItemsUnreserve, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def unreserve(
    params: ParamsResourceIndexingDatasourcesItemsUnreserve,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * cloudsearch.indexing.datasources.items.upload
    * @desc Creates an upload session for uploading item content. For items
    * smaller than 100 KiB, it's easier to embed the content inline within
    * update.
    * @alias cloudsearch.indexing.datasources.items.upload
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the Item to start a resumable upload. Format: datasources/{source_id}/items/{item_id}.
    * @param {().StartUploadItemRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def upload(): GaxiosPromise[SchemaUploadItemRef] = js.native
  def upload(callback: BodyResponseCallback[SchemaUploadItemRef]): Unit = js.native
  def upload(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUploadItemRef] = js.native
  def upload(params: ParamsResourceIndexingDatasourcesItemsUpload): GaxiosPromise[SchemaUploadItemRef] = js.native
  def upload(
    params: ParamsResourceIndexingDatasourcesItemsUpload,
    callback: BodyResponseCallback[SchemaUploadItemRef]
  ): Unit = js.native
  def upload(
    params: ParamsResourceIndexingDatasourcesItemsUpload,
    options: BodyResponseCallback[SchemaUploadItemRef],
    callback: BodyResponseCallback[SchemaUploadItemRef]
  ): Unit = js.native
  def upload(params: ParamsResourceIndexingDatasourcesItemsUpload, options: MethodOptions): GaxiosPromise[SchemaUploadItemRef] = js.native
  def upload(
    params: ParamsResourceIndexingDatasourcesItemsUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUploadItemRef]
  ): Unit = js.native
}
