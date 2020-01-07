package typings.googleapis.buildSrcApisYoutubeAnalyticsV1beta1Mod.youtubeAnalytics_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtubeAnalytics/v1beta1", "youtubeAnalytics_v1beta1.Resource$Groupitems")
@js.native
class Resource$Groupitems protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtubeAnalytics.groupItems.delete
    * @desc Removes an item from a group.
    * @alias youtubeAnalytics.groupItems.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id parameter specifies the YouTube group item ID for the group that is being deleted.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarGroupitemsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarGroupitemsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarGroupitemsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarGroupitemsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarGroupitemsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * youtubeAnalytics.groupItems.insert
    * @desc Creates a group item.
    * @alias youtubeAnalytics.groupItems.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {().GroupItem} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$GroupItem] = js.native
  def insert(callback: BodyResponseCallback[Schema$GroupItem]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarGroupitemsDollarInsert): GaxiosPromise[Schema$GroupItem] = js.native
  def insert(
    params: ParamsDollarResourceDollarGroupitemsDollarInsert,
    callback: BodyResponseCallback[Schema$GroupItem]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarGroupitemsDollarInsert,
    options: BodyResponseCallback[Schema$GroupItem],
    callback: BodyResponseCallback[Schema$GroupItem]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarGroupitemsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$GroupItem] = js.native
  def insert(
    params: ParamsDollarResourceDollarGroupitemsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GroupItem]
  ): Unit = js.native
  /**
    * youtubeAnalytics.groupItems.list
    * @desc Returns a collection of group items that match the API request
    * parameters.
    * @alias youtubeAnalytics.groupItems.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupId The id parameter specifies the unique ID of the group for which you want to retrieve group items.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GroupItemListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GroupItemListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarGroupitemsDollarList): GaxiosPromise[Schema$GroupItemListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarGroupitemsDollarList,
    callback: BodyResponseCallback[Schema$GroupItemListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarGroupitemsDollarList,
    options: BodyResponseCallback[Schema$GroupItemListResponse],
    callback: BodyResponseCallback[Schema$GroupItemListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarGroupitemsDollarList, options: MethodOptions): GaxiosPromise[Schema$GroupItemListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarGroupitemsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GroupItemListResponse]
  ): Unit = js.native
}

