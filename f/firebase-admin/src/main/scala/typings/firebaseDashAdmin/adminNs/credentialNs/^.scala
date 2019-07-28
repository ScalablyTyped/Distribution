package typings.firebaseDashAdmin.adminNs.credentialNs

import typings.firebaseDashAdmin.adminNs.ServiceAccount
import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("admin.credential")
@js.native
object ^ extends js.Object {
  /**
    * Returns a credential created from the
    * {@link
    *    https://developers.google.com/identity/protocols/application-default-credentials
    *    Google Application Default Credentials}
    * that grants admin access to Firebase services. This credential can be used
    * in the call to
    * {@link
    *   https://firebase.google.com/docs/reference/admin/node/admin#.initializeApp
    *  `admin.initializeApp()`}.
    *
    * Google Application Default Credentials are available on any Google
    * infrastructure, such as Google App Engine and Google Compute Engine.
    *
    * See
    * {@link
    *   https://firebase.google.com/docs/admin/setup#initialize_the_sdk
    *   Initialize the SDK}
    * for more details.
    *
    * @example
    * ```javascript
    * admin.initializeApp({
    *   credential: admin.credential.applicationDefault(),
    *   databaseURL: "https://<DATABASE_NAME>.firebaseio.com"
    * });
    * ```
    *
    * @param {!Object=} httpAgent Optional [HTTP Agent](https://nodejs.org/api/http.html#http_class_http_agent)
    *   to be used when retrieving access tokens from Google token servers.
    *
    * @return {!admin.credential.Credential} A credential authenticated via Google
    *   Application Default Credentials that can be used to initialize an app.
    */
  def applicationDefault(): Credential = js.native
  def applicationDefault(httpAgent: Agent): Credential = js.native
  /**
    * Returns a credential created from the provided service account that grants
    * admin access to Firebase services. This credential can be used in the call
    * to
    * {@link
    *   https://firebase.google.com/docs/reference/admin/node/admin#.initializeApp
    *   `admin.initializeApp()`}.
    *
    * See
    * {@link
    *   https://firebase.google.com/docs/admin/setup#initialize_the_sdk
    *   Initialize the SDK}
    * for more details.
    *
    * @example
    * ```javascript
    * // Providing a path to a service account key JSON file
    * var serviceAccount = require("path/to/serviceAccountKey.json");
    * admin.initializeApp({
    *   credential: admin.credential.cert(serviceAccount),
    *   databaseURL: "https://<DATABASE_NAME>.firebaseio.com"
    * });
    * ```
    *
    * @example
    * ```javascript
    * // Providing a service account object inline
    * admin.initializeApp({
    *   credential: admin.credential.cert({
    *     projectId: "<PROJECT_ID>",
    *     clientEmail: "foo@<PROJECT_ID>.iam.gserviceaccount.com",
    *     privateKey: "-----BEGIN PRIVATE KEY-----<KEY>-----END PRIVATE KEY-----\n"
    *   }),
    *   databaseURL: "https://<DATABASE_NAME>.firebaseio.com"
    * });
    * ```
    *
    * @param serviceAccountPathOrObject The path to a service
    *   account key JSON file or an object representing a service account key.
    * @param httpAgent Optional [HTTP Agent](https://nodejs.org/api/http.html#http_class_http_agent)
    *   to be used when retrieving access tokens from Google token servers.
    *
    * @return A credential authenticated via the
    *   provided service account that can be used to initialize an app.
    */
  def cert(serviceAccountPathOrObject: String): Credential = js.native
  def cert(serviceAccountPathOrObject: String, httpAgent: Agent): Credential = js.native
  def cert(serviceAccountPathOrObject: ServiceAccount): Credential = js.native
  def cert(serviceAccountPathOrObject: ServiceAccount, httpAgent: Agent): Credential = js.native
  /**
    * Returns a credential created from the provided refresh token that grants
    * admin access to Firebase services. This credential can be used in the call
    * to
    * {@link
    *   https://firebase.google.com/docs/reference/admin/node/admin#.initializeApp
    *   `admin.initializeApp()`}.
    *
    * See
    * {@link
    *   https://firebase.google.com/docs/admin/setup#initialize_the_sdk
    *   Initialize the SDK}
    * for more details.
    *
    * @example
    * ```javascript
    * // Providing a path to a refresh token JSON file
    * var refreshToken = require("path/to/refreshToken.json");
    * admin.initializeApp({
    *   credential: admin.credential.refreshToken(refreshToken),
    *   databaseURL: "https://<DATABASE_NAME>.firebaseio.com"
    * });
    * ```
    *
    * @param refreshTokenPathOrObject The path to a Google
    *   OAuth2 refresh token JSON file or an object representing a Google OAuth2
    *   refresh token.
    * @param httpAgent Optional [HTTP Agent](https://nodejs.org/api/http.html#http_class_http_agent)
    *   to be used when retrieving access tokens from Google token servers.
    *
    * @return A credential authenticated via the
    *   provided service account that can be used to initialize an app.
    */
  def refreshToken(refreshTokenPathOrObject: String): Credential = js.native
  def refreshToken(refreshTokenPathOrObject: String, httpAgent: Agent): Credential = js.native
  def refreshToken(refreshTokenPathOrObject: js.Object): Credential = js.native
  def refreshToken(refreshTokenPathOrObject: js.Object, httpAgent: Agent): Credential = js.native
}

