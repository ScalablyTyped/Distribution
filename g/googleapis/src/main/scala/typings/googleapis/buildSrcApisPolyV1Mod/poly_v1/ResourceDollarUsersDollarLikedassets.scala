package typings.googleapis.buildSrcApisPolyV1Mod.poly_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/poly/v1", "poly_v1.Resource$Users$Likedassets")
@js.native
class ResourceDollarUsersDollarLikedassets protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * poly.users.likedassets.list
    * @desc Lists assets that the user has liked. Only the value 'me',
    * representing the currently-authenticated user, is supported. May include
    * assets with an access level of UNLISTED.
    * @alias poly.users.likedassets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.format Return only assets with the matching format. Acceptable values are: `BLOCKS`, `FBX`, `GLTF`, `GLTF2`, `OBJ`, `TILT`.
    * @param {string} params.name A valid user id. Currently, only the special value 'me', representing the currently-authenticated user is supported. To use 'me', you must pass an OAuth token with the request.
    * @param {string=} params.orderBy Specifies an ordering for assets. Acceptable values are: `BEST`, `NEWEST`, `OLDEST`, 'LIKED_TIME'. Defaults to `LIKED_TIME`, which ranks assets based on how recently they were liked.
    * @param {integer=} params.pageSize The maximum number of assets to be returned. This value must be between `1` and `100`. Defaults to `20`.
    * @param {string=} params.pageToken Specifies a continuation token from a previous search whose results were split into multiple pages. To get the next page, submit the same request specifying the value from next_page_token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListLikedAssetsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListLikedAssetsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarLikedassetsDollarList): GaxiosPromise[Schema$ListLikedAssetsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarLikedassetsDollarList,
    callback: BodyResponseCallback[Schema$ListLikedAssetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarLikedassetsDollarList,
    options: BodyResponseCallback[Schema$ListLikedAssetsResponse],
    callback: BodyResponseCallback[Schema$ListLikedAssetsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarLikedassetsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListLikedAssetsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarLikedassetsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListLikedAssetsResponse]
  ): Unit = js.native
}

