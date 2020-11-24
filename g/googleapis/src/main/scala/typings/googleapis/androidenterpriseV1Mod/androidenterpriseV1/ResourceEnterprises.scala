package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Enterprises")
@js.native
class ResourceEnterprises protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * androidenterprise.enterprises.acknowledgeNotificationSet
    * @desc Acknowledges notifications that were received from
    * Enterprises.PullNotificationSet to prevent subsequent calls from
    * returning the same notifications.
    * @alias androidenterprise.enterprises.acknowledgeNotificationSet
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.notificationSetId The notification set ID as returned by Enterprises.PullNotificationSet. This must be provided.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def acknowledgeNotificationSet(): GaxiosPromise[Unit] = js.native
  def acknowledgeNotificationSet(callback: BodyResponseCallback[Unit]): Unit = js.native
  def acknowledgeNotificationSet(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def acknowledgeNotificationSet(params: ParamsResourceEnterprisesAcknowledgenotificationset): GaxiosPromise[Unit] = js.native
  def acknowledgeNotificationSet(params: ParamsResourceEnterprisesAcknowledgenotificationset, callback: BodyResponseCallback[Unit]): Unit = js.native
  def acknowledgeNotificationSet(
    params: ParamsResourceEnterprisesAcknowledgenotificationset,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def acknowledgeNotificationSet(params: ParamsResourceEnterprisesAcknowledgenotificationset, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def acknowledgeNotificationSet(
    params: ParamsResourceEnterprisesAcknowledgenotificationset,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * androidenterprise.enterprises.completeSignup
    * @desc Completes the signup flow, by specifying the Completion token and
    * Enterprise token. This request must not be called multiple times for a
    * given Enterprise Token.
    * @alias androidenterprise.enterprises.completeSignup
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.completionToken The Completion token initially returned by GenerateSignupUrl.
    * @param {string=} params.enterpriseToken The Enterprise token appended to the Callback URL.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def completeSignup(): GaxiosPromise[SchemaEnterprise] = js.native
  def completeSignup(callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def completeSignup(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def completeSignup(params: ParamsResourceEnterprisesCompletesignup): GaxiosPromise[SchemaEnterprise] = js.native
  def completeSignup(params: ParamsResourceEnterprisesCompletesignup, callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def completeSignup(
    params: ParamsResourceEnterprisesCompletesignup,
    options: BodyResponseCallback[SchemaEnterprise],
    callback: BodyResponseCallback[SchemaEnterprise]
  ): Unit = js.native
  def completeSignup(params: ParamsResourceEnterprisesCompletesignup, options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def completeSignup(
    params: ParamsResourceEnterprisesCompletesignup,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnterprise]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * androidenterprise.enterprises.createWebToken
    * @desc Returns a unique token to access an embeddable UI. To generate a
    * web UI, pass the generated token into the managed Google Play javascript
    * API. Each token may only be used to start one UI session. See the
    * javascript API documentation for further information.
    * @alias androidenterprise.enterprises.createWebToken
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {().AdministratorWebTokenSpec} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createWebToken(): GaxiosPromise[SchemaAdministratorWebToken] = js.native
  def createWebToken(callback: BodyResponseCallback[SchemaAdministratorWebToken]): Unit = js.native
  def createWebToken(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAdministratorWebToken] = js.native
  def createWebToken(params: ParamsResourceEnterprisesCreatewebtoken): GaxiosPromise[SchemaAdministratorWebToken] = js.native
  def createWebToken(
    params: ParamsResourceEnterprisesCreatewebtoken,
    callback: BodyResponseCallback[SchemaAdministratorWebToken]
  ): Unit = js.native
  def createWebToken(
    params: ParamsResourceEnterprisesCreatewebtoken,
    options: BodyResponseCallback[SchemaAdministratorWebToken],
    callback: BodyResponseCallback[SchemaAdministratorWebToken]
  ): Unit = js.native
  def createWebToken(params: ParamsResourceEnterprisesCreatewebtoken, options: MethodOptions): GaxiosPromise[SchemaAdministratorWebToken] = js.native
  def createWebToken(
    params: ParamsResourceEnterprisesCreatewebtoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdministratorWebToken]
  ): Unit = js.native
  
  /**
    * androidenterprise.enterprises.enroll
    * @desc Enrolls an enterprise with the calling EMM.
    * @alias androidenterprise.enterprises.enroll
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.token The token provided by the enterprise to register the EMM.
    * @param {().Enterprise} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def enroll(): GaxiosPromise[SchemaEnterprise] = js.native
  def enroll(callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def enroll(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def enroll(params: ParamsResourceEnterprisesEnroll): GaxiosPromise[SchemaEnterprise] = js.native
  def enroll(params: ParamsResourceEnterprisesEnroll, callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def enroll(
    params: ParamsResourceEnterprisesEnroll,
    options: BodyResponseCallback[SchemaEnterprise],
    callback: BodyResponseCallback[SchemaEnterprise]
  ): Unit = js.native
  def enroll(params: ParamsResourceEnterprisesEnroll, options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def enroll(
    params: ParamsResourceEnterprisesEnroll,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnterprise]
  ): Unit = js.native
  
  /**
    * androidenterprise.enterprises.generateSignupUrl
    * @desc Generates a sign-up URL.
    * @alias androidenterprise.enterprises.generateSignupUrl
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.callbackUrl The callback URL to which the Admin will be redirected after successfully creating an enterprise. Before redirecting there the system will add a single query parameter to this URL named "enterpriseToken" which will contain an opaque token to be used for the CompleteSignup request. Beware that this means that the URL will be parsed, the parameter added and then a new URL formatted, i.e. there may be some minor formatting changes and, more importantly, the URL must be well-formed so that it can be parsed.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generateSignupUrl(): GaxiosPromise[SchemaSignupInfo] = js.native
  def generateSignupUrl(callback: BodyResponseCallback[SchemaSignupInfo]): Unit = js.native
  def generateSignupUrl(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSignupInfo] = js.native
  def generateSignupUrl(params: ParamsResourceEnterprisesGeneratesignupurl): GaxiosPromise[SchemaSignupInfo] = js.native
  def generateSignupUrl(
    params: ParamsResourceEnterprisesGeneratesignupurl,
    callback: BodyResponseCallback[SchemaSignupInfo]
  ): Unit = js.native
  def generateSignupUrl(
    params: ParamsResourceEnterprisesGeneratesignupurl,
    options: BodyResponseCallback[SchemaSignupInfo],
    callback: BodyResponseCallback[SchemaSignupInfo]
  ): Unit = js.native
  def generateSignupUrl(params: ParamsResourceEnterprisesGeneratesignupurl, options: MethodOptions): GaxiosPromise[SchemaSignupInfo] = js.native
  def generateSignupUrl(
    params: ParamsResourceEnterprisesGeneratesignupurl,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSignupInfo]
  ): Unit = js.native
  
  /**
    * androidenterprise.enterprises.get
    * @desc Retrieves the name and domain of an enterprise.
    * @alias androidenterprise.enterprises.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaEnterprise] = js.native
  def get(callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def get(params: ParamsResourceEnterprisesGet): GaxiosPromise[SchemaEnterprise] = js.native
  def get(params: ParamsResourceEnterprisesGet, callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def get(
    params: ParamsResourceEnterprisesGet,
    options: BodyResponseCallback[SchemaEnterprise],
    callback: BodyResponseCallback[SchemaEnterprise]
  ): Unit = js.native
  def get(params: ParamsResourceEnterprisesGet, options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def get(
    params: ParamsResourceEnterprisesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnterprise]
  ): Unit = js.native
  
  /**
    * androidenterprise.enterprises.getServiceAccount
    * @desc Returns a service account and credentials. The service account can
    * be bound to the enterprise by calling setAccount. The service account is
    * unique to this enterprise and EMM, and will be deleted if the enterprise
    * is unbound. The credentials contain private key data and are not stored
    * server-side.  This method can only be called after calling
    * Enterprises.Enroll or Enterprises.CompleteSignup, and before
    * Enterprises.SetAccount; at other times it will return an error.
    * Subsequent calls after the first will generate a new, unique set of
    * credentials, and invalidate the previously generated credentials.  Once
    * the service account is bound to the enterprise, it can be managed using
    * the serviceAccountKeys resource.
    * @alias androidenterprise.enterprises.getServiceAccount
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string=} params.keyType The type of credential to return with the service account. Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getServiceAccount(): GaxiosPromise[SchemaServiceAccount] = js.native
  def getServiceAccount(callback: BodyResponseCallback[SchemaServiceAccount]): Unit = js.native
  def getServiceAccount(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaServiceAccount] = js.native
  def getServiceAccount(params: ParamsResourceEnterprisesGetserviceaccount): GaxiosPromise[SchemaServiceAccount] = js.native
  def getServiceAccount(
    params: ParamsResourceEnterprisesGetserviceaccount,
    callback: BodyResponseCallback[SchemaServiceAccount]
  ): Unit = js.native
  def getServiceAccount(
    params: ParamsResourceEnterprisesGetserviceaccount,
    options: BodyResponseCallback[SchemaServiceAccount],
    callback: BodyResponseCallback[SchemaServiceAccount]
  ): Unit = js.native
  def getServiceAccount(params: ParamsResourceEnterprisesGetserviceaccount, options: MethodOptions): GaxiosPromise[SchemaServiceAccount] = js.native
  def getServiceAccount(
    params: ParamsResourceEnterprisesGetserviceaccount,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServiceAccount]
  ): Unit = js.native
  
  /**
    * androidenterprise.enterprises.getStoreLayout
    * @desc Returns the store layout for the enterprise. If the store layout
    * has not been set, returns "basic" as the store layout type and no
    * homepage.
    * @alias androidenterprise.enterprises.getStoreLayout
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getStoreLayout(): GaxiosPromise[SchemaStoreLayout] = js.native
  def getStoreLayout(callback: BodyResponseCallback[SchemaStoreLayout]): Unit = js.native
  def getStoreLayout(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaStoreLayout] = js.native
  def getStoreLayout(params: ParamsResourceEnterprisesGetstorelayout): GaxiosPromise[SchemaStoreLayout] = js.native
  def getStoreLayout(params: ParamsResourceEnterprisesGetstorelayout, callback: BodyResponseCallback[SchemaStoreLayout]): Unit = js.native
  def getStoreLayout(
    params: ParamsResourceEnterprisesGetstorelayout,
    options: BodyResponseCallback[SchemaStoreLayout],
    callback: BodyResponseCallback[SchemaStoreLayout]
  ): Unit = js.native
  def getStoreLayout(params: ParamsResourceEnterprisesGetstorelayout, options: MethodOptions): GaxiosPromise[SchemaStoreLayout] = js.native
  def getStoreLayout(
    params: ParamsResourceEnterprisesGetstorelayout,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStoreLayout]
  ): Unit = js.native
  
  /**
    * androidenterprise.enterprises.list
    * @desc Looks up an enterprise by domain name. This is only supported for
    * enterprises created via the Google-initiated creation flow. Lookup of the
    * id is not needed for enterprises created via the EMM-initiated flow since
    * the EMM learns the enterprise ID in the callback specified in the
    * Enterprises.generateSignupUrl call.
    * @alias androidenterprise.enterprises.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.domain The exact primary domain name of the enterprise to look up.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaEnterprisesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaEnterprisesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEnterprisesListResponse] = js.native
  def list(params: ParamsResourceEnterprisesList): GaxiosPromise[SchemaEnterprisesListResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesList,
    callback: BodyResponseCallback[SchemaEnterprisesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceEnterprisesList,
    options: BodyResponseCallback[SchemaEnterprisesListResponse],
    callback: BodyResponseCallback[SchemaEnterprisesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEnterprisesList, options: MethodOptions): GaxiosPromise[SchemaEnterprisesListResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnterprisesListResponse]
  ): Unit = js.native
  
  /**
    * androidenterprise.enterprises.pullNotificationSet
    * @desc Pulls and returns a notification set for the enterprises associated
    * with the service account authenticated for the request. The notification
    * set may be empty if no notification are pending. A notification set
    * returned needs to be acknowledged within 20 seconds by calling
    * Enterprises.AcknowledgeNotificationSet, unless the notification set is
    * empty. Notifications that are not acknowledged within the 20 seconds will
    * eventually be included again in the response to another
    * PullNotificationSet request, and those that are never acknowledged will
    * ultimately be deleted according to the Google Cloud Platform Pub/Sub
    * system policy. Multiple requests might be performed concurrently to
    * retrieve notifications, in which case the pending notifications (if any)
    * will be split among each caller, if any are pending. If no notifications
    * are present, an empty notification list is returned. Subsequent requests
    * may return more notifications once they become available.
    * @alias androidenterprise.enterprises.pullNotificationSet
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.requestMode The request mode for pulling notifications. Specifying waitForNotifications will cause the request to block and wait until one or more notifications are present, or return an empty notification list if no notifications are present after some time. Speciying returnImmediately will cause the request to immediately return the pending notifications, or an empty list if no notifications are present. If omitted, defaults to waitForNotifications.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def pullNotificationSet(): GaxiosPromise[SchemaNotificationSet] = js.native
  def pullNotificationSet(callback: BodyResponseCallback[SchemaNotificationSet]): Unit = js.native
  def pullNotificationSet(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaNotificationSet] = js.native
  def pullNotificationSet(params: ParamsResourceEnterprisesPullnotificationset): GaxiosPromise[SchemaNotificationSet] = js.native
  def pullNotificationSet(
    params: ParamsResourceEnterprisesPullnotificationset,
    callback: BodyResponseCallback[SchemaNotificationSet]
  ): Unit = js.native
  def pullNotificationSet(
    params: ParamsResourceEnterprisesPullnotificationset,
    options: BodyResponseCallback[SchemaNotificationSet],
    callback: BodyResponseCallback[SchemaNotificationSet]
  ): Unit = js.native
  def pullNotificationSet(params: ParamsResourceEnterprisesPullnotificationset, options: MethodOptions): GaxiosPromise[SchemaNotificationSet] = js.native
  def pullNotificationSet(
    params: ParamsResourceEnterprisesPullnotificationset,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotificationSet]
  ): Unit = js.native
  
  /**
    * androidenterprise.enterprises.sendTestPushNotification
    * @desc Sends a test notification to validate the EMM integration with the
    * Google Cloud Pub/Sub service for this enterprise.
    * @alias androidenterprise.enterprises.sendTestPushNotification
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def sendTestPushNotification(): GaxiosPromise[SchemaEnterprisesSendTestPushNotificationResponse] = js.native
  def sendTestPushNotification(callback: BodyResponseCallback[SchemaEnterprisesSendTestPushNotificationResponse]): Unit = js.native
  def sendTestPushNotification(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEnterprisesSendTestPushNotificationResponse] = js.native
  def sendTestPushNotification(params: ParamsResourceEnterprisesSendtestpushnotification): GaxiosPromise[SchemaEnterprisesSendTestPushNotificationResponse] = js.native
  def sendTestPushNotification(
    params: ParamsResourceEnterprisesSendtestpushnotification,
    callback: BodyResponseCallback[SchemaEnterprisesSendTestPushNotificationResponse]
  ): Unit = js.native
  def sendTestPushNotification(
    params: ParamsResourceEnterprisesSendtestpushnotification,
    options: BodyResponseCallback[SchemaEnterprisesSendTestPushNotificationResponse],
    callback: BodyResponseCallback[SchemaEnterprisesSendTestPushNotificationResponse]
  ): Unit = js.native
  def sendTestPushNotification(params: ParamsResourceEnterprisesSendtestpushnotification, options: MethodOptions): GaxiosPromise[SchemaEnterprisesSendTestPushNotificationResponse] = js.native
  def sendTestPushNotification(
    params: ParamsResourceEnterprisesSendtestpushnotification,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnterprisesSendTestPushNotificationResponse]
  ): Unit = js.native
  
  /**
    * androidenterprise.enterprises.setAccount
    * @desc Sets the account that will be used to authenticate to the API as
    * the enterprise.
    * @alias androidenterprise.enterprises.setAccount
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {().EnterpriseAccount} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setAccount(): GaxiosPromise[SchemaEnterpriseAccount] = js.native
  def setAccount(callback: BodyResponseCallback[SchemaEnterpriseAccount]): Unit = js.native
  def setAccount(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEnterpriseAccount] = js.native
  def setAccount(params: ParamsResourceEnterprisesSetaccount): GaxiosPromise[SchemaEnterpriseAccount] = js.native
  def setAccount(
    params: ParamsResourceEnterprisesSetaccount,
    callback: BodyResponseCallback[SchemaEnterpriseAccount]
  ): Unit = js.native
  def setAccount(
    params: ParamsResourceEnterprisesSetaccount,
    options: BodyResponseCallback[SchemaEnterpriseAccount],
    callback: BodyResponseCallback[SchemaEnterpriseAccount]
  ): Unit = js.native
  def setAccount(params: ParamsResourceEnterprisesSetaccount, options: MethodOptions): GaxiosPromise[SchemaEnterpriseAccount] = js.native
  def setAccount(
    params: ParamsResourceEnterprisesSetaccount,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnterpriseAccount]
  ): Unit = js.native
  
  /**
    * androidenterprise.enterprises.setStoreLayout
    * @desc Sets the store layout for the enterprise. By default,
    * storeLayoutType is set to "basic" and the basic store layout is enabled.
    * The basic layout only contains apps approved by the admin, and that have
    * been added to the available product set for a user (using the
    * setAvailableProductSet call). Apps on the page are sorted in order of
    * their product ID value. If you create a custom store layout (by setting
    * storeLayoutType = "custom" and setting a homepage), the basic store
    * layout is disabled.
    * @alias androidenterprise.enterprises.setStoreLayout
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {().StoreLayout} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setStoreLayout(): GaxiosPromise[SchemaStoreLayout] = js.native
  def setStoreLayout(callback: BodyResponseCallback[SchemaStoreLayout]): Unit = js.native
  def setStoreLayout(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaStoreLayout] = js.native
  def setStoreLayout(params: ParamsResourceEnterprisesSetstorelayout): GaxiosPromise[SchemaStoreLayout] = js.native
  def setStoreLayout(params: ParamsResourceEnterprisesSetstorelayout, callback: BodyResponseCallback[SchemaStoreLayout]): Unit = js.native
  def setStoreLayout(
    params: ParamsResourceEnterprisesSetstorelayout,
    options: BodyResponseCallback[SchemaStoreLayout],
    callback: BodyResponseCallback[SchemaStoreLayout]
  ): Unit = js.native
  def setStoreLayout(params: ParamsResourceEnterprisesSetstorelayout, options: MethodOptions): GaxiosPromise[SchemaStoreLayout] = js.native
  def setStoreLayout(
    params: ParamsResourceEnterprisesSetstorelayout,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStoreLayout]
  ): Unit = js.native
  
  /**
    * androidenterprise.enterprises.unenroll
    * @desc Unenrolls an enterprise from the calling EMM.
    * @alias androidenterprise.enterprises.unenroll
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def unenroll(): GaxiosPromise[Unit] = js.native
  def unenroll(callback: BodyResponseCallback[Unit]): Unit = js.native
  def unenroll(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def unenroll(params: ParamsResourceEnterprisesUnenroll): GaxiosPromise[Unit] = js.native
  def unenroll(params: ParamsResourceEnterprisesUnenroll, callback: BodyResponseCallback[Unit]): Unit = js.native
  def unenroll(
    params: ParamsResourceEnterprisesUnenroll,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def unenroll(params: ParamsResourceEnterprisesUnenroll, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def unenroll(
    params: ParamsResourceEnterprisesUnenroll,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}
