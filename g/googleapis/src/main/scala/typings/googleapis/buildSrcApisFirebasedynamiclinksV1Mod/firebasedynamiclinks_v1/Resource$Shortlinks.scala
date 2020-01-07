package typings.googleapis.buildSrcApisFirebasedynamiclinksV1Mod.firebasedynamiclinks_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/firebasedynamiclinks/v1", "firebasedynamiclinks_v1.Resource$Shortlinks")
@js.native
class Resource$Shortlinks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * firebasedynamiclinks.shortLinks.create
    * @desc Creates a short Dynamic Link given either a valid long Dynamic Link
    * or details such as Dynamic Link domain, Android and iOS app information.
    * The created short Dynamic Link will not expire.  Repeated calls with the
    * same long Dynamic Link or Dynamic Link information will produce the same
    * short Dynamic Link.  The Dynamic Link domain in the request must be owned
    * by requester's Firebase project.
    * @alias firebasedynamiclinks.shortLinks.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().CreateShortDynamicLinkRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$CreateShortDynamicLinkResponse] = js.native
  def create(callback: BodyResponseCallback[Schema$CreateShortDynamicLinkResponse]): Unit = js.native
  def create(params: ParamsDollarResourceDollarShortlinksDollarCreate): GaxiosPromise[Schema$CreateShortDynamicLinkResponse] = js.native
  def create(
    params: ParamsDollarResourceDollarShortlinksDollarCreate,
    callback: BodyResponseCallback[Schema$CreateShortDynamicLinkResponse]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarShortlinksDollarCreate,
    options: BodyResponseCallback[Schema$CreateShortDynamicLinkResponse],
    callback: BodyResponseCallback[Schema$CreateShortDynamicLinkResponse]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarShortlinksDollarCreate, options: MethodOptions): GaxiosPromise[Schema$CreateShortDynamicLinkResponse] = js.native
  def create(
    params: ParamsDollarResourceDollarShortlinksDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CreateShortDynamicLinkResponse]
  ): Unit = js.native
}

