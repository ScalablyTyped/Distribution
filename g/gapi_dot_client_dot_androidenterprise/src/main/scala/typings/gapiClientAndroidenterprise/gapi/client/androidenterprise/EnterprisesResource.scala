package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidenterprise.anon.CallbackUrl
import typings.gapiClientAndroidenterprise.anon.CompletionToken
import typings.gapiClientAndroidenterprise.anon.Domain
import typings.gapiClientAndroidenterprise.anon.Fields
import typings.gapiClientAndroidenterprise.anon.Key
import typings.gapiClientAndroidenterprise.anon.KeyType
import typings.gapiClientAndroidenterprise.anon.Oauthtoken
import typings.gapiClientAndroidenterprise.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterprisesResource extends js.Object {
  /** Acknowledges notifications that were received from Enterprises.PullNotificationSet to prevent subsequent calls from returning the same notifications. */
  def acknowledgeNotificationSet(request: Fields): Request[Unit]
  /**
    * Completes the signup flow, by specifying the Completion token and Enterprise token. This request must not be called multiple times for a given
    * Enterprise Token.
    */
  def completeSignup(request: CompletionToken): Request[Enterprise]
  /**
    * Returns a unique token to access an embeddable UI. To generate a web UI, pass the generated token into the managed Google Play javascript API. Each
    * token may only be used to start one UI session. See the javascript API documentation for further information.
    */
  def createWebToken(request: Key): Request[AdministratorWebToken]
  /**
    * Deletes the binding between the EMM and enterprise. This is now deprecated. Use this method only to unenroll customers that were previously enrolled
    * with the insert call, then enroll them again with the enroll call.
    */
  def delete(request: Key): Request[Unit]
  /** Enrolls an enterprise with the calling EMM. */
  def enroll(request: Oauthtoken): Request[Enterprise]
  /** Generates a sign-up URL. */
  def generateSignupUrl(request: CallbackUrl): Request[SignupInfo]
  /** Retrieves the name and domain of an enterprise. */
  def get(request: Key): Request[Enterprise]
  /** Returns the Android Device Policy config resource. */
  def getAndroidDevicePolicyConfig(request: Key): Request[AndroidDevicePolicyConfig]
  /**
    * Returns a service account and credentials. The service account can be bound to the enterprise by calling setAccount. The service account is unique to
    * this enterprise and EMM, and will be deleted if the enterprise is unbound. The credentials contain private key data and are not stored server-side.
    *
    * This method can only be called after calling Enterprises.Enroll or Enterprises.CompleteSignup, and before Enterprises.SetAccount; at other times it
    * will return an error.
    *
    * Subsequent calls after the first will generate a new, unique set of credentials, and invalidate the previously generated credentials.
    *
    * Once the service account is bound to the enterprise, it can be managed using the serviceAccountKeys resource.
    */
  def getServiceAccount(request: KeyType): Request[ServiceAccount]
  /** Returns the store layout for the enterprise. If the store layout has not been set, returns "basic" as the store layout type and no homepage. */
  def getStoreLayout(request: Key): Request[StoreLayout]
  /** Establishes the binding between the EMM and an enterprise. This is now deprecated; use enroll instead. */
  def insert(request: Oauthtoken): Request[Enterprise]
  /**
    * Looks up an enterprise by domain name. This is only supported for enterprises created via the Google-initiated creation flow. Lookup of the id is not
    * needed for enterprises created via the EMM-initiated flow since the EMM learns the enterprise ID in the callback specified in the
    * Enterprises.generateSignupUrl call.
    */
  def list(request: Domain): Request[EnterprisesListResponse]
  /**
    * Pulls and returns a notification set for the enterprises associated with the service account authenticated for the request. The notification set may be
    * empty if no notification are pending.
    * A notification set returned needs to be acknowledged within 20 seconds by calling Enterprises.AcknowledgeNotificationSet, unless the notification set
    * is empty.
    * Notifications that are not acknowledged within the 20 seconds will eventually be included again in the response to another PullNotificationSet request,
    * and those that are never acknowledged will ultimately be deleted according to the Google Cloud Platform Pub/Sub system policy.
    * Multiple requests might be performed concurrently to retrieve notifications, in which case the pending notifications (if any) will be split among each
    * caller, if any are pending.
    * If no notifications are present, an empty notification list is returned. Subsequent requests may return more notifications once they become available.
    */
  def pullNotificationSet(request: PrettyPrint): Request[NotificationSet]
  /** Sends a test notification to validate the EMM integration with the Google Cloud Pub/Sub service for this enterprise. */
  def sendTestPushNotification(request: Key): Request[EnterprisesSendTestPushNotificationResponse]
  /** Sets the account that will be used to authenticate to the API as the enterprise. */
  def setAccount(request: Key): Request[EnterpriseAccount]
  /**
    * Sets the Android Device Policy config resource. EMM may use this method to enable or disable Android Device Policy support for the specified
    * enterprise. To learn more about managing devices and apps with Android Device Policy, see the Android Management API.
    */
  def setAndroidDevicePolicyConfig(request: Key): Request[AndroidDevicePolicyConfig]
  /**
    * Sets the store layout for the enterprise. By default, storeLayoutType is set to "basic" and the basic store layout is enabled. The basic layout only
    * contains apps approved by the admin, and that have been added to the available product set for a user (using the  setAvailableProductSet call). Apps on
    * the page are sorted in order of their product ID value. If you create a custom store layout (by setting storeLayoutType = "custom" and setting a
    * homepage), the basic store layout is disabled.
    */
  def setStoreLayout(request: Key): Request[StoreLayout]
  /** Unenrolls an enterprise from the calling EMM. */
  def unenroll(request: Key): Request[Unit]
}

