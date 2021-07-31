package typings.googleapis.chatV1Mod.chatV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/chat/v1", "chat_v1.Resource$Spaces")
@js.native
class ResourceSpaces protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
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
  def get(): GaxiosPromise[SchemaSpace] = js.native
  def get(callback: BodyResponseCallback[SchemaSpace]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSpace] = js.native
  def get(params: ParamsResourceSpacesGet): GaxiosPromise[SchemaSpace] = js.native
  def get(params: ParamsResourceSpacesGet, callback: BodyResponseCallback[SchemaSpace]): Unit = js.native
  def get(
    params: ParamsResourceSpacesGet,
    options: BodyResponseCallback[SchemaSpace],
    callback: BodyResponseCallback[SchemaSpace]
  ): Unit = js.native
  def get(params: ParamsResourceSpacesGet, options: MethodOptions): GaxiosPromise[SchemaSpace] = js.native
  def get(
    params: ParamsResourceSpacesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSpace]
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
  def list(): GaxiosPromise[SchemaListSpacesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSpacesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSpacesResponse] = js.native
  def list(params: ParamsResourceSpacesList): GaxiosPromise[SchemaListSpacesResponse] = js.native
  def list(params: ParamsResourceSpacesList, callback: BodyResponseCallback[SchemaListSpacesResponse]): Unit = js.native
  def list(
    params: ParamsResourceSpacesList,
    options: BodyResponseCallback[SchemaListSpacesResponse],
    callback: BodyResponseCallback[SchemaListSpacesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSpacesList, options: MethodOptions): GaxiosPromise[SchemaListSpacesResponse] = js.native
  def list(
    params: ParamsResourceSpacesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSpacesResponse]
  ): Unit = js.native
  
  var members: ResourceSpacesMembers = js.native
  
  var messages: ResourceSpacesMessages = js.native
}
