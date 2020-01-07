package typings.googleapis.buildSrcApisResellerV1Mod.reseller_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/reseller/v1", "reseller_v1.Resource$Resellernotify")
@js.native
class Resource$Resellernotify protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * reseller.resellernotify.getwatchdetails
    * @desc Returns all the details of the watch corresponding to the reseller.
    * @alias reseller.resellernotify.getwatchdetails
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getwatchdetails(): GaxiosPromise[Schema$ResellernotifyGetwatchdetailsResponse] = js.native
  def getwatchdetails(callback: BodyResponseCallback[Schema$ResellernotifyGetwatchdetailsResponse]): Unit = js.native
  def getwatchdetails(params: ParamsDollarResourceDollarResellernotifyDollarGetwatchdetails): GaxiosPromise[Schema$ResellernotifyGetwatchdetailsResponse] = js.native
  def getwatchdetails(
    params: ParamsDollarResourceDollarResellernotifyDollarGetwatchdetails,
    callback: BodyResponseCallback[Schema$ResellernotifyGetwatchdetailsResponse]
  ): Unit = js.native
  def getwatchdetails(
    params: ParamsDollarResourceDollarResellernotifyDollarGetwatchdetails,
    options: BodyResponseCallback[Schema$ResellernotifyGetwatchdetailsResponse],
    callback: BodyResponseCallback[Schema$ResellernotifyGetwatchdetailsResponse]
  ): Unit = js.native
  def getwatchdetails(params: ParamsDollarResourceDollarResellernotifyDollarGetwatchdetails, options: MethodOptions): GaxiosPromise[Schema$ResellernotifyGetwatchdetailsResponse] = js.native
  def getwatchdetails(
    params: ParamsDollarResourceDollarResellernotifyDollarGetwatchdetails,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ResellernotifyGetwatchdetailsResponse]
  ): Unit = js.native
  /**
    * reseller.resellernotify.register
    * @desc Registers a Reseller for receiving notifications.
    * @alias reseller.resellernotify.register
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.serviceAccountEmailAddress The service account which will own the created Cloud-PubSub topic.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def register(): GaxiosPromise[Schema$ResellernotifyResource] = js.native
  def register(callback: BodyResponseCallback[Schema$ResellernotifyResource]): Unit = js.native
  def register(params: ParamsDollarResourceDollarResellernotifyDollarRegister): GaxiosPromise[Schema$ResellernotifyResource] = js.native
  def register(
    params: ParamsDollarResourceDollarResellernotifyDollarRegister,
    callback: BodyResponseCallback[Schema$ResellernotifyResource]
  ): Unit = js.native
  def register(
    params: ParamsDollarResourceDollarResellernotifyDollarRegister,
    options: BodyResponseCallback[Schema$ResellernotifyResource],
    callback: BodyResponseCallback[Schema$ResellernotifyResource]
  ): Unit = js.native
  def register(params: ParamsDollarResourceDollarResellernotifyDollarRegister, options: MethodOptions): GaxiosPromise[Schema$ResellernotifyResource] = js.native
  def register(
    params: ParamsDollarResourceDollarResellernotifyDollarRegister,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ResellernotifyResource]
  ): Unit = js.native
  /**
    * reseller.resellernotify.unregister
    * @desc Unregisters a Reseller for receiving notifications.
    * @alias reseller.resellernotify.unregister
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.serviceAccountEmailAddress The service account which owns the Cloud-PubSub topic.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def unregister(): GaxiosPromise[Schema$ResellernotifyResource] = js.native
  def unregister(callback: BodyResponseCallback[Schema$ResellernotifyResource]): Unit = js.native
  def unregister(params: ParamsDollarResourceDollarResellernotifyDollarUnregister): GaxiosPromise[Schema$ResellernotifyResource] = js.native
  def unregister(
    params: ParamsDollarResourceDollarResellernotifyDollarUnregister,
    callback: BodyResponseCallback[Schema$ResellernotifyResource]
  ): Unit = js.native
  def unregister(
    params: ParamsDollarResourceDollarResellernotifyDollarUnregister,
    options: BodyResponseCallback[Schema$ResellernotifyResource],
    callback: BodyResponseCallback[Schema$ResellernotifyResource]
  ): Unit = js.native
  def unregister(params: ParamsDollarResourceDollarResellernotifyDollarUnregister, options: MethodOptions): GaxiosPromise[Schema$ResellernotifyResource] = js.native
  def unregister(
    params: ParamsDollarResourceDollarResellernotifyDollarUnregister,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ResellernotifyResource]
  ): Unit = js.native
}

