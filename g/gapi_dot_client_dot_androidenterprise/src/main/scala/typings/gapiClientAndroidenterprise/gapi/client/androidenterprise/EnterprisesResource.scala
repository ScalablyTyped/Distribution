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

@js.native
trait EnterprisesResource extends js.Object {
  /** Acknowledges notifications that were received from Enterprises.PullNotificationSet to prevent subsequent calls from returning the same notifications. */
  def acknowledgeNotificationSet(request: Fields): Request[Unit] = js.native
  /**
    * Completes the signup flow, by specifying the Completion token and Enterprise token. This request must not be called multiple times for a given
    * Enterprise Token.
    */
  def completeSignup(request: CompletionToken): Request[Enterprise] = js.native
  /**
    * Returns a unique token to access an embeddable UI. To generate a web UI, pass the generated token into the managed Google Play javascript API. Each
    * token may only be used to start one UI session. See the javascript API documentation for further information.
    */
  def createWebToken(request: Key): Request[AdministratorWebToken] = js.native
  /**
    * Deletes the binding between the EMM and enterprise. This is now deprecated. Use this method only to unenroll customers that were previously enrolled
    * with the insert call, then enroll them again with the enroll call.
    */
  def delete(request: Key): Request[Unit] = js.native
  /** Enrolls an enterprise with the calling EMM. */
  def enroll(request: Oauthtoken): Request[Enterprise] = js.native
  /** Generates a sign-up URL. */
  def generateSignupUrl(request: CallbackUrl): Request[SignupInfo] = js.native
  /** Retrieves the name and domain of an enterprise. */
  def get(request: Key): Request[Enterprise] = js.native
  /** Returns the Android Device Policy config resource. */
  def getAndroidDevicePolicyConfig(request: Key): Request[AndroidDevicePolicyConfig] = js.native
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
  def getServiceAccount(request: KeyType): Request[ServiceAccount] = js.native
  /** Returns the store layout for the enterprise. If the store layout has not been set, returns "basic" as the store layout type and no homepage. */
  def getStoreLayout(request: Key): Request[StoreLayout] = js.native
  /** Establishes the binding between the EMM and an enterprise. This is now deprecated; use enroll instead. */
  def insert(request: Oauthtoken): Request[Enterprise] = js.native
  /**
    * Looks up an enterprise by domain name. This is only supported for enterprises created via the Google-initiated creation flow. Lookup of the id is not
    * needed for enterprises created via the EMM-initiated flow since the EMM learns the enterprise ID in the callback specified in the
    * Enterprises.generateSignupUrl call.
    */
  def list(request: Domain): Request[EnterprisesListResponse] = js.native
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
  def pullNotificationSet(request: PrettyPrint): Request[NotificationSet] = js.native
  /** Sends a test notification to validate the EMM integration with the Google Cloud Pub/Sub service for this enterprise. */
  def sendTestPushNotification(request: Key): Request[EnterprisesSendTestPushNotificationResponse] = js.native
  /** Sets the account that will be used to authenticate to the API as the enterprise. */
  def setAccount(request: Key): Request[EnterpriseAccount] = js.native
  /**
    * Sets the Android Device Policy config resource. EMM may use this method to enable or disable Android Device Policy support for the specified
    * enterprise. To learn more about managing devices and apps with Android Device Policy, see the Android Management API.
    */
  def setAndroidDevicePolicyConfig(request: Key): Request[AndroidDevicePolicyConfig] = js.native
  /**
    * Sets the store layout for the enterprise. By default, storeLayoutType is set to "basic" and the basic store layout is enabled. The basic layout only
    * contains apps approved by the admin, and that have been added to the available product set for a user (using the  setAvailableProductSet call). Apps on
    * the page are sorted in order of their product ID value. If you create a custom store layout (by setting storeLayoutType = "custom" and setting a
    * homepage), the basic store layout is disabled.
    */
  def setStoreLayout(request: Key): Request[StoreLayout] = js.native
  /** Unenrolls an enterprise from the calling EMM. */
  def unenroll(request: Key): Request[Unit] = js.native
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
  @scala.inline
  implicit class EnterprisesResourceOps[Self <: EnterprisesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcknowledgeNotificationSet(value: Fields => Request[Unit]): Self = this.set("acknowledgeNotificationSet", js.Any.fromFunction1(value))
    @scala.inline
    def setCompleteSignup(value: CompletionToken => Request[Enterprise]): Self = this.set("completeSignup", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateWebToken(value: Key => Request[AdministratorWebToken]): Self = this.set("createWebToken", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Key => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setEnroll(value: Oauthtoken => Request[Enterprise]): Self = this.set("enroll", js.Any.fromFunction1(value))
    @scala.inline
    def setGenerateSignupUrl(value: CallbackUrl => Request[SignupInfo]): Self = this.set("generateSignupUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Key => Request[Enterprise]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAndroidDevicePolicyConfig(value: Key => Request[AndroidDevicePolicyConfig]): Self = this.set("getAndroidDevicePolicyConfig", js.Any.fromFunction1(value))
    @scala.inline
    def setGetServiceAccount(value: KeyType => Request[ServiceAccount]): Self = this.set("getServiceAccount", js.Any.fromFunction1(value))
    @scala.inline
    def setGetStoreLayout(value: Key => Request[StoreLayout]): Self = this.set("getStoreLayout", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Oauthtoken => Request[Enterprise]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Domain => Request[EnterprisesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPullNotificationSet(value: PrettyPrint => Request[NotificationSet]): Self = this.set("pullNotificationSet", js.Any.fromFunction1(value))
    @scala.inline
    def setSendTestPushNotification(value: Key => Request[EnterprisesSendTestPushNotificationResponse]): Self = this.set("sendTestPushNotification", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAccount(value: Key => Request[EnterpriseAccount]): Self = this.set("setAccount", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAndroidDevicePolicyConfig(value: Key => Request[AndroidDevicePolicyConfig]): Self = this.set("setAndroidDevicePolicyConfig", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStoreLayout(value: Key => Request[StoreLayout]): Self = this.set("setStoreLayout", js.Any.fromFunction1(value))
    @scala.inline
    def setUnenroll(value: Key => Request[Unit]): Self = this.set("unenroll", js.Any.fromFunction1(value))
  }
  
}

