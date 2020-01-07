package typings.googleapis.buildSrcApisMirrorV1Mod.mirror_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/mirror/v1", "mirror_v1.Resource$Timeline")
@js.native
class Resource$Timeline protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var attachments: ResourceDollarTimelineDollarAttachments = js.native
  var context: APIRequestContext = js.native
  /**
    * mirror.timeline.delete
    * @desc Deletes a timeline item.
    * @alias mirror.timeline.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the timeline item.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTimelineDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarTimelineDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarTimelineDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTimelineDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarTimelineDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * mirror.timeline.get
    * @desc Gets a single timeline item by ID.
    * @alias mirror.timeline.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the timeline item.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$TimelineItem] = js.native
  def get(callback: BodyResponseCallback[Schema$TimelineItem]): Unit = js.native
  def get(params: ParamsDollarResourceDollarTimelineDollarGet): GaxiosPromise[Schema$TimelineItem] = js.native
  def get(
    params: ParamsDollarResourceDollarTimelineDollarGet,
    callback: BodyResponseCallback[Schema$TimelineItem]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarTimelineDollarGet,
    options: BodyResponseCallback[Schema$TimelineItem],
    callback: BodyResponseCallback[Schema$TimelineItem]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarTimelineDollarGet, options: MethodOptions): GaxiosPromise[Schema$TimelineItem] = js.native
  def get(
    params: ParamsDollarResourceDollarTimelineDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TimelineItem]
  ): Unit = js.native
  /**
    * mirror.timeline.insert
    * @desc Inserts a new item into the timeline.
    * @alias mirror.timeline.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$TimelineItem] = js.native
  def insert(callback: BodyResponseCallback[Schema$TimelineItem]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarTimelineDollarInsert): GaxiosPromise[Schema$TimelineItem] = js.native
  def insert(
    params: ParamsDollarResourceDollarTimelineDollarInsert,
    callback: BodyResponseCallback[Schema$TimelineItem]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarTimelineDollarInsert,
    options: BodyResponseCallback[Schema$TimelineItem],
    callback: BodyResponseCallback[Schema$TimelineItem]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarTimelineDollarInsert, options: MethodOptions): GaxiosPromise[Schema$TimelineItem] = js.native
  def insert(
    params: ParamsDollarResourceDollarTimelineDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TimelineItem]
  ): Unit = js.native
  /**
    * mirror.timeline.list
    * @desc Retrieves a list of timeline items for the authenticated user.
    * @alias mirror.timeline.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.bundleId If provided, only items with the given bundleId will be returned.
    * @param {boolean=} params.includeDeleted If true, tombstone records for deleted items will be returned.
    * @param {integer=} params.maxResults The maximum number of items to include in the response, used for paging.
    * @param {string=} params.orderBy Controls the order in which timeline items are returned.
    * @param {string=} params.pageToken Token for the page of results to return.
    * @param {boolean=} params.pinnedOnly If true, only pinned items will be returned.
    * @param {string=} params.sourceItemId If provided, only items with the given sourceItemId will be returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$TimelineListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$TimelineListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarTimelineDollarList): GaxiosPromise[Schema$TimelineListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarTimelineDollarList,
    callback: BodyResponseCallback[Schema$TimelineListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarTimelineDollarList,
    options: BodyResponseCallback[Schema$TimelineListResponse],
    callback: BodyResponseCallback[Schema$TimelineListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarTimelineDollarList, options: MethodOptions): GaxiosPromise[Schema$TimelineListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarTimelineDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TimelineListResponse]
  ): Unit = js.native
  /**
    * mirror.timeline.patch
    * @desc Updates a timeline item in place. This method supports patch
    * semantics.
    * @alias mirror.timeline.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the timeline item.
    * @param {().TimelineItem} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$TimelineItem] = js.native
  def patch(callback: BodyResponseCallback[Schema$TimelineItem]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarTimelineDollarPatch): GaxiosPromise[Schema$TimelineItem] = js.native
  def patch(
    params: ParamsDollarResourceDollarTimelineDollarPatch,
    callback: BodyResponseCallback[Schema$TimelineItem]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarTimelineDollarPatch,
    options: BodyResponseCallback[Schema$TimelineItem],
    callback: BodyResponseCallback[Schema$TimelineItem]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarTimelineDollarPatch, options: MethodOptions): GaxiosPromise[Schema$TimelineItem] = js.native
  def patch(
    params: ParamsDollarResourceDollarTimelineDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TimelineItem]
  ): Unit = js.native
  /**
    * mirror.timeline.update
    * @desc Updates a timeline item in place.
    * @alias mirror.timeline.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the timeline item.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$TimelineItem] = js.native
  def update(callback: BodyResponseCallback[Schema$TimelineItem]): Unit = js.native
  def update(params: ParamsDollarResourceDollarTimelineDollarUpdate): GaxiosPromise[Schema$TimelineItem] = js.native
  def update(
    params: ParamsDollarResourceDollarTimelineDollarUpdate,
    callback: BodyResponseCallback[Schema$TimelineItem]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarTimelineDollarUpdate,
    options: BodyResponseCallback[Schema$TimelineItem],
    callback: BodyResponseCallback[Schema$TimelineItem]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarTimelineDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$TimelineItem] = js.native
  def update(
    params: ParamsDollarResourceDollarTimelineDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TimelineItem]
  ): Unit = js.native
}

