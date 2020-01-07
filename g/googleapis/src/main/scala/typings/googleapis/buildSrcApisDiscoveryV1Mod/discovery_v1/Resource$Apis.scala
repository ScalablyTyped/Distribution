package typings.googleapis.buildSrcApisDiscoveryV1Mod.discovery_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/discovery/v1", "discovery_v1.Resource$Apis")
@js.native
class Resource$Apis protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * discovery.apis.getRest
    * @desc Retrieve the description of a particular version of an api.
    * @alias discovery.apis.getRest
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.api The name of the API.
    * @param {string} params.version The version of the API.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getRest(): GaxiosPromise[Schema$RestDescription] = js.native
  def getRest(callback: BodyResponseCallback[Schema$RestDescription]): Unit = js.native
  def getRest(params: ParamsDollarResourceDollarApisDollarGetrest): GaxiosPromise[Schema$RestDescription] = js.native
  def getRest(
    params: ParamsDollarResourceDollarApisDollarGetrest,
    callback: BodyResponseCallback[Schema$RestDescription]
  ): Unit = js.native
  def getRest(
    params: ParamsDollarResourceDollarApisDollarGetrest,
    options: BodyResponseCallback[Schema$RestDescription],
    callback: BodyResponseCallback[Schema$RestDescription]
  ): Unit = js.native
  def getRest(params: ParamsDollarResourceDollarApisDollarGetrest, options: MethodOptions): GaxiosPromise[Schema$RestDescription] = js.native
  def getRest(
    params: ParamsDollarResourceDollarApisDollarGetrest,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RestDescription]
  ): Unit = js.native
  /**
    * discovery.apis.list
    * @desc Retrieve the list of APIs supported at this endpoint.
    * @alias discovery.apis.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.name Only include APIs with the given name.
    * @param {boolean=} params.preferred Return only the preferred version of an API.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$DirectoryList] = js.native
  def list(callback: BodyResponseCallback[Schema$DirectoryList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarApisDollarList): GaxiosPromise[Schema$DirectoryList] = js.native
  def list(
    params: ParamsDollarResourceDollarApisDollarList,
    callback: BodyResponseCallback[Schema$DirectoryList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarApisDollarList,
    options: BodyResponseCallback[Schema$DirectoryList],
    callback: BodyResponseCallback[Schema$DirectoryList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarApisDollarList, options: MethodOptions): GaxiosPromise[Schema$DirectoryList] = js.native
  def list(
    params: ParamsDollarResourceDollarApisDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DirectoryList]
  ): Unit = js.native
}

