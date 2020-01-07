package typings.googleapis.buildSrcApisResellerV1Mod.reseller_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/reseller/v1", "reseller_v1.Resource$Subscriptions")
@js.native
class Resource$Subscriptions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * reseller.subscriptions.activate
    * @desc Activates a subscription previously suspended by the reseller
    * @alias reseller.subscriptions.activate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {string} params.subscriptionId This is a required property. The subscriptionId is the subscription identifier and is unique for each customer. Since a subscriptionId changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the subscriptionId can be found using the retrieve all reseller subscriptions method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def activate(): GaxiosPromise[Schema$Subscription] = js.native
  def activate(callback: BodyResponseCallback[Schema$Subscription]): Unit = js.native
  def activate(params: ParamsDollarResourceDollarSubscriptionsDollarActivate): GaxiosPromise[Schema$Subscription] = js.native
  def activate(
    params: ParamsDollarResourceDollarSubscriptionsDollarActivate,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def activate(
    params: ParamsDollarResourceDollarSubscriptionsDollarActivate,
    options: BodyResponseCallback[Schema$Subscription],
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def activate(params: ParamsDollarResourceDollarSubscriptionsDollarActivate, options: MethodOptions): GaxiosPromise[Schema$Subscription] = js.native
  def activate(
    params: ParamsDollarResourceDollarSubscriptionsDollarActivate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  /**
    * reseller.subscriptions.changePlan
    * @desc Update a subscription plan. Use this method to update a plan for a
    * 30-day trial or a flexible plan subscription to an annual commitment plan
    * with monthly or yearly payments.
    * @alias reseller.subscriptions.changePlan
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {string} params.subscriptionId This is a required property. The subscriptionId is the subscription identifier and is unique for each customer. Since a subscriptionId changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the subscriptionId can be found using the retrieve all reseller subscriptions method.
    * @param {().ChangePlanRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def changePlan(): GaxiosPromise[Schema$Subscription] = js.native
  def changePlan(callback: BodyResponseCallback[Schema$Subscription]): Unit = js.native
  def changePlan(params: ParamsDollarResourceDollarSubscriptionsDollarChangeplan): GaxiosPromise[Schema$Subscription] = js.native
  def changePlan(
    params: ParamsDollarResourceDollarSubscriptionsDollarChangeplan,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def changePlan(
    params: ParamsDollarResourceDollarSubscriptionsDollarChangeplan,
    options: BodyResponseCallback[Schema$Subscription],
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def changePlan(params: ParamsDollarResourceDollarSubscriptionsDollarChangeplan, options: MethodOptions): GaxiosPromise[Schema$Subscription] = js.native
  def changePlan(
    params: ParamsDollarResourceDollarSubscriptionsDollarChangeplan,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  /**
    * reseller.subscriptions.changeRenewalSettings
    * @desc Update a user license's renewal settings. This is applicable for
    * accounts with annual commitment plans only.
    * @alias reseller.subscriptions.changeRenewalSettings
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {string} params.subscriptionId This is a required property. The subscriptionId is the subscription identifier and is unique for each customer. Since a subscriptionId changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the subscriptionId can be found using the retrieve all reseller subscriptions method.
    * @param {().RenewalSettings} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def changeRenewalSettings(): GaxiosPromise[Schema$Subscription] = js.native
  def changeRenewalSettings(callback: BodyResponseCallback[Schema$Subscription]): Unit = js.native
  def changeRenewalSettings(params: ParamsDollarResourceDollarSubscriptionsDollarChangerenewalsettings): GaxiosPromise[Schema$Subscription] = js.native
  def changeRenewalSettings(
    params: ParamsDollarResourceDollarSubscriptionsDollarChangerenewalsettings,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def changeRenewalSettings(
    params: ParamsDollarResourceDollarSubscriptionsDollarChangerenewalsettings,
    options: BodyResponseCallback[Schema$Subscription],
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def changeRenewalSettings(params: ParamsDollarResourceDollarSubscriptionsDollarChangerenewalsettings, options: MethodOptions): GaxiosPromise[Schema$Subscription] = js.native
  def changeRenewalSettings(
    params: ParamsDollarResourceDollarSubscriptionsDollarChangerenewalsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  /**
    * reseller.subscriptions.changeSeats
    * @desc Update a subscription's user license settings.
    * @alias reseller.subscriptions.changeSeats
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {string} params.subscriptionId This is a required property. The subscriptionId is the subscription identifier and is unique for each customer. Since a subscriptionId changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the subscriptionId can be found using the retrieve all reseller subscriptions method.
    * @param {().Seats} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def changeSeats(): GaxiosPromise[Schema$Subscription] = js.native
  def changeSeats(callback: BodyResponseCallback[Schema$Subscription]): Unit = js.native
  def changeSeats(params: ParamsDollarResourceDollarSubscriptionsDollarChangeseats): GaxiosPromise[Schema$Subscription] = js.native
  def changeSeats(
    params: ParamsDollarResourceDollarSubscriptionsDollarChangeseats,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def changeSeats(
    params: ParamsDollarResourceDollarSubscriptionsDollarChangeseats,
    options: BodyResponseCallback[Schema$Subscription],
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def changeSeats(params: ParamsDollarResourceDollarSubscriptionsDollarChangeseats, options: MethodOptions): GaxiosPromise[Schema$Subscription] = js.native
  def changeSeats(
    params: ParamsDollarResourceDollarSubscriptionsDollarChangeseats,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  /**
    * reseller.subscriptions.delete
    * @desc Cancel or transfer a subscription to direct.
    * @alias reseller.subscriptions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {string} params.deletionType The deletionType query string enables the cancellation, downgrade, or suspension of a subscription.
    * @param {string} params.subscriptionId This is a required property. The subscriptionId is the subscription identifier and is unique for each customer. Since a subscriptionId changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the subscriptionId can be found using the retrieve all reseller subscriptions method.
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
    * reseller.subscriptions.get
    * @desc Get a specific subscription.
    * @alias reseller.subscriptions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {string} params.subscriptionId This is a required property. The subscriptionId is the subscription identifier and is unique for each customer. Since a subscriptionId changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the subscriptionId can be found using the retrieve all reseller subscriptions method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Subscription] = js.native
  def get(callback: BodyResponseCallback[Schema$Subscription]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSubscriptionsDollarGet): GaxiosPromise[Schema$Subscription] = js.native
  def get(
    params: ParamsDollarResourceDollarSubscriptionsDollarGet,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSubscriptionsDollarGet,
    options: BodyResponseCallback[Schema$Subscription],
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSubscriptionsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Subscription] = js.native
  def get(
    params: ParamsDollarResourceDollarSubscriptionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  /**
    * reseller.subscriptions.insert
    * @desc Create or transfer a subscription.
    * @alias reseller.subscriptions.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.customerAuthToken The customerAuthToken query string is required when creating a resold account that transfers a direct customer's subscription or transfers another reseller customer's subscription to your reseller management. This is a hexadecimal authentication token needed to complete the subscription transfer. For more information, see the administrator help center.
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
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
    * reseller.subscriptions.list
    * @desc List of subscriptions managed by the reseller. The list can be all
    * subscriptions, all of a customer's subscriptions, or all of a customer's
    * transferable subscriptions.
    * @alias reseller.subscriptions.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.customerAuthToken The customerAuthToken query string is required when creating a resold account that transfers a direct customer's subscription or transfers another reseller customer's subscription to your reseller management. This is a hexadecimal authentication token needed to complete the subscription transfer. For more information, see the administrator help center.
    * @param {string=} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {string=} params.customerNamePrefix When retrieving all of your subscriptions and filtering for specific customers, you can enter a prefix for a customer name. Using an example customer group that includes exam.com, example20.com and example.com:   - exa -- Returns all customer names that start with 'exa' which could include exam.com, example20.com, and example.com. A name prefix is similar to using a regular expression's asterisk, exa*.  - example -- Returns example20.com and example.com.
    * @param {integer=} params.maxResults When retrieving a large list, the maxResults is the maximum number of results per page. The nextPageToken value takes you to the next page. The default is 20.
    * @param {string=} params.pageToken Token to specify next page in the list
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Subscriptions] = js.native
  def list(callback: BodyResponseCallback[Schema$Subscriptions]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSubscriptionsDollarList): GaxiosPromise[Schema$Subscriptions] = js.native
  def list(
    params: ParamsDollarResourceDollarSubscriptionsDollarList,
    callback: BodyResponseCallback[Schema$Subscriptions]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSubscriptionsDollarList,
    options: BodyResponseCallback[Schema$Subscriptions],
    callback: BodyResponseCallback[Schema$Subscriptions]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSubscriptionsDollarList, options: MethodOptions): GaxiosPromise[Schema$Subscriptions] = js.native
  def list(
    params: ParamsDollarResourceDollarSubscriptionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Subscriptions]
  ): Unit = js.native
  /**
    * reseller.subscriptions.startPaidService
    * @desc Immediately move a 30-day free trial subscription to a paid service
    * subscription.
    * @alias reseller.subscriptions.startPaidService
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {string} params.subscriptionId This is a required property. The subscriptionId is the subscription identifier and is unique for each customer. Since a subscriptionId changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the subscriptionId can be found using the retrieve all reseller subscriptions method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def startPaidService(): GaxiosPromise[Schema$Subscription] = js.native
  def startPaidService(callback: BodyResponseCallback[Schema$Subscription]): Unit = js.native
  def startPaidService(params: ParamsDollarResourceDollarSubscriptionsDollarStartpaidservice): GaxiosPromise[Schema$Subscription] = js.native
  def startPaidService(
    params: ParamsDollarResourceDollarSubscriptionsDollarStartpaidservice,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def startPaidService(
    params: ParamsDollarResourceDollarSubscriptionsDollarStartpaidservice,
    options: BodyResponseCallback[Schema$Subscription],
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def startPaidService(params: ParamsDollarResourceDollarSubscriptionsDollarStartpaidservice, options: MethodOptions): GaxiosPromise[Schema$Subscription] = js.native
  def startPaidService(
    params: ParamsDollarResourceDollarSubscriptionsDollarStartpaidservice,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  /**
    * reseller.subscriptions.suspend
    * @desc Suspends an active subscription.
    * @alias reseller.subscriptions.suspend
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {string} params.subscriptionId This is a required property. The subscriptionId is the subscription identifier and is unique for each customer. Since a subscriptionId changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the subscriptionId can be found using the retrieve all reseller subscriptions method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def suspend(): GaxiosPromise[Schema$Subscription] = js.native
  def suspend(callback: BodyResponseCallback[Schema$Subscription]): Unit = js.native
  def suspend(params: ParamsDollarResourceDollarSubscriptionsDollarSuspend): GaxiosPromise[Schema$Subscription] = js.native
  def suspend(
    params: ParamsDollarResourceDollarSubscriptionsDollarSuspend,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def suspend(
    params: ParamsDollarResourceDollarSubscriptionsDollarSuspend,
    options: BodyResponseCallback[Schema$Subscription],
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
  def suspend(params: ParamsDollarResourceDollarSubscriptionsDollarSuspend, options: MethodOptions): GaxiosPromise[Schema$Subscription] = js.native
  def suspend(
    params: ParamsDollarResourceDollarSubscriptionsDollarSuspend,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Subscription]
  ): Unit = js.native
}

