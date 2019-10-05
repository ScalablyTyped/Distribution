package typings.firebaseDashAdmin.admin.credential

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("admin.credential.refreshToken")
@js.native
object refreshToken extends js.Object {
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
  def apply(refreshTokenPathOrObject: String): Credential = js.native
  def apply(refreshTokenPathOrObject: String, httpAgent: Agent): Credential = js.native
  def apply(refreshTokenPathOrObject: js.Object): Credential = js.native
  def apply(refreshTokenPathOrObject: js.Object, httpAgent: Agent): Credential = js.native
}

