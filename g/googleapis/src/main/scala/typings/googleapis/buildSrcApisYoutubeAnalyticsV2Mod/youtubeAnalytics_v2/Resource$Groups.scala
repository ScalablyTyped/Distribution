package typings.googleapis.buildSrcApisYoutubeAnalyticsV2Mod.youtubeAnalytics_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtubeAnalytics/v2", "youtubeAnalytics_v2.Resource$Groups")
@js.native
class Resource$Groups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtubeAnalytics.groups.delete
    * @desc Deletes a group.
    * @alias youtubeAnalytics.groups.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.id The `id` parameter specifies the YouTube group ID of the group that is being deleted.
    * @param {string=} params.onBehalfOfContentOwner This parameter can only be used in a properly authorized request. **Note:** This parameter is intended exclusively for YouTube content partners that own and manage many different YouTube channels.  The `onBehalfOfContentOwner` parameter indicates that the request's authorization credentials identify a YouTube user who is acting on behalf of the content owner specified in the parameter value. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$EmptyResponse] = js.native
  def delete(callback: BodyResponseCallback[Schema$EmptyResponse]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarGroupsDollarDelete): GaxiosPromise[Schema$EmptyResponse] = js.native
  def delete(
    params: ParamsDollarResourceDollarGroupsDollarDelete,
    callback: BodyResponseCallback[Schema$EmptyResponse]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarGroupsDollarDelete,
    options: BodyResponseCallback[Schema$EmptyResponse],
    callback: BodyResponseCallback[Schema$EmptyResponse]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarGroupsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$EmptyResponse] = js.native
  def delete(
    params: ParamsDollarResourceDollarGroupsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$EmptyResponse]
  ): Unit = js.native
  /**
    * youtubeAnalytics.groups.insert
    * @desc Creates a group.
    * @alias youtubeAnalytics.groups.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner This parameter can only be used in a properly authorized request. **Note:** This parameter is intended exclusively for YouTube content partners that own and manage many different YouTube channels.  The `onBehalfOfContentOwner` parameter indicates that the request's authorization credentials identify a YouTube user who is acting on behalf of the content owner specified in the parameter value. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {().Group} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Group] = js.native
  def insert(callback: BodyResponseCallback[Schema$Group]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarGroupsDollarInsert): GaxiosPromise[Schema$Group] = js.native
  def insert(params: ParamsDollarResourceDollarGroupsDollarInsert, callback: BodyResponseCallback[Schema$Group]): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarGroupsDollarInsert,
    options: BodyResponseCallback[Schema$Group],
    callback: BodyResponseCallback[Schema$Group]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarGroupsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Group] = js.native
  def insert(
    params: ParamsDollarResourceDollarGroupsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Group]
  ): Unit = js.native
  /**
    * youtubeAnalytics.groups.list
    * @desc Returns a collection of groups that match the API request
    * parameters. For example, you can retrieve all groups that the
    * authenticated user owns, or you can retrieve one or more groups by their
    * unique IDs.
    * @alias youtubeAnalytics.groups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.id The `id` parameter specifies a comma-separated list of the YouTube group ID(s) for the resource(s) that are being retrieved. Each group must be owned by the authenticated user. In a `group` resource, the `id` property specifies the group's YouTube group ID.  Note that if you do not specify a value for the `id` parameter, then you must set the `mine` parameter to `true`.
    * @param {boolean=} params.mine This parameter can only be used in a properly authorized request. Set this parameter's value to true to retrieve all groups owned by the authenticated user.
    * @param {string=} params.onBehalfOfContentOwner This parameter can only be used in a properly authorized request. **Note:** This parameter is intended exclusively for YouTube content partners that own and manage many different YouTube channels.  The `onBehalfOfContentOwner` parameter indicates that the request's authorization credentials identify a YouTube user who is acting on behalf of the content owner specified in the parameter value. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string=} params.pageToken The `pageToken` parameter identifies a specific page in the result set that should be returned. In an API response, the `nextPageToken` property identifies the next page that can be retrieved.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListGroupsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListGroupsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarGroupsDollarList): GaxiosPromise[Schema$ListGroupsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarGroupsDollarList,
    callback: BodyResponseCallback[Schema$ListGroupsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarGroupsDollarList,
    options: BodyResponseCallback[Schema$ListGroupsResponse],
    callback: BodyResponseCallback[Schema$ListGroupsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarGroupsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListGroupsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarGroupsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListGroupsResponse]
  ): Unit = js.native
  /**
    * youtubeAnalytics.groups.update
    * @desc Modifies a group. For example, you could change a group's title.
    * @alias youtubeAnalytics.groups.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner This parameter can only be used in a properly authorized request. **Note:** This parameter is intended exclusively for YouTube content partners that own and manage many different YouTube channels.  The `onBehalfOfContentOwner` parameter indicates that the request's authorization credentials identify a YouTube user who is acting on behalf of the content owner specified in the parameter value. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {().Group} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Group] = js.native
  def update(callback: BodyResponseCallback[Schema$Group]): Unit = js.native
  def update(params: ParamsDollarResourceDollarGroupsDollarUpdate): GaxiosPromise[Schema$Group] = js.native
  def update(params: ParamsDollarResourceDollarGroupsDollarUpdate, callback: BodyResponseCallback[Schema$Group]): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarGroupsDollarUpdate,
    options: BodyResponseCallback[Schema$Group],
    callback: BodyResponseCallback[Schema$Group]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarGroupsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Group] = js.native
  def update(
    params: ParamsDollarResourceDollarGroupsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Group]
  ): Unit = js.native
}

