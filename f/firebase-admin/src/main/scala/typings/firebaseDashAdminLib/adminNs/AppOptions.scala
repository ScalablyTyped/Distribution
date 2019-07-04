package typings
package firebaseDashAdminLib.adminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Available options to pass to [`initializeApp()`](admin#.initializeApp).
  */
trait AppOptions extends js.Object {
  /**
    * A {@link admin.credential.Credential `Credential`} object used to
    * authenticate the Admin SDK.
    *
    * See [Initialize the SDK](/docs/admin/setup#initialize_the_sdk) for detailed
    * documentation and code samples.
    */
  var credential: js.UndefOr[firebaseDashAdminLib.adminNs.credentialNs.Credential] = js.undefined
  /**
    * The object to use as the [`auth`](/docs/reference/security/database/#auth)
    * variable in your Realtime Database Rules when the Admin SDK reads from or
    * writes to the Realtime Database. This allows you to downscope the Admin SDK
    * from its default full read and write privileges.
    *
    * You can pass `null` to act as an unauthenticated client.
    *
    * See
    * [Authenticate with limited privileges](/docs/database/admin/start#authenticate-with-limited-privileges)
    * for detailed documentation and code samples.
    */
  var databaseAuthVariableOverride: js.UndefOr[js.Object] = js.undefined
  /**
    * The URL of the Realtime Database from which to read and write data.
    */
  var databaseURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An [HTTP Agent](https://nodejs.org/api/http.html#http_class_http_agent)
    * to be used when making outgoing HTTP calls. This Agent instance is used
    * by all services that make REST calls (e.g. `auth`, `messaging`,
    * `projectManagement`).
    *
    * Realtime Database and Firestore use other means of communicating with
    * the backend servers, so they do not use this HTTP Agent. `Credential`
    * instances also do not use this HTTP Agent, but instead support
    * specifying an HTTP Agent in the corresponding factory methods.
    */
  var httpAgent: js.UndefOr[nodeLib.httpMod.Agent] = js.undefined
  /**
    * The ID of the Google Cloud project associated with the App.
    */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the service account to be used for signing custom tokens. This
    * can be found in the `client_email` field of a service account JSON file.
    */
  var serviceAccountId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the service account to be used for signing custom tokens. This
    * can be found in the `client_email` field of a service account JSON file.
    */
  var storageBucket: js.UndefOr[java.lang.String] = js.undefined
}

object AppOptions {
  @scala.inline
  def apply(
    credential: firebaseDashAdminLib.adminNs.credentialNs.Credential = null,
    databaseAuthVariableOverride: js.Object = null,
    databaseURL: java.lang.String = null,
    httpAgent: nodeLib.httpMod.Agent = null,
    projectId: java.lang.String = null,
    serviceAccountId: java.lang.String = null,
    storageBucket: java.lang.String = null
  ): AppOptions = {
    val __obj = js.Dynamic.literal()
    if (credential != null) __obj.updateDynamic("credential")(credential)
    if (databaseAuthVariableOverride != null) __obj.updateDynamic("databaseAuthVariableOverride")(databaseAuthVariableOverride)
    if (databaseURL != null) __obj.updateDynamic("databaseURL")(databaseURL)
    if (httpAgent != null) __obj.updateDynamic("httpAgent")(httpAgent)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (serviceAccountId != null) __obj.updateDynamic("serviceAccountId")(serviceAccountId)
    if (storageBucket != null) __obj.updateDynamic("storageBucket")(storageBucket)
    __obj.asInstanceOf[AppOptions]
  }
}

