package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Indexing$Datasources$Items")
@js.native
class ResourceDollarIndexingDollarDatasourcesDollarItems protected () extends js.Object {
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
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def deleteQueueItems(): GaxiosPromise[Schema$Operation] = js.native
  def deleteQueueItems(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def deleteQueueItems(params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarDeletequeueitems): GaxiosPromise[Schema$Operation] = js.native
  def deleteQueueItems(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarDeletequeueitems,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def deleteQueueItems(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarDeletequeueitems,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def deleteQueueItems(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarDeletequeueitems,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def deleteQueueItems(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarDeletequeueitems,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def get(): GaxiosPromise[Schema$Item] = js.native
  def get(callback: BodyResponseCallback[Schema$Item]): Unit = js.native
  def get(params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarGet): GaxiosPromise[Schema$Item] = js.native
  def get(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarGet,
    callback: BodyResponseCallback[Schema$Item]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarGet,
    options: BodyResponseCallback[Schema$Item],
    callback: BodyResponseCallback[Schema$Item]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Item] = js.native
  def get(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Item]
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
  def index(): GaxiosPromise[Schema$Operation] = js.native
  def index(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def index(params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarIndex): GaxiosPromise[Schema$Operation] = js.native
  def index(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarIndex,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def index(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarIndex,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def index(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarIndex,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def index(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarIndex,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def list(): GaxiosPromise[Schema$ListItemsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListItemsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarList): GaxiosPromise[Schema$ListItemsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarList,
    callback: BodyResponseCallback[Schema$ListItemsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarList,
    options: BodyResponseCallback[Schema$ListItemsResponse],
    callback: BodyResponseCallback[Schema$ListItemsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListItemsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListItemsResponse]
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
  def poll(): GaxiosPromise[Schema$PollItemsResponse] = js.native
  def poll(callback: BodyResponseCallback[Schema$PollItemsResponse]): Unit = js.native
  def poll(params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarPoll): GaxiosPromise[Schema$PollItemsResponse] = js.native
  def poll(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarPoll,
    callback: BodyResponseCallback[Schema$PollItemsResponse]
  ): Unit = js.native
  def poll(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarPoll,
    options: BodyResponseCallback[Schema$PollItemsResponse],
    callback: BodyResponseCallback[Schema$PollItemsResponse]
  ): Unit = js.native
  def poll(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarPoll,
    options: MethodOptions
  ): GaxiosPromise[Schema$PollItemsResponse] = js.native
  def poll(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarPoll,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PollItemsResponse]
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
  def push(): GaxiosPromise[Schema$Item] = js.native
  def push(callback: BodyResponseCallback[Schema$Item]): Unit = js.native
  def push(params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarPush): GaxiosPromise[Schema$Item] = js.native
  def push(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarPush,
    callback: BodyResponseCallback[Schema$Item]
  ): Unit = js.native
  def push(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarPush,
    options: BodyResponseCallback[Schema$Item],
    callback: BodyResponseCallback[Schema$Item]
  ): Unit = js.native
  def push(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarPush,
    options: MethodOptions
  ): GaxiosPromise[Schema$Item] = js.native
  def push(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarPush,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Item]
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
  def unreserve(): GaxiosPromise[Schema$Operation] = js.native
  def unreserve(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def unreserve(params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarUnreserve): GaxiosPromise[Schema$Operation] = js.native
  def unreserve(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarUnreserve,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def unreserve(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarUnreserve,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def unreserve(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarUnreserve,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def unreserve(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarUnreserve,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def upload(): GaxiosPromise[Schema$UploadItemRef] = js.native
  def upload(callback: BodyResponseCallback[Schema$UploadItemRef]): Unit = js.native
  def upload(params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarUpload): GaxiosPromise[Schema$UploadItemRef] = js.native
  def upload(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarUpload,
    callback: BodyResponseCallback[Schema$UploadItemRef]
  ): Unit = js.native
  def upload(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarUpload,
    options: BodyResponseCallback[Schema$UploadItemRef],
    callback: BodyResponseCallback[Schema$UploadItemRef]
  ): Unit = js.native
  def upload(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarUpload,
    options: MethodOptions
  ): GaxiosPromise[Schema$UploadItemRef] = js.native
  def upload(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarItemsDollarUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UploadItemRef]
  ): Unit = js.native
}

