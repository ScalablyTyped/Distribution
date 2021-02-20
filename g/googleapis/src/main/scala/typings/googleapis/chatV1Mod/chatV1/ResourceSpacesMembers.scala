package typings.googleapis.chatV1Mod.chatV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/chat/v1", "chat_v1.Resource$Spaces$Members")
@js.native
class ResourceSpacesMembers protected () extends StObject {
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
  def get(): GaxiosPromise[SchemaMembership] = js.native
  def get(callback: BodyResponseCallback[SchemaMembership]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMembership] = js.native
  def get(params: ParamsResourceSpacesMembersGet): GaxiosPromise[SchemaMembership] = js.native
  def get(params: ParamsResourceSpacesMembersGet, callback: BodyResponseCallback[SchemaMembership]): Unit = js.native
  def get(
    params: ParamsResourceSpacesMembersGet,
    options: BodyResponseCallback[SchemaMembership],
    callback: BodyResponseCallback[SchemaMembership]
  ): Unit = js.native
  def get(params: ParamsResourceSpacesMembersGet, options: MethodOptions): GaxiosPromise[SchemaMembership] = js.native
  def get(
    params: ParamsResourceSpacesMembersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMembership]
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
  def list(): GaxiosPromise[SchemaListMembershipsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListMembershipsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListMembershipsResponse] = js.native
  def list(params: ParamsResourceSpacesMembersList): GaxiosPromise[SchemaListMembershipsResponse] = js.native
  def list(
    params: ParamsResourceSpacesMembersList,
    callback: BodyResponseCallback[SchemaListMembershipsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceSpacesMembersList,
    options: BodyResponseCallback[SchemaListMembershipsResponse],
    callback: BodyResponseCallback[SchemaListMembershipsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSpacesMembersList, options: MethodOptions): GaxiosPromise[SchemaListMembershipsResponse] = js.native
  def list(
    params: ParamsResourceSpacesMembersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMembershipsResponse]
  ): Unit = js.native
}
