package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/chat/v1", "chat_v1.Resource$Spaces$Members")
@js.native
class ResourceDollarSpacesDollarMembers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * chat.spaces.members.get
    * @desc Returns a membership.
    * @alias chat.spaces.members.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. Resource name of the membership to be retrieved, in the form "spaces/x/members/x".  Example: spaces/AAAAMpdlehY/members/105115627578887013105
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Membership] = js.native
  def get(callback: BodyResponseCallback[Schema$Membership]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSpacesDollarMembersDollarGet): GaxiosPromise[Schema$Membership] = js.native
  def get(
    params: ParamsDollarResourceDollarSpacesDollarMembersDollarGet,
    callback: BodyResponseCallback[Schema$Membership]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSpacesDollarMembersDollarGet,
    options: BodyResponseCallback[Schema$Membership],
    callback: BodyResponseCallback[Schema$Membership]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSpacesDollarMembersDollarGet, options: MethodOptions): GaxiosPromise[Schema$Membership] = js.native
  def get(
    params: ParamsDollarResourceDollarSpacesDollarMembersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Membership]
  ): Unit = js.native
  /**
    * chat.spaces.members.list
    * @desc Lists human memberships in a space.
    * @alias chat.spaces.members.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Requested page size. The value is capped at 1000. Server may return fewer results than requested. If unspecified, server will default to 100.
    * @param {string=} params.pageToken A token identifying a page of results the server should return.
    * @param {string} params.parent Required. The resource name of the space for which membership list is to be fetched, in the form "spaces/x".  Example: spaces/AAAAMpdlehY
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListMembershipsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListMembershipsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSpacesDollarMembersDollarList): GaxiosPromise[Schema$ListMembershipsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSpacesDollarMembersDollarList,
    callback: BodyResponseCallback[Schema$ListMembershipsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSpacesDollarMembersDollarList,
    options: BodyResponseCallback[Schema$ListMembershipsResponse],
    callback: BodyResponseCallback[Schema$ListMembershipsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSpacesDollarMembersDollarList, options: MethodOptions): GaxiosPromise[Schema$ListMembershipsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSpacesDollarMembersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListMembershipsResponse]
  ): Unit = js.native
}