object EnterprisesResource {
  @scala.inline
  def apply(
    acknowledgeNotificationSet: Fields => Request[Unit],
    completeSignup: CompletionToken => Request[Enterprise],
    createWebToken: Key => Request[AdministratorWebToken],
    delete: Key => Request[Unit],
    enroll: Oauthtoken => Request[Enterprise],
    generateSignupUrl: CallbackUrl => Request[SignupInfo],
    get: Key => Request[Enterprise],
    getAndroidDevicePolicyConfig: Key => Request[AndroidDevicePolicyConfig],
    getServiceAccount: KeyType => Request[ServiceAccount],
    getStoreLayout: Key => Request[StoreLayout],
    insert: Oauthtoken => Request[Enterprise],
    list: Domain => Request[EnterprisesListResponse],
    pullNotificationSet: PrettyPrint => Request[NotificationSet],
    sendTestPushNotification: Key => Request[EnterprisesSendTestPushNotificationResponse],
    setAccount: Key => Request[EnterpriseAccount],
    setAndroidDevicePolicyConfig: Key => Request[AndroidDevicePolicyConfig],
    setStoreLayout: Key => Request[StoreLayout],
    unenroll: Key => Request[Unit]
  ): EnterprisesResource = {
    val __obj = js.Dynamic.literal(acknowledgeNotificationSet = js.Any.fromFunction1(acknowledgeNotificationSet), completeSignup = js.Any.fromFunction1(completeSignup), createWebToken = js.Any.fromFunction1(createWebToken), delete = js.Any.fromFunction1(delete), enroll = js.Any.fromFunction1(enroll), generateSignupUrl = js.Any.fromFunction1(generateSignupUrl), get = js.Any.fromFunction1(get), getAndroidDevicePolicyConfig = js.Any.fromFunction1(getAndroidDevicePolicyConfig), getServiceAccount = js.Any.fromFunction1(getServiceAccount), getStoreLayout = js.Any.fromFunction1(getStoreLayout), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), pullNotificationSet = js.Any.fromFunction1(pullNotificationSet), sendTestPushNotification = js.Any.fromFunction1(sendTestPushNotification), setAccount = js.Any.fromFunction1(setAccount), setAndroidDevicePolicyConfig = js.Any.fromFunction1(setAndroidDevicePolicyConfig), setStoreLayout = js.Any.fromFunction1(setStoreLayout), unenroll = js.Any.fromFunction1(unenroll))
    __obj.asInstanceOf[EnterprisesResource]
  }
}

