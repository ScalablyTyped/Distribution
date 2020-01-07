package typings.googleapis.buildSrcApisMirrorV1Mod.mirror_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/mirror/v1", "mirror_v1.Resource$Subscriptions")
@js.native
class Resource$Subscriptions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * mirror.subscriptions.delete
    * @desc Deletes a subscription.
    * @alias mirror.subscriptions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the subscription.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSubscriptionsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarSubscriptionsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarSubscriptionsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSubscriptionsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarSubscriptionsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * mirror.subscriptions.insert
    * @desc Creates a new subscription.
    * @alias mirror.subscriptions.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Subscription} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Subscription] = js.native
  def insert(callback: BodyResponseCallback[Schema$Subscription]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarSubscriptionsDollarInsert): GaxiosPromise[Schema$Subscription] = js.native
  def insert(
    params: ParamsDollarResourceDollarSubscriptionsDollarInsert,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarSubscriptionsDollarInsert,
    options: BodyResponseCallback[Schema$Subscription],
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarSubscriptionsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Subscription] = js.native
  def insert(
    params: ParamsDollarResourceDollarSubscriptionsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  /**
    * mirror.subscriptions.list
    * @desc Retrieves a list of subscriptions for the authenticated user and
    * service.
    * @alias mirror.subscriptions.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$SubscriptionsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$SubscriptionsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSubscriptionsDollarList): GaxiosPromise[Schema$SubscriptionsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSubscriptionsDollarList,
    callback: BodyResponseCallback[Schema$SubscriptionsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSubscriptionsDollarList,
    options: BodyResponseCallback[Schema$SubscriptionsListResponse],
    callback: BodyResponseCallback[Schema$SubscriptionsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSubscriptionsDollarList, options: MethodOptions): GaxiosPromise[Schema$SubscriptionsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSubscriptionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SubscriptionsListResponse]
  ): Unit = js.native
  /**
    * mirror.subscriptions.update
    * @desc Updates an existing subscription in place.
    * @alias mirror.subscriptions.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the subscription.
    * @param {().Subscription} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Subscription] = js.native
  def update(callback: BodyResponseCallback[Schema$Subscription]): Unit = js.native
  def update(params: ParamsDollarResourceDollarSubscriptionsDollarUpdate): GaxiosPromise[Schema$Subscription] = js.native
  def update(
    params: ParamsDollarResourceDollarSubscriptionsDollarUpdate,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarSubscriptionsDollarUpdate,
    options: BodyResponseCallback[Schema$Subscription],
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarSubscriptionsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Subscription] = js.native
  def update(
    params: ParamsDollarResourceDollarSubscriptionsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
}

