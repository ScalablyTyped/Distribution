package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/chat/v1", "chat_v1.Resource$Spaces")
@js.native
class Resource$Spaces protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var members: ResourceDollarSpacesDollarMembers = js.native
  var messages: ResourceDollarSpacesDollarMessages = js.native
  /**
    * chat.spaces.get
    * @desc Returns a space.
    * @alias chat.spaces.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. Resource name of the space, in the form "spaces/x".  Example: spaces/AAAAMpdlehY
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Space] = js.native
  def get(callback: BodyResponseCallback[Schema$Space]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSpacesDollarGet): GaxiosPromise[Schema$Space] = js.native
  def get(params: ParamsDollarResourceDollarSpacesDollarGet, callback: BodyResponseCallback[Schema$Space]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSpacesDollarGet,
    options: BodyResponseCallback[Schema$Space],
    callback: BodyResponseCallback[Schema$Space]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSpacesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Space] = js.native
  def get(
    params: ParamsDollarResourceDollarSpacesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Space]
  ): Unit = js.native
  /**
    * chat.spaces.list
    * @desc Lists spaces the caller is a member of.
    * @alias chat.spaces.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Requested page size. The value is capped at 1000. Server may return fewer results than requested. If unspecified, server will default to 100.
    * @param {string=} params.pageToken A token identifying a page of results the server should return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListSpacesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListSpacesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSpacesDollarList): GaxiosPromise[Schema$ListSpacesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSpacesDollarList,
    callback: BodyResponseCallback[Schema$ListSpacesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSpacesDollarList,
    options: BodyResponseCallback[Schema$ListSpacesResponse],
    callback: BodyResponseCallback[Schema$ListSpacesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSpacesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListSpacesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSpacesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListSpacesResponse]
  ): Unit = js.native
}

